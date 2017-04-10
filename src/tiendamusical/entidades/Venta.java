/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.entidades;

import java.sql.Date;

/**
 *
 * @author Pedro
 */
public class Venta {

    int id;
    Date fecha;
    int costoTotal;

    public Venta(int id, Date fecha, int costoTotal) {
        this.id = id;
        this.fecha = fecha;
        this.costoTotal = costoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

}
