import java.util.Scanner;
public class Track {
    private String title;
    private String artist;
    private int duration;
    private int year;
    private String genre;

    public Track(String title, String artist, int duration, int year, String genre){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.year = year;
        this.genre = genre;
    }

    public Track(Track other){
        this.title = other.title;
        this.artist = other.artist;
        this.duration = other.duration;
        this.year = other.year;
        this.genre = other.genre;
    }

    public Track(){}

    public static Track InputTrack(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Название трека: ");
        String title = scanner.nextLine();

        System.out.print("Исполнитель: ");
        String artist = scanner.nextLine();

        System.out.print("Жанр трека: ");
        String genre = scanner.nextLine();

        System.out.print("Продолжительность трека (в секундах): ");
        int duration = scanner.nextInt();

        System.out.print("Год выпуска трека: ");
        int year = scanner.nextInt();

        return new Track(title, artist, duration, year, genre);
    }

    public static Track InputShortTrack(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Название трека: ");
        String title = scanner.nextLine();

        System.out.print("Жанр трека: ");
        String genre = scanner.nextLine();

        System.out.print("Продолжительность трека (в секундах): ");
        int duration = scanner.nextInt();

        return new Track(title, "", duration, 0, genre);

    }

    public void OutputTrack(){
        System.out.println("\nНазвание: " + title);
        System.out.println("Исполнитель: " + artist);
        System.out.println("Продолжительность: " + duration + " секунд");
        System.out.println("Год выпуска: " + year);
        System.out.println("Жанр: " + genre);
    }

    public void OutputShortTrack(){
        System.out.printf("%-25s Продолжительность: %-10d сек Жанр: %s%n", title, duration, genre);
    }
}
