/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.pkg1;
import java.util.Scanner; //el programa usa la clase scanner, para poder insertar datos

/**
 *
 * @author Gustavo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cre un objeto Scanner para obtener la entrada de la venta de comando
        Scanner entrada = new Scanner( System.in);

        System.out.println("ENTRADA DE DATOS");
        int numero;
        System.out.println("inserte un numero: (entero) ");
        numero = entrada.nextInt();
        System.out.println("El numero int es: "+numero);
        
        float numero2;
        System.out.println("inserte un numero: (float)");
        numero2 = entrada.nextFloat();
        System.out.println("El numero float es: " + numero2);
        
        double numero3;
        System.out.println("inserte un numero: (double)");
        numero3 = entrada.nextDouble();
        System.out.println("El numero double es:"+numero3);
        
        String cadena;
        System.out.println("Digite una Cadena: ");
        cadena = entrada.next();//el uso de next solo guarda los caracteres
        //hasta que se inserte un espacio, despues del espacio no lo guarda
        System.out.println("La cadena es: "+cadena);
        
        char letra;
        System.out.println("Inserte un caracter: ");
        letra = entrada.next().charAt(0);//charArt(0) indica que se va a guardar
        //solo el primer carcater de los que se escribe
        System.out.println("El caracter es: "+letra);
     
        System.out.println("INSTRUCCIONES DE CONTROL");
        //SENTENCIA DE DECICION
        System.out.println("DECICION");
        int calificacion;
        System.out.println("Inserte una calificacion para definir su estado: ");
        calificacion = entrada.nextInt();
        if(calificacion >= 6)
            System.out.print("APROBADO con: "+ calificacion);
        else{
            System.out.print("REPROBADO con: " + calificacion );
        }
        System.out.println();
         
        //SENTENCIA DE REPETICION
        System.out.println("REPETICION CON WHILE");
        int contador=0;
        int num;
        while(contador < 3){
            System.out.print("inserte un numero: ");
            num = entrada.nextInt();
            contador = contador+1;
        }
        
        //ciclo for
        System.out.println("REPETICION CON FOR");
        for(int i=0; i<10; i++){
            System.out.println(" "+i);
        }
        System.out.println(" ");
        
        //ARREGLOS
        System.out.println("ARREGLOS 3");
        int arreglo [];//declaracion del arreglo
        arreglo = new int [10];//se crea el espacio para el areglo
        System.out.println("%s%8s\n"+"indice"+"valor");
        for(int pos = 0; pos < arreglo.length; pos++){
            System.out.println(" "+pos+" " + arreglo[pos]);
        }
        
    }
    
}
