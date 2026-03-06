package com.example.phongnmph62216_kiemttra_kiemthunangcao.service;

import com.example.phongnmph62216_kiemttra_kiemthunangcao.entity.NhanVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


//Tạo class NhanVienService và thực hiện hàm thêm mới 1
//đối tượng nhân viên (1 Điểm) ●
//Viết unit test cho chức năng trên


class NhanVienServiceTest {


    private NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }

//   add nhan vien
    @Test
    void testAddNhanVien() {
        NhanVien nhanVien1 = new NhanVien("NV001", "Nguyen Van A", 30, 5000.0f, 5, "IT");
        nhanVienService.addNhanVien(nhanVien1);

        List<NhanVien> nhanViens = nhanVienService.getNhanViens();
        assertEquals(1, nhanViens.size());
        assertEquals("NV001", nhanViens.get(0).getMaNV());
        assertEquals("Nguyen Van A", nhanViens.get(0).getTen());
        assertEquals(30, nhanViens.get(0).getTuoi());
        assertEquals(5000.0f, nhanViens.get(0).getLuong());
        assertEquals(5, nhanViens.get(0).getSoNamLamViec());
        assertEquals("IT", nhanViens.get(0).getPhongBan());



    }

    //add nhan vien khong trong du lieu
    @Test
    void testAddNhanVienNull() {
          Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.addNhanVien(null);
        });



    }

    //add nhan vien voi tuoi phai be hon 40
    @Test
    void testAddNhanVienTuoiLonHon40() {
         Exception exception = assertThrows(IllegalArgumentException.class, () -> {

            NhanVien nhanVien2 = new NhanVien("NV002", "Le Thi B", 45, 6000.0f, 10, "HR");
            nhanVienService.addNhanVien(nhanVien2);
            });

        assertEquals("Tuoi phai be hon 40", exception.getMessage());

    }

    //add nhan vien voi luong phai lon hon 0
    @Test
    void testAddNhanVienLuongAm() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NhanVien nhanVien3 = new NhanVien("NV003", "Tran Van C", 25, -1000.0f, 2, "Finance");
            nhanVienService.addNhanVien(nhanVien3);
        });
        assertEquals("Luong phai lon hon 0", exception.getMessage());

    }

         //add nhan vien voi ten khong duoc de null
    @Test
    void testAddNhanVienTenNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NhanVien nhanVien4 = new NhanVien("NV004", null, 28, 4000.0f, 3, "Marketing");
            nhanVienService.addNhanVien(nhanVien4);
        });
        assertEquals("Ten khong duoc de null hoac rong", exception.getMessage());
    }



}