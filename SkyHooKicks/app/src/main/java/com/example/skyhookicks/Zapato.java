package com.example.skyhookicks;

public abstract class Zapato {

    private final String nombre;

    public Zapato(String nombre) {
        this.nombre = nombre;
    }

    abstract public int talla();

    abstract public boolean Disponible();

    @Override
    public String toString() {
        return "ZAPATO [NOMBRE=" + nombre + "]";
    }


}

