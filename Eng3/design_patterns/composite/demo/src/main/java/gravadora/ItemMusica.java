package Eng3.design_patterns.composite.demo.src.main.java.gravadora;

public class ItemMusica implements Componente {
    String nome;

    public ItemMusica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void print() {
        System.out.println("Título: " + getNome());
    }

}
