package GameCharacters;

public class Archer extends GameCharacter{
    public Archer(int health){
        super(health);
    }
    @Override
    public void attack() {
        System.out.println("Archer attacks.");
    }
}
