package com.company.Logica;

public class Administrador extends Persona {

    public Administrador(String Nombre, String Apellido) {
        super(Nombre, Apellido);
    }

    @Override
    public String MostrarDatos()
    {
        return "Administrador: " + Nombre + " " + Apellido;
    }
}
