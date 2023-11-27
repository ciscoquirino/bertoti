public class TesteGravadora {
    public static void main(String[] args) {
        Composite artista1 = new Composite("The Wonders", "artista") ;
        Composite artista2 = new Composite("U2", "artista") ;
        Composite gravadora = new Composite("Warner Broders", "Gravadora") ;
        Composite disco1doartista2 = new Composite("Disco de estreia", "álbum"); 
        Composite disco2doartista2 = new Composite("Segundo Disco", "álbum");
        
        gravadora.adicionar(artista1);
        gravadora.adicionar(artista2);
        
        artista2.adicionar(disco1doartista2);
        artista2.adicionar(disco2doartista2);
        
        artista1.adicionar(new ItemMusica("That Thing You Do (single)"));
        
        disco1doartista2.adicionar(new ItemMusica("Sunday Bloody Sunday"));
        disco1doartista2.adicionar(new ItemMusica("One"));

        disco2doartista2.adicionar(new ItemMusica("Beautiful Day"));
        disco2doartista2.adicionar(new ItemMusica("With Or Without You"));

        System.out.println("Listagem de todas as músicas lançadas pela gravadora");
        gravadora.print();

        System.out.println("Listagem de todas as músicas lançadas pelo " + artista2.getNome());
        artista2.print();

    }
}