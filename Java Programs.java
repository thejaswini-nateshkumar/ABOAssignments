/*Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"}
String toSearch = "ODG";*/

class Solution {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS","THEJASWINI","THEJASWININATESHKUMAR"};
    String toSearch = "INI";
    String longest="";
    List<String> l=new ArrayList<>();
    for(int i=0;i<dict.length;i++){
      if(dict[i].contains(toSearch)){
        l.add(dict[i]);
      }
    }
    for(String s:l){
      if(s.length()>longest.length()){
        longest=s;
      }
    }
    System.out.println(longest);
    }
  }

//------------------------------------------------------------------------//

/*Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
return the final coordinates after traversing the string.
Given (0,0) and String - "URRDDL"
    Answer : (1,-1)
Additional testcase : String - "DOWN UP 2xRIGHT DOWN 3xLEFT"
    Answer : (-1,-1)*/ 

class Solution{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Input : ");//DOWN UP 2xRIGHT DOWN 3xLEFT
    String str=sc.nextLine();
    String[] nstr={};
    StringBuilder inp=new StringBuilder();
    if(str.contains(" ")){
      nstr=str.split(" ");
      for(String s:nstr){
        if(s.equals("RIGHT")){
          inp.append('R');
        }else if(s.equals("LEFT")){
          inp.append('L');
        }else if(s.equals("UP")){
          inp.append('U');
        }else if(s.equals("DOWN")){
          inp.append('D');
        }else if(s.contains("x")){
          int times=Integer.parseInt(s.substring(0,s.indexOf("x")));
          for(int i=0;i<times;i++){
            inp.append(s.charAt(s.indexOf("x")+1));
          }        
        }
      }
      str=inp.toString();
    }
    System.out.println(Arrays.toString(nstr));
    int[] d={0,0};
    int[] res=finalarr(d,str);
    System.out.println("["+res[0]+","+res[1]+"]");
  }

  public static int[] finalarr(int[] d,String str){
    int x=d[0];
    int y=d[1];
    for(Character ch:str.toCharArray()){
      switch(ch){
        case 'U': y++;
                break;
        case 'R': x++;
                break;
        case 'L': x--;
                break;
        case 'D': y--;
                break;
        default : System.out.println("Invalid Input");
                  System.exit(0);;
      }
    }
    return new int[]{x,y};
  }
}

///-----------------------------------------------------------------------------------------//
/*Find the median of two sorted arrays of different sizes.
arr1[] = {2, 3, 5, 8}
arr2[] = {10, 12, 14, 16, 18, 20}
 arr3[] = {2, 3, 5, 8, 10, 12, 14, 16, 18, 20}
        if the number of the elements are even, 
        so there are two middle elements,
        take the average between the two :
        (10 + 12) / 2 = 11. */

class Solution{
  public static void main(String[] args){
      int arr1[] = {2, 3, 5, 8};
      int arr2[] = {24, 27, 29, 32, 56};
      int arr3[] = new int[arr1.length+arr2.length];

      System.arraycopy(arr1, 0, arr3, 0, arr1.length);
      System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
      Arrays.sort(arr3);
      System.out.println(Arrays.toString(arr3));

      int len=arr3.length;
      int mid,res;
      if(len%2==0){
        mid=len/2;
        System.out.println("Median is : "+arr3[mid]);
      }else{
        mid=len/2;
        int mid1=mid+1;
        System.out.println("Median is : "+arr3[(mid+mid1)/2]);;
      }
  }
}

//------------------------------------------------------------------------------//

/*Prefix Search Given a document and a prefix, return all the words starting with the prefix.
    String[] arr = {"apple", "applet", "bread", "aper"};
    String prefix = "app";
    //Return apple, applet*/
	
class Solution{
  public static void main(String[] args){
      String[] arr = {"apple", "applet", "bread", "aper"};
      String prefix = "app";
      }
      System.out.println(list);
  }
}

//-----------------------------------------------------------------------------------//

/*Given a string,
    return the first non-repeating character.*/

