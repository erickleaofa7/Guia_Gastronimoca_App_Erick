package com.erick.guia_gastronimoca_app.ControladorColombia;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.erick.guia_gastronimoca_app.Colombia.Layout_BandejaP;
import com.erick.guia_gastronimoca_app.Colombia.Layout_Sancocho;
import com.erick.guia_gastronimoca_app.Paises;
import com.erick.guia_gastronimoca_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link costaColombia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class costaColombia extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    ImageButton bandeja, sancocho, atras;

    public costaColombia() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment costaColombia.
     */
    // TODO: Rename and change types and number of parameters
    public static costaColombia newInstance(String param1, String param2) {
        costaColombia fragment = new costaColombia();
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
        vista = inflater.inflate(R.layout.fragment_costa_colombia, container, false);
        bandeja = vista.findViewById(R.id.btnBandeja);
        bandeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ban = new Intent(costaColombia.this.getActivity(), Layout_BandejaP.class);
                startActivity(ban);
                Toast.makeText(getContext(), "CIUDAD DE SANTA MARTHA", Toast.LENGTH_LONG).show();
            }
        });

        sancocho = vista.findViewById(R.id.btnSancocho);
        sancocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent san = new Intent(costaColombia.this.getActivity(), Layout_Sancocho.class);
                startActivity(san);
                Toast.makeText(getContext(), "CIUDAD DE BARRANQUILLA", Toast.LENGTH_LONG).show();
            }
        });

        atras = vista.findViewById(R.id.btnAtras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atr = new Intent(costaColombia.this.getActivity(), Paises.class);
                startActivity(atr);
            }
        });
        return vista;


    }
}