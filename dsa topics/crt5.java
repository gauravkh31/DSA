import java.util.*;
public class crt5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Character x = sc.next().charAt(0);
        Character y = sc.next().charAt(0);
        Character z = sc.next().charAt(0);

        if(x.equals('>')&&y.equals('>')&&z.equals('>') ||  x.equals('<')&&y.equals('<')&&z.equals('<')){
            System.out.println("b");
        }

        else if(x.equals('>')&&y.equals('<')&&z.equals('<') ||  x.equals('<')&&y.equals('>')&&z.equals('>')){
            System.out.println("a");
        }

        else if(x.equals('<')&&y.equals('<')&&z.equals('>') ||  x.equals('>')&&y.equals('>')&&z.equals('<')){
            System.out.println("c");
        }else{
            System.out.println("Sahi se daal inputs: ");
        }
        
    }
    
}