import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input : ");;
    String str=sc.nextLine();
    char[] ch=str.toCharArray();
    Arrays.sort(ch);
    char res='x';
    for(int i=0;i<ch.length;i++){
      char temp=ch[i];
      for(int j=i;j<ch.length;j++){
        if(ch[j]==temp){
          i++;
        }
        else{
          res=ch[i];
          break;
        }
      }
    }
    System.out.println(res);

  }
}

class Solution {
  public static char fnc(String str){
    char res='x';
    Map<Character,Integer> m=new HashMap<>();
    for(char ch:str.toCharArray()){
      m.put(ch, m.getOrDefault(ch,0)+1);
    }
    for(char ch:str.toCharArray()){
      if(m.get(ch)==1){
        res=ch;
        break;
      }
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input : ");
    String str=sc.nextLine();
    char res=fnc(str);
    System.out.println(res);
  }
}

//-------------------------------------------------------------------------------------------------------------//

/*Given a sentence/phrase and two words, return the minimum distance between the words.*/
	
import java.io.*;
import java.util.*;

class Solution {
  public static int mindis(String str, String w1,String w2){
    String[] w=str.split(" ");
    int res=-1;
    int a=-1,b=-1;
    for(int i=0;i<w.length;i++){
      if(w[i].equals(w1)){
        a=i;
      }
      else if(w[i].equals(w2)){
        b=i;
      }
      if(a!=-1 && b!=-1){
        res=Math.abs(a-b)-1;
      }
      }
    return res;
  }
  public static void main(String[] args){
    String str = "the quick the brown quick brown the frog time quick fast";
    String w1 = "quick";
    String w2 = "frog";
    System.out.println(mindis(str,w1,w2));
  }
}

//------------------------------------------------------------------------------------------------------------//

/*    Given a string, you have to convert into integer. The input string may contain alphabets and special characters alongside numbers (both negative and positive)
Examples: String str1 = "123";     //Return 123 (in integer format)
    String str2 = "-123";    //Return -123\
    String str3 = "1a23";   //Return -1 (Invalid entry).*/
	
import java.io.*;
import java.util.*;

class Solution {
  public static int stoi(String str){
    int value=-1;
    boolean res=true;
    for(int i=1;i<str.length();i++){
    if(!Character.isDigit(str.charAt(i))) {
        res=false;
        break;
      }
    }
    if(res==true){
      value=Integer.parseInt(str);
    }
    return value;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input : ");
    String str=sc.nextLine();
    System.out.println(stoi(str));
  }
}

public static String stoi(String s1){
    int start=0;
    int val=0;
    int sign=1;
    if(s1.charAt(0)=='-'){
      start=1; sign=-1;
    }else if(s1.charAt(0)=='+'){
      start=1;
    }
    for(int i=start;i<s1.length();i++){
      if(s1.charAt(i)<'0' && s1.charAt(i)>){
        System.out.println("Invalid Character");
        System.exit(0);
      }
      val=val*10+(s1.charAt(i)-'0');
    }
    val=val*sign;
    return String.valueOf(val);
  }

//--------------------------------------------------------------------------------------------------------------------------//
/*Given a sorted rotated array, return the minimum element from it.
Examples : int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1  */

class Solution {
  public static int sm(int[] arr){
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    return arr[0];
  } 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input : ");
    int[] arr={56,7,845,54,2,3,9,1};
    System.out.println(sm(arr));
  }
}

import java.io.*;
import java.util.*;

class Solution {
  public static int minele(int[] arr){
    int l=0,h=arr.length-1;
    while(l<h){
      int m=l+(h-l)/2;
      if(arr[m]>arr[h]){
        l=m+1;
      }else{
        h=m;
      }
    }
    return arr[l];
  }
  public static void main(String[] args) {
    int[] arr = {5, 6, 34, 1, 2,34, 3, 4};
    System.out.println("Minimum element in the array is : "+minele(arr));
  }
}

//----------------------------------------------------------------------------------------------------------------------------------//

/*We are given a chess board and a piece with a fixed position (immoveable). We also have a bishop on the board which, well of course, can only move diagonally.
    - Return "YES" if we can reach the immoveable piece using the bishop, else return "NO".
    - If "YES", return the number of minimum steps it takes for the bishop to reach the immoveable piece.*/
	
