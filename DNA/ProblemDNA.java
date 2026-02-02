public class CountingDNA {
    public static void main(String[] args) {

        // Put your DNA string here (paste it from Rosalind)
        String dna = "";

        int A = 0;
        int C = 0;
        int G = 0;
        int T = 0;

        // Go through each letter in the string
        for (int i = 0; i < dna.length(); i++) {
            char letter = dna.charAt(i);

            if (letter == 'A') {
                A++;
            }
            if (letter == 'C') {
                C++;
            }
            if (letter == 'G') {
                G++;
            }
            if (letter == 'T') {
                T++;
            }
        }

        // Print results in the order Rosalind wants
        System.out.println(A + " " + C + " " + G + " " + T);
    }
}
