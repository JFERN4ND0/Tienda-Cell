public class Micas extends Articulos
{
	private char mat;

	public Micas(char mat)
	{
		super("Mica");
		this.mat = mat;
	}

	public String toString()
	{
		String mate = "";
		if(mat == 'a' || mat == 'A'){
			mate = "Plastico";
		}else if(mat == 'b' || mat =='B'){
			mate = "Cristal";
		}else if(mat == 'c' || mat == 'C'){
			mate = "Privacidad";
		}
		return super.toString() + " " + mate;
	}
}