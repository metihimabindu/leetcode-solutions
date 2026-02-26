public int NumSteps(string s) {
    int zeroCount = 1, oneCount = 0, n = s.Length;

    for(int i = n - 1; i >= 0; i--)
    {
        if(s[i] == '1') oneCount++;
        if(oneCount > 0 && s[i] == '0') zeroCount++;
    }

    return oneCount == 1 ? n - 1 : zeroCount + n;
}