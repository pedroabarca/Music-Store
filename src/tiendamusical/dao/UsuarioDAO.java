/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import tiendamusical.entidades.Usuario;

/**
 *
 * @author Pedro
 */
public class UsuarioDAO {

    public boolean registrar(Usuario usuario) throws SQLException {
        Connection c = null;
        PreparedStatement stmt = null;
        try {
            c = Conexion.conexion();
            String sql = "INSERT INTO usuario(correo, nombre, apellido_uno, apellido_dos, contrasenna)"
                    + " VALUES (?, ?, ?, ?, ?)";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, usuario.getCorreo());
            stmt.setString(2, usuario.getNombre());
            stmt.setString(3, usuario.getApellidoUno());
            stmt.setString(4, usuario.getApellidoDos());
            stmt.setString(5, usuario.getContrasenna());

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (c != null) {
                c.close();
            }
        }

        return false;
    }

    public Usuario autentificarUsuario(Usuario usuario) {
        //Consultar por id

        String sql = "SELECT id_usuario, correo, nombre, apellido_uno, apellido_dos, contrasenna\n"
                + "  FROM public.usuario WHERE correo = ? and contrasenna = ?;";
        try (Connection c = Conexion.conexion()) {
            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, usuario.getCorreo());
                stmt.setString(2, usuario.getContrasenna());
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return cargarUsuario(rs);
                }

            } catch (Exception e) {
                System.out.println("1: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("2: " + e.getMessage());
        }
        return new Usuario();

    }

    private Usuario cargarUsuario(ResultSet rs) throws SQLException {
        Usuario u = new Usuario();
        u.setId_usuario(rs.getInt("id_usuario"));
        u.setCorreo(rs.getString("correo"));
        u.setNombre(rs.getString("nombre"));
        u.setApellidoUno(rs.getString("apellido_uno"));
        u.setApellidoDos(rs.getString("apellido_dos"));
        u.setContrasenna(rs.getString("contrasenna"));
        return u;
    }

//    // INSERTAT, ACTUALIZAR, ELIMINAR CONSULTAR, funciones del DAO.
//    
//    public boolean insertar(Usuario p) throws Exception{
//        Connection c = null;
//        PreparedStatement insert = null;
//        try {
//           c = Conexion.conexion();
//           
//           String sql = "INSERT INTO persona(\n" +
//"            cedula, nombre, apellido_uno, apellido_dos,genero, fecha_nacimiento)\n" +
//"    VALUES (?, ?, ?, ?, ?, ?)";
//           insert = c.prepareStatement(sql);
////           insert.setString(1, p.getCedula());
//           insert.setString(2, p.getNombre());
//           insert.setString(3, p.getApellidoUno());
//           insert.setString(4, p.getApellidoDos());
////           insert.setString(5, String.valueOf(p.getGenero()));
////           insert.setDate(6, new Date(p.getFechaNacimiento().getTime()));
//           return insert.executeUpdate() > 0;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw e;
//        }finally{
//            if (insert != null) {
//                insert.close();
//            }if (c != null) {
//                c.close();
//            }
//        
//        }
//        }
//    public boolean eliminar(Usuario p) throws SQLException {
//        Connection c = null;
//        PreparedStatement stmt = null;
//        try {
//            c = Conexion.conexion();
//            String sql = "DELETE FROM persona where id = ? or cedula = ?";
//            stmt = c.prepareStatement(sql);
//            stmt.setInt(1, p.getId_usuario());
////            stmt.setString(2, p.getCedula());
//            return stmt.executeUpdate() > 0;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//            }
//            if (c != null) {
//                c.close();
//            }
//        }
//
//        return false;
//    }
//   public boolean update (Usuario p) throws SQLException, Exception{
//   
//  Connection c = null;
//  PreparedStatement stmt = null;
//       try {
//           c =Conexion.conexion();
//           String sql = "UPDATE persona "
//                   + " SET  cedula=?, nombre=?, apellido_uno=?, apellido_dos=?, fecha_nacimiento=?,genero=?\n"
//                   + " WHERE id = ?;";
//           stmt = c.prepareStatement(sql);
////           stmt.setString(1, p.getCedula());
//           stmt.setString(2, p.getNombre());
//           stmt.setString(3, p.getApellidoUno());
//           stmt.setString(4, p.getApellidoDos());
////           stmt.setDate(5, new Date(p.getFechaNacimiento().getTime()));
////           stmt.setString(6, String.valueOf(p.getGenero()));
//           stmt.setInt(7, p.getId_usuario());
//           
//           return stmt.executeUpdate() > 0;
//           
//       } catch (Exception e) {
//           System.out.println(e.getMessage());
//            throw e;
//       }finally{
//            if (stmt != null) {
//                stmt .close();
//            }if (c != null) {
//                c.close();
//            }
//        
//        }
//   
//  }
//   public  LinkedList<Usuario> consultar() {
//   LinkedList<Usuario> personas = new LinkedList<>();
//   
//  String sql = "SELECT "
//          + "id, cedula, nombre, apellido_uno, apellido_dos, fecha_nacimiento, \n"
//          + "genero\n"
//          +"FROM persona;";
// 
//        try (Connection c = Conexion.conexion();) {
//
//            try (PreparedStatement stmt = c.prepareStatement(sql)) {
//                ResultSet rs = stmt.executeQuery();
//                while (rs.next()) {                    
//                    personas.add(cargarPersona(rs));
//                }
//                
//            } catch (Exception e) {
//                System.out.println("1 "+ e.getMessage());
//            }
//        } catch (Exception e) {
//             System.out.println("2 "+ e.getMessage());
//        }
//        return personas;
//    }
//
//    private Usuario cargarPersona(ResultSet rs) throws SQLException {
//        Usuario p = new Usuario();
//        p.setId_usuario(rs.getInt("id"));
////        p.setCedula(rs.getString("cedula"));
//        p.setNombre(rs.getString("nombre"));
//        p.setApellidoUno(rs.getString("apellido_uno"));
//        p.setApellidoDos(rs.getString("apellido_Dos"));
////        p.setGenero(rs.getString("genero").charAt(0));
////        p.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
//        return p;
//        
//    }
// public Usuario select_by(){
//     Usuario p = new Usuario();
//     String sql = "SELECT * from persona\n" 
//                + "WHERE id = ?; ";
//       try (Connection c = Conexion.conexion();) {
//
//            try (PreparedStatement stmt = c.prepareStatement(sql)) {
//                ResultSet rs = stmt.executeQuery();
//                if(rs.next()) {                    
//                    
//                }
//                
//            } catch (Exception e) {
//                System.out.println("1 "+ e.getMessage());
//            }
//        } catch (Exception e) {
//             System.out.println("2 "+ e.getMessage());
//        }
//        return p;
//     
// 
// 
// }
}
