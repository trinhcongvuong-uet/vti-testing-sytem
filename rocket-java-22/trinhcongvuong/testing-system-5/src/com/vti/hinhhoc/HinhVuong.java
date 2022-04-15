package com.vti.hinhhoc;

public class HinhVuong extends HinhChuNhat {

	public double tinhChuVi(double canhHv) {
		return super.tinhChuVi(canhHv, canhHv);
	}

	public double tinhDientich(double canhHv) {
		return super.tinhDientich(canhHv, canhHv);
	}
}
