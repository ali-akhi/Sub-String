/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substring;

/**
 *
 * @author ali
 */
public class SubStr {
    static void print_Common_SubStr(String X, String Y, int m, int n) 
    {
        int[][] suffix = new int[m + 1][n + 1]; 
        int L = 0; 
        int row = 0, col = 0; 
        for (int i = 0; i <= m; i++) { 
            for (int j = 0; j <= n; j++) { 
                if (i == 0 || j == 0) 
                    suffix[i][j] = 0; 
                else if (X.charAt(i - 1) == Y.charAt(j - 1)) { 
                    suffix[i][j] = suffix[i - 1][j - 1] + 1; 
                    if (L < suffix[i][j]) { 
                        L = suffix[i][j]; 
                        row = i; 
                        col = j; 
                    } 
                } 
                else
                    suffix[i][j] = 0; 
            } 
        } 
        if (L == 0) { 
            System.out.println("do not have Common Substring"); 
            return; 
        } 
        String temp = ""; 
        while (suffix[row][col] != 0) { 
            temp = X.charAt(row - 1) + temp;
            --L; 
            row--; 
            col--; 
        } 
        System.out.println(temp); 
    } 
    
     static int length_SubStr(char X[], char Y[], int m, int n)  
    { 
        int temp = 0;
        int suffix[][] = new int[m + 1][n + 1]; 
        for (int i = 0; i <= m; i++){ 
            for (int j = 0; j <= n; j++){ 
                if (i == 0 || j == 0) 
                    suffix[i][j] = 0; 
                else if (X[i - 1] == Y[j - 1]){ 
                    suffix[i][j] = suffix[i - 1][j - 1] + 1; 
                    temp = Integer.max(temp, suffix[i][j]); 
                }  
                else
                    suffix[i][j] = 0; 
            } 
        } 
        return temp; 
    } 
}
