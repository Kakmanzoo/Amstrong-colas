import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Digita el numero: ");
        int x = read.nextInt();
        read.close();

        if (isAmstrong(x)) {
            System.out.println(x + " es un numero Amstrong." );
        }
        else {
            System.out.println(x + " no es un numero Amstrong.");
        }

    }

    public static boolean isAmstrong(int x) {
        int originalnumber = x;
        int addition = 0;
        int digits = String.valueOf(x).length();


        Queue<Integer> ColaDigito = new LinkedList<>();
        while (x > 0) {
            ColaDigito.offer(x % 10);
            x /= 10;
        }

        while (!ColaDigito.isEmpty()) {
            int digit = ColaDigito.poll();
            addition += Math.pow(digit, digits);
        }

        return addition == originalnumber;
    }
}

