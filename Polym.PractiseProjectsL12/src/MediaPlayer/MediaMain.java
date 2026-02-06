package MediaPlayer;

public class MediaMain {
    public static void main(String[] args){
        Media[] mediaList = new Media[3];
        mediaList[0] = new Music();
        mediaList[1] = new Movie();
        mediaList[2] = new Podcast();

        for(int i = 0; i<mediaList.length; i++){
            mediaList[i].play();
        }
    }
}
