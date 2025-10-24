/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

public class TarjetaCredito implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double porcentaje) {
        return porcentaje;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito realizado por $" + monto);
    }
}
