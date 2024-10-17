
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int eurSum = this.euros + addition.euros;
        int centSum = this.cents + addition.cents;
        if (centSum > 99) {
            centSum = centSum % 100;
            eurSum = eurSum + 1;
        }
        Money newMoney = new Money(eurSum, centSum); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros) {
            return this.cents < compared.cents;
        } else {
            return this.euros < compared.euros;
        }
    }
    
    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        }
        int eurDiff = this.euros - decreaser.euros;
        int centDiff = this.cents - decreaser.cents;
        if (centDiff < 0) {
            eurDiff = eurDiff - 1;
            centDiff = 100 + centDiff;
        }
        Money newMoney = new Money(eurDiff, centDiff);
        return newMoney;
    }
}
