package Practicals;

import java.util.HashMap;

public class practical4 {
	
	    public boolean isAnagram(String s, String t) {
			if(s.length()!=t.length())
				return false;
			char ch;
			HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
			for(int i=0;i<s.length();i++) {
				ch = s.charAt(i);
				if(hm.containsKey(ch)) hm.put(ch, hm.get(ch)+1);
				else hm.put(ch, 1);
			}
			for(int i=0;i<t.length();i++) {
				ch = t.charAt(i);
				if(hm.containsKey(ch) == false || hm.get(ch) == 0) return false;
				else hm.put(ch, hm.get(ch)-1);
			}
	        return true;
	    }
	    public static void main(String[] args)
	       {
	    	   String input1 = "Hello world ";
	           practical4 gfg1= new practical4();
	           System.out.println( gfg1.isAnagram(input1.));
	    }
	}

	