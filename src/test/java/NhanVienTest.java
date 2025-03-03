import org.example.NhanVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NhanVienTest {
    NhanVienService nhanVienService = new NhanVienService();

    @Test
    public void updateNhanVien() {
        String exp = "Không tìm thấy nhân viên";
        String act = nhanVienService.updateNhanVien("NV3", "quocanh", 20, 200f, 3, "IT");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void updateNhanVien1() {
        String exp = "Tuổi nhân viên phải lớn hơn 18";
        String act = nhanVienService.updateNhanVien("NV2", "quocanh", 2, 200f, 3, "IT");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void updateNhanVien2() {
        Assertions.assertThrows(NullPointerException.class, () -> nhanVienService.updateNhanVien("", "quocanh", 2, 200f, 3, "IT"));
    }

    @Test
    public void updateNhanVien3() {
        String exp = "Không tìm thấy nhân viên";
        String act = nhanVienService.updateNhanVien("NV5", "quocanh", 22, 200f, 3, "IT");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void updateNhanVien4() {
        String exp = "Lương phải lớn hơn 0";
        String act = nhanVienService.updateNhanVien("NV2", "quocanh", 22, -200f, 3, "IT");
        Assertions.assertEquals(exp, act);
    }
}
