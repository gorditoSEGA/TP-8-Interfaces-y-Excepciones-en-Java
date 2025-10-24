/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese el divisor: ");
            int div = Integer.parseInt(sc.nextLine());

            int resultado = num / div;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: entrada no válida, se esperaba un número entero.");
        } finally {
            sc.close();
        }
    }
}
