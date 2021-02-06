package ada.java;

public class Madera {
    private Integer tipo;
    private Double precio;
    private static final Double COSTO_PLACA=3000.00;

    public Madera(Integer tipo) {
        this.tipo = tipo;
        precio = COSTO_PLACA;
        if (tipo==4 || tipo==5)  precio+=COSTO_PLACA * 20 / 100;
    }

    public Integer getTipo() {
        return tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void mostrarDatos(){
        System.out.print("Madera " + tipo);
        System.out.print(" (" + precio + ")");
    }

}
