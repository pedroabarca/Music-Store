/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.bo;

import java.sql.SQLException;
import tiendamusical.dao.UsuarioDAO;
import tiendamusical.entidades.Usuario;

/**
 *
 * @author Pedro
 */
public class UsuarioBO {

    UsuarioDAO udao;

    public UsuarioBO() {
        udao = new UsuarioDAO();
    }

    public boolean autentificarContrasenna(Usuario u) {
        return u.getContrasenna().equals(u.getContraDos());

    }

    public boolean registrar(Usuario u) throws SQLException {
        return udao.registrar(u);
    }

    public Usuario autentificarUsuario(Usuario u) {

        return udao.autentificarUsuario(u);

    }

}
