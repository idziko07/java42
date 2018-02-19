import javafx.scene.transform.Scale;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Queue<Double> numbers = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double num;
        int i = 0;
        while (i != 10){
            System.out.println("Podaj " + (i + 1) + " liczbę: ");
            num = input.nextDouble();
            input.nextLine();
            numbers.offer(num);
            i++;
        }

        double sum = 0;
        System.out.println(i);
        System.out.print("Suma podanych liczb wynosi: ");
        while (numbers.peek() != null){
            if(numbers.size()-1 == 0) {
                sum+=numbers.peek();
                System.out.print(numbers.poll() + " = " + sum);
            }else {
                System.out.print(numbers.peek() + " + ");
                sum += numbers.poll();
            }

        }



    }
}
