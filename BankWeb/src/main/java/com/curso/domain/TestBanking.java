package com.curso.domain;

public class TestBanking {
    public static void main(String[] args) {
        
        Bank.addCustomer("Jane", "Simms");
        Bank.addCustomer("Owen", "Bryant");
        Bank.addCustomer("Tim", "Soley");
        Bank.addCustomer("Maria", "Soley");
        
        for ( int i = 0; i < Bank.getNumOfCustomers(); i++ ) {
            Customer customer = Bank.getCustomer(i);
            
            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
}
//index con un boton que muestre una lista de clientes
//si la muestra cuando hago click en un cliente tengo que mostrar la cuenta de ese cliente
//necesito un bank services donde le pido todos los clientes, creo un bloque estatico dentro de la clase bank