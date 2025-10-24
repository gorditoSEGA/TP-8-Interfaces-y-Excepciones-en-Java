/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

public class PruebaEdad {
    public static void main(String[] args) {
        try {
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        try {
            validarEdad(23); 
        } catch (EdadInvalidaException e) {
            System.out.println("No debería pasar aquí.");
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera del rango permitido (0-120).");
        }
        System.out.println("Edad válida: " + edad);
    }
}
