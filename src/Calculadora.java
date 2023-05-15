import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    public static void abrirCalculadora() {

        double num1;
        double num2;
        String signo;


        JFrame miCalculadora = new JFrame();
        miCalculadora.setTitle("Calculadora");
        miCalculadora.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miCalculadora.setSize(500, 600);
        miCalculadora.setLayout(new GridBagLayout());

        JPanel panelArriba = new JPanel();
        JPanel panelAbajo = new JPanel();

        panelArriba.setLayout(new GridBagLayout());
        JLabel labelArriba = new JLabel();
        JTextField pantalla = new JTextField();
        GridBagConstraints constraintsArriba = new GridBagConstraints();
        constraintsArriba.fill = GridBagConstraints.BOTH;
        constraintsArriba.weightx = 1;
        constraintsArriba.weighty = 1;
        constraintsArriba.gridx = 0;
        constraintsArriba.gridy = 0;
        constraintsArriba.gridwidth = 4;
        miCalculadora.add(pantalla, constraintsArriba);

        panelAbajo.setLayout(new GridBagLayout());

        JButton botonUno = new JButton("1");
        JButton botonDos = new JButton("2");
        JButton botonTres = new JButton("3");
        JButton botonSuma = new JButton("+");

        JButton botonCuatro = new JButton("4");
        JButton botonCinco = new JButton("5");
        JButton botonSeis = new JButton("6");
        JButton botonResta = new JButton("-");

        JButton botonSiete = new JButton("7");
        JButton botonOcho = new JButton("8");
        JButton botonNueve = new JButton("9");
        JButton botonMultiplicar = new JButton("x");

        JButton botonCero = new JButton("0");
        JButton botonComa = new JButton(",");
        JButton botonIgual = new JButton("=");
        JButton botonDividir = new JButton("/");

        JButton botonBorrar = new JButton("C");




        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        miCalculadora.add(botonUno, constraints);

        botonUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "1");
            }
        });

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        miCalculadora.add(botonDos, constraints);
        botonDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "2");
            }
        });

        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        miCalculadora.add(botonTres, constraints);
        botonTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "3");
            }
        });

        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        miCalculadora.add(botonSuma, constraints);
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(pantalla.getText());
                signo = "+";
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        miCalculadora.add(botonCuatro, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        miCalculadora.add(botonCinco, constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        miCalculadora.add(botonSeis, constraints);

        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        miCalculadora.add(botonResta, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        miCalculadora.add(botonSiete, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        miCalculadora.add(botonOcho, constraints);

        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        miCalculadora.add(botonNueve, constraints);

        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        miCalculadora.add(botonMultiplicar, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        miCalculadora.add(botonCero, constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        miCalculadora.add(botonComa, constraints);


        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        miCalculadora.add(botonIgual, constraints);
        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1= Double.parseDouble(pantalla.getText());
                switch(signo){
                    case "+":
                        pantalla.setText(Double.toString(num1+num2));
                }

            }
        });


        constraints.gridx = 3;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        miCalculadora.add(botonDividir, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 4;
        miCalculadora.add(botonBorrar, constraints);
        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
            }
        });


        miCalculadora.add(panelArriba);
        miCalculadora.add(panelAbajo);
        miCalculadora.setVisible(true);
    }



}