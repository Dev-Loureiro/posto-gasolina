import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        boolean exibirTabela = true;

        int x;
        do {
            if (exibirTabela) {
                System.out.println("-------COMBUSTIVEIS DISPONIVEIS-------");
                System.out.println("1.Alcool");
                System.out.println("2.Gasolina");
                System.out.println("3.Dielsel");
                System.out.println("4.Encerrar compra");
                System.out.println("--------------------------------------");
               
                
            }

            System.out.print("Digite um código: ");
            x = sc.nextInt();
            System.out.println();

            if (x == 1) {
                s1++;
                exibirTabela = true;
            } else if (x == 2) {
                s2++;
                exibirTabela = true;
            } else if (x == 3) {
                s3++;
                exibirTabela = true;
            } else if (x != 4) {
            	System.out.println("------------------------------------");
                System.out.println("Código inválido, digite novamente.");
                exibirTabela = false;
            }

        } while (x != 4);

        System.out.println();
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Sua compra foi");
        System.out.println("Alcool: " + s1);
        System.out.println("Gasolina: " + s2);
        System.out.println("Diesel: " + s3);

        sc.close();
    }
}