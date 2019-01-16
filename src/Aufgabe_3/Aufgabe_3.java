package Aufgabe_3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe_3 {

    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("I bims. Gib amal dei email blisss");

        try
        {
            checkEmail(email);
            System.out.println(email);
        }
        catch (Exception e)
        {
            System.out.println("This ain't it chief.");
        }
    }


    public static void checkEmail(String email) throws Exception
    {
        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
        Matcher m = pattern.matcher(email);
        if(!m.find()){
            throw new Exception();  //Leitet an main methode weiter
        }
    }
}