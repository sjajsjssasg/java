import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); System.out.println("Программа вычисляет кинетическую энергию тела"); System.out.print("Введите массу (кг): ");
        double m=sc.nextDouble(); System.out.print("Введите скорость (м/с): "); double v=sc.nextDouble();
        if (m<=0 || v<0) {System.out.println("Ошибка: масса должна быть больше нуля, скорость не может быть отрицательной"); return; }
        double e=m*v*v/2;
        System.out.println("Кинетическая энергия = "+e+" Дж");}}
