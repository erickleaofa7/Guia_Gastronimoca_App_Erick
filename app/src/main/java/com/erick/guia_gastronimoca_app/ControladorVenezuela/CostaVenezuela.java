package com.erick.guia_gastronimoca_app.ControladorVenezuela;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.erick.guia_gastronimoca_app.Layout_Playero;
import com.erick.guia_gastronimoca_app.R;
import com.erick.guia_gastronimoca_app.Venezuela.Layout_Arepa;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CostaVenezuela#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CostaVenezuela extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    ImageButton arepa,playero;

    public CostaVenezuela() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CostaVenezuela.
     */
    // TODO: Rename and change types and number of parameters
    public static CostaVenezuela newInstance(String param1, String param2) {
        CostaVenezuela fragment = new CostaVenezuela();
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
        view = inflater.inflate(R.layout.fragment_costa_venezuela, container, false);
        arepa = view.findViewById(R.id.btnArepa);
        arepa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent are = new Intent(CostaVenezuela.this.getActivity(), Layout_Arepa.class);
                startActivity(are);
                Toast.makeText(getContext(),"CIUDAD DE MARACAIBO", Toast.LENGTH_LONG).show();
            }
        });
        playero= view.findViewById(R.id.btnPlayero);
        playero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(CostaVenezuela.this.getActivity(), Layout_Playero.class);
                startActivity(play);
                Toast.makeText(getContext(),"CIUDAD DE MARACAIBO", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}