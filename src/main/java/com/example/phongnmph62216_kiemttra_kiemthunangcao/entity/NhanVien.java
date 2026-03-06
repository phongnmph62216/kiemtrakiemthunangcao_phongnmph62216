package com.example.phongnmph62216_kiemttra_kiemthunangcao.entity;


//Tạo class NhanVien gồm các thuộc tính maNV - String , ten –
//String, tuoi - int, luong - float, soNamLamViec - int, phongBan -
//String 


public class NhanVien {

    private String maNV;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;
    private String phongBan;

    public NhanVien() {
    }

    public NhanVien(String maNV, String ten, int tuoi, float luong, int soNamLamViec, String phongBan) {
//        this.maNV = maNV;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.luong = luong;
//        this.soNamLamViec = soNamLamViec;
//        this.phongBan = phongBan;
        setMaNV(maNV);
        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);
        setPhongBan(phongBan);
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        //add nhan vien voi ten khong duoc de null
        if (ten == null || ten.trim().isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de null hoac rong");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
         //add nhan vien voi tuoi phai be hon 40
        if (tuoi > 40) {
            throw new IllegalArgumentException("Tuoi phai be hon 40");
        }
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        //add nhan vien voi luong phai lon hon 0
        if (luong <= 0) {
            throw new IllegalArgumentException("Luong phai lon hon 0");
        }

        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }



}
