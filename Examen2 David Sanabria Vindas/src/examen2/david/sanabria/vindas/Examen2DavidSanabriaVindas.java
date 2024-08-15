/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2.david.sanabria.vindas;

import javax.swing.JOptionPane;

public class Examen2DavidSanabriaVindas {

    public static void main(String[] args) {
        //Creacion de objeto en la clase registoHabitaciones
        RegistroHabitaciones habitacion = new RegistroHabitaciones();
        //Menu
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea modificar la infomracion \n"
                + "Ingrese 2 si desea ver la informacion del hotel\n"));
        //Solicitud de numero hasta que sea valido 
        while (num > 2) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero erroneo \n" + "Ingrese 1 si desea modificar la infomracion \n"
                    + "Ingrese 2 si desea ver la informacion del hotel\n"));
        }
        if (num == 1) {
            habitacion.agregarinfo(habitacion.arrHabitaciones);
            habitacion.ModificarHabitacion();
            habitacion.EstadoHotel();
        } else if (num == 2) {
            habitacion.agregarinfo(habitacion.arrHabitaciones);
            JOptionPane.showMessageDialog(null, habitacion.arrHabitaciones);
            habitacion.EstadoHotel();
        }

    }
}
