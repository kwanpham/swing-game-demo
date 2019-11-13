package kwan.org.demospringswing.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class LopHoc implements Serializable {

    private int ma_lop_hoc;
    private KhoaHoc khoaHoc;
    private HocVien hocVien;
    private Date ngay_dang_ky;
    private boolean tinh_trang;
}