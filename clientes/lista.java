package clientes;

import javax.swing.JOptionPane;

public class lista {
    private nodo cabeza;
    
    
    public lista(){this.cabeza=null;}
    

    //metodo que llama acepta datos para introducirlo a la lista
    public void inserta(datos pDato){
        //Crear el nuevo nodo a insertar
        nodo nuevo=new nodo(pDato);
        //si no hay nada en la lista se cumple esta primera condicion que le da a cabeza los primeros datos de la lista 
        if(cabeza==null){
            //Lista es vacia
            cabeza=nuevo;
           
            
        }else if(pDato.getIdentificacion()!=cabeza.getDato().getIdentificacion()){
            //si hay datos en la lista mientras la identificacion del usuario insertada sea diferente de una ya existente 
            //va a agregarlo a la lista
            nuevo.setSiguiente(cabeza);
            cabeza=nuevo;
            
        }else if(cabeza.getSiguiente()==null){
            //La lista solo tiene un elemento
            cabeza.setSiguiente(nuevo);
            
        }else{
            //para todos los casos que no se cumpla el if y else if
            nodo aux=this.cabeza;
            while(aux.getSiguiente()!=null && 
                    aux.getSiguiente().getDato().getIdentificacion()<pDato.getIdentificacion()){
                
                aux=aux.getSiguiente();
            }
            
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
            
        }
    }
    //metodo para modificar algun cliente ya existente,modificando los datos de este en caso de que sea nesesario
    public void modifica(datos p) {
        //asigna la identificacion brindada 
        int id = p.getIdentificacion();
        nodo aux = cabeza;
        
        while (aux != null) {
            //si la identificacion brindada existe en la lista se asignaran los nuevos datos brindados remplasando los viejos
            if (aux.getDato().getIdentificacion() == id) {
                aux.getDato().setNombre(p.getNombre());
                aux.getDato().setApellido1(p.getApellido1());
                aux.getDato().setApellido2(p.getApellido2());
                aux.getDato().setCorreo(p.getCorreo());
                aux.getDato().setTelefono(p.getTelefono());
                JOptionPane.showMessageDialog(null, "datos actualizados");
                break;
            }else{
                //si la identificacion brindada no existe muestra el siguiente mensaje
            JOptionPane.showMessageDialog(null, "identifcacion no encontrada");

            }
            aux = aux.getSiguiente();
        }
    }


    @Override
    public String toString() {
        String r="";
        nodo aux=cabeza;
        while(aux!=null){
            r+=aux.toString()+"\n";
            aux=aux.getSiguiente();
        }
        return r;
    }
}
