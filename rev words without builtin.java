import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner o=new Scanner(System.in);
        String s=o.nextLine();
        String words=""; 
        System.out.println(rev(s,s.length()-1,words));
    }
    public static String rev(String s,int k,String words){
        
        if(k<0) return "";
        
        String word="";
        
        for(int j=k;j>=0;j--){
            if(s.charAt(j)==' '){
                words=words+word+" ";
                return rev(s,j-1,words);
            }
            word=s.charAt(j)+word;
        }
        words+=word;
        
        return words;
    }
}
