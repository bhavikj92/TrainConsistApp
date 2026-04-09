import java.util.Arrays;

public class U19 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC19: Binary Search for Bogie ID\n");

        // Step 1: Bogie IDs (can be unsorted)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort before binary search (required)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Step 3: Search key
        String searchKey = "BG309"; // change to test

        int low = 0;
        int high = bogieIds.length - 1;

        boolean found = false;

        // Step 4: Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                System.out.println("\nBogie Found at index: " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Step 5: Result
        if (!found) {
            System.out.println("\nBogie NOT Found");
        }
    }
}