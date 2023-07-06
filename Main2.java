import java.util.Scanner;

class Main2 {

    // Function to move string character
    static void encode(String s, int k) {
        // changed string
        StringBuilder newS = new StringBuilder();

        // iterate for every character
        for (int i = 0; i < s.length(); ++i) {
            // ASCII value
            int val = s.charAt(i);

            // calculate the new character value
            int encodedVal = val + k;

            // handle wrap-around for characters after 'z'
            if (encodedVal > 122) {
                encodedVal = 97 + (encodedVal - 123);
            }

            // append the encoded character to the new string
            newS.append((char) encodedVal);
        }

        // print the new string
        System.out.println("The encoded message is " + newS);
    }

    static void decode(String s, int k) {
        // changed string
        StringBuilder newS = new StringBuilder();

        // iterate for every character
        for (int i = 0; i < s.length(); ++i) {
            // ASCII value
            int val = s.charAt(i);

            // calculate the new character value
            int decodedVal = val - k;

            // handle wrap-around for characters before 'a'
            if (decodedVal < 97) {
                decodedVal = 123 - (97 - decodedVal);
            }

            // append the decoded character to the new string
            newS.append((char) decodedVal);
        }

        // print the new string
        System.out.println("The decoded message is " + newS);
    }

    public static void main(String[] args) {
        String str;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type encode to encrypt and decode to decrypt: ");
        String s = sc.next();

        System.out.print("\nType the message: ");
        str = sc.next();

        System.out.print("\nEnter the number of shifts: ");
        k = sc.nextInt();

        // function call
        if (s.equals("decode"))
            decode(str, k);
        else if (s.equals("encode"))
            encode(str, k);
    }
}


