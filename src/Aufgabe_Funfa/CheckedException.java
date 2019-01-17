package Aufgabe_Funfa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) throws IOException {  //Checked exception wird durch throws deklariert, IO ist Input-Output
        FileWriter writer = new FileWriter("D:uebung.txt");
     //OR
      /*
      try {
        FileWriter writer = new FileWriter ("D:uebung.txt");
      }
      catch (IOException e)
      {
        e.printStackTrace() //Auto-generated catch block
      }
       */
    }

}

/*CHECKED EXCEPTION
- Sind geplante Ausnahmesituationen, z.B. FileNotFound, ParseException
- alle Checked Exception erben von Exception, ausser die die von RuntimeException erben
- Checked Exceptions müssen durch eine Angabe in der Methodensignatur mit throws spezifizieren
  oder durch Abfangen in einem try-catch Block behandelt werden.
- Java überprüft zur Compilezeit, ob die Exception entsprechend behandelt wird.
- Checked exceptions müssen behandelt werden oder sie erzeugen einen compile time error


UNCHECKED EXCEPTION
- werden nicht in einer Methodensigntur angegeben
- erben von RuntimeException
- RuntimeException sollen auf Programmierfehler hin deuten
- müssen nicht zur compilezeit behandelt werden


 */