public class cliente {
    public static void main(String[] args) {

        usdollar x = new usdollar(5, 80);
        usdollar y = new usdollar(1, 90);

        usdollar result = x.plus(y);

        System.out.println("x: " + x); // exemplo 1 ( $5,80)
        System.out.println("y: " + y); // exemplo2  ( $1,90)
        System.out.println("----------------------------=---");
        System.out.println("***x + y***: $" + result); // soma dos 2
        System.out.println("--------------------------------");

    }
}

