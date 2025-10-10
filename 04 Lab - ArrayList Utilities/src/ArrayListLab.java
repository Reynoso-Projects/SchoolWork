
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
         ArrayList<String> words = new ArrayList<>();

         Scanner sc = new Scanner(new File(filename));
         while(sc.hasNext()){
             words.add(sc.next());
        }
        return words;
    }

    /**
     * TODO: Read whitespace-separated integers from the given file into an ArrayList<Integer>.
     * - Use Scanner and hasNextInt().
     * - Return a new ArrayList containing the numbers in read order.
     */
    public static ArrayList<Integer> readInts(String filename) throws FileNotFoundException {
        ArrayList<Integer> numbs = new ArrayList<>();

        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNextInt()){
            numbs.add(sc.nextInt());
        }
        return numbs;
    }

    /* -------------------- STRING UTILITIES -------------------- */

    /**
     * TODO: Reverse the list of strings IN PLACE (do not create a new list).
     * - Swap symmetric pairs until the middle.
     * - Hint: use get(i) and set(i, value).
     */
    public static void reverseInPlace(ArrayList<String> words) {
        // TODO
        int i = 0;
        int j = words.size()- 1;

        while(i<j){
            String temp = words.get(i);
            words.set(i, words.get(j));
            words.set(j, temp);
            i++;
            j--;
        }
    }

    /**
     * TODO: Capitalize (upper-case) any word that ends with 's' (case-insensitive), IN PLACE.
     * - Example: "dogs" -> "DOGS", "BUSes" -> "BUSES".
     * - Do NOT remove anything; only replace with uppercased version.
     */
    public static void capitalizePlurals(ArrayList<String> words) {
        // TODO
        for(int i = 0; i < words.size()-1; i++){
            String w = words.get(i);
            if(w.toLowerCase().endsWith("s")){
                words.set(i, w.toUpperCase());
            }

        }
    }

    /**
     * TODO: Remove ANY word that ends with 's' (case-insensitive), IN PLACE.
     * - Be careful not to skip elements when removing.
     * - Approach: iterate backward OR decrement i after removing.
     */
    public static void removePlurals(ArrayList<String> words) {
        // TODO
        for(int i = words.size() - 1; i >= 0; i--){
            String w = words.get(i);
            if(w.toLowerCase().endsWith("s")){
                words.remove(i);
            }
        }
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
        long sum = 0;
        int min = nums.getFirst();
        int max = nums.getFirst();

        for(int x : nums){
            sum = sum + x;

            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }

        double avg = sum / (double) nums.size();

        return new Stats (avg, min, max);
    }

    /**
     * TODO: Remove all even numbers from the list IN PLACE.
     * - Use a removal-safe traversal strategy (e.g., iterate from end to start).
     */
    public static void removeEvens(ArrayList<Integer> nums) {
        // TODO
        for(int i = nums.size() - 1; i >= 0; i--){
            if(nums.get(i) % 2 == 0){
                nums.remove(i);
            }
        }
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
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < a.size() && j < b.size() ){
            if(a.get(i).equals(b.get(j))){
                result.add(a.get(i));
                i++;
                j++;
            } else if (a.get(i) > b.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return result;
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
