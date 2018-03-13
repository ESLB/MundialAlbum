package com.album.mundial.eslb.mundialalbum.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.album.mundial.eslb.mundialalbum.R;
import com.album.mundial.eslb.mundialalbum.Static.ArgumentsFragment;
import com.album.mundial.eslb.mundialalbum.Static.FragmentNames;

import static com.album.mundial.eslb.mundialalbum.Activities.Central_4.CambiarPestana;


public class AlbumFragment_12 extends Fragment {

    Button Futbolistas,Equipos, Sedes, Fixture;

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
        Futbolistas = (Button) view.findViewById(R.id.futbolistasButton);
        Equipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambiarPestana(FragmentNames.STICKERSUNO);
                ArgumentsFragment.FragmentAmostrar = ArgumentsFragment.EQUIPOS;
            }
        });
        Sedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambiarPestana(FragmentNames.STICKERSUNO);
                ArgumentsFragment.FragmentAmostrar = ArgumentsFragment.SEDES;
            }
        });
        Fixture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambiarPestana(FragmentNames.STICKERSUNO);
                ArgumentsFragment.FragmentAmostrar = ArgumentsFragment.FIXTURE;
            }
        });
        Futbolistas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambiarPestana(FragmentNames.PAISES);
            }
        });

        return view;
    }


}
