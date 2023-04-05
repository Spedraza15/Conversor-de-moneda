package com.alura.conversor.vista;

import com.alura.conversor.controlador.ValidacionDeCampoException;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Temperatura {


    public Temperatura(){

       List<String> listaOpciones = new ArrayList<>() {{
            add("De Celsius a Fahrenheit");
            add("De Celsius a Kelvin");
            add("De Celsius a Rankine");
            add("De Fahrenheit a Celsius");
            add("De Fahrenheit a Kelvin");
            add("De Fahrenheit a Rankine");

            }};


        Object[] valores = listaOpciones.toArray();

        String opcionSeleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una conversion: ", "Opciones", JOptionPane.INFORMATION_MESSAGE, null, valores, " ");
        String ingreso ;
        double valoringreso = 0;
        double valorresultado = 0;

            if (opcionSeleccion == listaOpciones.get(0)) {
                valorresultado = (validarValorIngresado() * 9/5) + 32;
            } else if (opcionSeleccion == listaOpciones.get(1)) {
                valorresultado = (validarValorIngresado() + 273.15);
            } else if (opcionSeleccion == listaOpciones.get(2)) {
                valorresultado = (validarValorIngresado() * 9/5 + 491.67);
            } else if (opcionSeleccion == listaOpciones.get(3)) {
                valorresultado = (validarValorIngresado() - 32) * 5/9;
            } else if (opcionSeleccion == listaOpciones.get(4)) {
                valorresultado = (validarValorIngresado() + 459.67) * 5/9;
            } else if (opcionSeleccion == listaOpciones.get(5)) {
                valorresultado = (validarValorIngresado() + 459.67);
            }

            // Definir el formato
            DecimalFormat formato = new DecimalFormat("#,###.00");
            // Aplicar el formato al número
            String numeroFormateado = formato.format(valorresultado);

            JOptionPane.showMessageDialog(null, "Resultado: " + numeroFormateado);


        int panelConfirmacion;
        panelConfirmacion = JOptionPane.showConfirmDialog(null, "Deseas continuar ? ", "Selecciona una opcion", JOptionPane.YES_NO_CANCEL_OPTION);

        if (panelConfirmacion == JOptionPane.YES_OPTION) {
            new Temperatura();
        } else if (panelConfirmacion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
        } else {
            JOptionPane.showMessageDialog(null, "Programa terminado");

//
        }

    }
    //metodo para validar y convertir el campo de ingresar valor sea correcto
    public double validarValorIngresado() throws RuntimeException{
        String ingreso = "";
        double validarNumerico = 0;
        do {
            ingreso = JOptionPane.showInputDialog(null, "Ingresa la cantidad de grados que deseas convertir", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
            if (ingreso.isEmpty()) {

                JOptionPane.showMessageDialog(null,"El campo es requerido");
            } else {
                try {
                    validarNumerico =Double.parseDouble(ingreso);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"El valor ingresado no puede contener letras ni caracteres");
                }
            }
        } while (ingreso.isEmpty() || validarNumerico==0);
        return validarNumerico;
    }

//    public boolean valorvalido(String valorParaValidacion){
//
//        try {
//            double valorConvertidoDouble = Double.parseDouble(valorParaValidacion);
//        } catch (NumberFormatException e){
//            JOptionPane.showMessageDialog(null,"El valor ingresado no puede contener letras ni caracteres");
//        }
//
//    }
}
