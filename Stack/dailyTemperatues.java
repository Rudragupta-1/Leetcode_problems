import java.util.Stack;


class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair<Integer, Integer>> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int span = 0;

            while (!st.isEmpty() && st.peek().getKey() <= arr[i]) {
                span += st.pop().getValue();
            }

            if (!st.isEmpty() && st.peek().getKey() > arr[i]) {
                span+=1;
                st.push(new Pair<>(arr[i], span));
            } else {
                span=0;
                st.push(new Pair<>(arr[i], 0));
            }

            res[i] = span;
        }

        return res;
    }
}
