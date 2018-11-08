public class Rational
{
    // PUT PRIVATE DATA FIELDS HERE
    private int numerator;
    private int denominator;
    /**
     * The default constructor for objects of class Rational.  Creates the rational number 1.
     */
    public Rational()
    {       
        // ADD CODE TO THE CONSTRUCTOR
        numerator=1;
        denominator=1;
    }

    /**
     * The alternate constructor for objects of class Rational.  Creates a rational number equivalent to n/d.
     * @param n The numerator of the rational number.
     * @param d The denominator of the rational number.
     */    
    public Rational(int n, int d)
    {
        // ADD CODE TO THE ALTERNATE CONSTRUCTOR
        if(d==0){
            throw new ZeroDenominatorException("Denominator is zero");
        }
        int gcd = gcd(n,d);
        n /= gcd;
        d /= gcd;
        numerator =n;
        denominator =d;
        if(d<0){
            int val = gcd(Math.abs(n),Math.abs(d));
            numerator =  (-n/val);
            denominator = Math.abs(d)/val;
        }
    }
    
    /**
     * Get the value of the Numerator
     *
     * @return     the value of the numerator
     */
    public int getNumerator()
    {
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return numerator;
    }
    
    /**
     * Get the value of the Denominator
     *
     * @return     the value of the denominator
     */
    public int getDenominator()
    {
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return denominator;
    }

    /**
     * Negate a rational number r
     * 
     * @return a new rational number that is negation of this number -r
     */    
    public Rational negate()
    {               
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        //Rational r= new Rational(((-1)*numerator),denominator);
        //return r;
        return new Rational(-numerator,denominator);
    }

    /**
     * Invert a rational number r 
     * 
     * @return a new rational number that is 1/r.
     */    
    public Rational invert()
    {               
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        Rational invert = new Rational(denominator,numerator);
        return invert;
    }

    /**
     * Add two rational numbers
     *
     * @param other the second argument of the add
     * @return a new rational number that is the sum of this and the other rational
     */    
    public Rational add(Rational other)
    {       
        // ADD NEW CODE AND CHANGE THE RETURN TO SOMETHING APPROPRIATE
        int newNumerator= (numerator*other.denominator+denominator*other.numerator);
        int newDenominator= (denominator*other.denominator); 
        return new Rational(newNumerator,newDenominator);
    }
    
     /**
     * Subtract a rational number t from this one r
     *
     * @param other the second argument of subtract
     * @return a new rational number that is r-t
     */    
    public Rational subtract(Rational other)
    {               
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        int newNumerator= (numerator*other.denominator-denominator*other.numerator);
        int newDenominator= (denominator*other.denominator);
        return new Rational(newNumerator,newDenominator);
    }

    /**
     * Multiply two rational numbers
     *
     * @param other the second argument of multiply
     * @return a new rational number that is the sum of this object and the other rational.
     */    
    public Rational multiply(Rational other)
    {       
        // ADD NEW CODE AND CHANGE THE RETURN TO SOMETHING APPROPRIATE
        int newNumerator= (numerator*other.numerator);
        int newDenominator= (denominator*other.denominator);
        return new Rational(newNumerator,newDenominator);
    }        
 
     /**
     * Divide this rational number r by another one t
     *
     * @param other the second argument of divide
     * @return a new rational number that is r/t
     */    
    public Rational divide(Rational other)
    {               
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        int newNumerator= (numerator*other.denominator);
        int newDenominator= (denominator*other.numerator);
        return new Rational(newNumerator,newDenominator);
    }   
 
    /**
     * Put the rational number in normal form where the numerator
     * and the denominator share no common factors.  Guarantee that only the numerator
     * is negative.
     *
     */
    private void normalize()
    {
        // ADD CODE TO NORMALIZE THE RATIONAL NUMBER
        int divisor= gcd(numerator,denominator);
        numerator= numerator/divisor;
        denominator= denominator/divisor;
    }
    
    /**
     * Recursively compute the greatest common divisor of two positive integers
     *
     * @param a the first argument of gcd
     * @param b the second argument of gcd
     * @return the gcd of the two arguments
     */
    private int gcd(int a, int b)
    {
        if(b==0){
            return a;
        }
        else{
            return gcd(b, a % b);
        }
    }
}