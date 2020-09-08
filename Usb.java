public class Usb extends Cables
{
	private char sal;

	public Usb(char sal)
	{
		super("USB");
		this.sal = sal;
	}

	public String toString()
	{
		String sali = "";

		if(sal == 'a' || sal == 'A')
		{
			sali = "tipo c";
		}else if(sal == 'b' | sal == 'B')
		{
			sali = "tipo micro usb";
		}else if(sal == 'c' || sal == 'C')
		{
			sali = "tipo mini usb";
		}else if(sal == 'd' || sal == 'D')
		{
			sali = "Varias salidas";
		}

		return super.toString() + sali;
	}
}