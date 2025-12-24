import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args){
        CountCommonWordsWithOneOccurrence obj = new CountCommonWordsWithOneOccurrence();

        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};

        int result = obj.countWords(words1, words2);

        System.out.println("Count of common words with one occurrence: " + result);
    }
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map=new HashMap<String,Integer>();  
        for(String word:words1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word:words2){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int count=0;
        for(int freq:map.values()){
            if(freq==2){
                count++;
            }
        }
        return count;               
    }
}
