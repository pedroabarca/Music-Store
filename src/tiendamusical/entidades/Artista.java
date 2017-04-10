/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.entidades;

/**
 *
 * @author Pedro
 */
public class Artista {

    int id;
    String nombre;
    String album;

    public Artista(int id, String nombre, String album) {
        this.id = id;
        this.nombre = nombre;
        this.album = album;
    }

    public Artista() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    

}
