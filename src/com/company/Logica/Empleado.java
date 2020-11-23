package com.company.Logica;

public class Empleado extends Persona{
    private long Celular;
    private String Ciudad;
    private float IngresoMensual;

    public Empleado(String Nombre, String Apellido, long Celular, String Ciudad, float IngresoMensual) {
        super(Nombre, Apellido);
        this.Celular = Celular;
        this.Ciudad = Ciudad;
        this.IngresoMensual = IngresoMensual;
    }

    public long getCelular() {
        return Celular;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public float getIngresoMensual() {
        return IngresoMensual;
    }

    public void setCelular(long Celular) {
        this.Celular = Celular;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setIngresoMensual(float IngresoMensual) {
        this.IngresoMensual = IngresoMensual;
    }

    public float CalcularIngresoTrimestral(){
        return IngresoMensual * 3;
    }
    public float CalcularIngresoSemestral(){
        return IngresoMensual * 6;
    }
    public double CalcularIngresoAnual(){
        return IngresoMensual * 12;
    }

    public float CalcularImpuesto(){
        if(IngresoMensual > 1500000){
            return IngresoMensual * 2;
        }
        else{
            return IngresoMensual / 2;
        }
    }
}
