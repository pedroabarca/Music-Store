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
import tiendamusical.entidades.Artista;

/**
 *
 * @author Pedro
 */
public class ArtistaDAO {

      public Artista buscarArtista(String nombre) {

        String sql = "SELECT artista.id_artista, artista.nombre, album.nombre AS nombre_album,\n" 
                + "FROM public.album, public.artista WHERE artista.nombre =? and"
                + " album.id_artista = artista.id_artista ;";

        try (Connection c = Conexion.conexion()) {
            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, nombre);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return cargarArtista(rs);
                }

            } catch (Exception e) {
                System.out.println("1: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("2: " + e.getMessage());
        }
        return new Artista();

    }

    private Artista cargarArtista(ResultSet rs) throws SQLException {
        Artista art = new Artista();
        art.setId(rs.getInt("id_artista"));
        art.setNombre(rs.getString("nombre"));
        art.setAlbum("nombre_album");

        return art;
    }

}
