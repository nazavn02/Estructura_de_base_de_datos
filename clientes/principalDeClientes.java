package clientes;

import javax.swing.JOptionPane;

public class principalDeClientes {
    private final lista list;
    //private nodo cabeza;

    public principalDeClientes() {
        list = new lista();
    }

    
    public void ejecutar() {
        lista a=new lista();

        a.inserta(new datos("alexander","sojo","jimenez",
                "alesojojimes@gmail.com",305550429,71005216));
        a.inserta(new datos("alexander2","sojo2","jimenez2",
                "alesojojimes@gmail.com",1111,71005216));
        
        System.out.println(a.toString());
        //modificacion de datos pide los datos y los modifica
        datos persona = new datos(JOptionPane.showInputDialog("Ingrese el nombre "),
                JOptionPane.showInputDialog("Ingrese el apellido "),
                JOptionPane.showInputDialog("Ingrese el segundo apellido"),
                JOptionPane.showInputDialog("Ingrese el correo del cliente"),
                Integer.parseInt(JOptionPane.showInputDialog("ingrese la cedula")),
                Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero telefonico")));
  
        JOptionPane.showMessageDialog(null, a.toString());
        a.modifica(persona);
        JOptionPane.showMessageDialog(null, a.toString());
    
    }
    public static void main(String[] args) {
        
        principalDeClientes otro = new principalDeClientes();
        lista a=new lista();
        a.inserta(new datos("teran","sojo","jimenez",
                "alesojojimes@gmail.com",777,71005216));
        //otro.primerejecutar();
        otro.ejecutar();

        System.out.println(a.toString());
        //JOptionPane.showMessageDialog(null, a.mostrasClientes());
        JOptionPane.showMessageDialog(null, a.toString());
        
    }
}
