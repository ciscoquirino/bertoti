import java.util.ArrayList;
import java.util.Iterator;

public class Composite implements Componente {
    ArrayList items = new ArrayList();
    String nome;
    String desc;

    public Composite(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
    }

    public void adicionar(Componente componente) {
        items.add(componente);
    }

    public void remover(Componente componente) {
        items.remove(componente);
    }

    public Componente getChildren(int i) {
        return (Componente) items.get(i);
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }

    public void print() {
        System.out.println("\n" + getDesc() + ": " + getNome());

        Iterator iterator = items.iterator();
        while (iterator.hasNext()) {
            Componente componente = (Componente) iterator.next();
            componente.print();
        }
    }

}
