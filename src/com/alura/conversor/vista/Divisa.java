package com.alura.conversor.vista;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Divisa {

    public static void main(String[] args) {
        Divisa dv = new Divisa();
    }

    public Divisa() {

        //opciones de seleccion

        HashMap<Integer, String> options = new HashMap<Integer, String>() {{
            put(1, "De Pesos - Dolares");
            put(2, "De Pesos  - Euros");
            put(3, "De Pesos a Libras");
            put(4, "De Pesos a Yen");
            put(5, "De Pesos a Won Coreano");
            put(6, "De Dolar a Pesos");
            put(7, "De Euro a Pesos");
            put(8, "De Libras a Pesos");

        }};

        List<String> listaOpciones = new ArrayList<>() {{
            add("De Pesos - Dolares");
            add("De Pesos  - Euros");
            add("De Pesos a Libras");
            add("De Pesos a Yen");
            add("De Pesos a Won Coreano");
            add("De Dolar a Pesos");
            add("De Euro a Pesos");
            add("De Libras a Pesos");
        }};


        Object[] valores = options.values().toArray();


        Object[] opciones = {

                "De Pesos - Dolares", "De Pesos  - Euros", "De Pesos a Libras",
                "De Pesos a Yen ", "De Pesos a Won Coreano", "De Dolar a Pesos",
                "De Euro a Pesos", "De Libras a Pesos"
        };

        String opcionSeleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una conversion: ", "Opciones", JOptionPane.INFORMATION_MESSAGE, null, valores, " ");


        String ingreso = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir", "Monedas", JOptionPane.INFORMATION_MESSAGE);
        double valoringreso = 0;
        double valorresultado = 0;

//        JTextField tx = new JTextField();

        if (ingreso.isEmpty()) {
            JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
        } else {
            try {
                valoringreso = Double.parseDouble(ingreso);

            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error, el valor ingresado no puede contener letras ni caracteres ");
            }
        }



            if (opcionSeleccion == listaOpciones.get(0)) {
                valorresultado = valoringreso / 4700;
            } else if (opcionSeleccion == listaOpciones.get(1)) {
                valorresultado = valoringreso / 5000;
            } else if (opcionSeleccion == listaOpciones.get(2)) {
                valorresultado = valoringreso * 0.00017;
            } else if (opcionSeleccion == listaOpciones.get(3)) {
                valorresultado = valoringreso * 0.027;
            } else if (opcionSeleccion == listaOpciones.get(4)) {
                valorresultado = valoringreso * 0.27;
            } else if (opcionSeleccion == listaOpciones.get(5)) {
                valorresultado = valoringreso * 4772;
            } else if (opcionSeleccion == listaOpciones.get(6)) {
                valorresultado = valoringreso * 5182;
            } else if (opcionSeleccion == listaOpciones.get(7)) {
                valorresultado = valoringreso * 5852;

            }

            // Definimos el formato
            DecimalFormat formato = new DecimalFormat("#,###.00");
            // Aplicamos el formato al número
            String numeroFormateado = formato.format(valorresultado);

            JOptionPane.showMessageDialog(null, "tienes: " + numeroFormateado);





            Object[] continuar_salir = {"Continuar", "Salir"};
            int panelConfirmacion;
            panelConfirmacion = JOptionPane.showConfirmDialog(null, "Deseas continuar ? ", "Selecciona una opcion", JOptionPane.YES_NO_CANCEL_OPTION);

            if (panelConfirmacion == JOptionPane.YES_OPTION) {new Divisa();}
            else if (panelConfirmacion == JOptionPane.NO_OPTION) {
                System.out.println("Hasta luego!");
            }
            else {
                System.out.println("Programa Finalizado"); }






//}
//
    }
}
