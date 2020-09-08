public class Clavijas extends Articulos
{
	private char car;

	public Clavijas(char car)
	{
		super("Clavijas");

		this.car = car;
	}

	public String toString()
	{
		String carr = "";

		if(car == 'a' || car == 'A')
		{
			carr = "De contacto";
		}else if(car == 'b' | car == 'B')
		{
			carr = "De carro";
		}
		
		return super.toString() + " " + carr;
	}
}