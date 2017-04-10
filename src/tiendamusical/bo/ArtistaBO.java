/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.bo;

import tiendamusical.dao.ArtistaDAO;
import tiendamusical.dao.UsuarioDAO;
import tiendamusical.entidades.Artista;

/**
 *
 * @author Pedro
 */
public class ArtistaBO {

    ArtistaDAO adao;

    public ArtistaBO() {
        this.adao = new ArtistaDAO();
    }

 public Artista buscarArtista(String nombre) {
        return adao.buscarArtista(nombre);

    }
}
