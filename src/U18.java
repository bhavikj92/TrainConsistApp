public class U18 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC18: Linear Search for Bogie ID\n");

        // Step 1: Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Search key
        String searchKey = "BG309";  // change to test

        boolean found = false;

        // Step 3: Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                System.out.println("Bogie Found at index: " + i);
                found = true;
                break;  // early termination
            }
        }

        // Step 4: Result
        if (!found) {
            System.out.println("Bogie NOT Found");
        }
    }
}