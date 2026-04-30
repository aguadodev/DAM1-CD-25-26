package ud4.refactorizacion;

import java.util.List;

class Pedido {
    public Pedido(String cliente, double importe) {
        this.cliente = cliente;
        this.importe = importe;
    }

    String cliente;
    double importe;
    double impuestos;
    double descuento;
    double total;

    public void calcular() {
            impuestos = importe * 0.21;

            descuento = getDescuento(importe);

            total = importe + impuestos - descuento;
    }

    private double getDescuento(double importe) {
        double descuento = 0;
        if (importe > 200) {
            descuento = importe * 0.10;
        }
        return descuento;
    }

    void imprimirPedido() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Importe: " + importe);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
    
        System.out.println("Guardando pedido en base de datos...");
    
        if (total > 0) {
            System.out.println("Enviando confirmación al cliente...");
        }
    
        System.out.println("-----");
    }    
}

public class ProcesadorPedidos {

    public Pedido parsearPedido (String pedido) {
            String[] partes = pedido.split(",");
            return new Pedido (partes[0], Double.parseDouble(partes[1]));
    }


    
    public void procesarPedidos(List<String> pedidos) {
        for (String lineaPedido : pedidos) {

            if (lineaPedido == null || lineaPedido.isEmpty()) {
                System.out.println("Pedido inválido");
                continue;
            }

            Pedido pedido = parsearPedido(lineaPedido);
            pedido.calcular();
            pedido.imprimirPedido();
        }
    }


    

}
