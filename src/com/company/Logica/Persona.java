package com.company.Logica;

public class Persona {
    protected String Nombre;
    protected String Apellido;

    public Persona(String Nombre, String Apellido)
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {

        return Nombre;
    }

    public String getApellido() {

        return Apellido;
    }

    public void setNombre(String Nombre) {

        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {

        this.Apellido = Apellido;
    }

    public String MostrarDatos()
    {
       return  Nombre + " " + Apellido;
    }
}
