package com.example.www_tuan05.daos;

import com.example.www_tuan05.entities.DienThoai;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

public interface DienThoaiDAO {
    List<DienThoai> getDSDienThoai();
    boolean addDienThoai(DienThoai dienThoai);
}
