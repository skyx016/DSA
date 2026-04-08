public class substring {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        int index = findFirstIndex(haystack, needle);
        System.out.println("First occurrence index: " + index);
    }

    public static int findFirstIndex(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            // Assume match is true
            boolean found = true;

            for (int j = 0; j < m; j++) {

                // If any character doesn't match
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }

            // If still true → full match found
            if (found) {
                return i;
            }
        }

        return -1;
    }
}