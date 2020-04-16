
/**
 * Write a description of class b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class b
{
public static void doSomething(int value)
{
    if(0 < value && value < 10)
    {
        doSomething(value + 4);
        doSomething(value + 2);
        System.out.print(" " + value);
    }
}
}
