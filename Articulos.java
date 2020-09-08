import java.io.*;
import javax.swing.JOptionPane;
public class Articulos implements Serializable
{
	private String marca;
	private String tipo;
	private String color;
	private int precio = 0;

	public Articulos(String tipo)
	{
		this.tipo = tipo;
		this.marca = JOptionPane.showInputDialog("Marca");
		this.color = JOptionPane.showInputDialog("Color");
		do{
			try{
				this.precio = Integer.parseInt(JOptionPane.showInputDialog("precio"));
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Precio no valido");
			}
		}while(precio == 0);
	}

	public String toString()
    {
        return String.format("%10s | %10s | %9s | $%4d |", tipo, marca, color, precio);
    }
}