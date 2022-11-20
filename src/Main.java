import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Album album1 = new Album("Album1", "Arijit");
        album1.addSong("1", 4.5);
        album1.addSong("2", 7);
        album1.addSong("3", 8);
        album1.addSong("4", 8);
        album1.addSong("5", 8);
        album1.addSong("6", 8);


        LinkedList<Song> myPlayList = new LinkedList<>();
       album1.addToPlayList("1", myPlayList);
        album1.addToPlayList("2", myPlayList);
        album1.addToPlayList("3", myPlayList);
        album1.addToPlayList("4", myPlayList);
        album1.addToPlayList("5", myPlayList);



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
boolean frwd=true;
while(true){
    int op=sc.nextInt();
    switch (op){
        case 0:
            System.out.println("ok.ty.bye");
            return;
        case 1: menu();return;
        case 2: printList(playList); break;
        case 3: if(!frwd){
            if(itr.hasNext())
            itr.next();

        }
            if(!itr.hasNext()){
            System.out.println("end game baby");
        }
        else{
            System.out.println("Now u r listening to "+itr.next());
        }
        frwd=true;
        break;
        case 4: if(frwd){
            itr.hasPrevious();
            itr.previous();}


            if(!itr.hasPrevious()){
            System.out.println("start game baby");
        }
        else{
            System.out.println("Now u r listening to "+itr.previous());
        }
        frwd=false;
        break;

        case 5: if(frwd){
            if(itr.hasPrevious()){
                System.out.println("Now playing "+itr.previous().toString());
                frwd=false;
            }else{
                System.out.println("We are at the start");

            }

        }
        else{
            if(itr.hasNext()){
                System.out.println("Now playing "+itr.next().toString());
                frwd=true;
            }else{
                System.out.println("We are at the end");

            }
        }
        break;

        case 6:
                if(playList.size()>0){
                    itr.remove();
                    if(itr.hasNext()){
                        System.out.println("Now playing "+itr.next());
                    }
                    else{
                        if(itr.hasPrevious())
                            System.out.println("Now playing "+ itr.previous());
                    }
                }


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