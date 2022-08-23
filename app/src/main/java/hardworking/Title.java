package hardworking;

import java.util.Random;

public class Title {
    public String getGreeting() {
        return "Hello World!";
    }
    public String title(String s){
        String first=s.substring(0,1).toUpperCase();
        return first+s.substring(1);
    }
    public String upper(String s){
        String big=s.toUpperCase();
        return big;
    }
    public String lower(String s){
        String small=s.toLowerCase();
        return small;
    }
    public String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
    public String spongebob(String s){
        Random random = new Random();
        int e= random.nextInt(s.length()+1);
//        System.out.println(e);
        for(int i=0;i<e;i++){
            int index = random.nextInt(s.length());
            char aaa=s.charAt(index);
            if(aaa>=65 && aaa<=90){
                System.out.println(String.valueOf(aaa).toLowerCase());
            } else if(aaa>=97 && aaa<=122){
                System.out.println(String.valueOf(aaa).toUpperCase());
            }
//            System.out.println(index);
//            System.out.println(s.charAt(index));
        }
        return "";
    }
}
