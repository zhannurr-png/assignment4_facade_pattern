import facade.MediaConversionFacade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaConversionFacade facade = new MediaConversionFacade();

        System.out.print("Enter file name (e.g. movie.avi): ");
        String fileName = scanner.nextLine();

        System.out.print("Enter target format (e.g. mp4): ");
        String targetFormat = scanner.nextLine();

        System.out.println("Enter current volume(0-100)");
        int volume = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter an action(increase/decrease: ");
        String action = scanner.nextLine();

        String result = facade.convert(fileName, targetFormat, volume, action);
        System.out.println(result);
        scanner.close();
    }
}