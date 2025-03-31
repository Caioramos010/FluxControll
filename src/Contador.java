import java.rmi.server.ExportException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int num2 = sc.nextInt();

        try{
            contar(num1, num2);
        }catch (ParametrosInvalidosException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }
    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num2 < num1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else {
            int contagem = num2 -num1;
            for (int aux = 0 ; aux < contagem ; aux++) {
                System.out.println("Imprimindo o número: " + (aux+1));
            }
        }
    }
}
