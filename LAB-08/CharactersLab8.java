public class CharactersLab8 {

    public static void main(String[] args) {

        char FIRST = 'A', LAST = 'Z', first = 'a', last = 'z', LETTER_J = 'J', LETTER_S = 'S';
        char first1 = 'a', last1 = 'z', DECREMENTING_Z = 'Z', DECREMENTING_K = 'K';
        System.out.print("\n Alphabets in Capital Case: ");
        while (FIRST <= LAST) {
            System.out.print(FIRST + " ");
            FIRST++;
        }
        System.out.print("\n Alphabets in Smaller Case: ");
        while (first <= last) {
            System.out.print(first + " ");
            first++;
        }
        System.out.print("\n Alphabets in Upper Case from J to S: ");
        while (LETTER_J <= LETTER_S) {
            System.out.print(LETTER_J + " ");
            LETTER_J++;
        }
        System.out.print("\n Alphabets in Smaller Case and skipping Two Letters: ");
        while (first1 <= last1) {
            System.out.print(first1 + " ");
            first1 += 3;
        }
        System.out.print("\n Alphabets in Upper Case and in Descending order from Z to K: ");
        while (DECREMENTING_Z >= DECREMENTING_K) {
            System.out.print(DECREMENTING_Z + " ");
            DECREMENTING_Z--;
        }
        System.out.println("\n");

    }

}
