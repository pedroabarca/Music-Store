/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.bo;

import java.util.ArrayList;
import java.util.LinkedList;
import tiendamusical.dao.AlbumDAO;
import tiendamusical.entidades.Album;

/**
 *
 * @author Pedro
 */
public class AlbumBO {

    AlbumDAO adao;

    public AlbumBO() {
        this.adao = new AlbumDAO();
    }

    public Album buscarAlbum(String nombre) {
        return adao.buscarAlbum(nombre);

    }

}
