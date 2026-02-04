public class ReverseComplement {
    public static void main(String[] args) {

        // Paste your DNA string from Rosalind here
        String dna = "";

        String result = "";

        // Go through the DNA string BACKWARDS
        for (int i = dna.length() - 1; i >= 0; i--) {
            char letter = dna.charAt(i);

            // Add the complement
            if (letter == 'A') {
                result = result + 'T';
            }
            else if (letter == 'T') {
                result = result + 'A';
            }
            else if (letter == 'C') {
                result = result + 'G';
            }
            else if (letter == 'G') {
                result = result + 'C';
            }
        }

        // Print the reverse complement
        System.out.println(result);
    }
}
