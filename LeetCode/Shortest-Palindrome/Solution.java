prefixTable[0] = 0;
for (int i = 1; i < n; i++) {
    int length = prefixTable[i - 1];
    while (length > 0 && s.charAt(i) != s.charAt(length)) {
        length = prefixTable[length - 1];
    }
    if (s.charAt(i) == s.charAt(length)) {
        length++;
    }
    prefixTable[i] = length;
}