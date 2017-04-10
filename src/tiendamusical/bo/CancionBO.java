/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.bo;

import java.util.ArrayList;
import java.util.LinkedList;
import tiendamusical.dao.CancionDAO;
import tiendamusical.entidades.Cancion;

/**
 *
 * @author Pedro
 */
public class CancionBO {

    CancionDAO cdao;

    public CancionBO() {
        this.cdao = new CancionDAO();
    }

    public LinkedList buscarCancionesAlbum(int id_album) {
        return cdao.buscarCancionAlbum(id_album);
    }

    public Cancion buscarCancion(String nombre) {
        return cdao.buscarCancionNombre(nombre);

    }
}
