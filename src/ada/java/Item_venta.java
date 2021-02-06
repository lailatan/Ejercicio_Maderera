package ada.java;

public class Item_venta {
    private Placa Placa;
    private Integer cantidadCortes;
    public static final Double COSTO_CORTE=150.00;

    public Item_venta(Placa Placa, Integer cantidadCortes) {
        this.Placa = Placa;
        this.cantidadCortes = cantidadCortes;
    }

    public Placa getMadera() {
        return Placa;
    }

    public Integer getCantidadCortes() {
        return cantidadCortes;
    }

    public void setCantidadCortes(Integer cantidadCortes) {
        this.cantidadCortes = cantidadCortes;
    }

    public Double getCosto(){
        return Placa.getPrecio() + cantidadCortes * COSTO_CORTE;
    }

    public void mostrarDatos(){
        System.out.printf("Cantidad Cortes: %2d" , cantidadCortes);
        System.out.print("        ");
        Placa.mostrarDatos();
        System.out.print("        ");
        System.out.println("Subtotal: " + getCosto());
    }
}
