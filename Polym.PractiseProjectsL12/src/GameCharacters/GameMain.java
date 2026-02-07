package GameCharacters;

public class GameMain {
    public static void main(String[] args){
        GameCharacter[] characters = {
                new Warrior(100),
                new Archer(50),
                new Mage(200)
        };

        for (GameCharacter c : characters) {
            c.attack();
        }
    }
}
