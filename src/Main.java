import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Album album1 = new Album("Album1", "Arijit");
        album1.addSong("Kesariya", 4.5);
        album1.addSong("tum hi ho", 7);
        album1.addSong("abad barbad", 8);
        LinkedList<Song> myPlayList = new LinkedList<>();
        album1.addToPlayList("Kesariya", myPlayList);
        play(myPlayList);
    }
    public static void play(LinkedList<Song>playList){
        Scanner sc= new Scanner(System.in);

        ListIterator<Song>itr=playList.listIterator();
if(!itr.hasNext()){
    System.out.println("PlayList is empty");return;}
else{
    System.out.println("You are now" +
            " listening "+itr.next());
}
menu();
while(true){
    int op=sc.nextInt();
    switch (op){
        case 0:
            System.out.println("ty for listening");
            return;
        case 1: menu();return;
        case 2: printList(playList); break;



    }
}
    }
        public static void printList(LinkedList<Song> playList){
            ListIterator<Song>itr=playList.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            }
    }
    public static void menu(){
        System.out.println("0 .Exit");
        System.out.println("1. Print menu");
        System.out.println("2.Show list of all songs");
        System.out.println("3.Play next song");
        System.out.println("4.Play previous song");
        System.out.println("5.Repeat the song");
        System.out.println("6.Delete the song");

    }
}