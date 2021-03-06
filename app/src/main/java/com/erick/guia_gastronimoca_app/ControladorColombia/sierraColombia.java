package com.erick.guia_gastronimoca_app.ControladorColombia;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.erick.guia_gastronimoca_app.Colombia.Layout_Ajiaco;
import com.erick.guia_gastronimoca_app.Colombia.Layout_ArrozC;
import com.erick.guia_gastronimoca_app.Paises;
import com.erick.guia_gastronimoca_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sierraColombia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sierraColombia extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    ImageButton arrrozC, ajiaco, atras;

    public sierraColombia() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sierraColombia.
     */
    // TODO: Rename and change types and number of parameters
    public static sierraColombia newInstance(String param1, String param2) {
        sierraColombia fragment = new sierraColombia();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_sierra_colombia, container, false);
        arrrozC = vista.findViewById(R.id.btnArrozC);
        arrrozC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arroz = new Intent(sierraColombia.this.getActivity(), Layout_ArrozC.class);
                startActivity(arroz);
                Toast.makeText(getContext(), "CIUDAD DE BOGOTA", Toast.LENGTH_LONG).show();
            }
        });

        ajiaco = vista.findViewById(R.id.btnAjiaco);
        ajiaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajiaco = new Intent(sierraColombia.this.getActivity(), Layout_Ajiaco.class);
                startActivity(ajiaco);
                Toast.makeText(getContext(), "CIUDAD DE SANTA FE", Toast.LENGTH_LONG).show();
            }
        });

        atras = vista.findViewById(R.id.btnAtras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras = new Intent(sierraColombia.this.getActivity(), Paises.class);
                startActivity(atras);
            }
        });
        return vista;
    }
}