class Solution {
  public static String canBishopReach(int bishopX,int bishopY,int pieceX,int pieceY){
    if((bishopX+bishopY)%2!=(pieceX+pieceY)%2){
      return "No";
    }
    if (Math.abs(bishopX - pieceX) == Math.abs(bishopY - pieceY)) {
            return "YES, 1";
        } else {
            // The bishop can reach the piece in two moves
            return "YES, 2";
        }
  }
  public static void main(String[] args) {
    System.out.println(canBishopReach(0, 2, 3, 5));
  }
}

//----------------------------------------------------------------------------------------------------------------------------------------//
/*Remove Duplicate Characters in a senetence*/

class Solution {
  public static String rmdupcins(String s1){
    s1=s1.toLowerCase();
    Set<Character> hs=new HashSet<>();
    StringBuilder s=new StringBuilder();
    for(char ch:s1.toCharArray()){
      if(!hs.contains(ch)){
        hs.add(ch);
        s.append(ch);
      }
    }
    return s.toString();
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1="Input : is Duplicate characters in the string";
    System.out.println(rmdupcins(s1));
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------//
/*Print the duplicate elements in the senetence in sorted order*/

class Solution {
  public static String dupele(String s1){
    StringBuilder res=new StringBuilder();
   Map<Character,Integer> chcnt=new HashMap<>();
   for(char ch:s1.toCharArray()){
    chcnt.put(ch, chcnt.getOrDefault(ch, 0)+1);
   }
   for(char ch:chcnt.keySet()){
    if(chcnt.get(ch)>1){
      res.append(ch);
    }
   }
   char[] arrch=String.valueOf(res).toCharArray();
   Arrays.sort(arrch);
   return String.valueOf(arrch);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1="ThejaswiniNTN";
    System.out.println(dupele(s1));
  }
}

//-----------------------------------------------------------------------------------------------------------------------------------------//
/*print all the subarrays which sum is equals to k*/ 

public class Solution {
    public static List<int[]> findAllSubarraysWithSumK(int[] arr,int K){
      List<int[]> res=new LinkedList<>();
      int cursum=0;
      for(int i=0;i<arr.length;i++){
        cursum=0;
        for(int j=i;j<arr.length;j++){
          cursum+=arr[j];
          if(cursum==12){
            int[] subar=new int[j-i+1];
            System.arraycopy(arr, i, subar, 0, j-i+1);
            res.add(subar);
          }
        }
      }
      return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 1, 10, 2, 1};
        int K = 12;
        List<int[]> result=findAllSubarraysWithSumK(arr,K);
        for(int[] list:result){
          System.out.print("Subarray : ");{
            for(int num:list){
              System.out.print(num+" ");
            }
          }
          System.out.println();
        }
    }
}

//------------------------------------------------------------------------------------------------------//
/*Check whether a number is a power of 10.*/
public class Solution {
    public static boolean isPowerOfTen(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 10 == 0) {
            num /= 10;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        int number = 1024;
        if (isPowerOfTen(number)) {
            System.out.println(number + " is a power of 10.");
        } else {
            System.out.println(number + " is not a power of 10.");
        }
    }
}

//-------------------------------------------------------------------------------------------------------------------//
/* Reading the value of double String array and storing it using a hashmap*/
import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    String[][] marks = {
      {"Charles", "84"},
      {"John", "100"},
      {"Andy", "37"},
      {"John", "23"},
      {"Charles", "20"}
    };
    System.out.println("Scores in array is");
    for(String[] s:marks){
      System.out.print(s[0]);
      System.out.println(" : "+s[1]);
    }
    Map<String, int[]> sb=new HashMap<>();
    for(String[] s:marks){
      String name=s[0];
      int score=Integer.parseInt(s[1]);
      sb.putIfAbsent(name, new int[2]);
      sb.get(name)[0]+=score;
      sb.get(name)[1]+=1;
    }
    System.out.println();
    System.out.println("Score Board in map");
    for(Map.Entry<String,int[]> map:sb.entrySet()){
      System.err.println();
      System.out.print(map.getKey()+" : ");
      for(int num:map.getValue()){
        System.out.print(num+" ");
      }
    }
  }
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
/*Given a list of student names and corresponding marks,
    return the highest average marks (and print the corresponding student name - optional).
    The marks can be negative as well and a student may have multiple marks.*/
	
