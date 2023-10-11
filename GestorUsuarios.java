/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectousuarios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * gestiona los usuarios que se crearon de la clase Usuario 
 * se crea un Stack para que con el constructor iniciarlo con un push y agregar
 * el usuario al Stack
 */
public class GestorUsuarios {
    private Stack<Usuario> usuarios = new Stack<>();

    // Método para agregar un usuario a la pila
    public void agregarUsuario(Usuario usuario) {
        usuarios.push(usuario);
    }

    // Método para guardar usuarios en un archivo .txt usando recursividad
    public void guardarUsuarios(String archivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo, true))) {
            guardarUsuariosEnArchivo(writer, usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método recursivo para guardar usuarios en el archivo
    private void guardarUsuariosEnArchivo(PrintWriter writer, Stack<Usuario> stack) {
        if (!stack.isEmpty()) {
            Usuario usuario = stack.pop();
            guardarUsuariosEnArchivo(writer, stack);
            writer.println("Nombre: " + usuario.getNombre());
            writer.println("Apellidos: " + usuario.getApellidos());
            writer.println("Identificación: " + usuario.getIdentificacion());
            writer.println("Correo Electrónico: " + usuario.getCorreo());
            writer.println("Número de Teléfono: " + usuario.getTelefono());
            writer.println("Contraseña: " + usuario.getPassword());
            writer.println();
        }
    }
}
