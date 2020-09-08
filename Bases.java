public class Bases extends Articulos
{
    private char com;
    public Bases(char mot)
    {
        super("Base");

        this.com = mot;
    }

    public String toString()
    {
        String moc = "";
        if(com == 'a' || com == 'A')
        {
            moc = "De usb a c";
        }else if(com == 'b' || com =='B')
        {
            moc = "De usb a micro usb";
        }else if(com == 'C' || com == 'c')
        {
            moc = "Para audifonos tipo c";
        }else if(com == 'D' || com == 'd')
        {
            moc = "para memoria micro sd";
        }
        return String.format(super.toString() + " " + moc);
    }
}