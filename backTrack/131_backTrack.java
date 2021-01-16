class Solution {
    public List<List<String>> partition(String s) {
     
        List<List<String>> list = new ArrayList<List<String>>();

        if (s.length()==0){
            return list;
        }
        Deque<String> path = new ArrayDeque<>();

        backtrack(s.length(), s, path, list, 0);
        return list;
    }
    public void backtrack(int len, String s, Deque<String> path, List<List<String>> list, int start){
        if (start == len){
            list.add(new ArrayList<>(path));
        }
        for (int i = start; i < len ; i++){
            if (!check(s, start, i)) continue;
            path.addLast(s.substring(start, i+1));
         
            backtrack(len, s, path, list, i+1);
            path.removeLast();
        }
    }
    public boolean check(String s, int start, int end){
        while (start<end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}