import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) {
    String[][] marks = {
      {"Charles", "84"},
      {"John", "100"},
      {"Andy", "37"},
      {"John", "23"},
      {"Charles", "20"}
    };

    Map<String,int[]> sb=new HashMap<>();
    System.out.println("List of Students with there marks are as below");
    for(String[] s:marks){
      System.out.print(s[0]+" : ");
      System.out.println(s[1]);
    }
    for(String[] s:marks){
      String name=s[0];
      int score=Integer.parseInt(s[1]);
      sb.putIfAbsent(name, new int[2]);
      sb.get(name)[0]+=score;
      sb.get(name)[1]+=1;
    }
    System.out.println();
    System.out.println("List of students with total marks subject wise");
    for(Map.Entry<String, int[]> map:sb.entrySet()){
      System.out.print(map.getKey()+" : ");
      for(int num:map.getValue()){
        System.out.print(num);
      }
      System.out.println();
    }
    String topStu=null;
    double avg = Double.NEGATIVE_INFINITY;
    for(Map.Entry<String,int[]> map:sb.entrySet()){
      int[] scores=map.getValue();
      double temp=(double) scores[0]/scores[1];
      if(temp>avg){
        avg=temp;
        topStu=map.getKey();
      }
    }
    System.out.println();
    System.out.println("1st rank :"+topStu+" "+avg);
  }
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------//
/* Given an array of strings,
    return the IP address that occurs maximum number of times. 
    [You might have to check for the validity of the IP address before considering it]. */

import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    String[] str = {
      "10.0.0.1 bytes=32 time=50ms TTL=63",
      "10.0.0.2 bytes=32 time=50ms TTL=73",
      "10.0.0.4 bytes=32 time=50ms TTL=83",
      "10.0.0.2 bytes=32 time=50ms TTL=93",
      "100.2.4.5",
      "10.0.0.1",
      "10.0.0.1",
      "255.34.3.4",
      "234.86.345.34"
    };
    System.out.println("Highest : "+mostFrequentIP(str)); // Output: 10.0.0.2
  }
  public static String mostFrequentIP(String[] str) {
    String res="";
    Map<String, Integer> ipCount = new HashMap<>();
    for(String s:str){
      String[] parts=s.split(" ");
      for(String s1:parts){
        if(isValidIP(s1)){
          ipCount.put(s1, ipCount.getOrDefault(s1, 0)+1);
        }
      }
    }
    int c=0;
    for(Map.Entry<String,Integer> map:ipCount.entrySet() ){
      if(map.getValue()>c){
        res=map.getKey();
        c=map.getValue();
      }
    }
    return res;
  }
  public static boolean isValidIP(String ip) {
    String[] check=ip.split("\\.");
    if(check.length!=4){
      return false;
    }
    for(String s2:check){
      try{
        int num=Integer.parseInt(s2);
        if(num<0 || num>255){
          return false;
        }
      }
      catch(NumberFormatException e){
          return false;
      }
    }
    return true;
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------//
/*Given a dictionary (list of words) and a word,
    return an array of strings that can be formed from the given word.
    [Every letter in the input word can occur only once in the word to be returned].
Examples:
    String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
    String input = "abcd";
    // Return {"abcd", "bcad"}*/
	
class Solution {
  public static void main(String[] args) {
        String[] dict1 = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input1 = "abcd";
        
        System.out.println(findWordsFromInput(dict1, input1));  // Output: [abcd, bcad]

        String[] dict2 = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input2 = "caab";
        System.out.println(findWordsFromInput(dict2, input2));  // Output: [acab]
  }
  public static List<String> findWordsFromInput(String[] dict,String str){
    List<String> res=new ArrayList<>();
    char[] ch=str.toCharArray();
    Arrays.sort(ch);
    String nstr=new String(ch);
    for(String word:dict){
      char[] ch1=word.toCharArray();
      Arrays.sort(ch1);
      String nword=new String(ch1);
      if(nstr.equals(nword)){
        res.add(word);
      }
    }
    return res;
  }
}

//--------------------------------------------------------------------------------------------------------------------------------------------//
/*Given a sorted array of non-negative integers of size n,
    return the smallest missing integer.
Examples:
    int[] arr1 = {1, 2, 3, 4};    // Return 0*/
	
class Solution {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4};
    System.out.println(findSmallestMissing(arr1));  // Output: 0

    int[] arr2 = {0, 1, 3, 4};
    System.out.println(findSmallestMissing(arr2));  // Output: 2
  }
  public static int findSmallestMissing(int[] arr){
    int res=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=i){
        res=i;
        break;
      }
    }
    return res;
  }
}

