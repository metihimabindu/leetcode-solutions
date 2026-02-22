public int binaryGap(int N) {
    int temp=0,cnt=-1,large=0;
    while(N!=0)
    {
        temp=N%2;
        if(cnt>=0) cnt++;
        if(temp==1)
        { 
            if(cnt>0)
            {
               large=cnt>large?cnt:large; 
            }
            cnt=0;
        }
       
        N/=2;
    }
    return large;
}