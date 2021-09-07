package Practicals;

class practical3{
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }
       public static void main(String[] args)
       {
    	   String input = "Hello world ";
           practical3 gfg = new practical3();
           System.out.println( gfg.lengthOfLastWord(input));
    }
}
