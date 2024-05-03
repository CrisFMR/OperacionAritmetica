import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r1;
        do {
            System.out.println("Ingrese Resistencia 1:");
            r1 = sc.nextFloat();
        } while (r1 < 0);

        float r2;
        do {
            System.out.println("Ingrese Resistencia 2:");
            r2 = sc.nextFloat();
        } while (r2 < 0);

        float r3;
        do {
            System.out.println("Ingrese Resistencia 3:");
            r3 = sc.nextFloat();
        } while (r3 < 0);

        float RT = 1/(1/r1+1/r2+1/r3);

        System.out.printf("La resistencia total es de %.2f", RT);
    }
}
