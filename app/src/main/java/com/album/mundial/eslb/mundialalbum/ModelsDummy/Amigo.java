package com.album.mundial.eslb.mundialalbum.ModelsDummy;

public class Amigo {

    private int foto;
    private String descripcion;

    public Amigo() {
    }

    public Amigo(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
