package com.example.phongnmph62216_kiemttra_kiemthunangcao.service;



import com.example.phongnmph62216_kiemttra_kiemthunangcao.entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> nhanVienList = new ArrayList<>();

    public void addNhanVien(NhanVien nhanVien) {
        if (nhanVien == null) {
            throw new IllegalArgumentException("NhanVien khong dc de null");
        }
        nhanVienList.add(nhanVien);
    }




    public List<NhanVien> getNhanViens() {
        return nhanVienList;
    }

}
