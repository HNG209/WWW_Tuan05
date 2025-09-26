package com.example.www_tuan05.daos;

import com.example.www_tuan05.entities.NhaCungCap;

import java.util.List;

public interface NhaCungCapDAO {
    List<NhaCungCap> getDSNCC();
    NhaCungCap findById(int id);
}
