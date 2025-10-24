/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alejandro");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 12000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        TarjetaCredito tarjeta = new TarjetaCredito();
        double descuento = 0.60;
        double totalConDescuento = total - (total * tarjeta.aplicarDescuento(descuento));
        tarjeta.procesarPago(totalConDescuento);

        
        pedido.cambiarEstado("Enviado");
    }
}
