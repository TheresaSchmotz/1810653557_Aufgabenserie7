package Aufgabe_2;

import javax.swing.*;


public class Aufgabe2 {

    public static void main(String[] args) {

        while(true){
            String input = JOptionPane.showInputDialog("Gib mir ne Zahl, keine Buchstaben du Lärri");

            if(isInteger(input)){
                int zahl = Integer.parseInt(input);
            }
            else
            {
                break;
            }
        }
    }

    public static boolean isInteger(String s)
    {
        try
        {
            Integer.parseInt(s); //Anweisung, die zu Fehlern führen kann.
        }
        catch (NumberFormatException e)
        {
            System.out.println("Brot kann schimmeln, was kannst du.");
            return false; //Anweisung im Fehlerfall NumberFormatException
        }
        return true;
    }
}
