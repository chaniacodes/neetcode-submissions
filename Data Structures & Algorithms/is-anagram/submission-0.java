class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    HashMap <Character, Integer> countS = new HashMap<>();
    HashMap <Character, Integer> countT = new HashMap<>();
    for(int i=0;i<s.length();i++){
       char chS = s.charAt(i);
       int freqS = countS.getOrDefault(chS,0);
       countS.put(chS,freqS+1);
       char chT=t.charAt(i);
       int freqT=countT.getOrDefault(chT,0);
       countT.put(chT,freqT+1);
    }
    return countS.equals(countT);
    }
}
