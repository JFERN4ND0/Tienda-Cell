import javax.swing.JOptionPane;
public class Cables extends Articulos
{
	private String uso;
	private String longitud;
	private String color;

	public Cables(String uso)
	{
		super("Cable");

		this.uso = uso;
		this.longitud = JOptionPane.showInputDialog("Longitud");
		this.color = JOptionPane.showInputDialog("Color");
	}

	public String toString()
    {
        return super.toString() + " " + uso + " " + longitud;
    }
}