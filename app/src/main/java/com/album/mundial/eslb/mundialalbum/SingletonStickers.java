package com.album.mundial.eslb.mundialalbum;

import android.content.Context;

import com.album.mundial.eslb.mundialalbum.models.StickersModel;

import java.util.ArrayList;
import java.util.Collections;
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
        GenerarStickersTengo();
        GenerarStickersVacios();
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



    private List<StickersModel> VacioPaises = new ArrayList<>();

    public List<StickersModel> getVacioPaises() {
        return VacioPaises;
    }

    public List<StickersModel> getVacioFutbolistas() {
        return VacioFutbolistas;
    }

    public List<StickersModel> getVacioEquipos() {
        return VacioEquipos;
    }

    public List<StickersModel> getVacioSedes() {
        return VacioSedes;
    }

    public List<StickersModel> getVacioFixture() {
        return VacioFixture;
    }

    private List<StickersModel> VacioFutbolistas = new ArrayList<>();
    private List<StickersModel> VacioEquipos = new ArrayList<>();
    private List<StickersModel> VacioSedes = new ArrayList<>();
    private List<StickersModel> VacioFixture = new ArrayList<>();



    private void GenerarStickersVacios(){

        int i = 1;

        for(; i<=32; i++){

            if(!(i==2||i==5||i==14||i==22||i==28))
            {
                VacioPaises.add(new StickersModel(R.drawable.ejemplo_pais_no_tengo, "lore "+i,i));
            }
        }
        VacioPaises.addAll(TengoEquipos);
        Collections.sort(VacioPaises);
        for(; i<=93; i++){
            if(!(i==2||i==5||i==14||i==22||i==28))
            {
                VacioFutbolistas.add(new StickersModel(R.drawable.ejemplo_futbolista_no_tengo, "lore "+i,i));
            }
        }
        VacioFutbolistas.addAll(TengoFutbolistas);
        Collections.sort(VacioFutbolistas);
        for(; i<=120; i++){
            if(!(i==2||i==5||i==14||i==22||i==28))
            {VacioEquipos.add(new StickersModel(R.drawable.ejemplo_equipo_no_tengo, "lore "+i,i));}
        }
        VacioEquipos.addAll(TengoEquipos);
        Collections.sort(VacioEquipos);
        for(; i<=140; i++){
            if(!(i==2||i==5||i==14||i==22||i==28))
            {VacioSedes.add(new StickersModel(R.drawable.ejemplo_sede_no_tengo, "lore "+i,i));}
        }
        VacioSedes.addAll(TengoSedes);
        Collections.sort(VacioSedes);
        for(; i<=160; i++){
            if(!(i==2||i==5||i==14||i==22||i==28)){
                VacioFixture.add(new StickersModel(R.drawable.ejemplo_fixture_no_tengo, "lore "+i,i));
            }
        }
        VacioFixture.addAll(TengoFixture);
        Collections.sort(VacioFixture);
    }

    private void GenerarStickersTengo(){
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 2));
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 5));
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 14 ));
        TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo, "Lore", 22));
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
