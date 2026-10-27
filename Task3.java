import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);System.out.print("Введите первое число: ");int a=sc.nextInt();System.out.print("Введите второе число: ");int b=sc.nextInt();System.out.print("Введите третье число: ");int c=sc.nextInt();
        if (a<b && a<c) {System.out.println("Наименьшее: "+a);}
        else if (b<a && b<c) {System.out.println("Наименьшее: "+b);} 
        else {System.out.println("Наименьшее: "+c);}}
}
