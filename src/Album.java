import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;

    private String artist;
   private ArrayList<Song> songs;
public Album(String title,String singer){
    this.title=title;
    this.artist=singer;
    this.songs = new ArrayList<>();

}

    public boolean findSong(String title){
        for(Song c:this.songs){
            if(c.getTitle().equals(title))
            {
            System.out.print("Song found");
            return true;
        }
    }
        return false;
}
public boolean addSong(String title,double duration){
 if(findSong(title)==true){
     System.out.println("Song found !");
     return false;
 }
    Song newSong= new Song(title,duration);
 this.songs.add(newSong);
 return true;
    }
public boolean addToPlayList(String title, LinkedList<Song>playList){
  //i can add only those which are in album
  for(Song s:this.songs){
      if(s.getTitle().equals(title)){
          playList.add(s);
          return true;
      }
  } return false;
}
public boolean addToPlayList(int trackNumber,LinkedList<Song> playList){
      int index=trackNumber-1;
      if(index>=0 && index<=this.songs.size()-1){
          playList.add(this.songs.get(index));
          return true;
      }
      return false;
}
}
