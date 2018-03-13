package com.album.mundial.eslb.mundialalbum.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.album.mundial.eslb.mundialalbum.Fragments.AlbumFragment_12;
import com.album.mundial.eslb.mundialalbum.Fragments.ComprarFragment_11;
import com.album.mundial.eslb.mundialalbum.Fragments.EquiposFragment_14;
import com.album.mundial.eslb.mundialalbum.Fragments.FixtureFragment_16;
import com.album.mundial.eslb.mundialalbum.Fragments.GruposFragment_5;
import com.album.mundial.eslb.mundialalbum.Fragments.FutbolistasFragment_8;
import com.album.mundial.eslb.mundialalbum.Fragments.MiPerfilFragment_7;
import com.album.mundial.eslb.mundialalbum.Fragments.AmigosFragment_10;
import com.album.mundial.eslb.mundialalbum.Fragments.PaisesFragment_6;
import com.album.mundial.eslb.mundialalbum.Fragments.StickersUnoFragment_15;
import com.album.mundial.eslb.mundialalbum.R;
import com.album.mundial.eslb.mundialalbum.SingletonStickers;
import com.album.mundial.eslb.mundialalbum.Static.FragmentNames;
import com.album.mundial.eslb.mundialalbum.drawer.DrawerFragment;

public class Central_4 extends AppCompatActivity {

    private static int orden = 0;
    public static Toolbar toolbar;
    public static FragmentManager fm;
    public static Fragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.central_activity_4);
        SingletonStickers SS = SingletonStickers.get(getApplicationContext());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Album Mundial");
        fm = getSupportFragmentManager();
        fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new AlbumFragment_12();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        setUpDrawer();

    }

    public static void CambiarPestana(String nombre){
        switch (nombre){
            case FragmentNames.COMPRAR_STICK:
                fragment = new ComprarFragment_11();
                toolbar.setSubtitle("Compra tus Stickers: ");
                break;
            case FragmentNames.INICIO:
                fragment = new GruposFragment_5();
                toolbar.setSubtitle("");
                break;
            case FragmentNames.MI_PERFIL:
                fragment = new MiPerfilFragment_7();
                toolbar.setSubtitle("Mi Perfil");
                break;
            case FragmentNames.MIS_AMIGOS:
                fragment = new AmigosFragment_10();
                toolbar.setSubtitle("Mis Amigos");
                break;
            case FragmentNames.MI_ALBUM:
                fragment = new AlbumFragment_12();
                toolbar.setSubtitle("");
                break;
            case FragmentNames.PAISES:
                fragment = new PaisesFragment_6();
                toolbar.setSubtitle("Bloque A");
                orden = 1;
                break;
            case FragmentNames.FUTBOLISTAS:
                fragment = new FutbolistasFragment_8();
                toolbar.setSubtitle("Dinamarca");
                orden = 2;
                break;
            case FragmentNames.SEDES:
                fragment = new StickersUnoFragment_15();
                toolbar.setSubtitle("Sedes");
                orden = 1;
                break;
            case FragmentNames.EQUIPOS:
                fragment = new EquiposFragment_14();
                toolbar.setSubtitle("Equipos");
                orden = 1;
                break;
            case FragmentNames.FIXTURE:
                fragment = new FixtureFragment_16();
                toolbar.setSubtitle("Fixture");
                orden = 1;
                break;
            case FragmentNames.STICKERSUNO:
                fragment = new StickersUnoFragment_15();
                orden = 1;
                break;

        }
        if(fm!=null){
            fm.beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    }


    private void setUpDrawer() {
        DrawerFragment drawerFragment = (DrawerFragment) getSupportFragmentManager().findFragmentById(R.id.drawer_fragment);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerFragment.setUpDrawer(R.id.drawer_fragment, drawerLayout, toolbar);
    }

    @Override
    public void onBackPressed() {

        switch (orden){
            case 0:
                super.onBackPressed();
                break;
            case 1:
                fragment = new AlbumFragment_12();
                toolbar.setSubtitle("");
                orden = 0;
                break;
            case 2:
                fragment = new PaisesFragment_6();
                orden = 1;
                toolbar.setSubtitle("Bloque A");
                break;
            case 3:
                fragment = new FutbolistasFragment_8();
                orden = 2;
                toolbar.setSubtitle("Dinamarca");
                break;
        }
        if(fm!=null){
            fm.beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    }
}

