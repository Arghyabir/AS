import java.util.*;
public class Booth{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    m1=sc.nextInt();
    m2=sc.nextInt();

    int n = Integer.toBinaryString(m1).length();
    System.out.println(n);
    int p=0;
    for(int i = 0;i<n;i++){
      int unit= (m1&0b1);
      if(unit ==1){
        p=p+m2;
    }
      m1=m1>>1;
      m2=m2<<1;
  }
    System.out.println(p);
}
}
