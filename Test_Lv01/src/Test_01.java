
class Solution {
	    public int solution(String t, String p) {
	    	
	        int answer = 0;
	        
	        long Plength = Long.parseLong(p);
	        int length = t.length() - p.length() + 1;
	        
	        for(int i = 0; i < length; i++){
	            long num = Long.parseLong(t.substring(i, i + p.length()));
	            if(num <= Plength){
	                answer++;
	            }
	        }
	        return answer;
	    }
	}

public class Test_01 {
	
	public static void main(String[] args) {
		Solution result = new Solution();
		
		System.out.println(result.solution("3141592", "271"));
	}
	
}
