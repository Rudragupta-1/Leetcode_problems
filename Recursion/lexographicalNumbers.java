import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=9;i++)
        func(list, n, i);
        return list;
    }

    public static void func(List<Integer> list, int n, int curr) {
        if (curr > n) return;
        
        list.add(curr);
        
        for (int i = 0; i <= 9; i++) {
            if (curr * 10 + i > n) {return;}
                func(list, n, curr * 10 + i);
            // }
        }
    }
}
