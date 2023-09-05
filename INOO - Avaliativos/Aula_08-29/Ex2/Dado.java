import java.util.Random;

class Dado {
    private int lados;

    public Dado(int lados) {
        this.lados = lados;
    }

    public int rolar() {
        Random random = new Random();
        return random.nextInt(lados) + 1;
    }

    public static void main(String[] args) {
        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(6);

        for (int i = 1; i <= 3; i++) {
            int resultadoDado1 = dado1.rolar();
            int resultadoDado2 = dado2.rolar();
            int soma = resultadoDado1 + resultadoDado2;

            System.out.println("Lancamento " + i + ":");
            System.out.println("Dado 1: " + resultadoDado1);
            System.out.println("Dado 2: " + resultadoDado2);
            System.out.println("Soma: " + soma);
            System.out.println();
        }
    }
}
