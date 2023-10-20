/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendedoresarreglosena;
import java.util.Scanner;

/**
 *
 * @author JohnMayorga18
 */
public class VendedoresArregloSENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cantvendedores;
        int contador=1;
        
        //Doy la bienvenida al programa
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Programa Para Calcular el Promedio de tus Vendedores: ");
        System.out.println("BIENVENIDO/A: ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        
        Scanner in = new Scanner(System.in);
        
        //Pregunto la Cantidad de Vendedores
        while(true){
            try {
                System.out.println("Cuantos Vendedores hay en tu Compañía?: ");
                cantvendedores = Integer.parseInt(in.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("La Cantidad de Vendedores Ingresada NO ES VALIDA!!!!. ");
            }
        }
        
        //Creo el Arreglo de 2 Dimensiones
        String[][] reportevendedores = new String[cantvendedores][6];
        
        while(contador<=cantvendedores){
            
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("Ingresa el Nombre del Vendedor: " + contador);
            reportevendedores[contador - 1][0] = in.nextLine();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
            
            while (reportevendedores[contador - 1][0].equals("")){
                System.out.println("El Nombre Ingresado no es Valido. ");
                System.out.println("Ingresa el Nombre del Vendedor: ");
                reportevendedores[contador - 1][0] = in.nextLine();
            } 
            
            for (int i = 1; i < 5; i++) {
                
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                System.out.println("Ingresa el Valor de las Ventas del TRIMESTRE "+ i +" para " + reportevendedores[contador - 1][0]);
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                reportevendedores[contador - 1][i] = in.nextLine();
                
                while(true){
                    try {
                        Float.parseFloat(reportevendedores[contador - 1][i]);
                        break;
                    } catch (Exception e) {
                        System.out.println("El valor de Ventas Ingresado para: " + reportevendedores[contador - 1][0] + " NO ES VALIDO!!!!");
                        System.out.println("Ingresa el Valor de las Ventas del TRIMESTRE "+ i +" para " + reportevendedores[contador - 1][0]);
                        reportevendedores[contador - 1][i] = in.nextLine();
                    }
                }
            }
            contador=contador+1;
        }
        
        System.out.println("Calculando Promedios . . . . . . . . . . . . ");
        float sumapromedios=0;
        
        contador=1;
        
        while(contador<=cantvendedores){
            reportevendedores[contador - 1][5]=Float.toString(
                    (
                            Float.parseFloat(reportevendedores[contador - 1][1]) + Float.parseFloat(reportevendedores[contador - 1][2]) +
                            Float.parseFloat(reportevendedores[contador - 1][3]) + Float.parseFloat(reportevendedores[contador - 1][4])
                    )/4
            );
        contador=contador+1;
        }
        
        contador=1;
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Estos Son los Datos de TODOS los Vendedores");
        System.out.println("Incluyendo Promedios: ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        
        while(contador<=cantvendedores){
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("| Nombre Vendedor: | Promedio Primer Trimeste: | Promedio Segundo Trimeste: | Promedio Tercer Trimeste: | Promedio Cuarto Trimestre: | Promedio Año: | ");
            System.out.println(" | " + reportevendedores[contador - 1][0] + " | " + reportevendedores[contador - 1][1] + " | " + reportevendedores[contador - 1][2] + " | " + reportevendedores[contador - 1][3] + " | " + reportevendedores[contador - 1][4] + " | " + reportevendedores[contador - 1][5]);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            
            sumapromedios = (sumapromedios + Float.parseFloat(reportevendedores[contador - 1][5]));
            contador = contador+1;
        }
        
        System.out.println("- - - - - - - - - - - - - - - - - - ");
        System.out.println("Promedio de TODOS los Vendedores: " + (sumapromedios/cantvendedores));
        System.out.println("- - - - - - - - - - - - - - - - - - ");
    }
    
}
