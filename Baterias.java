public class Baterias extends Articulos
{
	private String des;

	public Baterias(String des)
	{
		super("Baterias");

		this.des = des;
	}

	public String toString()
	{
		return super.toString() + " " + des;
	}
}