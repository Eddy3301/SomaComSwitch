import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int N;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para somar: (0 para encerrar)");
        N = scanner.nextInt();
        int sum = 0;
        while (N != 0) {
            sum = sum + N;
            System.out.println("Digite um número para somar: (0 para encerrar)");
            N = scanner.nextInt();
        }
        System.out.println("A soma dos números digitados é: " + sum);
        scanner.close(); 
        

    }
}
