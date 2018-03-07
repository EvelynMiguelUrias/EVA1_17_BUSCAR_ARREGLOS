/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_buscar_arreglos;

import java.util.Scanner;

/**
 *
 * @author Evelyn
 */
public class EVA1_17_BUSCAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiDatos = new int[5];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*10)+1;
            System.out.print(aiDatos[i] + " ");
        }
        Scanner scCaptu = new Scanner(System.in);
        System.out.println("Que valor buscas? ");
        int iVal = scCaptu.nextInt();
        for (int i = 0; i < aiDatos.length; i++) {
            if(iVal == aiDatos[i]){//LO ENCONTRAMOS 
                System.out.println("El valor esta en la posicion: " + i);
                //SI QUEREMOS DETENERLO, USARIAMOS UN break;
            }
        }
    }
    
}
