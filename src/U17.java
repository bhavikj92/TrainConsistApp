import java.util.Arrays;

public class U17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC17: Sort Bogie Names Using Arrays.sort()\n");

        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        Arrays.sort(bogies);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}