import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        StringBuilder a=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            if(s[i]!=" "){
                a.append(s[i]);
                if(i!=0){
                    a.append(" ");
                }
            }
        }
        System.out.println(a);
    }
}