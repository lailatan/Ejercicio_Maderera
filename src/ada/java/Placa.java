package ada.java;

public class Placa {
    private Integer modelo;
    private Double precio;
    private static final Double COSTO_PLACA=3000.00;

    public Placa(Integer tipo) {
        this.modelo = tipo;
        precio = COSTO_PLACA;
        if (tipo==4 || tipo==5)  precio+=COSTO_PLACA * 20 / 100;
    }

    public Integer getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void mostrarDatos(){
        System.out.print("Placa " + modelo);
        System.out.print(" (" + precio + ")");
    }

}
