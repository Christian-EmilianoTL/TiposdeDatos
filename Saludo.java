import java.util.Scanner; 
public class Saludo{
    public static void main (String [] args){
        Scanner ingreso = new Scanner(System.in); 
        String nombre;
        int edad; 

        System.out.println("Dime tu nombre:");
        nombre = ingreso.nextLine(); 

        System.out.println("Dime tu edad: ");
        edad = ingreso.nextInt(); 

        System.out.println("Tu nombre es "+ nombre); 
        System.out.println("Tu edad es: "+ edad);

    }
}