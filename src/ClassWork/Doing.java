package ClassWork;

public class Doing {
    private int[] items;

    public Doing(int length)
    {
        items = new int[ length];
    }
    public void insert()
    {

    }
    public void print()
    {
        for(int i = 0; i < items.length; i++)
        {
            System.out.println(items[i]);
        }
    }
}
