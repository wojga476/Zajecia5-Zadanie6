import java.util.Scanner;

public class LiczOdUzyt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int wynik = input.nextInt();
        
        while (wynik < 100 || wynik > 200 || wynik%3 !=0) {
            
            System.out.println("Liczba musi być z przedziału (100,200) i być podzielna przez 3.Podaj liczbę:");
            wynik = input.nextInt();
            
        }
            System.out.println("Twoja liczba jest ok");
//            if (wynik % 3 == 0) {
//                System.out.println("Liczba jest podzielna przez 3");
//            } else if (wynik % 3 != 0) {
//                System.out.println("Liczba jest nie podzielna przez 3");
//            }
        
        input.close();
    }
}