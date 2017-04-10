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
import java.util.LinkedList;
import tiendamusical.entidades.Album;
import tiendamusical.entidades.Cancion;

/**
 *
 * @author Pedro
 */
public class CancionDAO {

    public Cancion buscarCancionNombre(String nombre) {

        String sql = "SELECT cancion.id_cancion, cancion.nombre, "
                + "cancion.precio, cancion.id_album_fk, "
                + "cancion.id_artista, album.nombre as nombre_album\n"
                + "  FROM public.cancion, public.album "
                + "WHERE cancion.nombre =? and album.id_album = cancion.id_album_fk";

        try (Connection c = Conexion.conexion()) {
            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, nombre);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return cargarCancion(rs);
                }

            } catch (Exception e) {
                System.out.println("1: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("2: " + e.getMessage());
        }
        return new Cancion();

    }

    private Cancion cargarCancion(ResultSet rs) throws SQLException {
        Cancion c = new Cancion();
        c.setId_cancion(rs.getInt("id_cancion"));
        c.setNombre(rs.getString("nombre"));
        c.setPrecio(rs.getInt("precio"));
        c.set_album(rs.getString("nombre_album"));
        return c;
    }

    public LinkedList buscarCancionAlbum(int id_album) {

        String sql = "SELECT id_cancion, nombre, precio, id_album_fk, id_artista\n"
                + "  FROM public.cancion WHERE cancion.id_album_fk =?";

        try (Connection c = Conexion.conexion()) {
            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setInt(1, id_album);
                ResultSet rst = stmt.executeQuery();
                LinkedList<Cancion> clist = new LinkedList<>();
                while (rst.next()) {
                    Cancion cancion = new Cancion();
                    cancion.setNombre(rst.getString("nombre"));
                    cancion.setPrecio(rst.getInt("precio"));
                    clist.add(cancion);
                }
                return clist;

            } catch (Exception e) {
                System.out.println("1: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("2: " + e.getMessage());
        }
        return new LinkedList();

    }

}
