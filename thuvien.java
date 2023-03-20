import java.time.LocalDate;

public class ThuVien {

    private double maSach;
    private LocalDate ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    public ThuVien(double maSach, LocalDate ngayNhap, double donGia,int soLuong,String nhaXuatBan){
        super();
        this.maSach= maSach;
        this.ngayNhap= ngayNhap;
        this.donGia= donGia;
        this.soLuong= soLuong;
        this.nhaXuatBan= nhaXuatBan;
    }
    public double getMaSach(){
        return  maSach;
    }
    public void setMaSach(double maSach){
        this.maSach= maSach;
    }
    public LocalDate getNgayNhap(){
        return ngayNhap;
    }
    public void setNgayNhap(LocalDate ngayNhap){
        this.ngayNhap= ngayNhap;
    }
    public double getDonGia(){
        return donGia;
    }
    public  void setDonGia(double donGia){
        this.donGia= donGia;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        this.soLuong= soLuong;
    }
  public String getNhaXuatBan(){
        return nhaXuatBan;
  }
  public void setNhaXuatBan(String nhaXuatBan){
        this.nhaXuatBan= nhaXuatBan;

  }
  public String quanliThuVien(){
        return "Thuvien [maSach=" + maSach + ", ngayNhap=" + ngayNhap +"donGia=" + donGia + "soLuong" + soLuong + "nhaXuatBan" + nhaXuatBan + "]";

  }
    }




