class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        char[] st = s.toCharArray();
        Stack<Integer> stt = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            if (st[i] == '(') {
                stt.push(i);
            } else if (st[i] == ')') {
                if (!stt.isEmpty()) {
                    stt.pop();
                } else {
                    st[i] = ' ';
                }
            }
        }
        
        while (!stt.isEmpty()) {
            int index = stt.pop();
            st[index] = ' ';
        }
        
        StringBuilder res = new StringBuilder();
        for (char ch : st) {
            if (ch != ' ') {
                res.append(ch);
            }
        }
        
        return res.toString();
    }
}
