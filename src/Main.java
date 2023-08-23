import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,end;

        Scanner boyInp = new Scanner(System.in);
        System.out.print("Mt cinsinden boyunuzu girin :");
        boy = boyInp.nextDouble();

        Scanner kgInp = new Scanner(System.in);
        System.out.print("Kilonuzu girin :");
        kilo = kgInp.nextInt();

        end = kilo / (boy * boy);
        System.out.println(end);
    }
}