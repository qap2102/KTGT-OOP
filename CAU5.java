import java.math.BigInteger;
import java.util.Scanner;

public class CAU5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;++i){
            String[] line = sc.nextLine().split("\\s+");
            String a = line[0];
            String b = line[1];
            String k ="";
            for(char j:a.toCharArray()){
                if(j=='6'){
                    j='5';
                }
                k+=j;
            }
            String k1 = "";
            for(char j:b.toCharArray()){
                if(j=='6'){
                    j='5';
                }
                k1+=j;
            }
            String x = "";
            for(char j:a.toCharArray()){
                if(j=='5'){
                    j='6';
                }
                x+=j;
            }
            String x1 = "";
            for(char j:b.toCharArray()){
                if(j=='5'){
                    j='6';
                }
                x1+=j;
            }
            BigInteger A = new BigInteger(k);
            BigInteger B = new BigInteger(k1);
            BigInteger A1 = new BigInteger(x);
            BigInteger B1 = new BigInteger(x1);
            System.out.printf("%s %s\n",A.add(B).toString(), A1.add(B1).toString());
        }
        sc.close();
    }
}
