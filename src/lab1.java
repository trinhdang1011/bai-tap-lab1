import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner adang = new Scanner(System.in);
        System.out.println("Chuong trinh nhap xuat thoong tin ung vien");
        System.out.println("==========================================");
        System.out.println("Nhap ho ten:");
        String hoten= adang.nextLine();
        System.out.println("Nhap nam sinh:");
        int nansinh=adang.nextInt();
        System.out.println("Nhap gioi tinh:");
        String gioitinh= adang.next();
        System.out.println("Nhap chieu cao:");
        float chieucao=adang.nextFloat();
        System.out.println("Nhap can nang:");
        float cannang=adang.nextFloat();
        adang.nextLine();
        System.out.println("Nhap que quan:");
        String quequan= adang.nextLine();
        System.out.println("Nhap chuyen nganh:");
        String chuyennganh= adang.nextLine();
        System.out.println("===========================");
        System.out.println("Thong tin ung vien da nhap");
        System.out.println("===========================");
        System.out.println("+ Ho ten: "+hoten+"\n+ Nam sinh: "+nansinh+"\n+ Gioi tinh: "+gioitinh+
                "\n+ Chieu cao: "+chieucao+"\n+ Can nang: "+cannang+"\n+ Que quan: "+quequan+
                "\n+ Chuyen nganh: "+chuyennganh);



    }
}
