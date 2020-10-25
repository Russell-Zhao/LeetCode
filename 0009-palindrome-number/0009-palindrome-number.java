class Solution {
    public boolean isPalindrome(int x) {
        Stack<Integer> a = new Stack<Integer>();
        ArrayDeque<Integer> b = new ArrayDeque<Integer>();
        int result = x;
        int counter = 0;
        if(x < 0){
            return false;
        }
        if(x == 0){
            return true;
        }
        while(x !=0){
            result = x % 10;
            a.add(result);
            b.add(result);
            x = x / 10;
            counter ++;
        }
        int size  = a.size();
        for(int i = 0; i < size; i++){
            if(a.pop() != b.poll()){
                return false;
            }
            i++;
        }
        return true;
    }
}
