class Solution {
    // public int minimumLength(String s) {
    //     Deque<Character> dq = new ArrayDeque<>();
    //     int startPointer = 0;
    //     int endPointer = s.length() - 1;
    //     for (char c : s.toCharArray()) {
    //         dq.addLast(c);
    //     }
    //     while (dq.size() > 1 && startPointer < endPointer) {
    //         if (dq.isEmpty()) break;
    //         char prefixFirst = dq.peekFirst();
    //         char suffixFirst = dq.peekLast();
    //         if (prefixFirst != suffixFirst) break;
    //         while (!dq.isEmpty() && dq.peekFirst() == prefixFirst) {
    //             // prefix.append(dq.removeFirst());
    //             dq.removeFirst();
    //             startPointer++;
    //         }
    //         while (!dq.isEmpty() && dq.peekLast() == suffixFirst) {
    //             // suffix.append(dq.removeLast());
    //             dq.removeLast();
    //             endPointer--;
    //         }
    //     }
    //     return dq.size();
    // }
    public int minimumLength(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right && str.charAt(left)==str.charAt(right)){
            char ch=str.charAt(left);
            while(left<=right && str.charAt(left)==ch){
                left++;
            }
            while(left<=right && str.charAt(right)==ch){
                right--;
            }
        }
        return right-left+1;
    }
}
