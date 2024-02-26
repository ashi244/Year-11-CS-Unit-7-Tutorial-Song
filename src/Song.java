import java.util.ArrayList;
public class Song {

    private String title;
    private String artist;
    private ArrayList <String> listeners = new ArrayList();
    public Song (String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int howMany(ArrayList <String> newListeners){
        int newListenerCount = 0;
        for (int i = 0; i < newListeners.size(); i++){
            String lowercaseListener = newListeners.get(i).toLowerCase();
            if (!(listeners.contains(lowercaseListener))){
                listeners.add(lowercaseListener);
                newListenerCount++;
            }
        }
        return newListenerCount;
    }
}
