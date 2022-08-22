/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;



import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class main {
    public static void main(String [] args){
        String respuesta="";
        int respuesta1=0;
       
        coche coche=new coche();
        boolean seleccion=true;
        while(seleccion=true){
        respuesta=JOptionPane.showInputDialog(null,"Selecciones unas de las opciones por favor: \n 1:Asignar cosas\n 2:Elegir por pruebas por ruedas\n 3:Salir");
       
        switch(respuesta){
                case "1":
                      respuesta=JOptionPane.showInputDialog(null,"Seleccione una opcion\n1: Carros\n 2:: Motocicletas\n 3:Bicicletas\n 4: Camionetas");
                      switch(respuesta){
                          case"1":
                                 respuesta=(JOptionPane.showInputDialog(null,"Dijite el cilindrage: "));
                                 coche.setcilindrado(respuesta);
                                 respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de llantas: "));
                                 coche.setruedas(respuesta1);
                                 respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el kilometrage: "));
                                 coche.setvelocidad(respuesta1);
                                 respuesta=(JOptionPane.showInputDialog(null,"Dijite el color: "));
                                 coche.setcolor(respuesta);
                                  
                              break;
                                case"2":
                                 respuesta=(JOptionPane.showInputDialog(null,"Digite el cilindrage: "));
                                 coche.setcilindrado(respuesta);
                                 respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de llantas: "));
                                 coche.setruedas(respuesta1);
                                 respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el kilometrage: "));
                                 coche.setvelocidad(respuesta1);
                                 respuesta=(JOptionPane.showInputDialog(null,"Dijite el color: "));
                                 coche.setcolor(respuesta);
                              break;
                                case"3":
                                    
                              break;
                                    
                              
                                case"4":
                                    
                              break;
                      }
                    break;
                    case "2":
                        respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de llantas: "));
                        coche.setruedas(respuesta1);
                        if(coche.ruedas==2){
                              JOptionPane.showMessageDialog(null,"Motocicletas:\n Honda parroquiales \n BMW WADS \n Suzuki Gagamuchi \n KTM HD \n");
                               JOptionPane.showMessageDialog(null,"Bicicletas:\n BMX \n Specialized \n Trek \n Shimano \n");
                        }
                        if(coche.ruedas==4){
                              JOptionPane.showMessageDialog(null,"Carros:\n Ferrari Tuneado\n Honda Parroquiales \n MC Claren WIECH \n Dodge \n");
                             JOptionPane.showMessageDialog(null,"Camionetas: \n Raptor \n Hiunday Tuturu \n Thule \n"); 
                        }
                      
                    break;
                    case "3":
                        System.exit(0);
                    break;
        }
        }

    }   
}
