import java.util.Scanner;

public class ClientCode {

    public static void main(String[] args) {
        
        Scanner scanner;
        Triangulo triangulo;

        int a,b,c;

        /* Instanciar objetos */
        scanner = new Scanner(System.in);

        /* ler 5 triangulos, com 3 dados */

        for(int i = 0; i != 5; i++){
            System.out.println("Digite os 3 lados: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            /* Instanciar um triangulo */

            triangulo = new Triangulo(a, b, c);

            if(triangulo.Equilatero()){
                System.out.println("Equilátero");
            } else if(triangulo.Escaleno()){
                System.out.println("Escaleno");
            } else if(triangulo.Isoceles()){
                System.out.println("Isoceles");
            } else{
                System.out.println("Não forma triangulo");
            }
        }
        scanner.close();
    }
}
