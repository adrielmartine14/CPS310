public class ZeroDenominatorException extends RuntimeException
{
    public ZeroDenominatorException(String reason)
    {
        super(reason);
    }
}