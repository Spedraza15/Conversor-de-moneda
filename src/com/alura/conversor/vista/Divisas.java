package com.alura.conversor.vista;



import javax.swing.*;
import java.awt.*;


public class Divisas {

    public static void main(String[] args) {
        Divisas eject = new Divisas();

    }

    JFrame plantilla = new JFrame();



    Toolkit pantalla = Toolkit.getDefaultToolkit();
    Dimension tamanio = pantalla.getScreenSize();

    private int altopantalla = tamanio.height;
    private int anchopantalla = tamanio.width;





    public Divisas() {

        plantilla.setTitle("Conversor de divisas");

        plantilla.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        plantilla.setBounds(getAnchopantalla()/4, getAltopantalla()/4, getAnchopantalla()/2,getAltopantalla()/2);

        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        plantilla.setFont(new Font("Sanserif", Font.PLAIN, 14));
        plantilla.setLayout(gridBag);


        JPanel panel = new JPanel();
        plantilla.add(panel);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;

        JLabel tituloApp = new JLabel("CONVERTIR DIVISAS");
        tituloApp.setFont(new Font("Arial", Font.PLAIN, 20));
        tituloApp.setBounds(plantilla.getWidth()/4,15,205,86);
        panel.add(tituloApp,constraints);




        constraints.fill = GridBagConstraints.HORIZONTAL;
        JLabel lblimporte = new JLabel("Importe");
        lblimporte.setFont(new Font("Arial", Font.ITALIC, 15));
        constraints.gridx = 3;
        constraints.gridwidth = 1;
        panel.add(lblimporte , constraints);

        constraints.fill = GridBagConstraints.NONE;
//        constraints.weightx =
//        constraints.gridx = 2 ;
//        constraints.gridy =







//        plantilla.getContentPane().add(panel, BorderLayout.CENTER);
//        panel.setLayout(new GridBagLayout());






        plantilla.setVisible(true);


    }


    public int getAltopantalla() {
        return altopantalla;
    }

    public int getAnchopantalla() {
        return anchopantalla;
    }
}
