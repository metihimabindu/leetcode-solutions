public boolean checkIfPangram(String sentence) {
    int size = sentence.length();
    int hash = 0; // Bitmask to track presence of letters (26 bits needed)

    // Iterate over each character in the sentence
    for (int i = 0; i < size; i++) {
        int ch = sentence.charAt(i); // Current character
        int one = 1;                 // Start with binary 000...001

        int shift = ch - 'a';        // Determine position (0 for 'a', 25 for 'z')
        one <<= shift;               // Shift the bit to the correct position

        hash = hash | one;           // Set the bit in the hash (mark letter as present)
    }

    // Check if all 26 bits are set
    for (int i = 1; i <= 26; i++) {
        int curr = hash & 1;         // Check the least significant bit
        if (curr == 0) return false; // If any bit is 0 → letter missing
        hash >>= 1;                  // Right shift to check next bit
    }

    return true; // All letters are present → pangram
}