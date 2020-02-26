public class Fraction   {
    private int n, d;

    //Constructors============================================================
    public Fraction()   {   //default constructor
        this.n = 1;
        this.d = 2;
    }

    public Fraction(int n, int d)   {   //2 parameter constructor
        this.n = n;
        if(d != 0)  {
            this.d = d;
        }   else    {
            System.out.println("Error");
        }
    }

    public Fraction(String str) {   //string 1/2 formate constructor
        int slash = str.indexOf("/");
        String num = str.substring(0, slash);
        String den = str.substring(slash, slash + 1);
        this.n = Integer.parseInt(num);
        if(Integer.parseInt(den) != 0)  {
            this.d = Integer.parseInt(den);
        }   else    {
            System.out.println("Error");
        }
    }

    public Fraction(Fraction f) {   //copy constructor
        this.n = f.n;
        if(this.d != 0) {
            this.d = f.d;
        }   else    {
            System.out.println("Error");
        }
    }
    //Accessor Methods========================================================
    public int getNum() {
        return this.n;
    }

    public int getDen() {
        return this.d;
    }

    public String toString(String str)    {
        str = new String();
        str = this.n + "/" + this.d;
        return str;
    }

    public double toDouble()   {
        return (double) n/d;
    }
    //static methods===========================================================================================================
    public void reduce() {
        int gcd = gcd(this.n, this.d);
        this.n = this.n / gcd;
        this.d = this.d / gcd;
    }

    public static Fraction multiply(Fraction a, Fraction b)    {
        int top = a.n * b.n;
        int bottom = a.d * b.d;
        Fraction sum = new Fraction(top , bottom);
        sum.reduce();
        return sum;
    }

    public static Fraction divide(Fraction a, Fraction b)   {
        if (b.n == 0) {
            System.out.println("error");
            return new Fraction();
        } else {
            int top = a.n * b.d;
            int bottom = a.d * b.n;
            Fraction sum = new Fraction(top , bottom);
            sum.reduce();
            return sum;
        }
    }

    public static Fraction add(Fraction a, Fraction b)    {
        int top = a.n * b.d + b.n * a.d;
        int bottom = a.d * b.d;
        Fraction sum = new Fraction(top, bottom);
        sum.reduce();
        return sum;
    }
    
    public static Fraction subtract (Fraction a, Fraction b) {      
        int top = a.n * b.d - b.n * a.d;
        int bottom = a.d * b.d;
        Fraction sum = new Fraction(top, bottom);
        sum.reduce();
        return sum;
    }

    public int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
        {
            return 1;
        }

        while (a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
