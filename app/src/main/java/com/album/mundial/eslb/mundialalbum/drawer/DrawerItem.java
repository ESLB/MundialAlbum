package com.album.mundial.eslb.mundialalbum.drawer;


public class DrawerItem {

    private String nombre, apellidos, fragmentTAG;

    public DrawerItem(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public DrawerItem(String nombre, String apellidos, String fragmentTAG) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fragmentTAG = fragmentTAG;
    }

    public DrawerItem() {
    }

    public String getFragmentTAG() {
        return fragmentTAG;
    }

    public void setFragmentTAG(String fragmentTAG) {
        this.fragmentTAG = fragmentTAG;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
