package ada.java;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String tipo;
    private Integer topeCortes;

    public Cliente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        if (tipo=="Corporativo") topeCortes=2;
        else topeCortes=0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getTopeCortes() {
        return topeCortes;
    }

    public void mostrarDatos(){
        System.out.print("Cliente: " + nombre);
        System.out.println(" - Tipo: " + tipo);
    }
}
