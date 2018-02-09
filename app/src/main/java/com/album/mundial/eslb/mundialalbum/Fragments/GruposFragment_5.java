package com.album.mundial.eslb.mundialalbum.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.album.mundial.eslb.mundialalbum.R;


public class GruposFragment_5 extends Fragment {

    Button mGrupoA, mGrupoB, mGrupoC;

    public GruposFragment_5() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.grupos_fragment_5, container, false);

        mGrupoA = (Button) view.findViewById(R.id.grupoA);
        mGrupoB = (Button) view.findViewById(R.id.grupoB);
        mGrupoC = (Button) view.findViewById(R.id.grupoC);

        mGrupoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), mGrupoA.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        mGrupoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), mGrupoB.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        mGrupoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), mGrupoC.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


}
