import java.util.Scanner; 
public class Tiposdedatos{
    public static void main (String [] args){
        Scanner ingresado = new Scanner(System.in); 
        //Cadena
        System.out.println("Ingresa tu nombre: "); 
        String nombre = ingresado.nextLine; 
        //Caracter
        System.out.println("Ingresa tu inicial: ");
        Char inicial = ingresado.next().charAt(index: 0);
        //Enteros
        System.out.println("Ingresa tu edad: ");
        int edad = ingresado.nextLine(); 
        //Decimal 
        System.out.println("Ingresa tu estatura: ");
        float estatura = ingresado.nextFloat(); 
        //Doble
        System.out.println("Ingresa tu peso: ");
        double peso = ingresado.nextDouble(); 
        //Booleano
        System.out.println("Eres estudiante: ");
        boolean estudiante = ingresado.nextBoolean(); 

        System.out.println("Tu nombre es:"+nombre);
        System.out.println("Tu inicial es:"+inicial);
        System.out.println(" Tu edad es:"+edad);
        System.out.println("Tu estatura es:"+estatura); 
        System.out.println("Tu peso es:"+peso);
        System.out.println("Y eres:"+estudiante); 
    }
}