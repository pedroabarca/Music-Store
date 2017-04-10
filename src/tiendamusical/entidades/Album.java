/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.entidades;

import java.util.LinkedList;

/**
 *
 * @author Pedro
 */
public class Album {

    int id_album;
    String nombre;
    int anno;
    String casaDisquera;
    String descripcion;
    int precio;
    int id_genero;
    String artista;
    String canciones;

    public Album() {
    }

    public Album(int id_album, String nombre, int anno, String casaDisquera,
            String descripcion, int precio, int id_genero, String id_artista) {
        this.id_album = id_album;
        this.nombre = nombre;
        this.anno = anno;
        this.casaDisquera = casaDisquera;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id_genero = id_genero;
        this.artista = id_artista;

    }

    public int getId_album() {
        return id_album;
    }

    public void setId_album(int id_album) {
        this.id_album = id_album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getCasaDisquera() {
        return casaDisquera;
    }

    public void setCasaDisquera(String casaDisquera) {
        this.casaDisquera = casaDisquera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getId_artista() {
        return artista;
    }

    public void setId_artista(String id_artista) {
        this.artista = id_artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCanciones() {
        return canciones;
    }

    public void setCanciones(String canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "" + nombre + "     " + artista + "    " + precio + " colones";
    }

}