//--------------------------------------------------------------------------------------------------------------------------------------------//
/*Given two integers representing the numerator and denominator of a fraction, 
    return the fraction in string format. 
    [If the fractional part is repeating, enclose the repeating part in parentheses].

Examples:
    Numerator = 1, Denominator = 2
    // Return "0.5"

    Numerator = 1, Denominator = -2
    // Return "-0.5"

    Numerator = 50, Denominator = 22
    // Return "2.(27)"  [Fractional part (27) is repeating, hence enclosed in paranthesis]*/
	
class Solution {
  public static void main(String[] args) {
    int num,den;
    Scanner sc=new Scanner(System.in);
    System.out.print("Numerator : ");
    num=sc.nextInt();
    System.out.print("Denominator : ");
    den=sc.nextInt();
    System.out.println(findfraction(num,den));
  }
  public static String findfraction(int num,int den){
    StringBuilder res=new StringBuilder();
    if(num<0 || den<0){
      res.append('-');
      num=Math.abs(num);
      den=Math.abs(den);
    }
    int intpart=num/den;
    res.append(intpart).append('.');
    int rem=num%den;
    Map<Integer,Integer> remMap=new HashMap<>();
    while(rem!=0){
      if(remMap.containsKey(rem)){
        int start=remMap.get(rem);
        res.insert(start, '(');
        res.append(')');
        break;
      }
      remMap.put(rem,res.length());
      rem=rem*10;
      int quo=rem/den;
      res.append(quo);
      rem%=den;
    }
    return res.toString();
  }
}

//Another approach
class Solution {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input : ");
    String input=sc.nextLine();
    System.out.println(strops(input));
  }
  public static String strops(String str){
    StringBuilder res=new StringBuilder();
    Map<Character,Integer> map=new HashMap<>();
    for(char ch:str.toCharArray()){
      map.put(ch, map.getOrDefault(ch, 0)+1);
    }
    for(char ch:str.toCharArray()){
      if(map.containsKey(ch)){
        res.append(ch).append(map.get(ch));
        map.remove(ch);
      }
    }
    return res.toString();
  }
}

//---------------------------------------------------------------------------------------------------------------------------------------------------//
/*Give two fractions, the numerator and denominator represented as a pair of ints,
    return them in their simplest form after adding them.

Examples:
    {Numerator_frac1 = 1, Denominator_frac1 = 3}                // 1/3
    {Numerator_frac2 = 3, Denominator_frac2 = 9}                // 3/9
    // Return Numerator_ans = 2, Denominator_ans = 3       // 2/3*/
	
class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Num1 : ");
    int a=sc.nextInt();
    System.out.print("Den1 : ");
    int b=sc.nextInt();
    System.out.print("Num2 : ");
    int c=sc.nextInt();
    System.out.print("Den2 : ");
    int d=sc.nextInt();
    int numerator=a*d + b*c;
    int denominator=b*d;
    int gcd=gcd(numerator,denominator);
    numerator /= gcd;
    denominator /= gcd;
    System.out.println(numerator+"/"+denominator);
  }
  static int gcd(int x, int y){
    if(y==0){
      return x;
    }
    return gcd(y,x%y);
  }
}

//-----------------------------------------------------------------------------------------------------------------------------//
/*A staircase with n steps is given. Starting from the base,
    return the number of ways of reaching the n’th stair.
    [The person can climb either 1 or 2 stairs in one move].*/
	
