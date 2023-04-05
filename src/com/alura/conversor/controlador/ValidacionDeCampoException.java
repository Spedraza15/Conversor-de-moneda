package com.alura.conversor.controlador;

import javax.swing.*;

public class ValidacionDeCampoException extends Exception{

    public ValidacionDeCampoException(String ingreso){
        super(ingreso);
        if (ingreso.isEmpty()) {


        }

    }
}
