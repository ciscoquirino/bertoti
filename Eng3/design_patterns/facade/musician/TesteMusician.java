public class TesteMusician {
    public static void main(String[] args) {
        Voice v1 = new Voice("Lead singer");
        Instrument g1 = new Instrument("guitar");
        
        MusicianFacade musician = new MusicianFacade(v1, g1);
        
        musician.learn("'Freebird'");
        musician.play("'Freebird'");
        musician.finish();
    }
}