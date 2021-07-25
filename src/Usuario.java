import java.util.*;


public class Usuario {


    HashSet user = new HashSet<>();
    TreeSet mytree = new TreeSet();


    public void addTelefono(String s) {
        user.add(s);
    }

    public void mostrarTelefonos(){
        mytree.addAll(user);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "" + mytree;
    }
}
