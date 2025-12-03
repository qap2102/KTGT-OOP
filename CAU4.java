import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CAU4 {

    public static class SinhVien {
        String msv;
        String ten;
        String gt;
        String lop;
        String mail;
        String sdt;
        public SinhVien(String msv, String ten, String gt, String lop, String mail, String sdt){
            this.msv=msv;
            this.ten=ten;
            this.gt=gt;
            this.lop=lop;
            this.mail=mail;
            this.sdt=sdt;
        }

        
    }
    public static class SinhVien1 extends SinhVien {
        String siz;
        public SinhVien1(String msv, String ten, String gt, String lop, String mail, String sdt, String siz){
            super(msv, ten, gt, lop, mail, sdt);
            this.siz=siz;
        }
        
    }
    public static void main(String[] args) throws IOException {
        Scanner sc_sv = new Scanner(new File("SINHVIEN.in"));
        Scanner sc_dk = new Scanner(new File("DANGKY.in"));
        Scanner sc_tv = new Scanner(new File("TRUYVAN.in"));
        int n = sc_sv.nextInt();
        sc_sv.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0;i<n;++i){
            String msv = sc_sv.nextLine();
            String ten = sc_sv.nextLine();
            String gt = sc_sv.nextLine();
            String lop = sc_sv.nextLine();
            String mail = sc_sv.nextLine();
            String sdt = sc_sv.nextLine();
            a.add(new SinhVien(msv, ten, gt, lop, mail, sdt));
        }
        ArrayList<SinhVien1> b= new ArrayList<>();
        for(int i=0;i<n;++i){
            String[] tmp = sc_dk.nextLine().split("\\s+");
            String msv = tmp[0];
            String siz = tmp[1];
            for(SinhVien j:a){
                // b.add(new SinhVien1(msv, j.ten, j.gt, j.lop, j.mail, j.sdt, siz));
                // break;
                if(j.msv.equals(msv)){
                    b.add(new SinhVien1(msv, j.ten, j.gt, j.lop, j.mail, j.sdt, siz));
                    break;
                }
            }
        }
        // for(SinhVien1 i:b){
        //     System.out.println(i.msv+" "+i.ten+" "+i.gt+" "+i.lop+" "+i.mail+" "+i.sdt+" "+i.siz);
        // }
        // Collections.sort(b,(x,y)->{
        //     return x.msv.compareTo(y.msv);
        // });
        int q = sc_tv.nextInt();
        sc_tv.nextLine();
        while(q-->0){
            String[] line = sc_tv.nextLine().split("\\s+");
            String gt = line[0];
            String co = line[1];
            Collections.sort(b,(x,y)->{
                return x.msv.compareTo(y.msv);
            });
            System.out.println("DANH SACH SINH VIEN "+gt.toUpperCase()+" DANG KY SIZE "+co.toUpperCase());
            for(SinhVien1 i:b){
                if(i.gt.equals(gt)){
                    if(i.siz.equals(co)){
                        System.out.println(i.msv+" "+i.ten+" "+i.lop+" "+i.mail+" "+i.sdt);
                    }
                }
            }
        }
        sc_sv.close();
        sc_dk.close();
        sc_tv.close();
        
    }
}
