import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);System.out.print("Введите x: ");
        double x=sc.nextDouble();
        double y=Math.pow(x,5)+Math.pow(Math.log(x),3)+Math.sqrt(Math.pow(x,5));
        System.out.println("y = "+y);}}
