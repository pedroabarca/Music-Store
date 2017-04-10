/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusical.entidades;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Usuario {

    private int id_usuario;
    private String nombre;
    private String apellidoUno;
    private String apellidoDos;
    private String correo;
    private String contrasenna;
    private String contraDos;

    public Usuario(int id_usuario, String nombre, String apellidoUno, String apellidoDos, String correo, String contrasenna, String contraDos) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.correo = correo;
        this.contrasenna = contrasenna;
        this.contraDos = contraDos;
    }

    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getContraDos() {
        return contraDos;
    }

    public void setContraDos(String contraDos) {
        this.contraDos = contraDos;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Usuario other = (Usuario) obj;
//        if (this.id_usuario != other.id_usuario) {
//            return false;
//        }
//        return true;
//    }
    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nombre=" + nombre
                + ", apellidoUno=" + apellidoUno + ", apellidoDos=" + apellidoDos + ", correo=" + correo + ", contrasenna=" + contrasenna + '}';
    }

}
