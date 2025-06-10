import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = sc.nextInt();

        try{
            counter(n1, n2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primero.");
        }
    }

    static void counter(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 > n2) {
            throw new ParametrosInvalidosException("Parâmetros inválidos.");
        }
        int n3 = n2 - n1;;
        for (int i = 1 ; i <= n3; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }
}
