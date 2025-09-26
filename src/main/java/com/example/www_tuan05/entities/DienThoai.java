package com.example.www_tuan05.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "dienthoai")
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DienThoai {
    @Id
    @Column(name = "madt")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long maDT;

    @Column(name = "tendt")
    String tenDT;

    @Column(name = "namsanxuat")
    int namSX;

    @Column(name = "cauhinh")
    String cauHinh;

    @ManyToOne
    @JoinColumn(name = "mancc")
    NhaCungCap nhaCungCap;

    @Lob
    @Column(columnDefinition = "LONGBLOB", name = "hinhanh")
    byte[] hinhAnh;
}
