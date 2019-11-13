package kwan.org.demospringswing.model;


import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class HocVien implements Serializable {

    private int ma_hoc_vien;
    private String ho_ten;
    private String so_dien_thoai;
    private String dia_chi;
    private Date ngay_sinh;
    private boolean gioi_tinh;
    private boolean tinh_trang;

}