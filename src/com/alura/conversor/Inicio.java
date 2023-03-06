package com.alura.conversor;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame{

    public static void main(String[] args) {

        Inicio nuevo = new Inicio();

        nuevo.setVisible(true);
    }

    public  void Inicio() {


        JFrame plantilla = new JFrame();

        plantilla.setTitle("Inicio de divisas");

        plantilla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panel principal

        JPanel panel = new JPanel(new GridBagLayout());

        plantilla.add(panel);

        Toolkit pantalla = Toolkit.getDefaultToolkit();

        Dimension tamanio = pantalla.getScreenSize();

        int altopantalla = tamanio.height;

        int anchopantalla = tamanio.width;

        // Asigna el tamaño y la localizacion de la ventana con las coordenadas de la pantalla.

        plantilla.setBounds(anchopantalla / 4, altopantalla / 4, anchopantalla / 2, altopantalla / 2);

        //cambiar icono (por ahora no funciona)

//        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/media/favicon.ico"));
//
//        plantilla.setIconImage(icon);


        // panel del frame

//        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,30,30));

        GridBagConstraints c = new GridBagConstraints();




        // Boton divisa

        JButton botonDivisa = new JButton();


        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(0, 10, 0, 40);
//        c.anchor = GridBagConstraints.LINE_START;

        panel.add(botonDivisa, c);


        //btn temperatura

        JButton botonTemperatura = new JButton();


        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.gridx = 2;
        c.gridy = 1;
        c.insets = new Insets(0, 40, 0, 10);
//        c.anchor = GridBagConstraints.LINE_END;


        panel.add(botonTemperatura, c);

        //Texto principal
        JLabel tituloApp = new JLabel("CONVERSOR DE UNIDADES");

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


    
    

}


