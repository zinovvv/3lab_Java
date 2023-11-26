import java.util.ArrayList;
import java.util.Scanner;

public class Artist {
    private String name;
    private int numAlbums;
    private ArrayList<Album> albums;

    public Artist(String name, int numAlbums){
        this.name = name;
        this.numAlbums = numAlbums;
    }

    public Artist(Artist other){
        this.name = other.name;
        this.numAlbums = other.numAlbums;
        this.albums = other.albums;
    }

    public Artist(){}

    public void setAlbums(ArrayList<Album> albums){
        this.albums = albums;
    }

    public void PrintAlbums(){
        for (Album album : albums) {
            album.outputAlbum();
        }
    }

    public void deleteAlbum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер альбома, который хотите удалить: ");
        int number = scanner.nextInt();
        this.albums.remove(number-1);
    }
}
