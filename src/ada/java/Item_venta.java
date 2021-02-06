package ada.java;

public class Item_venta {
    private Madera madera;
    private Integer cantidadCortes;
    public static final Double COSTO_CORTE=150.00;

    public Item_venta(Madera madera, Integer cantidadCortes) {
        this.madera = madera;
        this.cantidadCortes = cantidadCortes;
    }

    public Madera getMadera() {
        return madera;
    }

    public Integer getCantidadCortes() {
        return cantidadCortes;
    }

    public void setCantidadCortes(Integer cantidadCortes) {
        this.cantidadCortes = cantidadCortes;
    }

    public Double getCosto(){
        return madera.getPrecio() + cantidadCortes * COSTO_CORTE;
    }

    public void mostrarDatos(){
        System.out.print("Cantidad Cortes:" + cantidadCortes);
        System.out.print("        ");
        madera.mostrarDatos();
        System.out.print("        ");
        System.out.println("Subtotal: " + getCosto());
    }
}
