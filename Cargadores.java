public class Cargadores extends Articulos
{
    private char salida;

    public Cargadores(char sal)
    {
        super("Cargador");

        this.salida = sal;
    }

    public String tiString()
    {
        String sali = "";
        
        if(salida == 'a' || salida == 'A')
        {
            sali = "Salida tipo C";
        }else if(salida == 'b' || salida == 'B')
        {
            sali = "salida tipo micro usb";
        }else if(salida == 'c' || salida == 'C')
        {
            sali = "salida tipo mini usb";
        }

        return super.toString() + " " + sali;
    }
}