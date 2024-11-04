import java.util.*;
public class main{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.print("enter a String : ");
String str = in.nextLine();
String res = longestpalindromicstring(str);
System.out.print("longest panlindrome :" + res);
}
public static boolean ispalindrome(String str , int left, int right){
while(left < right){
if(str.charAt(left)!=str.charAt(right)){
return false;
}
left++;
right--;
}
return true;
}
public static String longestpalindromicstring(String str){
if(str==null || str.length()<1){
return "";
}
int maxlen=1;
int start=0;
int len = str.length();
for(int i=0;i<len;i++){
for(int j=i;j<len;j++){
if(ispalindrome(str, i, j)){
int currentlen=j-i+1;
if(currentlen>maxlen){
maxlen=currentlen;
start=i;
}
}
}
}
StringBuilder palindrome =new StringBuilder();
for(int i=start;i<start+maxlen;i++){
palindrome.append(str.charAt(i));
}
return palindrome.toString();
}
}
