import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        terminal.close();

        try {
            //imprimir números
            contador(parametroUm, parametroDois);
        }  catch (ParametrosInvalidosException exception) {
            System.err.println("O segundo número deve ser maior que o primeiro");
        }

    }

    static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) 
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for(int inicial = 1; inicial <= contagem; inicial++ ){
            System.out.println(inicial);
        }
    }  
}
