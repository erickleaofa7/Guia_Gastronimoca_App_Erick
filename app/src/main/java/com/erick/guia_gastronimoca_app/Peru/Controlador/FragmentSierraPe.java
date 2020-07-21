package com.erick.guia_gastronimoca_app.Peru.Controlador;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.erick.guia_gastronimoca_app.Ecuador.Layout_Yahuarlocro;
import com.erick.guia_gastronimoca_app.Peru.Layout_Juane;
import com.erick.guia_gastronimoca_app.Peru.Layout_Llunca;
import com.erick.guia_gastronimoca_app.R;
import com.erick.guia_gastronimoca_app.controlador.FragmentSierra;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentSierraPe#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentSierraPe extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    ImageButton juane,llunca;

    public FragmentSierraPe() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSierraPe.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSierraPe newInstance(String param1, String param2) {
        FragmentSierraPe fragment = new FragmentSierraPe();
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
        view = inflater.inflate(R.layout.fragment_sierra, container, false);
        juane = view.findViewById(R.id.btnJade);
        juane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ecu = new Intent(FragmentSierraPe.this.getActivity(), Layout_Juane.class);
                startActivity(ecu);
                Toast.makeText(getContext(),"CUIDAD DE LIMA", Toast.LENGTH_LONG).show();
            }
        });

        llunca = view.findViewById(R.id.btnLlunca);
        llunca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ecu = new Intent(FragmentSierraPe.this.getActivity(), Layout_Llunca.class);
                startActivity(ecu);
                Toast.makeText(getContext(),"CUIDAD DE LIMA", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}