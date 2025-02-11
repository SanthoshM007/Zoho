// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,10,11},{4,5,6,12,13},{7,8,9,14,15}};
        
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(int j=0;j<5;j++){
            if(j%2==0){
                for(int i=0;i<3;i++){
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(int i=2;i>=0;i--){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
        
        
    }
}
