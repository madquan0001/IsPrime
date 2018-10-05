package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number;
	Scanner scanner = new Scanner(System.in);
        System.out.print("Imput your number : ");
        number = scanner.nextInt();
        if (isPrime(number) == true)
        {
            System.out.println(number + " là số nguyên tố");
        }
        else
        {
            System.out.println(number + " không phải là số nguyên tố");
        }
        System.out.println("Các số nguyên tố từ 1 -> 10000 : ");
        for (int i = 1 ; i <= 10000 ; i++)
        {
            if (isPrime(i) == true)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number)
    {
        int count = 0;
        for (int i = 1 ; i <= number ; i++)
        {
            if (number % i == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            return true;
        }
        return false;

    }
}
