import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class Admin
{
	public ArrayList<Audifonos> audifonos = new ArrayList<Audifonos>();
	public ArrayList<Micas> micas = new ArrayList<Micas>();
	public ArrayList<Auxiliares> auxiliares = new ArrayList<Auxiliares>();
	public ArrayList<Cargadores> cargadores = new ArrayList<Cargadores>();
	public ArrayList<Usb> usb = new ArrayList<Usb>();
	public ArrayList<Bases> bases = new ArrayList<Bases>();
	public ArrayList<Adaptadores> adapta = new ArrayList<Adaptadores>();
	public ArrayList<Baterias> baterias = new ArrayList<Baterias>();
	public ArrayList<Clavijas> clavijas = new ArrayList<Clavijas>();
	public ArrayList<Fundas> fundas = new ArrayList<Fundas>();
	public ArrayList<Articulos> almacen = new ArrayList<Articulos>();

	public void agregar()
	{
		char dec = 'o';
		do{
			dec = JOptionPane.showInputDialog("¿Que tipo de Articulo agregar? \n a.Audifonos \n b.Adaptador \n c.Auxiliar \n d.Base" +
											  "\n e.Bateria \n f.Cargador \n g.Clavija \n h.Micas \n i.Cable Usb \n j.Fundas \n" +
											  "k.Salir").charAt(0);

			switch(dec){
				case 'a':
				audifonos.add(new Audifonos(JOptionPane.showInputDialog("Modelo"), JOptionPane.showInputDialog("Diseño")));
				break;
				case 'b':
				adapta.add(new Adaptadores(JOptionPane.showInputDialog("a.De usb a c \n b.De usb a micro usb \n c.Para audifonos tipo c" +
																	 "\n d.para memoria micro sd").charAt(0)));
				break;
				case 'c':
				auxiliares.add(new Auxiliares());
				break;
				case 'd':
				bases.add(new Bases(JOptionPane.showInputDialog("a.De carro b. de moto").charAt(0)));
				break;
				case 'e':
				baterias.add(new Baterias(JOptionPane.showInputDialog("Descripción")));
				break;
				case 'f':
				cargadores.add(new Cargadores(JOptionPane.showInputDialog("a.Salida tipo C \n b.salida tipo micro usb \n" +
				 														  "c.salida tipo mini usb").charAt(0)));
				break;
				case 'g':
				clavijas.add(new Clavijas(JOptionPane.showInputDialog("a.De contacto \n b.De carro").charAt(0)));
				break;
				case 'h':
				micas.add(new Micas(JOptionPane.showInputDialog("a.Plastico \n b.Cristal \n c.Privacidad").charAt(0)));
				break;
				case 'i':
				usb.add(new Usb(JOptionPane.showInputDialog("a.tipo c \n b.tipo micro usb \n c.tipo mini usb \n d.Varias salidas").charAt(0)));
				break;
				case 'j':
				fundas.add(new Fundas(JOptionPane.showInputDialog("a.Dibujo \n b.Uso rudo \n c.Sencilla")));
				break;
			}
		}while(dec != 'k');
	}

	public void vender()
	{
	    char rem = 'z';
		do{
			rem = JOptionPane.showInputDialog("¿Que Articulo vender? \n a.Audifonos \n b.Adaptador \n c.Auxiliar \n d.Base" +
											   "\n e.Bateria \n f.Cargador \n g.Clavija \n h.Mica \n i.Cable Usb \n j.Funda" +
											   "\nk.Salir").charAt(0);
			int de = 0;
			switch(rem){
				case 'a':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que Audifonos vender?"));
				almacen.add(audifonos.get(de-1));
				audifonos.remove(de-1);
				break;
				case 'b':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que Adaptador vender?"));
				almacen.add(adapta.get(de-1));
				adapta.remove(de-1);
				break;
				case 'c':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que Auxiliar vender?"));
				almacen.add(auxiliares.get(de-1));
				auxiliares.remove(de-1);
				break;
				case 'd':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que Base vender?"));
				almacen.add(bases.get(de-1));
				bases.remove(de-1);
				break;
				case 'e':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que Bateria vender?"));
				almacen.add(baterias.get(de-1));
				baterias.remove(de-1);
				break;
				case 'f':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que Cargador vender?"));
				almacen.add(cargadores.get(de-1));
				cargadores.remove(de-1);
				break;
				case 'g':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que Clavija vender?"));
				almacen.add(clavijas.get(de-1));
				clavijas.remove(de-1);
				break;
				case 'h':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que Mica vender?"));
				almacen.add(micas.get(de-1));
				micas.remove(de-1);
				break;
				case 'i':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que cable usb vender?"));
				almacen.add(usb.get(de-1));
				usb.remove(de-1);
				break;
				case 'j':
				de = Integer.parseInt(JOptionPane.showInputDialog("¿Que funda vender?"));
				almacen.add(fundas.get(de-1));
				fundas.remove(de-1);
				break;
			}
        }while(rem == 'k');
	}

	public void guardarobjeto(){
        try{
            FileOutputStream fs = new FileOutputStream("Articulos.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < almacen.size(); i++ ) {
                os.writeObject(almacen.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardaraudi(){
        try{
            FileOutputStream fs = new FileOutputStream("Audifonos.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < audifonos.size(); i++ ) {
                os.writeObject(audifonos.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardaradapt(){
        try{
            FileOutputStream fs = new FileOutputStream("Adaptadores.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < adapta.size(); i++ ) {
                os.writeObject(adapta.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardaraux(){
        try{
            FileOutputStream fs = new FileOutputStream("Auxiliares.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < auxiliares.size(); i++ ) {
                os.writeObject(auxiliares.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardarBases(){
        try{
            FileOutputStream fs = new FileOutputStream("Bases.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < bases.size(); i++ ) {
                os.writeObject(bases.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardarbat(){
        try{
            FileOutputStream fs = new FileOutputStream("Baterias.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < baterias.size(); i++ ) {
                os.writeObject(baterias.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardarcargador(){
        try{
            FileOutputStream fs = new FileOutputStream("Cargadores.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < cargadores.size(); i++ ) {
                os.writeObject(cargadores.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardarclavija(){
        try{
            FileOutputStream fs = new FileOutputStream("Clavijas.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < clavijas.size(); i++ ) {
                os.writeObject(clavijas.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardarmica(){
        try{
            FileOutputStream fs = new FileOutputStream("Micas.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < micas.size(); i++ ) {
                os.writeObject(micas.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardarusb(){
        try{
            FileOutputStream fs = new FileOutputStream("Usbs.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < usb.size(); i++ ) {
                os.writeObject(usb.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void guardarfundas(){
        try{
            FileOutputStream fs = new FileOutputStream("Fundas.ji");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            for (int i = 0; i < fundas.size(); i++ ) {
                os.writeObject(fundas.get(i));
                //El método writeObject() serializa el objeto y lo escribe en el archivo
            }

            os.close();//Hay que cerrar siempre el archivo
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void leerobjeto(){
        try{
            FileInputStream fis = new FileInputStream("Articulos.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                almacen.add((Articulos) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto1(){
        try{
            FileInputStream fis = new FileInputStream("Audifonos.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                audifonos.add((Audifonos) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto2(){
        try{
            FileInputStream fis = new FileInputStream("Adaptadores.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                adapta.add((Adaptadores) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto3(){
        try{
            FileInputStream fis = new FileInputStream("Auxiliares.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                auxiliares.add((Auxiliares) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto4(){
        try{
            FileInputStream fis = new FileInputStream("Bases.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                bases.add((Bases) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto5(){
        try{
            FileInputStream fis = new FileInputStream("Baterias.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                baterias.add((Baterias) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto6(){
        try{
            FileInputStream fis = new FileInputStream("Cargadores.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                cargadores.add((Cargadores) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto7(){
        try{
            FileInputStream fis = new FileInputStream("Clavijas.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                clavijas.add((Clavijas) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto8(){
        try{
            FileInputStream fis = new FileInputStream("Micas.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                micas.add((Micas) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leerobjeto9(){
        try{
            FileInputStream fis = new FileInputStream("Usbs.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                usb.add((Usb) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public void leer1(){
        try{
            FileInputStream fis = new FileInputStream("Fundas.ji");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //El método readObject() recupera el objeto
            Object elemento;
            while((elemento = ois.readObject()) != null){
                fundas.add((Fundas) elemento);
            }

            ois.close();
            fis.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
    }

    public Admin()
    {
    	leerobjeto();
    	leerobjeto1();
    	leerobjeto2();
    	leerobjeto3();
    	leerobjeto4();
    	leerobjeto5();
    	leerobjeto6();
    	leerobjeto7();
    	leerobjeto8();
    	leerobjeto9();
    	leer1();

    	char elec = 'q';

    	do{
    		elec = JOptionPane.showInputDialog("¿Que quiere hacer? \n a.Mostrar almacen \n b.Agregar Articulo" +
                                               "\n c.Vender \n d.Borrar Ventas \n e.Salir").charAt(0);

    		switch(elec){
                case 'a': listas();
                break;
                case 'b': agregar();
                break;
                case 'c': vender();
                break;
                case 'd': almacen.clear();
                break;
            }
        }while(elec != 'e');
    }

    public void listas()
    {
    	char lis = 's';
    	do{
    		lis = JOptionPane.showInputDialog("¿Que lista ver? \n a.Audifonos \n b.Adaptador \n c.Auxiliar \n d.Base" +
											   "\n e.Bateria \n f.Cargador \n g.Clavija \n h.Mica \n i.Cable Usb \n j.Funda" +
											   "\n k.Ventas \n l.Salir").charAt(0);
		System.out.println("   #    |    Tipo   |    Marca   |    color  | precio| Descripción");
    		System.out.println("--------------------------------------------------------------");
    		switch(lis){
                case 'a':
                for (int i=0; i<audifonos.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(audifonos.get(i));
                }
                guardaraudi();
                break;
                case 'b':
                for (int i=0; i<adapta.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(adapta.get(i));
                }
                guardaradapt();
                break;
                case 'c':
                for (int i=0; i<auxiliares.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(auxiliares.get(i));
                }
                guardaraux();
                break;
                case 'd':
                for (int i=0; i<bases.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(bases.get(i));
                }
                guardarBases();
                break;
                case 'e':
                for (int i=0; i<baterias.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(baterias.get(i));
                }
                guardarbat();
                break;
                case 'f':
                for (int i=0; i<cargadores.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(cargadores.get(i));
                }
                guardarcargador();
                break;
                case 'g':
                for (int i=0; i<clavijas.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(clavijas.get(i));
                }
                guardarclavija();
                break;
                case 'h':
                for (int i=0; i<micas.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(micas.get(i));
                }
                guardarmica();
                break;
                case 'i':
                for (int i=0; i<usb.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(usb.get(i));
                }
                guardarusb();
                break;
                case 'j':
                for (int i=0; i<fundas.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(fundas.get(i));
                }
                guardarfundas();
                break;
                case 'k':
                for (int i=0; i<almacen.size(); i++){
                	System.out.printf(" %7d|",i+1 );
                	System.out.println(almacen.get(i));
                }
                guardarobjeto();
                break;
            }
        }while(lis != 'l');
    }

    public static void main(String[] args) {
    	Admin Encargado = new Admin();
    }
}