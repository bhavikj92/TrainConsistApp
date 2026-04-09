public class U20 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC20: Exception Handling During Search\n");

        // Step 1: Bogie array (try empty {} to test exception)
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        // Step 2: Search key
        String searchKey = "BG205";

        // Step 3: Fail-fast validation
        if (bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        boolean found = false;

        // Step 4: Linear Search (can reuse UC18 logic)
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                System.out.println("Bogie Found at index: " + i);
                found = true;
                break;
            }
        }

        // Step 5: Result
        if (!found) {
            System.out.println("Bogie NOT Found");
        }
    }
}