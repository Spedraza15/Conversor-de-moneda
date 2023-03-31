package com.alura.conversor.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public abstract class Inicio implements ActionListener {

    JFrame plantilla = new JFrame();
    JPanel panel = new JPanel(new GridBagLayout());
    JButton botonDivisa = new JButton();
    JButton botonTemperatura = new JButton();
    JLabel tituloApp = new JLabel("CONVERSOR DE UNIDADES");

    Toolkit pantalla = Toolkit.getDefaultToolkit();
    Dimension tamanio = pantalla.getScreenSize();
    private int altopantalla = tamanio.height;
    private int anchopantalla = tamanio.width;


     public Inicio() {


            plantilla.setTitle("Conversor");

            plantilla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //panel principal

            plantilla.add(panel);


            // Asigna el tamaño y la localizacion de la ventana con las coordenadas de la pantalla.

            plantilla.setBounds(anchopantalla / 4, altopantalla / 4, anchopantalla / 2, altopantalla / 2);


            // panel del frame con gridbaglayout

            GridBagConstraints c = new GridBagConstraints();

            // Boton divisa

            c.fill = GridBagConstraints.HORIZONTAL;
            c.ipady = 20;
            c.gridx = 1;
            c.gridy = 1;
            c.insets = new Insets(0, 10, 0, 40);
//        c.anchor = GridBagConstraints.LINE_START;

            panel.add(botonDivisa, c);
            botonDivisa.addActionListener(actionListener);


            //btn temperatura



            c.fill = GridBagConstraints.HORIZONTAL;
            c.ipady = 20;
            c.gridx = 2;
            c.gridy = 1;
            c.insets = new Insets(0, 40, 0, 10);
//        c.anchor = GridBagConstraints.LINE_END;


            panel.add(botonTemperatura, c);

            //Texto principal


            tituloApp.setFont(new Font("Arial", Font.BOLD, 25));
            c.fill = GridBagConstraints.HORIZONTAL;
            c.insets = new Insets(0, 0, 40, 10);
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = 3;
            c.anchor = GridBagConstraints.CENTER;

            panel.add(tituloApp, c);


            ImageIcon iconoDivisa = new ImageIcon("change.png");

            ImageIcon iconoTemp = new ImageIcon("temp.png");

            Image imagenDivisa = iconoDivisa.getImage();

            Image imagenTemp = iconoTemp.getImage();

            imagenDivisa = imagenDivisa.getScaledInstance(plantilla.getWidth() / 5, 200, Image.SCALE_SMOOTH);

            imagenTemp = imagenTemp.getScaledInstance(plantilla.getWidth() / 5, 200, Image.SCALE_SMOOTH);


            botonDivisa.setIcon(new ImageIcon(imagenDivisa));

            botonTemperatura.setIcon(new ImageIcon(imagenTemp));

            botonDivisa.setBounds(plantilla.getWidth() / 4, 200, plantilla.getWidth() / 5, 200);

            botonTemperatura.setBounds(plantilla.getWidth() / 4 * 2, 200, plantilla.getWidth() / 5, 200);


            //al método pack() en tu contenedor principal para que los componentes se muestren correctamente:
//        plantilla.pack();

            plantilla.setVisible(true);


        }

    public int getAltopantalla() {
        return altopantalla;
    }

    public int getAnchopantalla() {
        return anchopantalla;
    }


    ActionListener actionListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        Divisa nuevaventana = new Divisa();

    }
    };

}


