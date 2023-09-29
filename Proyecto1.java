/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyecto1;

import com.mycompany.proyecto1.ConfiguracionEmpresa.Usuario;

/**
 *
 * @author zloai
 */
public class Proyecto1 {

    public static void main(String[] args) {

        // Acceder a la información de la empresa
        String nombreEmpresa = ConfiguracionEmpresa.getNombreEmpresa();
        String telefonoEmpresa = ConfiguracionEmpresa.getTelefonoEmpresa();
        String direccionEmpresa = ConfiguracionEmpresa.getDireccionEmpresa();

        // Mostrar la información de la empresa
        System.out.println("Nombre de la empresa: " + nombreEmpresa);
        System.out.println("Teléfono de la empresa: " + telefonoEmpresa);
        System.out.println("Dirección de la empresa: " + direccionEmpresa);
        Iterable<Usuario> usuarios = null;
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellidos: " + usuario.getApellidos());
            System.out.println("Identificación: " + usuario.getIdentificacion());
            System.out.println("Correo Electrónico: " + usuario.getCorreoElectronico());
            System.out.println("Número de Teléfono: " + usuario.getNumeroTelefono());
            System.out.println("Contraseña: " + usuario.getContraseña());
            System.out.println();
        }
    }
}
