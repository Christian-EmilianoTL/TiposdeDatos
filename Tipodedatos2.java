import java.util.Scanner; 
public class Tipodedatos2 {
    public static void main (String [] args){
        Scanner ingreso = new Scanner(System.in); 
        final double DESC = .10;
        double art,art2,art3,art4,art5,total,totalcondescuento; 
        System.out.println("Tus productos son: ");
         System.out.println("Agua: ");
          art = ingreso.nextDouble(); 

           System.out.println("Paleta: ");
            art2 = ingreso.nextDouble();

             System.out.println("Gansito: ");
              art3 = ingreso.nextDouble(); 

               System.out.println("Oreos: ");
                art4 = ingreso.nextDouble();
                 
                 System.out.println("Sabritas: ");
                  art5 = ingreso.nextDouble(); 

        total = art + art2 + art3 + art4 + art5; 

           totalcondescuento = total - (total * DESC); 
        
           System.out.println("El total de tus articulos (con descuento) es:  "+totalcondescuento); 
        
        ingreso.close(); 
    }
}
