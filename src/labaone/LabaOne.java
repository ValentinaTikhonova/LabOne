/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labaone;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LabaOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password; //Строка для хранения введеного пароля
        boolean value = false; //Переменная для хранения результата сравнения введенной строки с строкой образцом
        //Цикл для введения пароля до тех пор пока он не будет верным
        while (value == false) {
            password = input(); //Ввод пароля
        value = comparison(password); //Вызов метода сравнения пароля с образцом
        if (value == true) System.out.println("Пароль верный");
        else System.out.println("Пароль неверный"); 
        }
              
    }
    
    // Метод, реализующий ввод входной строки символов
    private static String input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        return in.next();

    }
     // Метод, реализующий сравнение введенного пароля с образцом
    private static boolean comparison(String s) {
        String sample = "123456789";
        boolean m;
        m = sample.equals(s);
        return m;

    }
    
}
