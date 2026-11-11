package m51_25662861_TruongTanLoc;

import java.time.LocalDate;

class GiaoDichDat extends GiaoDich {
	private String loaiDat;
	
	public GiaoDichDat(String ma, LocalDate ngay, double donGia, double dienTich, String loaiDat) {
		super(ma, ngay, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	
	@Override
	public double thanhTien() {
		if(loaiDat.equalsIgnoreCase("A")) {
			return dienTich * donGia *  1.5;
		}
		return dienTich * donGia;
	}
	
	public String toString() {
		return "[DAT]" + super.toString() + "| Loai: " + loaiDat;
	}
}

class GiaoDichNha extends GiaoDich {

	private String loaiNha;
	private String diaChi;
	
	public GiaoDichNha(String ma, LocalDate ngay, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(ma, ngay, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}

	@Override
	public double thanhTien() {
		if(loaiNha.equalsIgnoreCase("cao cap")) {
			return dienTich * donGia *  1.5;
		}
		return dienTich * donGia * 0.9;
	}
	
	public String toString() {
		return "[NHA]" + super.toString() + "| Loai: " + loaiNha;
	}
}

