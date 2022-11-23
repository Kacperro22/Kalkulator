import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int inputNumber = skaner.nextInt();

        switch(inputNumber){
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2");
                break;
            case 3:
                System.out.println("case3");
                break;
        }
    }
}
