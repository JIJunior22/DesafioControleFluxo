import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            if(parametroDois>parametroUm){
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            }else{
                throw new ParametrosInvalidosException();
            }

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }


    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        System.out.println("O resultado de "+parametroDois+" - "+parametroUm+" é: "+contagem);
    }
}

