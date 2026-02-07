package GameCharacters;

public class GameCharacter {
    int health;

    public GameCharacter(int health) {
        this.health = health;
    }
    public void attack(){
        System.out.println("GameCharacter attacks.");
    }
}
