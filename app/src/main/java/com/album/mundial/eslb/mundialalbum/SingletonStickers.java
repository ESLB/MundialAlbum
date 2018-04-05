package com.album.mundial.eslb.mundialalbum;

import android.app.Activity;
import android.content.Context;

import com.album.mundial.eslb.mundialalbum.models.StickersModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingletonStickers {

    //Están bien todos los nombres
    private String[] nombreJugadores = {"Aguero","Biblia","Dybala","Funes Mori","Gago","Mascherano","Mercado","Messi","Otamendi","Rojo"," Sergio Romero"," Andre Carrillo"," Christian Ramos","Cueva","Farfán","Flores","Gallese","Paolo","Rodriguez","Ruidiaz","Tapia","Yotun","Alvaro","Costa","De Guea","Iniesta","Isco","Jordi","Jose","Pique","Ramos","Thiago","Villa","Armero","Carbonero"," Carlos Sanchez","Cuadrado","Guarin","Helibelton","Martinez","Medina","Ospina","Radamel","Yerri Mina","Brand","Emre Can","Ginter","Julian","Kimmich","Lahm","Ozil","Rudiger","Trapp","Uwe","Werner"};

    private static SingletonStickers sSingleStickers;
    private Context mContext;
    private List<StickersModel> StickersJugadores = new ArrayList<>();
    private List<Integer> StickersTengo = new ArrayList<>();

    String[]Jugadores={"Benjamin Moukandjo",
            "Jean Makoun",
            "Gerard Piqué",
            "David Villa",
            "Jordi Alba",
            "Memphis Depay",
            "Eugenio Mena"};
            String[]Sedes={"Estadio de Nizhny Nóvgorod",
            "Estadio Luzhniki",
            "Samara Arena",
            "Rostov Arena",
            "Estadio de San Petersburgo",
            "Estadio de Kaliningrado",
            "Mordovia Arena"};
            String[]Fixture={"Rusia vs Equipo",
            "Urugua vs A. Saudita",
            "España vs Marruecos",
            "Francia vs Perú",
            "Dinamarca vs Australia",
            "Argentina vs Islandia",
            "Brasil vs Suiza"};
            String[]Equipos={"Equipo Costa Rica",
            "Equipo Honduras",
            "Equipo Francia",
            "Equipo Ecuador",
            "Equipo Grecia",
            "Equipo Rusia",
            "Equipo Islandia"};


    public static SingletonStickers get(Context context){
            if(sSingleStickers==null){
            sSingleStickers=new SingletonStickers(context);
            }
            return sSingleStickers;
            }

    private SingletonStickers(Context context){
            mContext=context.getApplicationContext();
            GenerarStickersTengo();
            GenerarStickersVacios();
            GenerarStickers();

            }

    private void GenerarStickers(){
            //del 1 al 55 son futbolistas, el 0 no existe
            int i=1;

            for(;i<=54;i++){
            StickersJugadores.add(new StickersModel(R.drawable.jugador_no_tengo_oficial,nombreJugadores[i-1],i));
            }

        StickersTengo.add(2);
        StickersTengo.add(8);
        StickersTengo.add(6);
        StickersTengo.add(3);

        String h;
        for (Integer j :
                StickersTengo) {
            h = "sticker_oficial_"+j;
            int resId = mContext.getResources().getIdentifier(h, "drawable", mContext.getPackageName());
            StickersJugadores.set(j-1, new StickersModel(resId, nombreJugadores[j-1], j));
        }

        }


    public List<StickersModel> getStickers(String parametro){
        List<StickersModel> stickers=new ArrayList<>();

        switch (parametro){
            case "argentina":
                stickers = StickersJugadores.subList(0,11);
                break;
        }

        return stickers;
    }


    private List<StickersModel> VacioFutbolistas=new ArrayList<>();
    private List<StickersModel> VacioEquipos=new ArrayList<>();
    private List<StickersModel> VacioSedes=new ArrayList<>();
    private List<StickersModel> VacioFixture=new ArrayList<>();


            List<StickersModel> TengoPaises=new ArrayList<>();
            List<StickersModel> TengoFutbolistas=new ArrayList<>();
            List<StickersModel> TengoEquipos=new ArrayList<>();
            List<StickersModel> TengoSedes=new ArrayList<>();
            List<StickersModel> TengoFixture=new ArrayList<>();

    private List<StickersModel> VacioPaises=new ArrayList<>();

    public List<StickersModel> getVacioPaises(){
            return VacioPaises;
            }

    public List<StickersModel> getVacioFutbolistas(){
            return VacioFutbolistas.subList(0, 10);
            }

    public List<StickersModel> getVacioEquipos(){
            return VacioEquipos.subList(0,13);
            }

    public List<StickersModel> getVacioSedes(){
            return VacioSedes.subList(0,12);
            }

    public List<StickersModel> getVacioFixture(){
            return VacioFixture.subList(0,15);
            }


    private void GenerarStickersVacios(){

            int i=1;

            for(;i<=32;i++){

            if(i!=2&&i!=5&&i!=14&&i!=22&&i!=28)
            {
            VacioPaises.add(new StickersModel(R.drawable.ejemplo_pais_no_tengo,"lore "+i,i));
            }
            }
            VacioPaises.addAll(TengoPaises);
            Collections.sort(VacioPaises);

            for(;i<=93;i++){
            if(!(i==34||i==37||i==38||i==40||i==43))
            {
            VacioFutbolistas.add(new StickersModel(R.drawable.jugador_no_tengo_oficial,Jugadores[i%Jugadores.length],i));
            }
            }
            VacioFutbolistas.addAll(TengoFutbolistas);
            Collections.sort(VacioFutbolistas);

            for(;i<=120;i++){
            if(!(i==94||i==96||i==99||i==102||i==105))
            {VacioEquipos.add(new StickersModel(R.drawable.equipo_no_tengo_oficial,Equipos[i%Equipos.length],i));}
            }
            VacioEquipos.addAll(TengoEquipos);
            Collections.sort(VacioEquipos);

            for(;i<=140;i++){
            if(!(i==123||i==124||i==126||i==127||i==130))
            {VacioSedes.add(new StickersModel(R.drawable.sede_no_tengo_fijo,Sedes[i%Sedes.length],i));}
            }
            VacioSedes.addAll(TengoSedes);
            Collections.sort(VacioSedes);

            for(;i<=160;i++){
            if(!(i==141||i==143||i==145||i==146||i==148)){
            VacioFixture.add(new StickersModel(R.drawable.ejemplo_fixture_no_tengo,Fixture[i%Fixture.length],i));
            }
            }
            VacioFixture.addAll(TengoFixture);
            Collections.sort(VacioFixture);
            }

    private void GenerarStickersTengo(){
            TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo,"Lore",2));
            TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo,"Lore",5));
            TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo,"Lore",14));
            TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo,"Lore",22));
            TengoPaises.add(new StickersModel(R.drawable.ejemplo_pais_tengo,"Lore",28));

            TengoFutbolistas.add(new StickersModel(R.drawable.ejemplo_futbolista_tengo,"Luka Modrić",34));
            TengoFutbolistas.add(new StickersModel(R.drawable.jugador_11,"Gordon Schildenfeld",37));
            TengoFutbolistas.add(new StickersModel(R.drawable.jugador_33,"Ivica Olić",38));
            TengoFutbolistas.add(new StickersModel(R.drawable.jugador_44,"Milan Badelj",40));
            TengoFutbolistas.add(new StickersModel(R.drawable.jugador_77,"Miguel Layún",43));

            TengoEquipos.add(new StickersModel(R.drawable.ejemplo_equipo_tengo,"Equipo Japones",94));
            TengoEquipos.add(new StickersModel(R.drawable.equipo_11,"Equipo Senegal",96));
            TengoEquipos.add(new StickersModel(R.drawable.equipo_22,"Equipo Argentino",99));
            TengoEquipos.add(new StickersModel(R.drawable.equipo_33,"Equipo Colombiano",102));
            TengoEquipos.add(new StickersModel(R.drawable.equipo_44,"Equipo Inglaterra",105));

            TengoSedes.add(new StickersModel(R.drawable.sede_11,"Estadio del Spartak",123));
            TengoSedes.add(new StickersModel(R.drawable.sede_22,"Volgogrado Arena",124));
            TengoSedes.add(new StickersModel(R.drawable.sede_33,"Ekaterimburgo Arena",126));
            TengoSedes.add(new StickersModel(R.drawable.sede_44,"Estadio Fisht",127));
            TengoSedes.add(new StickersModel(R.drawable.ejemplo_sede_tengo,"Kazán Arena",130));

            TengoFixture.add(new StickersModel(R.drawable.fixture_11,"Rusia vs A.Saudita",141));
            TengoFixture.add(new StickersModel(R.drawable.fixture_22,"Alemania vs Suecia",143));
            TengoFixture.add(new StickersModel(R.drawable.fixture_33,"Serbia vs Suiza",145));
            TengoFixture.add(new StickersModel(R.drawable.fixture_44,"Polonia vs Colombia",146));
            TengoFixture.add(new StickersModel(R.drawable.ejemplo_fixture_tengo,"Inglaterra vs Panamá",148));

            }

}
