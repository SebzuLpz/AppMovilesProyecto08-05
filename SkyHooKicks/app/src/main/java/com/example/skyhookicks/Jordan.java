package com.example.skyhookicks;

public class Jordan extends Zapato{

    public Jordan(String nombre, String number) {
        super(nombre);
    }

    @Override
    public int talla() {
        return 9;
    }

    @Override
    public boolean Disponible() {
        return true;
    }
}
