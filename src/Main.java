import java.util.Scanner;

public class Main {
    static void showTable(int number) {
        for (int i=1; i <= 10; i++) {
            System.out.println(i + "  " + i*number);
        }
    }

    public static void main(String[] args) {
        // Skapa en metod som skriver ut en multiplikationstabell för X (parameter)
        // Om X = 4 skall formatet på utskriften vara:
        // 1  4
        // 2  8
        // ...
        // 10 40

        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        int number = input.nextInt();

        showTable(number);
    }
}