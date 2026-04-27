package ud4.refactorizacion;

public class CalculadoraDescuentos {

    public double calcularDescuentoClienteNormal(double precio) {
        return calcularDescuentoCliente("Normal", precio);
    }

    public double calcularDescuentoClientePremium(double precio) {
        return calcularDescuentoCliente("Premium", precio);
    }

    public double calcularDescuentoCliente(String tipoCliente, double precio) {
        double descuento = 0.0;
        double descuento100;
        double descuento50;

        switch (tipoCliente) {
            case "Normal": 
                descuento100 = 0.10;
                descuento50 = 0.05;            
            break;
            case "Premium": 
                descuento100 = 0.15;
                descuento50 = 0.10;              
            break;
            default:
                descuento100 = 0;
                descuento50 = 0;                  
        }

        if (precio > 100) {
            
            descuento = precio * descuento100;
        } else if (precio > 50) {
            descuento = precio * descuento50;
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
