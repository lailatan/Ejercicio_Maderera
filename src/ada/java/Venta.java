package ada.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private Integer numero;
    private Cliente cliente;
    private List<Item_venta> items;
    private LocalDate fechaRetiro;

    public Venta(Integer numero, Cliente cliente, LocalDate fechaRetiro) {
        this.numero = numero;
        this.cliente = cliente;
        this.fechaRetiro = fechaRetiro;
        this.items = new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public List<Item_venta> getItems() {
        return items;
    }

    public Boolean agregarItem(Placa Placa, Integer cantidadCortes) {
        if (cliente.getTopeCortes()>0 && cliente.getTopeCortes()<cantidadCortes)
            return false;
        else {
            items.add(new Item_venta(Placa,cantidadCortes));
            return true;
        }
    }

    public Double costoTotalBruto(){
        Double total=0.0;
        for (Item_venta item:items) total+=item.getCosto();
        return total;
    }

    public Double costoTotalNeto(){
        Double total=costoTotalBruto();
        return (fechaRetiro.getDayOfMonth()<=10) ? (total-total * 20 / 100):total;
    }

    public void mostrarDatos(){
        System.out.print("Venta #" + numero);
        System.out.print("        ");
        System.out.print("Fecha Retiro: " + fechaRetiro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.print("        ");
        cliente.mostrarDatos();
        for (Item_venta i:items) i.mostrarDatos();
        System.out.print("Total Bruto: " + costoTotalBruto());
        System.out.print("              ");
        System.out.println("Total Neto: " + costoTotalNeto());
    }
}
