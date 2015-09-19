/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpunto4;

import javax.swing.JOptionPane;

/**
 *
 * @author Stiven
 */
public class LabPunto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ALMACENARA LOS NOMBRES DE LOS PACIENTES
        String[] nombres = new String[20];
        //ALMACENARA LAS DOLENCIAS
        int[] dolencias = new int[20];
        //ALMACENARA LOS MENSAJES
        String[] mensajes = new String[20];
        //CONTADORES PARA DO WHILE, i VARIARA LA POSICION DEL ARRAY, n FINALIZARA EL CICLO
        int n = 0;
        int i = 0;
        //ALMACENAR DATOS DEL PACIENTE, HASTA 20 PERSONAS MAXIMO
        do {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del Paciente");
            dolencias[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de su dolencia 1-9"));
            //PROCESAR SI ES CONTAGIOSA, NO CONTAGIOSA, O NO SE SABE
            if (dolencias[i] >= 1 && dolencias[i] <= 3) {
                mensajes[i] = "Contagiosa";
            } else if (dolencias[i] > 3 && dolencias[i] <= 6) {
                mensajes[i] = "NO Contagiosa";
            } else {
                mensajes[i] = "No Sabemos";
            }
            System.out.println(nombres[i] + " " + dolencias[i] + " " + mensajes[i]);
            i++;
            n = Integer.parseInt(JOptionPane.showInputDialog("0.Ingresar Otro Paciente\n1.Finalizar"));

        } while (n == 0);
        //MOSTRAR DATOS AL PACIENTE
        for (int p = 0; p < i; p++) {
            JOptionPane.showMessageDialog(null, nombres[p] + " " + mensajes[p]);
        }
    }
}