class Solution {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter the number of steps : ");
    int n=sc.nextInt();
    System.out.print("The number of ways a person can reach top is : "+staircase(n));
  }
  static int staircase(int n){
    int prev=1;
    int prev1=1;
    for(int i=2;i<=n;i++){
      int curr=prev+prev1;
      prev1=prev;
      prev=curr;
    }
    return prev;
  }
}


//or

class Solution {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter the number of steps : ");
    int n=sc.nextInt();
    System.out.print("The number of ways a person can reach top is : "+staircase(n));
  }
  static int staircase(int n){
    int[] s=new int[n+1];
    s[0]=1;
    s[1]=1;
    for(int i=2;i<=n;i++){
      s[i]=s[i-2]+s[i-1];
    }
    return s[n];
  }
}

//-------------------------------------------------------------------------------------------------------------------//
/*Given an array of integers and a sum K,
    return the length of the shortest sub-array which matches the given sum. If it doesn't exist, return -1.
    [Even a single integer can be considered as a sum.]

Examples:
    int[] arr = {2, 4, 6, 10, 2, 1}, K = 12        // Return 2*/

class Solution {
  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 10, 2, 1};
    int k = 12;
    int r=smallsum(arr,k);
    System.out.println(r);
  }
  static int smallsum(int[] arr,int k){
    int res=Integer.MAX_VALUE;
    int cursum=0;
    int start=0;
    for(int i=0;i<arr.length;i++){
      cursum+=arr[i];
      while(cursum>=k){
        res=Math.min(res,i-start+1);
        cursum-=arr[start];
        start++;
      }
    }
    return res == Integer.MAX_VALUE ? -1 : res;
  }
}

//--------------------------------------------------------------------------------------------------------------------------------//
/*Write a method that will take a string input and return a string output
The String s, will contain only numeric digits, In the output reverse only the digits divisible by 3.
Example 1: Input: s = “12345632189”
Output: "12945362183"*/

class Solution {
  public static void main(String[] args) {
    String s = "12345632189";
    System.out.println(s);
    System.out.println(strops(s));
    String s1 = "1234563218976";
    System.out.println(s1);
    System.out.println(strops(s1));
  }
  public static String strops(String s){
    StringBuilder revstr=new StringBuilder();
    char[] ch=s.toCharArray();
    for(char c:ch){
      if(Character.isDigit(c) && (c-'0')%3==0){
        revstr.append(c);
      }
    }
    revstr.reverse();
    int index=0;
    for(int i=0;i<ch.length;i++){
      if(Character.isDigit(ch[i]) && (ch[i]-'0')%3==0){
        ch[i]=revstr.charAt(index++);
      }
    }
    return new String(ch);
  }
}

//-------------------------------------------------------------------------------------------------------------//
/*Convert a string as given in the format below:
Example:
aabbbycyyc into a2b3y3c2*/
class Solution {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String inp="";
    System.out.print("Input : ");
    inp=sc.nextLine();
    System.out.println(strops(inp));
  }
  public static String strops(String inp){
    StringBuilder res=new StringBuilder();
    LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
    for(char c:inp.toCharArray()){
      map.put(c, map.getOrDefault(c, 0)+1);
    }
    for(Map.Entry<Character,Integer> m:map.entrySet()){
      res.append(m.getKey()).append(m.getValue());
    }
    return res.toString();
  }
}

//---------------------------------------------------------------------------------------------------------------------------------//
/*Pascal Triangle*/

class Solution {
  public static void main(String[] args) {
    int n=4;
    for(int line=1;line<=n;line++){
      for(int i=0;i<n-line;i++){
        System.out.print(" ");
      }
      int c=1;
      for(int j=1;j<=line;j++){
        System.out.print(c+" ");
        c=c*(line-j)/j;
      }
      System.out.println();
    }
  }
}

//-------------------------------------------------------------------------------------------//
/*Given n non-nega􀆟ve integers represen􀆟ng an eleva􀆟on map where the width of each bar is 1,
compute how much water it can trap a􀅌er raining.Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6*/

