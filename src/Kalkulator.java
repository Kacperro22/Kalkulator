import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        System.out.println("Witamy w kalkulatorze \n Podaj pierwsza liczbe: ");
        int first = skan.nextInt();;

        System.out.println("Podaj drugą liczbe");
        int second = skan.nextInt();

        System.out.println("Jaka operacje chcesz wykonac :, x, +, -");
        int num = skan.next().charAt(0);


        switch(num){
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

    }
}
