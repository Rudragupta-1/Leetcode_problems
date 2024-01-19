class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st=new Stack<>();
        int sum;
        for(int i=0;i<operations.length;i++)
        {
            int x=-1;
            int y=-1;
            sum=0;
            if(!operations[i].equals("+") &&!operations[i].equals("C") &&!operations[i].equals("D")){
                st.push(operations[i]);
            }
            if(operations[i].equals("C"))
            {
                st.pop();
            }
            if(operations[i].equals("D"))
            {
                st.push(Integer.toString(2*Integer.parseInt(st.peek())));
            }
            if(operations[i].equals("+")) {
                x=Integer.parseInt(st.pop());
                y=Integer.parseInt(st.pop());
                sum=x+y;a
                st.push(Integer.toString(y));
                st.push(Integer.toString(x));
                st.push(Integer.toString(sum));
            }
        }
        sum=0;
        while(!st.isEmpty())
        {
            sum+=Integer.parseInt(st.pop());
        }
        return sum;
    }
}
