import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int cantHoras;
        double sueldoPorHora;
        double horasExtras;
        double sueldoExtra;
        double total;

        System.out.println("Ingrese la cantidad de horas trabajadas");
        cantHoras= scanner.nextInt();
        System.out.println("Ingrese su sueldo por hora");
        sueldoPorHora = scanner.nextDouble();

        total=sueldoPorHora * cantHoras;

        if(cantHoras>180){
            horasExtras=(cantHoras-180);
            sueldoExtra=horasExtras*(sueldoPorHora/2);
            total += sueldoExtra;
        }
        System.out.println("Su sueldo es de: " + total);
    }
}