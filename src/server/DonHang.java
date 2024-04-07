package server;

import java.io.Serializable;

public class DonHang implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int maDonHang;
	private int maKhachHang;
	private int maNhanVien;
	private String ngayDatHang;
	private String trangThai;
	
	public DonHang(int maDonHang, int maKhachHang, int maNhanVien, String ngayDatHang, String trangThai) {
		super();
		this.maDonHang = maDonHang;
		this.maKhachHang = maKhachHang;
		this.maNhanVien = maNhanVien;
		this.ngayDatHang = ngayDatHang;
		this.trangThai = trangThai;
	}

	public int getMaDonHang() {
		return maDonHang;
	}

	public void setMaDonHang(int maDonHang) {
		this.maDonHang = maDonHang;
	}

	public int getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getNgayDatHang() {
		return ngayDatHang;
	}

	public void setNgayDatHang(String ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "DonHang [maDonHang=" + maDonHang + ", maKhachHang=" + maKhachHang + ", maNhanVien=" + maNhanVien
				+ ", ngayDatHang=" + ngayDatHang + ", trangThai=" + trangThai + "]";
	}
	
	

}