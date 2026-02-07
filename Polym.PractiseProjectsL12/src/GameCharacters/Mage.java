package GameCharacters;

public class Mage extends GameCharacter{
    public Mage(int health){
        super(health);
    }
    @Override
    public void attack() {
        System.out.println("Mage attacks.");
    }
}
