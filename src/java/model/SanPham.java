/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anh.leuduc.sv
 */
public class SanPham {
    private String ma;
    private String tensp;
    private double gia;
    private int soluong;

    public SanPham(String ma, String tensp, double gia, int soluong) {
        this.ma = ma;
        this.tensp = tensp;
        this.gia = gia;
        this.soluong = soluong;
    }

    public SanPham() {
    }

    public SanPham(String parameter) {
        this.ma = parameter;
    }

    public String getMa() {
        return ma;
    }

    public String getTensp() {
        return tensp;
    }

    public double getGia() {
        return gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
   
}
