import java.util.ArrayList;
import java.util.Scanner;

public class CAU2 {
    public static class SinhVien {
        String msv;
        String ten;
        String lop;
        String detai;
        String gio;
        public SinhVien(String msv, String ten, String lop, String detai, String gio){
            this.msv=msv;
            this.ten=ten;
            this.lop=lop;
            this.detai=detai;
            this.gio=gio;
        }
        @Override
        public String toString(){
            return msv+", "+ten+", "+lop+", "+detai+", "+gio;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0;i<n;++i){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String detai = sc.nextLine();
            String gio = sc.nextLine();
            a.add(new SinhVien(msv, ten, lop, detai, gio));
        }
        for(SinhVien i:a){
            System.out.println(i);
        }
        sc.close();
    }
}
