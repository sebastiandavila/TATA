package com.company.Logica;

public class Mes {
    private String Nombre;
    private double Ganancia;

    public Mes(String Nombre, double Ganancia){
        this.Nombre = Nombre;
        this.Ganancia = Ganancia;
    }

    public Mes(String Nombre){

        this.Nombre = Nombre;
    }

    public String getNombre() {

        return Nombre;
    }

    public double getGanancia() {

        return Ganancia;
    }

    public void setNombre(String Nombre) {

        this.Nombre = Nombre;
    }

    public void setGanancia(double Ganancia) {

        this.Ganancia = Ganancia;
    }


    public void CalcularGananciaFebrero(double GananciaEnero)
    {

        Ganancia = GananciaEnero / 2;
    }

    public void CalcularGananciaMarzo(double GananciaEnero)
    {

        Ganancia = GananciaEnero * 2;
    }

    public void CalcularGananciaAbril(double GananciaMarzo)
    {
        Ganancia = GananciaMarzo * 0.8;
    }

    public void CalcularGananciaMayo(double GananciaFebrero, double GananciaMarzo)
    {
        Ganancia = (GananciaFebrero + GananciaMarzo) / 3;
    }

    //Son el promedio de las ganancias de enero, febrero, marzo, abril y mayo.
    public void CalcularGananciaJunio(double GananciaEnero, double GananciaFebrero, double GananciaMarzo,double GananciaAbril, double GananciaMayo)
    {
        Ganancia = (GananciaEnero + GananciaFebrero + GananciaMarzo + GananciaAbril + GananciaMayo) / 5;
    }
}
