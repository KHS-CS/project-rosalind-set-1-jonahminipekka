public class DNAToRNA {
    public static void main(String[] args) {

        // Paste your DNA string from Rosalind here
        String dna = "";

        String rna = "";

        // Look at each letter in the DNA string
        for (int i = 0; i < dna.length(); i++) {
            char letter = dna.charAt(i);

            // If it's T, change it to U
            if (letter == 'T') {
                rna = rna + 'U';
            } 
            // Otherwise, keep the letter the same
            else {
                rna = rna + letter;
            }
        }

        // Print the RNA string
        System.out.println(rna);
    }
}
