package com.mycompany.tarea1;

import hola.Cliente;
import hola.Producto;

/**
 *
 * @author joser
 */
public class Tarea1 {

    public static void main(String[] args) {
        Producto objproducto1= new Producto("Shampoo","sedal", 7.00, 1);
        System.out.println("PRODUCTOS");
        System.out.println("Nombre del producto:" +objproducto1.getNombrePro());
        System.out.println("Descripcion:" +objproducto1.getDescripcion());
        System.out.println("Precio:" +objproducto1.getPrecio());
        System.out.println("Stock:" +objproducto1.getStock());
        
        Producto objproducto2= new Producto("Celular", "tecno", 150.00, 1);
        System.out.println("Nombre del producto:" +objproducto2.getNombrePro());
        System.out.println("Descripcion:" +objproducto2.getDescripcion());
        System.out.println("Precio:" +objproducto2.getPrecio());
        System.out.println("Stock:" +objproducto2.getStock());
        
        Cliente objcliente1= new Cliente("Genesis", "Delgado", "soltera", "genesis.delgado@espoch.edu.ec", "1501153165");
        System.out.println("CLIENTES ");
        System.out.println("Nombre:" +objcliente1.getNombre());
        System.out.println("Apellido :" +objcliente1.getApellido());
        System.out.println("Estado civil:"+objcliente1.getEstadoCivil());
        System.out.println("Correo:" +objcliente1.getMail());
        System.out.println("Cedula:" +objcliente1.getCedula());
        
        Cliente objcliente2= new Cliente("Victor","Valle","soltero","victor.valle@espoch.edu.ec","150345676");
        System.out.println("Nombre:" +objcliente2.getNombre());
        System.out.println("Apellido:" +objcliente2.getApellido());
        System.out.println("Estado civil:"+objcliente2.getEstadoCivil());
        System.out.println("Correo:" +objcliente2.getMail());
        System.out.println("Cedula:" +objcliente2.getCedula());
    
    }
}
