package org.example;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> list = new ArrayList<>();
    public NhanVienService(){
        list.add(new NhanVien("NV1", "quocanh", 18, 200f, 3,"IT"));
        list.add(new NhanVien("NV2", "quocanh", 18, 200f, 3,"IT"));
        list.add(new NhanVien("NV3", "quocanh", 18, 200f, 3,"IT"));
    }
    public String updateNhanVien(String maNhanVien, String tenNhanVien, Integer tuoi, Float luong, Integer soNamLamViec,
                                 String phongBan){
        if (maNhanVien.trim().isEmpty() || maNhanVien.trim() == null ||
                tenNhanVien.trim().isEmpty() || tenNhanVien.trim() == null ||
                phongBan.trim().isEmpty() || phongBan.trim() == null
        ){
            throw new NullPointerException("Không được để trống thông tin");
        }
        if (tuoi < 18){
            return "Tuổi nhân viên phải lớn hơn 18";
        }
        if (luong < 0){
            return "Lương phải lớn hơn 0";
        }
        for (NhanVien nhanVien: list
             ) {
            if (nhanVien.getMaNhanVien().trim().equalsIgnoreCase(maNhanVien)){
                nhanVien.setTen(tenNhanVien);
                nhanVien.setLuong(luong);
                nhanVien.setTuoi(tuoi);
                nhanVien.setSoNamLamViec(soNamLamViec);
                nhanVien.setPhongBan(phongBan);
                return "Sửa nhân viên thành công";
            } else if (!nhanVien.getMaNhanVien().trim().equalsIgnoreCase(maNhanVien)){
                return "Không tìm thấy nhân viên";
            }
        }
        return "Update thất bại";
    }
}
