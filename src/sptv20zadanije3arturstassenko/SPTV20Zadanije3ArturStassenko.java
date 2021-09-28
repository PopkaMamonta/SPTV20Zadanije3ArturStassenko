
package sptv20zadanije3arturstassenko;

import java.util.Scanner;

public class SPTV20Zadanije3ArturStassenko {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String name=scanner.nextLine();
        System.out.println("Введите свою фамилию: ");
        String surname=scanner.nextLine();
        System.out.println("Введите свой месяц рождения: ");
        String month=scanner.nextLine();
        System.out.println("Введите свой год рождения: ");
        int year=scanner.nextInt();
        System.out.println("Введите свою дату рождения: ");
        int day=scanner.nextInt();

        System.out.printf("%2s %2s was born %2d %2s %2d",name,surname,day,month,year);
    }
    
}
