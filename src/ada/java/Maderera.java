package ada.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
Maderera
Una maderera ofrece cortes a los clientes en placas MDF. La maderera tiene 5 modelos de placas que el
cliente puede elegir. Los modelos 4 y 5 son un 20% más caros que los otros modelos.
Los clientes corporativos sólo pueden pedir placas enteras o con 1 o 2 cortes.
Los clientes particulares pueden pedir la cantidad de cortes que deseen.
Cada corte tiene un costo de 150 pesos. El costo de la placa (1, 2 y 3) es de 3000 pesos.
Antes de comprar, el cliente debe indicar la fecha en la que retira la madera. Si retira los primeros
10 días del mes, tiene un 20% de descuento.
Informar el costo total.

Maderera    --> Ventas
Cliente     --> Tipo (Corporativos piden entera o hasta 2 cortes)
                     (Particulares  sin limite)
Venta       --> Cliente
            --> items
                fecha retiro (los primeros 10 días del mes, tiene un 20% de descuento)
item Venta --> Madera
                cantidad contes (150$)
Madera      --> modelo (5 modelos)
                precio (base 3000$, 4 y 5 20% mas)

*/
public class Maderera {

    public static void main(String[] args) {
        List<Venta> ventas = new ArrayList<>();
        Madera madera1=new Madera(1);
        Madera madera2=new Madera(2);
        Madera madera3=new Madera(3);
        Madera madera4=new Madera(4);
        Madera madera5=new Madera(5);

        Cliente cliente1 = new Cliente("ConstruNorte S.A.", "Corporativo");
        Cliente cliente2 = new Cliente("Jose Luis", "Particular");

        Venta venta1 = new Venta(1,cliente1, LocalDate.of(2021,2,20));
        if (!venta1.agregarItem(madera1,10))
            System.out.println("No se pueden agregar esta venta con 10 cortes");
        if (!venta1.agregarItem(madera2,2))
            System.out.println("No se pueden agregar esta venta.");
        ventas.add(venta1);

        Venta venta2 = new Venta(2,cliente2, LocalDate.of(2021,3,5));
        if (!venta2.agregarItem(madera1,10))
            System.out.println("No se pueden agregar esta venta.");
        ventas.add(venta2);

        Venta venta3 = new Venta(3,cliente1, LocalDate.of(2021,3,10));
        if (!venta3.agregarItem(madera4,2))
            System.out.println("No se pueden agregar esta venta.");
        if (!venta3.agregarItem(madera1,1))
            System.out.println("No se pueden agregar esta venta.");
        ventas.add(venta3);

        System.out.println("*********************************************************************************************************");
        System.out.println("            LISTADO DE VENTAS");
        System.out.println("*********************************************************************************************************");
        for (Venta v : ventas){
            v.mostrarDatos();
            System.out.println("---------------------------------------------------------------------------------------------------------");
        }

    }
}
