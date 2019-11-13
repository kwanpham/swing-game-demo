package kwan.org.demospringswing.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class KhoaHoc implements Serializable {

    private int ma_khoa_hoc;
    private String ten_khoa_hoc;
    private String mo_ta;
    private Date ngay_bat_dau;
    private Date ngay_ket_thuc;
    private boolean tinh_trang;
}