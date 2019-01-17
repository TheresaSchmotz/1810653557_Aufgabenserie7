package Aufgabe_Funfa;

public class UncheckedException {

    public static void main(String[] args) {

        int i = 2/0;   //ArithmeticException weil man 0 nicht teilen kann. Jedoch kein Compilerfehler WEIL RuntimeException.
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
