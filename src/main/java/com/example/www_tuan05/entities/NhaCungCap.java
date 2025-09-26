package com.example.www_tuan05.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "nhacungcap")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NhaCungCap {
    @Id
    @Column(name = "mancc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long maNCC;

    @Column(name = "tennhacc")
    String tenNCC;

    @Column(name = "diachi")
    String diaChi;

    @Column(name = "sodienthoai")
    String sdt;
}
