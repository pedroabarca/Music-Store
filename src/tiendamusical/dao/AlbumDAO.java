/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tiendamusical.entidades.Album;
import tiendamusical.entidades.Usuario;

/**
 *
 * @author Pedro
 */
public class AlbumDAO {

    public Album buscarAlbum(String nombre) {

        String sql = "SELECT album.id_album, album.nombre, album.anno, "
                + "album.casa_disc, album.descripcion, album.precio,"
                + " album.id_genero, \n"
                + "       album.id_artista, album.id_cancion, artista.nombre as nombre_artista \n"
                + "  FROM public.album, public.artista WHERE album.nombre =?"
                + " and artista.id_artista = album.id_artista;";

        try (Connection c = Conexion.conexion()) {
            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, nombre);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return cargarAlbum(rs);
                }

            } catch (Exception e) {
                System.out.println("1: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("2: " + e.getMessage());
        }
        return new Album();

    }

    private Album cargarAlbum(ResultSet rs) throws SQLException {
        Album alb = new Album();
        alb.setId_album(rs.getInt("id_album"));
        alb.setNombre(rs.getString("nombre"));
        alb.setAnno(Integer.parseInt(rs.getString("anno")));
        alb.setCasaDisquera(rs.getString("casa_disc"));
        alb.setDescripcion(rs.getString("descripcion"));
        alb.setPrecio(Integer.parseInt(rs.getString("precio")));
        alb.setId_genero(Integer.parseInt(rs.getString("id_genero")));
        alb.setId_artista(rs.getString("nombre_artista"));
        return alb;
    }

}
