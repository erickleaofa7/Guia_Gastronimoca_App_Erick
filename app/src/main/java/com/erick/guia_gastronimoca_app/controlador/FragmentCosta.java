package com.erick.guia_gastronimoca_app.controlador;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.erick.guia_gastronimoca_app.Ecuador.Layout_Ceviche;
import com.erick.guia_gastronimoca_app.Ecuador.Layout_Encebollado;


import com.erick.guia_gastronimoca_app.Ecuador.Layout_Encebollado;
import com.erick.guia_gastronimoca_app.Paises;
import com.erick.guia_gastronimoca_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCosta#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCosta extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    ImageButton encebollado, ceviche;

    public FragmentCosta() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCosta.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentCosta newInstance(String param1, String param2) {
        FragmentCosta fragment = new FragmentCosta();
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
        // Inflate the layout for this fragment
        vista =inflater.inflate(R.layout.fragment_costa, container, false);
        encebollado = vista.findViewById(R.id.btnEncebollado);
        encebollado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent ecu = new Intent(FragmentCosta.this.getActivity(),Layout_Encebollado.class);
                   startActivity(ecu);
                   Toast.makeText(getContext(),"CUIDAD DE GUAYAQUIL", Toast.LENGTH_LONG).show();
            }
        });

        ceviche = vista.findViewById(R.id.btnCeviche);
        ceviche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ec = new Intent(FragmentCosta.this.getActivity(), Layout_Ceviche.class);
                startActivity(ec);
                Toast.makeText(getContext(),"CUIDAD DE GUAYAQUIL", Toast.LENGTH_LONG).show();
            }
        });
        return vista;
    }
}