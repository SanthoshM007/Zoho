// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s1=o.next();
        String s2=o.next();
        
        int fw=0,fd=0,sw=0,sd=0;
        int k=10;
        int i;
        
        for(i=0;i<s1.length();i++){
            if(s1.charAt(i)=='.') break;
            fw=(fw*k)+(s1.charAt(i)-'0');
        }
        
        for(i=i+1;i<s1.length();i++){
            fd=(fd*k)+(s1.charAt(i)-'0');
        }
        
        for(i=0;i<s2.length();i++){
            if(s1.charAt(i)=='.') break;
            sw=(sw*k)+(s2.charAt(i)-'0');
        }
        
        for(i=i+1;i<s2.length();i++){
            sd=(sd*k)+(s2.charAt(i)-'0');
        }
        
        if(fw<sw){
           System.out.print("-1"); 
        }
        else if(fw>sw){
           System.out.print("1"); 
        }
        else{
            if(fd<sd){
                System.out.print("-1");
            }
            else if(fd>sd){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
}
}
