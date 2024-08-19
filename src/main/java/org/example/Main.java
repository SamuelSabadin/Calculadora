package org.example;
import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }
        catch(UnsupportedLookAndFeelException e)
        {
            System.out.println("erro");
        }
        Form1 f = new Form1();
    }
}