
class minBitFlips {

    public int solution(int start, int goal) {
        int ans = start ^ goal;
        int c = 0;
        while(ans>0){
            ans = ans & (ans-1);
            c++;
        }
        return c;
    }
}
