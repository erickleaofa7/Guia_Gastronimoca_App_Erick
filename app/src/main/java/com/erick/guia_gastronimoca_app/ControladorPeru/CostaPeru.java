package com.erick.guia_gastronimoca_app.ControladorPeru;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.erick.guia_gastronimoca_app.Peru.Layout_Chupe;
import com.erick.guia_gastronimoca_app.Peru.Layout_Escabeche;
import com.erick.guia_gastronimoca_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CostaPeru#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CostaPeru extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    ImageButton pescado,chupe;
    Button enla;
    String direcc;
    TextView texto;

    public CostaPeru() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CostaPeru.
     */
    // TODO: Rename and change types and number of parameters
    public static CostaPeru newInstance(String param1, String param2) {
        CostaPeru fragment = new CostaPeru();
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
       view = inflater.inflate(R.layout.fragment_costa_peru, container, false);
        pescado = view.findViewById(R.id.btnPescado);
        pescado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pes = new Intent(CostaPeru.this.getActivity(), Layout_Escabeche.class);
                startActivity(pes);
                Toast.makeText(getContext(),"CUIDAD DE PIURA", Toast.LENGTH_LONG).show();
            }
        });

        chupe = view.findViewById(R.id.btnCamaron);
        chupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chu = new Intent(CostaPeru.this.getActivity(), Layout_Chupe.class);
                startActivity(chu);
                Toast.makeText(getContext(),"CUIDAD DE PIURA", Toast.LENGTH_LONG).show();

            }
        });

        texto = view.findViewById(R.id.linkTexto);
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                direcc="https://www.excelenciasgourmet.com/es/opinion-news/gastronomia-peruana-una-de-las-mas-diversas-del-mundo";
                Link(direcc);
            }
        });

        enla = view.findViewById(R.id.btnEnl);
        enla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                direcc ="https://www.youtube.com/watch?v=6S8kj-z_WQ4";
                Link(direcc);
            }
        });

        return view;
    }

    public void Link(String li){
        Uri uri = Uri.parse(li);
        Intent nav = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(nav);
    }
}