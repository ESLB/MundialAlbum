package com.album.mundial.eslb.mundialalbum;

import android.content.Context;

import com.album.mundial.eslb.mundialalbum.models.StickersModel;

import java.util.ArrayList;
import java.util.List;

public class SingletonStickers {

    private static SingletonStickers sSingleStickers;
    private Context mContext;


    public static SingletonStickers get(Context context){
        if(sSingleStickers == null){
            sSingleStickers = new SingletonStickers(context);
        }
        return sSingleStickers;
    }

    private SingletonStickers(Context context){
        mContext = context.getApplicationContext();
        GenerarStickersVacios();
        GenerarStickersTengo();
    }

    public List<StickersModel> getPaises(){
        List<StickersModel> stickersPaises = new ArrayList<>();



        return stickersPaises;
    }

    public List<StickersModel> getFutbolistas(){
        List<StickersModel> stickersFutbolistas = new ArrayList<>();



        return stickersFutbolistas;
    }

    public List<StickersModel> getEquipos(){
        List<StickersModel> stickersEquipos = new ArrayList<>();



        return stickersEquipos;
    }

    public List<StickersModel> getSedes(){
        List<StickersModel> stickersSedes = new ArrayList<>();



        return stickersSedes;
    }

    public List<StickersModel> getFixture(){
        List<StickersModel> stickersFixture = new ArrayList<>();



        return stickersFixture;
    }

    List<StickersModel> TengoPaises = new ArrayList<>();
    List<StickersModel> TengoFutbolistas = new ArrayList<>();
    List<StickersModel> TengoEquipos = new ArrayList<>();
    List<StickersModel> TengoSedes = new ArrayList<>();
    List<StickersModel> TengoFixture = new ArrayList<>();



    List<StickersModel> VacioPaises = new ArrayList<>();
    List<StickersModel> VacioFutbolistas = new ArrayList<>();
    List<StickersModel> VacioEquipos = new ArrayList<>();
    List<StickersModel> VacioSedes = new ArrayList<>();
    List<StickersModel> VacioFixture = new ArrayList<>();



    private void GenerarStickersVacios(){



    }

    private void GenerarStickersTengo(){
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 5));
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 14));
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 22 ));
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 2));
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 28));

        TengoFutbolistas.add(new StickersModel(R.drawable.ejemplo_futbolista_tengo, "lore", 34));
        TengoFutbolistas.add(new StickersModel(R.drawable.ejemplo_futbolista_tengo, "lore", 37));
        TengoFutbolistas.add(new StickersModel(R.drawable.ejemplo_futbolista_tengo, "lore", 38));
        TengoFutbolistas.add(new StickersModel(R.drawable.ejemplo_futbolista_tengo, "lore", 40));
        TengoFutbolistas.add(new StickersModel(R.drawable.ejemplo_futbolista_tengo, "lore", 43));

        TengoEquipos.add(new StickersModel(R.drawable.ejemplo_equipo_tengo, "lore", 94));
        TengoEquipos.add(new StickersModel(R.drawable.ejemplo_equipo_tengo, "lore", 96));
        TengoEquipos.add(new StickersModel(R.drawable.ejemplo_equipo_tengo, "lore", 99));
        TengoEquipos.add(new StickersModel(R.drawable.ejemplo_equipo_tengo, "lore", 102));
        TengoEquipos.add(new StickersModel(R.drawable.ejemplo_equipo_tengo, "lore", 105));

        TengoSedes.add(new StickersModel(R.drawable.ejemplo_sede_tengo, "lore", 123));
        TengoSedes.add(new StickersModel(R.drawable.ejemplo_sede_tengo, "lore", 124));
        TengoSedes.add(new StickersModel(R.drawable.ejemplo_sede_tengo, "lore", 126));
        TengoSedes.add(new StickersModel(R.drawable.ejemplo_sede_tengo, "lore", 127));
        TengoSedes.add(new StickersModel(R.drawable.ejemplo_sede_tengo, "lore", 130));

        TengoFixture.add(new StickersModel(R.drawable.ejemplo_fixture_tengo, "lore", 141));
        TengoFixture.add(new StickersModel(R.drawable.ejemplo_fixture_tengo, "lore", 143));
        TengoFixture.add(new StickersModel(R.drawable.ejemplo_fixture_tengo, "lore", 145));
        TengoFixture.add(new StickersModel(R.drawable.ejemplo_fixture_tengo, "lore", 146));
        TengoFixture.add(new StickersModel(R.drawable.ejemplo_fixture_tengo, "lore", 148));

    }

}
