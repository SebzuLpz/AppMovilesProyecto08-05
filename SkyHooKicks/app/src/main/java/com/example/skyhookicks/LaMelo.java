package com.example.skyhookicks;

public class LaMelo extends Zapato{
    public LaMelo(String nombre, String number) {
        super(nombre);
    }

    @Override
    public int talla() {
        return 11;
    }

    @Override
    public boolean Disponible() {
        return false;
    }
}
