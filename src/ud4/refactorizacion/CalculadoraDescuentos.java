package ud4.refactorizacion;

public class CalculadoraDescuentos {

    public double calcularDescuentoClienteNormal(double precio) {
        double descuento = 0.0;

        if (precio > 100) {
            descuento = precio * 0.10;
        } else if (precio > 50) {
            descuento = precio * 0.05;
        }

        double precioFinal = precio - descuento;

        if (precioFinal < 0) {
            precioFinal = 0;
        }

        return precioFinal;
    }

    public double calcularDescuentoClientePremium(double precio) {
        double descuento = 0.0;

        if (precio > 100) {
            descuento = precio * 0.15;
        } else if (precio > 50) {
            descuento = precio * 0.10;
        }

        double precioFinal = precio - descuento;

        if (precioFinal < 0) {
            precioFinal = 0;
        }

        return precioFinal;
    }


    public static void main(String[] args) {
        String tipoCliente = "Premium";
        double precio = 80;
        double descuento = 0;
        CalculadoraDescuentos calc = new CalculadoraDescuentos();

        switch (tipoCliente) {
            case "Normal": 
                descuento = calc.calcularDescuentoClienteNormal(precio);
                break;
            case "Premium": 
                descuento = calc.calcularDescuentoClientePremium(precio);            
                break;
        }

        System.out.println("Descuento: " + descuento);
    }


}
