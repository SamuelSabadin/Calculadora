package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame
{
    String op;
    double n1,n2,result;
    String r;

    public Form1()
    {
        super("Calculadora");
        setSize(380,480);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //sessão de painéis
        JPanel buttonpanel = new JPanel(new GridLayout(5,4));
        JPanel panelcenter = new JPanel(new BorderLayout());
        JPanel panelnorth = new JPanel(new BorderLayout());
        //fim da sessão de painéis

        //sessão de componentes
        JTextField textBox1 = new JTextField();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton bc = new JButton("<-");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b0 = new JButton("0");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton be = new JButton("=");
        JButton bp = new JButton("+");
        JButton bm = new JButton("-");
        JButton bt = new JButton("×");
        JButton bd = new JButton("÷");
        JButton bdc = new JButton(".");
        JButton b = new JButton("C");
        JButton b22 = new JButton();
        //fim da sessão de componentes

        //sessão de layout
        buttonpanel.add(b1);
        buttonpanel.add(b2);
        buttonpanel.add(b3);
        buttonpanel.add(bc);
        buttonpanel.add(b4);
        buttonpanel.add(b5);
        buttonpanel.add(b6);
        buttonpanel.add(b0);
        buttonpanel.add(b7);
        buttonpanel.add(b8);
        buttonpanel.add(b9);
        buttonpanel.add(be);
        buttonpanel.add(bp);
        buttonpanel.add(bm);
        buttonpanel.add(bt);
        buttonpanel.add(bd);
        buttonpanel.add(b);
        buttonpanel.add(bdc);
        buttonpanel.add(b22);

        panelnorth.add(textBox1,BorderLayout.NORTH);
        panelcenter.add(buttonpanel,BorderLayout.CENTER);

        add(panelcenter,BorderLayout.CENTER);
        add(panelnorth,BorderLayout.NORTH);
        //fim da sessão de layout

        //sessão de tamanho
        panelnorth.setPreferredSize(new Dimension(100,50));
        textBox1.setPreferredSize(new Dimension(100,50));
        //fim da sessão de tamanho

        //sessão de métodos
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"4");
            }
        });
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"5");
            }
        });
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"6");
            }
        });
        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"7");
            }
        });
        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"8");
            }
        });
        b9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"9");
            }
        });
        b0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                textBox1.setText(textBox1.getText()+"0");
            }
        });
        bdc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                if(textBox1.getText().contains("."))
                {
                    textBox1.setText(textBox1.getText()+"");
                }
                else
                {
                    textBox1.setText(textBox1.getText()+".");
                }
            }
        });

        bc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                String t = textBox1.getText();
                String t2 = t.substring(0,t.length()-1);
                textBox1.setText(t2);
            }
        });
        bp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                op = "+";
                n1 = Double.parseDouble(textBox1.getText());
                textBox1.setText("");
            }
        });
        bm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(textBox1.getText().equals(""))
                {
                    textBox1.setText(textBox1.getText()+"-");
                }
                else{
                    op = "-";
                    n1 = Double.parseDouble(textBox1.getText());
                    textBox1.setText("");
                }

            }
        });
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                op = "*";
                n1 = Double.parseDouble(textBox1.getText());
                textBox1.setText("");
            }
        });
        bd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                op = "/";
                n1 = Double.parseDouble(textBox1.getText());
                textBox1.setText("");
            }
        });
        be.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                n2 = Double.parseDouble(textBox1.getText());
                if(op.equals("+"))
                {
                    result = n1+n2;
                    r = String.valueOf(result);
                    textBox1.setText(r);
                }
                if(op.equals("-"))
                {
                    result = n1-n2;
                    r = String.valueOf(result);
                    textBox1.setText(r);
                }
                if(op.equals("*"))
                {
                    result = n1*n2;
                    r = String.valueOf(result);
                    textBox1.setText(r);
                }
                if(op.equals("/"))
                {
                    result = n1/n2;
                    r = String.valueOf(result);
                    textBox1.setText(r);
                }
            }
        });
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                textBox1.setText("");
            }
        });
        //fim da sessão de métodos

        setVisible(true);
    }
}