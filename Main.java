import java.util.*;
class Main {
  public static void main(String[] args) {
    Random r=new Random();
    int randomInt=r.nextInt(50)+1;
    System.out.println("The random number is: "+randomInt+'\n');
    for(int i=randomInt; i>=0;i--)
    {
      System.out.println(i);
    }
    if(randomInt<25)
    {
      System.out.println("Ahoy mateys!");
    }
    else if(randomInt>25&&randomInt<42)
    {
      System.out.println("Cannonball!");
    }
    else
    {
      System.out.println("Blast Off");
    }
  }
}