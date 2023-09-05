public class usdollar {
    private int dollars;
    private int cents;

        //construtor //sobra
    public usdollar(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;

        if (this.cents >= 100) {
            int extraDollars = this.cents / 100;
            this.dollars += extraDollars;
            this.cents %= 100;
        }
    }

    public usdollar plus(usdollar other) {
        int newDollars = this.dollars + other.dollars;
        int newCents = this.cents + other.cents;

        if (newCents >= 100) {
            int extraDollars = newCents / 100;
            newDollars += extraDollars;
            newCents %= 100;
        }

        return new usdollar(newDollars, newCents);
    }

    public String toString() {
        return dollars + "," + cents;
    }
}
