import java.util.Scanner;

//Explicitando para o codigo que o PARAMETRO INVALIDO É REALMENTE UMA EXCECAO

class ParametroInvalidoException extends Exception {
    public ParametroInvalidoException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite um SEGUNDO número:");
        int parametroDois = terminal.nextInt();

        terminal.close();
        
        try {
            contar(parametroUm, parametroDois);

        } catch (ParametroInvalidoException e) {
            System.out.println("O PARAMETRO UM DEVE SER MENOR QUE O PARAMETRO DOIS. DIGITE NOVAMENTE.");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroUm > parametroDois) {
            throw new ParametroInvalidoException("PARÂMETROS INCORRETOS");
        }
        else {
            for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
    }

}
