// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Illegal field name */

        String S#$ = "string";

        /* Print uninitialized variable */

        String exm;
        System.out.println(exm);

        /* Print Out Local Variable */

        for(int i = 0; i < 9; i++){
            String localVar = "local";
        }
        System.out.println(localVar);
        }
    }
