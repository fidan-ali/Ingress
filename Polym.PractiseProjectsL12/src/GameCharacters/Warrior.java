package GameCharacters;

public class Warrior extends GameCharacter{
    public Warrior(int health){
        super(health);
    }
    @Override
    public void attack() {
        System.out.println("Warrior attacks.");
    }
}
