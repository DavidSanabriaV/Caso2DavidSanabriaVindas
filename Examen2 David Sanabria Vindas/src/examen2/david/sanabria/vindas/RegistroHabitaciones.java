package examen2.david.sanabria.vindas;

import javax.swing.JOptionPane;

public class RegistroHabitaciones {

    //Matriz a trabajar
    Habitaciones[][] arrHabitaciones = new Habitaciones[3][3];
//Metodo para agregar la informacion de cada habitacion

    public void agregarinfo(Habitaciones[][] agregarInfo) {
        for (int i = 0; i < 3; i++) {
            this.arrHabitaciones[0][i] = new Habitaciones(i + 1, "Libre", "Normal", 50);
        }
        for (int i = 0; i < 3; i++) {
            this.arrHabitaciones[1][i] = new Habitaciones(i + 1, "Libre", "Premium", 75);
        }
        for (int i = 0; i < 3; i++) {
            this.arrHabitaciones[2][i] = new Habitaciones(i + 1, "Libre", "plus", 100);
        }

    }
//Metodo para modificar la informacion 

    public void ModificarHabitacion() {
        int piso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piso del que desea ingresar"));
        int habitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitacion del que desea ingresar"));
        String estado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la habitacion");
        String tipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de habitacion");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio de la habitacion"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de la habitacion"));
        arrHabitaciones[piso - 1][habitacion - 1].setNumeroHabitacion(numero);
        arrHabitaciones[piso - 1][habitacion - 1].setEstadoHabitacion(estado);
        arrHabitaciones[piso - 1][habitacion - 1].setTipoHabitacion(tipo);
        arrHabitaciones[piso - 1][habitacion - 1].setPrecioHabitacion(precio);
        JOptionPane.showMessageDialog(null, arrHabitaciones);
    }
//Metodo para el resumen del Estado del Hotel

    public void EstadoHotel() {
        //Cantidad de habitaciones sucias,libres o ocupadas
        int libres = 0;
        int ocupadas = 0;
        int sucias = 0;
        int total = 0;
        double porcentaje = 0;
        //Calculo del piso1
        for (int i = 0; i < 3; i++) {
            this.arrHabitaciones[0][i].getEstadoHabitacion();
            if (this.arrHabitaciones[0][i].getEstadoHabitacion().equals(libres)) {
                libres += 1;
            } else if (this.arrHabitaciones[0][i].getEstadoHabitacion().equals(ocupadas)) {
                ocupadas += 1;
                total += this.arrHabitaciones[0][i].getPrecioHabitacion();
            } else {
                this.arrHabitaciones[0][i].getEstadoHabitacion().equals(sucias);
                sucias += 1;
            }
        }
        //Calculo del piso2
        for (int i = 0; i < 3; i++) {
            this.arrHabitaciones[1][i].getEstadoHabitacion();
            if (this.arrHabitaciones[1][i].getEstadoHabitacion().equals(ocupadas)) {
                libres += 1;
            } else if (this.arrHabitaciones[1][i].getEstadoHabitacion().equals(ocupadas)) {
                ocupadas += 1;
                total += this.arrHabitaciones[1][i].getPrecioHabitacion();

            } else if (this.arrHabitaciones[1][i].getEstadoHabitacion().equals(sucias)) {
                sucias += 1;

            }

        }
        //Calculo del piso2
        for (int i = 0; i < 3; i++) {
            this.arrHabitaciones[2][i].getEstadoHabitacion();
            if (this.arrHabitaciones[2][i].getEstadoHabitacion().equals(sucias)) {
                libres += 1;
            } else if (this.arrHabitaciones[2][i].getEstadoHabitacion().equals(sucias)) {
                ocupadas += 1;
                total += this.arrHabitaciones[2][i].getPrecioHabitacion();
            } 
        }
        //Calculo de porcentaje 
        porcentaje = (ocupadas / 9) * 100;
        //Muestra de estado de las habitaciones
        JOptionPane.showMessageDialog(null, "La cantidad de habitaciones libres es de: " + libres);
        JOptionPane.showMessageDialog(null, "La cantidad de habitaciones ocupadas es de: " + ocupadas);
        JOptionPane.showMessageDialog(null, "La cantidad de habitaciones sucias es de: " + sucias);
        JOptionPane.showMessageDialog(null, "El total generado es de: " + total);
        JOptionPane.showMessageDialog(null, "El porcentaje de habitaciones ocuapdas seria de: " + porcentaje);
    }
}
