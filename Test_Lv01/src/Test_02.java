import java.util.*;

class Solution2 {
    public int[] solution(String s) {
        
        String[] strArr = s.split("");
        Map<String, Integer> strMap = new HashMap<String, Integer>();
        
        int[] answer = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            
            if(strMap.get(strArr[i]) == null){
                answer[i] = -1;
            } else {
                answer[i] = i - strMap.get(strArr[i]);
            }
            strMap.put(strArr[i], i);
        }
        return answer;
        
    }
}

//class Solution {

//    public int[] solution(String s) {

//        int[] answer = new int[s.length()];
//        HashMap<Character,Integer> map = new HashMap<>();

//        for(int i = 0; i < s.length(); i++){

//            char ch = s.charAt(i);
//            answer[i] = i - map.getOrDefault(ch, i + 1);
//            map.put(ch, i);
//        }
//        return answer;
//    }
//}

public class Test_02 {

	public static void main(String[] args) {
		
		Solution2 result = new Solution2();
		
		System.out.println(Arrays.toString(result.solution("banana")));
		
	
	}

}
