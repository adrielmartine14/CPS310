public class Counter
{
    // PUT PRIVATE DATA FIELDS HERE
    private int minimum;
    private int maximum;
    private int current;
    private boolean rollOver;
    /**
     * The default constructor for objects of class Counter.  Minimum is 0 and the maximum
     * is the largest possible integer.
     */
    public Counter()
    {
        minimum=0;
        maximum=Integer.MAX_VALUE;
        current=minimum;
        rollOver=false;
    }
    
    /**
     * The alternate constructor for objects of class Counter.  The minimum and maximum values are given as parameters.
     * The counter starts at the minimum value.
     * @param min The minimum value that the counter can have
     * @param max The maximum value that the counter can have
     * */
    public Counter(int min, int max)
    {
        // ADD CODE FOR THE ALTERNATE CONSTRUCTOR
        minimum=min;
        maximum=max;
        current=minimum;
        rollOver=false;
    }
    
    /**
     * Determine if two counters are in the same state
     *
     * @param  otherObject   the object to test against for equality
     * @return     true if the objects are in the same state
     */
    public boolean equals(Object otherObject)
    {
        boolean result = false;
        if (otherObject instanceof Counter)
        {
            // YOUR CODE GOES HERE
            Counter counter= (Counter) otherObject;
            if(minimum==counter.minimum && maximum==counter.maximum && current==counter.current){
                //return true;
                result= true;
            }
            else{
                //return false;
                result= false;
            }
        }
        return result;
    }
    
    /**
     * Increases the counter by one
     */
    public void increase()
    {
        // ADD CODE TO INCREASE THE VALUE OF THE COUNTER
        current++;
        if(current > maximum){
            current= minimum;
            rollOver=true;
        }
    }
    
     /**
     * Decreases the counter by one
     */
    public void decrease()
    {
        // ADD CODE TO INCREASE THE VALUE OF THE COUNTER
        current--;
        if(current < maximum){
            current= maximum;
            rollOver=true;
        }
    }
    
    /**
     * Get the value of the counter
     *
     * @return     the current value of the counter
     */
    public int value()
    {
        // CHANGE THE RETURN TO GIVE THE CURRENT VALUE OF THE COUNTER
        return current;
    }
    
    
    /**
     * Accessor that allows the client to determine if the counter
     *             rolled over on the last count
     *
     * @return     true if the counter rolled over
     */
    public boolean rolledOver()
    {
        // CHANGE THE RETURN TO THE ROLLOVER STATUS OF THE COUNTER
        return rollOver;
    }
    
    /**
     * Override the toString method to provide a more informative
     * description of the counter
     *
     * @return     a descriptive string about the object
     */
    public String toString()
    {
        // CHANGE THE RETURN TO A DESCRIPTION OF THE COUNTER
        return "Current is "+ current+". The max is "+maximum+". The min is "+minimum+".";      
    }
 
}