/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2.david.sanabria.vindas;

public class Habitaciones {

//Atributos 
    private int numeroHabitacion;
    private String estadoHabitacion;
    private String tipoHabitacion;
    private int precioHabitacion;

//Constructor
    public Habitaciones(int numeroHabitacion, String estadoHabitacion, String tipoHabitacion, int precioHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.estadoHabitacion = estadoHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
    }
//toString

    @Override
    public String toString() {
        return "{" + numeroHabitacion + " " + "\n" + estadoHabitacion + " " + "\n" + tipoHabitacion + " " + "\n" + precioHabitacion + " " + '}' + "\n";
    }

//Setter y getter
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

}
