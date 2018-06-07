import java.util.Scanner;
public class LiczOdUzyt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int wynik = input.nextInt();

        if(wynik>100 && wynik<200){
            if(wynik%3 ==0){
                System.out.println("Twoja liczba jest ok");
            }
            else{
                System.out.println("Twoja liczba nie jest podzielna przez 3");
            }
        }
        else{
            System.out.println("Liczba nie jest z przedziału (100,200)");
        }

    }

}
