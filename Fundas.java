public class Fundas extends Articulos
{
    private String dis;

    public Fundas(String dis)
    {
        super("Funda");
        this.dis = dis;
    }

    public String toString()
    {
        return String.format(super.toString() + " " + dis);
    }
}