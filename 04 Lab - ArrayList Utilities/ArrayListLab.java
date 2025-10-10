
import java.io.*;
import java.util.*;

/**
 * CSUS — ArrayList Lab (Student Version)
 * Complete all TODOs. Do not change method signatures.
 * Compile: javac ArrayListLab.java
 * Run:     java ArrayListLab
 */
public class ArrayListLab {

    /* -------------------- I/O HELPERS -------------------- */

    /**
     * TODO: Read whitespace-separated words from the given file into an ArrayList<String>.
     * - Use Scanner and hasNext().
     * - Return a new ArrayList containing the words in read order.
     */
    public static ArrayList<String> readWords(String filename) throws FileNotFoundException {
        // TODO
        return null;
    }

    /**
     * TODO: Read whitespace-separated integers from the given file into an ArrayList<Integer>.
     * - Use Scanner and hasNextInt().
     * - Return a new ArrayList containing the numbers in read order.
     */
    public static ArrayList<Integer> readInts(String filename) throws FileNotFoundException {
        // TODO
        return null;
    }

    /* -------------------- STRING UTILITIES -------------------- */

    /**
     * TODO: Reverse the list of strings IN PLACE (do not create a new list).
     * - Swap symmetric pairs until the middle.
     * - Hint: use get(i) and set(i, value).
     */
    public static void reverseInPlace(ArrayList<String> words) {
        // TODO
    }

    /**
     * TODO: Capitalize (upper-case) any word that ends with 's' (case-insensitive), IN PLACE.
     * - Example: "dogs" -> "DOGS", "BUSes" -> "BUSES".
     * - Do NOT remove anything; only replace with uppercased version.
     */
    public static void capitalizePlurals(ArrayList<String> words) {
        // TODO
    }

    /**
     * TODO: Remove ANY word that ends with 's' (case-insensitive), IN PLACE.
     * - Be careful not to skip elements when removing.
     * - Approach: iterate backward OR decrement i after removing.
     */
    public static void removePlurals(ArrayList<String> words) {
        // TODO
    }

    /* -------------------- INTEGER UTILITIES -------------------- */

    /** Small record-like container for statistics. */
    public static class Stats {
        public final double average;
        public final int min;
        public final int max;
        public Stats(double average, int min, int max) {
            this.average = average; this.min = min; this.max = max;
        }
    }

    /**
     * TODO: Compute average (double), min, and max for a NON-EMPTY list of integers.
     * - Return a Stats object with the three values.
     * - Use wrapper Integer values via list.get(i).
     */
    public static Stats computeStats(ArrayList<Integer> nums) {
        // TODO
        return null;
    }

    /**
     * TODO: Remove all even numbers from the list IN PLACE.
     * - Use a removal-safe traversal strategy (e.g., iterate from end to start).
     */
    public static void removeEvens(ArrayList<Integer> nums) {
        // TODO
    }

    /**
     * TODO: Return a NEW list containing the intersection of two sorted integer lists.
     * - Both inputs are assumed sorted ascending (duplicates allowed).
     * - Output contains each value as many times as it appears in BOTH lists.
     * - Implement the classic two-pointer scan in O(n + m).
     * - DO NOT modify the inputs.
     */
    public static ArrayList<Integer> intersectSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        // TODO
        return null;
    }

    /* -------------------- DEMO / MAIN -------------------- */

    public static void main(String[] args) throws Exception {
        // Load data
        ArrayList<String> words = readWords("words.txt");
        ArrayList<Integer> nums  = readInts("numbers.txt");

        System.out.println("Original words:       " + words);
        reverseInPlace(words);
        System.out.println("Reversed words:       " + words);
        capitalizePlurals(words);
        System.out.println("Cap Plurals words:    " + words);
        removePlurals(words);
        System.out.println("No Plurals words:     " + words);
        System.out.println();

        System.out.println("Original numbers:     " + nums);
        Stats s = computeStats(nums);
        System.out.printf("Stats -> avg=%.2f, min=%d, max=%d%n", s.average, s.min, s.max);
        removeEvens(nums);
        System.out.println("After remove evens:   " + nums);

        // For intersection demo: derive a sorted second list
        ArrayList<Integer> numsSorted = new ArrayList<>(readInts("numbers.txt"));
        Collections.sort(numsSorted);
        ArrayList<Integer> handMade = new ArrayList<>(Arrays.asList(3, 3, 5, 7, 11, 14, 21, 42));
        System.out.println("Sorted A:             " + numsSorted);
        System.out.println("Sorted B:             " + handMade);
        System.out.println("Intersect(A,B):       " + intersectSorted(numsSorted, handMade));
    }
}
