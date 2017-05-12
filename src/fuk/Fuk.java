/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuk;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Fuk {

    /**
     * @param args the command line arguments
     */
    public static String prepCheck(String temp){
        StringBuilder temporary = new StringBuilder();
        temporary.append(temp);
        temporary.insert(5, "3");
        temporary.insert(2, "3");
        temporary.insert(1, "3");
        temporary.insert(1, "3");
        
        return temporary.toString();
    }
    
    public static void main(String[] args) {
        String tempp = "10101010";
        
        char[] test = prepCheck(tempp).toCharArray();
        
        
        int[] bits = {0,0,0,0};
        int[][] storage = {
            {3, 1/**/, 3, 0/**/, 1, 0/**/, 3, 1/**/, 0, 1/**/},  //[0][0]
            {1/**/, 3, 0, 1/**/, 0/**/, 3, 1, 0/**/, 1/**/},     //[1][0]
            {0/**/, 1/**/, 0/**/, 3, 1, 0, 1},                   //[2][0]
            {1/**/, 0/**/, 1/**/}                                //[3][0]
        };
        boolean[][] check = {
            {false, true, false, true, false, true, false, true, false, true},
            {true, false, false, true, true, false, false, true, true},
            {true, true, true, false, false, false, false},
            {true, true, true}
        };
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < storage[i].length; j++) {
                if(storage[i][j]!=3 && check[i][j] == true){
                    //System.out.println("add:"+storage[i][j]+" to " + i + "     " + j);
                    bits[i]+=storage[i][j];
                    
                }
            }
        }
        for (int i = 0; i < bits.length; i++) {
            //System.out.println(bits[i]);
            if(bits[i]%2==0){
                bits[i]=0;
            }else{
                bits[i]=1;
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(bits[i]);
        }
     
        
        
        
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
        
//            int num = 1;
//        for (int i = 0; i < temp.length(); i++) {
//            if(i%num==0){
//                for (int j = i; j < i+num; j++) {
//                    System.out.println(test[j]);
//                }
//                i+=(num);
//                num*=2;
//            }
//            if(i==12){
//                break;
//            }
//            System.out.println(test[i]);
//        }


//        for (int i = 0; i < test.length; i++) {
//            System.out.print(test[i]);
//        }
//
                                                 //331301031010
//        for (int o = 0; o < test.length; o++) {//131301031010
//                                                 //130301030010
//            
//        
//        int num = 1;
//        for (int i = 0; i < test.length; i++) {
//            
//            int temp = 0;
//            if (i % num == 0) {
//                for (int j = i; j < i + num; j++) {
//                    temp += (int) test[j];
//                }
//                if (temp % 2 == 0) {
//                    test[i] = '0';
//                } else {
//                    test[i] = '1';
//                }
//                i += (num);
//                num *= 2;
//            }
//            if (i == 12) {
//                break;
//            }
//        }
//
//        }
//        for (int i = 0; i < test.length; i++) {
//            System.out.print(test[i]);
//        }
//        System.out.println("");
//        for(int i = 0; i < test.length; i++){
//            System.out.print(test[i]);
//        }
//        System.out.println("");
//        System.out.println(test.toString());
//

//    // test = {0, 3, 3, 1, 3, 0, 1, 0, 3, 1, 0, 1}
//    int num = 1;
//    int counter = 0;
//    boolean skip = false;
//        for (int i = 1; i < test.length; i++) {
//            System.out.println("");
//            System.out.print(i+":  ");
//            if(test[i] == '3'){
//                for (int j = i; j < test.length; j+=0) {
//                    System.out.print(j+":"+test[j]);
//                    if(counter < num){
//                        counter++;
//                        j++;
//                        System.out.print("D");
//                    }else if(counter == num){
//                        counter=0;
//                        j+=num;
//                        System.out.print("S");
//                    }
//                    System.out.print("|");
//                    
//
//                }
//                num*=2;
//            }
//            
//            
//        }




    }

}
//System.out.print(test[j]);
//                    if(skip){
//                        j+=num;
//                        skip = false;
//                        counter = 0;
//                    }else if(skip = false && counter<num){
//                        j++;
//                        counter++;
//                        
//                    }else{
//                        skip = true;
//                    }