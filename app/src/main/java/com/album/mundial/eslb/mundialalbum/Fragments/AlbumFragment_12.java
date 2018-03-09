package com.album.mundial.eslb.mundialalbum.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.album.mundial.eslb.mundialalbum.R;
import com.album.mundial.eslb.mundialalbum.Static.FragmentNames;

import static com.album.mundial.eslb.mundialalbum.Activities.Central_4.CambiarPestana;


public class AlbumFragment_12 extends Fragment {

    Button Equipos, Sedes, Fixture;

    public AlbumFragment_12() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.album_fragment_12, container, false);

        Equipos = (Button) view.findViewById(R.id.equiposButton);
        Sedes = (Button) view.findViewById(R.id.sedesButton);
        Fixture = (Button) view.findViewById(R.id.fixtureButton);

        Equipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarPaises();
            }
        });
        Sedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarPaises();
            }
        });
        Fixture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarPaises();
            }
        });

        return view;
    }

    public void llamarPaises(){
        CambiarPestana(FragmentNames.PAISES);
    }

}
