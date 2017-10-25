/**
 * Created by Alumnos on 25/10/2017.
 */
public class AplicacionTerminal {
    public static void main(String[] args)
    {
        Contacto c1=new Contacto("Raul","UASLP",4441228395);
        Contacto c2=new Contacto("irma","vallezarzuela",4442332094);
        Contacto c3=new Contacto("andrea","UASLP",4441815190);

        Agenda agenda=new Agenda;
        agenda.agregarContacto(c1);
        agenda.agregarContacto(c2);
        agenda.agregarContacto(c3);
        agenda.imprimeTodo();
    }

}
