class ProductOfNumbers {

    
  List<Integer> list=new ArrayList<>();


public void add(int num) {
  if(num==0) list.clear();
  else if(list.isEmpty()){
      list.add(num);
  }
  else list.add(list.get(list.size()-1)*num);
}

public int getProduct(int k) {
  if(list.size()<k) return 0;
  else if(list.size()==k) return list.get(list.size()-1);
  var right=list.get(list.size()-1);
  var left=list.get(list.size()-1-k);
  return right/left;
}
}

/**
* Your ProductOfNumbers object will be instantiated and called as such:
* ProductOfNumbers obj = new ProductOfNumbers();
* obj.add(num);
* int param_2 = obj.getProduct(k);
*/