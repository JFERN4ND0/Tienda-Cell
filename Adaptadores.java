public class Adaptadores extends Articulos
{
	private char end;

	public Adaptadores(char end)
	{
		super("Adaptadores");
		this.end = end;
	}

	public String toString()
	{
		String fine = "";
		
		if(end == 'a' || end == 'A')
		{
			fine = "De usb a c";
		}else if(end == 'b' || end =='B')
		{
			fine = "De usb a micro usb";
		}else if(end == 'C' || end == 'c')
		{
			fine = "Para audifonos tipo c";
		}else if(end == 'D' || end == 'd')
		{
			fine = "para memoria micro sd";
		}

		return super.toString() + " " + fine;
	}
}