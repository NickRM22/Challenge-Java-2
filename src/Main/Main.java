package Main;

import Application.Usuario;

/**
 *
 * @author Nicolas Martins, Nicolas Frazao, Vinicius Soares, Henrique Soares, Caua Bordini
 * @version 1.0
 * @since 1.0
 *
 */

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nicolas", "Nick22", "abc123",
                "12345", 180);
        System.out.println("""
                ========== MINHAS INFORMAÇÕES ==========
                Name: %s
                Username: %s
                Password: %s
                CPF: %s
                View Minutes: %d
                """.formatted(
                usuario.getName(),
                usuario.getUserName(),
                usuario.getPassword(),
                usuario.getCpf(),
                usuario.getViewMinutes()
        ));
        System.out.println("""
                ========== MEUS CRÉDITOS ==========
                """);

    }
}