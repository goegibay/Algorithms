class Solution {
   public  List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      if (candidates == null) return res;

      for (int i=0; i<candidates.length; i++) {
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(candidates[i]);
        dfs(i, candidates, target, tmp, res);
      }
      return res;
  }

  private  void dfs(int index, int[] candidates, int target, List<Integer>  tmpList, List<List<Integer>>  res) {
    //tmpList.add(candidates[i]);
    int sum = sumOfArray(tmpList);
    //System.out.println("sum = "+ sum + " target = "+target);
    if (sum == target) {
      //System.out.println("Add: "+tmpList);
      //res.add(tmpList);
      res.add(new ArrayList<Integer>(tmpList));
      //System.out.println("res: "+res);
    } else if(sum < target) {
      for (int i=index; i< candidates.length; i++) {
        tmpList.add(candidates[i]);
        //System.out.println(tmpList);
        dfs(i, candidates, target, tmpList, res);
        tmpList.remove(tmpList.size()-1 );
      }
    } else { //sum > target
      //System.out.println("return");
      return;
    }
  }

  private  int sumOfArray(List<Integer> array) {
    int sum = 0;
    for(int i=0; i<array.size(); i++) {
      sum += (int) array.get(i);
    }
    return sum;
  }
}
