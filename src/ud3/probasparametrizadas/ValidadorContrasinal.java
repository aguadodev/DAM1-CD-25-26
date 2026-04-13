package ud3.probasparametrizadas;

public class ValidadorContrasinal {
    boolean eValida(String password) {
        if (password == null || password.length() < 8) return false;
            return password.matches(".*\\d.*");
    }

    

}
