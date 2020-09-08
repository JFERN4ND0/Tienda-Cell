public class Audifonos extends Articulos
{
    private String conec;
    private String dise;

    public Audifonos(String modelo, String dise)
    {
    	super("Audifonos");

    	this.conec = modelo;
    	this.dise = dise;
    }

    public String toString()
    {
    	return super.toString() + " " + conec + " " + dise;
    }
}