class Solution {
    public static int findTrap(int[] arr){
        if(arr.length==0 && arr==null){
            return 0;
        }
        //[4,2,0,3,2,5]
        int left=0,right=arr.length-1;
        int leftMax=0,rightMax=0;
        int bal=0;
        while(left<right){
            if(arr[left]<arr[right]){
                if(arr[left]>=leftMax) {
                    leftMax = arr[left];
                }else{
                    bal += leftMax-arr[left];
                }
                left++;
            }else{
                if(arr[right]>=rightMax){
                    rightMax=arr[right];
                }else{
                    bal += rightMax-arr[right];
                }
                right--;
            }
        }
        return bal;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        System.out.println(findTrap(arr));
    }
}


//-----------------------------------------------------------------------------------------//
/*Given an array of integers, sort it in a wave form.
    [ The order of elements in a wave form:arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ….. ]
    int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
    Answer : arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR {20, 5, 10, 2, 80, 6, 100, 3}*/
	
class Solution {
  public static void main(String[] args) {
    int[] a = {10, 5, 6, 3, 2, 100, 80};
    System.out.println(Arrays.toString(a));
    for(int i=0;i<a.length;i++){
      if(i%2==0 && i<a.length-1){
        if(a[i]<=a[i+1]){
          int temp=a[i+1];
          a[i+1]=a[i];
          a[i]=temp;
        }
      }
      else if(i<a.length-1){
        if(a[i]>=a[i+1]){
          int temp=a[i+1];
          a[i+1]=a[i];
          a[i]=temp;
        }
      }
    }
    System.out.println();
    System.out.println(Arrays.toString(a));
  }
}

//-------------------------------------------------------------------------------------------------//
/*Given an array of strings,
    return the IP address that occurs maximum number of times. 
    [You might have to check for the validity of the IP address before considering it].*/

class Solution {
  public static void main(String[] args) {
    List<String> ipAddress=new LinkedList<>();
    ipAddress.add("10.0.0.1 bytes=32 time=50ms TTL=63");
    ipAddress.add("10.0.0.2 bytes=32 time=50ms TTL=73");
    ipAddress.add("10.0.0.4 bytes=32 time=50ms TTL=83");
    ipAddress.add("10.0.0.2 bytes=32 time=50ms TTL=93");
    ipAddress.add("10.0.0.2 bytes=32 time=50ms TTL=73");
    System.out.println(getMaximumFrequentipAddress(ipAddress));
  }
  public static String getMaximumFrequentipAddress(List<String> ipAddress){
    String mostFrequntipAddress="";
    Map<String,Integer> ipCount=new HashMap<>();
    for(String s:ipAddress){
      ipCount.put(s, ipCount.getOrDefault(s, 0)+1);
    }
    int maxCount=0;
    for(Map.Entry<String,Integer> ip:ipCount.entrySet()){
      if(ip.getValue()>maxCount){ 
        mostFrequntipAddress=ip.getKey();
        maxCount=ip.getValue();
      }
    }
    return mostFrequntipAddress;
  }
}

//--------------------------------------------------------------------------------------------------------------//
/*Given a dictionary (list of words) and a word,
    return an array of strings that can be formed from the given word.
    [Every letter in the input word can occur only once in the word to be returned].

Examples:
    String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
    String input = "abcd";
    // Return {"abcd", "bcad"}
*/

class Solution {
  public static void main(String[] args) {
    String[] dict1 = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab","dcab"};
    String input1 = "abcd";
    System.out.println(stringOperations(dict1,input1));
    String[] dict2 =  {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab","acba"};
    String input2 = "caab";
    System.out.println(stringOperations(dict2,input2));
  }
  public static List<String> stringOperations(String[] dictnory, String input){
    List<String> resultList=new LinkedList<>();
    char[] inputArray=input.toCharArray();
    Arrays.sort(inputArray);
    String sortedInput=new String(inputArray);
    for(String s:dictnory){
      char[] sArray=s.toCharArray();
      Arrays.sort(sArray);
      String sortedString=new String(sArray);
      if(sortedInput.equals(sortedString)){
        resultList.add(s);
      }
    }
    return resultList;
  }
}
//---------------------------------------------------------------------------------------------------//
