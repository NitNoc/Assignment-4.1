public class FractionDriver {
    public static void main(String args[])  {
        Fraction f0 = new Fraction(1, 0);
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 5);
        
        Fraction product;
        product = Fraction.multiply(f1, f2);
        System.out.println(product);
        product = Fraction.multiply(f2, f0);
        System.out.println(product);
    }
}
