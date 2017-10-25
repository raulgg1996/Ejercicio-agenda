import java.util.LinkedList;

/**
 * Created by Alumnos on 25/10/2017.
 */
public class Agenda {
    private LinkedList<Contacto>contactos;


    public Agenda()
        {
            contactos=new LinkedList<>();
        }


    public void agregarContacto(Contacto nuevo)
    {
        contactos.add(nuevo);
    }

    public void imprimeTodo()
    {
     /*   for(int i=0;i<contactos.size();i++)
        {

        }*/
     /*for(Tipo var:coleccion)
     {
         acciones con la variable var
     }*/
     for(Contacto c: contactos)
     {
         
     }
    }
}
