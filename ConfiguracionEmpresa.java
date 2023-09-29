/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

/**
 *
 * @author zloai
 */
public class ConfiguracionEmpresa {

    // Campos estáticos para la información de la empresa
    private static final String NOMBRE_EMPRESA = "AzzaCar";
    private static final String TELEFONO_EMPRESA = "8888-8888";
    private static final String DIRECCION_EMPRESA = "Cartago, Cartago, Occidental";

    // Métodos estáticos para acceder a la información de la empresa
    public static String getNombreEmpresa() {
        return NOMBRE_EMPRESA;
    }

    public static String getTelefonoEmpresa() {
        return TELEFONO_EMPRESA;
    }

    public static String getDireccionEmpresa() {
        return DIRECCION_EMPRESA;
    }

    public class Usuario {

        private final String nombre;
        private final String apellidos;
        private final String identificacion;
        private final String correoElectronico;
        private final String numeroTelefono;
        private final String contraseña;

        public Usuario(String nombre, String apellidos, String identificacion, String correoElectronico, String numeroTelefono, String contraseña) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.identificacion = identificacion;
            this.correoElectronico = correoElectronico;
            this.numeroTelefono = numeroTelefono;
            this.contraseña = contraseña;
        }

        // Métodos para obtener información del usuario
        public String getNombre() {
            return nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public String getIdentificacion() {
            return identificacion;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public String getNumeroTelefono() {
            return numeroTelefono;
        }

        public String getContraseña() {
            return contraseña;
        }
    }
}
