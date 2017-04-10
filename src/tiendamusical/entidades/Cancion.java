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
public class Cancion {

    int id;
    String nombre;
    int precio;
    String album;
    int id_cancion;

    public Cancion() {
    }

    public Cancion(int id, String nombre, int precio, String id_album, int id_cancion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.album = id_album;
        this.id_cancion = id_cancion;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String get_album() {
        return album;
    }

    public void set_album(String id_album) {
        this.album = id_album;
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

    @Override
    public String toString() {
        return "" + nombre + "     " + precio + "colones";
    }

}
