package Eng3.design_patterns.singleton.demo.src.main.java.com.example.singleton;

public class Highlander {
    private static Highlander uniqueInstance;

    private Highlander() {};

    public static Highlander getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Highlander();
        }
        return uniqueInstance;
    }    

    public void frase(){
        System.out.println("SÓ PODE HAVER UM!!!!! \n");
    }
}
