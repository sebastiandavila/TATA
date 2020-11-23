package com.company;
import com.company.Logica.Administrador;
import com.company.Logica.Empleado;
import com.company.Logica.Mes;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opciones = 0;

        while (opciones != 100) {

            opciones = Integer.parseInt(JOptionPane.showInputDialog("Opciones \n "
                    + "1.Generar reporte \n "
                    + "2.Generar informe de pago de impuestos \n"
                    + "100. Salir"));

            switch (opciones) {
                case 1:
                double GananciaSemestre;
                String NombreAdministrador = JOptionPane.showInputDialog("Digite el nombre del administrador ");
                String ApellidoAdministrador = JOptionPane.showInputDialog("Digite el apellido del administrador ");

                Administrador administrador = new Administrador(NombreAdministrador, ApellidoAdministrador);

                double IngresosEnero = Double.parseDouble(JOptionPane.showInputDialog("Digite los ingresos obtenidos en el mes de enero"));
                if (!NombreAdministrador.isEmpty() && !ApellidoAdministrador.isEmpty() && IngresosEnero >= 0) {
                    Mes Enero = new Mes("Enero", IngresosEnero);

                    Mes Febrero = new Mes("Febrero");
                    Febrero.CalcularGananciaFebrero(Enero.getGanancia());

                    Mes Marzo = new Mes("Marzo");
                    Marzo.CalcularGananciaMarzo(Enero.getGanancia());

                    Mes Abril = new Mes("Abril");
                    Abril.CalcularGananciaAbril(Marzo.getGanancia());

                    Mes Mayo = new Mes("Mayo");
                    Mayo.CalcularGananciaMayo(Febrero.getGanancia(), Marzo.getGanancia());

                    Mes Junio = new Mes("Junio");
                    Junio.CalcularGananciaJunio(Enero.getGanancia(),
                            Febrero.getGanancia(),
                            Marzo.getGanancia(),
                            Abril.getGanancia(),
                            Mayo.getGanancia());

                    GananciaSemestre = Enero.getGanancia() +
                            Febrero.getGanancia() +
                            Marzo.getGanancia() +
                            Abril.getGanancia() +
                            Mayo.getGanancia() +
                            Junio.getGanancia();

                    JOptionPane.showMessageDialog(null, "------------Reporte------------" + "\n" +
                            administrador.MostrarDatos()+ "\n" + "\n" +
                            "Ganancia de cada mes: " + "\n" +
                            Enero.getNombre() + ": " + Enero.getGanancia() + "\n" +
                            Febrero.getNombre() + ": " + Febrero.getGanancia() + "\n" +
                            Marzo.getNombre() + ": " + Marzo.getGanancia() + "\n" +
                            Abril.getNombre() + ": " + Abril.getGanancia() + "\n" +
                            Mayo.getNombre() + ": " + Mayo.getGanancia() + "\n" +
                            Junio.getNombre() + ": " + Junio.getGanancia() + "\n" + "\n" +
                            "Las ganancias totales del semestre son de: " + GananciaSemestre
                    );

                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese toda la informacion requerida");
                }
                break;
                case 2:
                    String NombreEmpleado = JOptionPane.showInputDialog("Digite el nombre del empleado");
                    String ApellidoEmpleado = JOptionPane.showInputDialog("Digite el apellido del empleado ");
                    long Celular = Long.parseLong(JOptionPane.showInputDialog("Digite el celular del empleado"));
                    String Ciudad = JOptionPane.showInputDialog("Digite la ciudad del empleado");
                    float IngresoMensualEmpleado = Float.parseFloat(JOptionPane.showInputDialog("Digite el ingreo mensual del empleado"));
                    if (!NombreEmpleado.isEmpty() && !ApellidoEmpleado.isEmpty() && Celular > 0 && !Ciudad.isEmpty() && IngresoMensualEmpleado >=0) {
                        Empleado empleado = new Empleado(NombreEmpleado, ApellidoEmpleado, Celular, Ciudad, IngresoMensualEmpleado);

                        JOptionPane.showMessageDialog(null, "------------Reporte del pago de impuestos------------" + "\n" +
                                empleado.MostrarDatos()+"\n" +
                                "Ingresos trimestrales: "+empleado.CalcularIngresoTrimestral()+"\n" +
                                "Ingresos semestral: "+empleado.CalcularIngresoSemestral()+"\n" +
                                "Ingresos por año: "+empleado.CalcularIngresoAnual()+"\n" +"\n" +
                                "Cantidad a pagar en impuestos: " + empleado.CalcularImpuesto()
                        );

                    }
                    break;
            }
        }
    }
}