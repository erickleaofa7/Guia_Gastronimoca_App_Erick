package com.erick.guia_gastronimoca_app.controlador;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.erick.guia_gastronimoca_app.Ecuador.Layout_Hornado;
import com.erick.guia_gastronimoca_app.Ecuador.Layout_Yahuarlocro;
import com.erick.guia_gastronimoca_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentSierra#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentSierra extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    ImageButton yahuarlocro, hornado;

    public FragmentSierra() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSierra.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSierra newInstance(String param1, String param2) {
        FragmentSierra fragment = new FragmentSierra();
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
        view = inflater.inflate(R.layout.fragment_sierra, container, false);
        yahuarlocro = view.findViewById(R.id.btnYahuarlocro);
        yahuarlocro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ecu = new Intent(FragmentSierra.this.getActivity(), Layout_Yahuarlocro.class);
                startActivity(ecu);
                Toast.makeText(getContext(),"CUIDAD DE QUITO", Toast.LENGTH_LONG).show();
            }
        });

        hornado = view.findViewById(R.id.btnHornado);
        hornado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hor = new Intent(FragmentSierra.this.getActivity(), Layout_Hornado.class);
                startActivity(hor);
                Toast.makeText(getContext(),"CUIDAD DE QUITO", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}