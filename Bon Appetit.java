import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

  public static void main(String arg[])
       {int n,p,q,sum=0,sum1,sum2;
Scanner in=new Scanner(System.in);
n=in.nextInt();p=in.nextInt();
int k[]=new int[n];

for(int i=0;i<n;i++)
{k[i]=in.nextInt();}
q=in.nextInt();

for(int i=0;i<n;i++)
{sum+=k[i];}

sum1=sum-k[p];
sum2=-sum1/2+q;
if(sum2!=0)
{System.out.println(sum2);}
else{System.out.println("Bon Appetit");}




}
}
