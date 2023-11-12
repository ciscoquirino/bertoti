package Eng3.design_patterns.singleton.demo.src.main.java.com.example.singleton;

public class Main {
    public static void main(String[] args) {
        Highlander h = Highlander.getInstance();
        h.frase();
    }
}