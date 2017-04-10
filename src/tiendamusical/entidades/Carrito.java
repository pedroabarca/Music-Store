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
public class Carrito {

    int id;
    int subTotal;
    boolean cancion;

    public Carrito(int id, int subTotal, boolean cancion) {
        this.id = id;
        this.subTotal = subTotal;
        this.cancion = cancion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public boolean isCancion() {
        return cancion;
    }

    public void setCancion(boolean cancion) {
        this.cancion = cancion;
    }

}
