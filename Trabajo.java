import java.util.Scanner;

public class Trabajo {
    public static void main(String[] args) {

        Scanner andres= new Scanner (System.in);

         int opcion;
      double TOTAL_BASICO=0;
      double TOTAL_MEDIO=0;
      double totalPremium=0;
      double precioFinal;
      double IMPUESTO_IVA = 0.19;
      double DESCUENTO_PRODUCTO= 0.10;
      double precioTotal;

         do   {
            System.out.println("CAJA REGISTRADORA");
            System.out.println("¿Que producto desea comprar?");
            System.out.println("NOTA: LOS PRODUCTOS ESTAN  ENUMERADOS, RECUERDA SEGUIR CON EL ORDEN EN EL QUE ESTA ENUMERADA CADA OPCION DE SELECCION Y DEFINALIZAR COMPRA");
            System.out.println("opcion 1. Producto basico: 20.000 ");
            System.out.println("opcion 2.Producto medio: 70.000 ");
             System.out.println("opcion 3. premium: 150.000");
            System.out.println("opcion 4. Desea finalizar compra");
            opcion=andres.nextInt();
            
            switch (opcion)  {


                  case 1: System.out.println("El producto vale: 20.000");
                      TOTAL_BASICO += 20000;
                    break;
                     
                case 2: System.out.println("El producto vale: 70.000");
                     TOTAL_MEDIO += 70000;
                     break;

                        
                     
                case 3: System.out.println("El producto vale: 150.000");
                     totalPremium += 150000;
                       break;

                     
                case 4: System.out.println("FINALIZAR COMPRA");
                    break;
                   
                    default:
                        System.out.println("Debe de ingresar el numero correcto para escoger el producto");
                    break;
                } 

                   } while ( opcion != 4);
                
                precioFinal= totalPremium + (totalPremium * IMPUESTO_IVA );
                precioTotal=  precioFinal - (precioFinal * DESCUENTO_PRODUCTO);
               

               System.out.println("---FACTURA---");
               System.out.println("El precio final del producto basico es " + TOTAL_BASICO);
               System.out.println("El precio final del  producto medio es: " + TOTAL_MEDIO );
               System.out.println("El precio final del producto premium con el iva y el descuento es: " +  precioTotal);

      
 
        

 andres.close();
     
    }
}
