import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        System.out.println("Witamy w kalkulatorze \n Podaj pierwsza liczbe: ");
        double first = skan.nextDouble();;

        System.out.println("Podaj drugą liczbe");
        double second = skan.nextDouble();

        System.out.println("Jaka operacje chcesz wykonac :, x, +, -");
        int charr = skan.next().charAt(0);

        switch(charr){
            case ':' :
                System.out.println("Suma: " + (first/second));
                break;

            case 'x' :
                System.out.println("Suma: "+ (first*second));
                break;

            case '+' :
                System.out.println("Suma: " + (first+second));
                break;

            case '-' :
                System.out.println("Suma: " + (first-second));
                break;
        }
        System.out.println("");
    }
}
