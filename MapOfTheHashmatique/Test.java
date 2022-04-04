import java.util.*;
public class Test{
    public static void main(String[] args){
            HashMap<String, String> trackList = new HashMap<String, String>();
                trackList.put("Lyrics for song one...", "Song 1");
                trackList.put("Lyrics for song two...", "Song 2");
                trackList.put("Lyrics for song three...", "Song 3");
                trackList.put("Lyrics for song four...", "Song 4");

            String name = trackList.get("Lyrics for song one...");
            System.out.println("Song title: " + name);

            Set<String> keys = trackList.keySet();
            for(String key : keys){
                System.out.println(trackList.get(key) + ":" + key);
    }
    }
}