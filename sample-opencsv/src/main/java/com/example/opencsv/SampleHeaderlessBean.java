package com.example.opencsv;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class SampleHeaderlessBean {

	@CsvBindByPosition(position = 0)
	private String fldField1;
	@CsvBindByPosition(position = 1, required = true)
	private char fldChar;
	@CsvBindByPosition(position = 2, required = true)
	private boolean fldBoolean;
	@CsvBindByPosition(position = 3, required = true)
	private short fldShort;
	@CsvBindByPosition(position = 4, required = true)
	private int fldInt;
	@CsvBindByPosition(position = 5, required = true)
	private long fldLong;
	@CsvBindByPosition(position = 6, required = true)
	private float fldFloat;
	@CsvBindByPosition(position = 7, required = true)
	private double fldDouble;
	@CsvBindByPosition(position = 8)
	private BigDecimal fldBigDecimal;
	@CsvBindByPosition(position = 9)
	@CsvDate(value = "yyyyMMdd HHmmssSSS")
	private Date fldDate;

	@Override
	public String toString() {
		return "SampleBean [fldField1=" + fldField1 + ", fldChar=" + fldChar + ", fldBoolean=" + fldBoolean
				+ ", fldShort=" + fldShort + ", fldInt=" + fldInt + ", fldLong=" + fldLong + ", fldFloat=" + fldFloat
				+ ", fldDouble=" + fldDouble + ", fldBigDecimal="
				+ (fldBigDecimal == null ? "null" : fldBigDecimal.toPlainString()) + ", fldDate="
				+ (fldDate == null ? "null" : new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").format(fldDate)) + "]";
	}

	public String getFldField1() {
		return fldField1;
	}

	public void setFldField1(String fldField1) {
		this.fldField1 = fldField1;
	}

	public char getFldChar() {
		return fldChar;
	}

	public void setFldChar(char fldChar) {
		this.fldChar = fldChar;
	}

	public boolean isFldBoolean() {
		return fldBoolean;
	}

	public void setFldBoolean(boolean fldBoolean) {
		this.fldBoolean = fldBoolean;
	}

	public short getFldShort() {
		return fldShort;
	}

	public void setFldShort(short fldShort) {
		this.fldShort = fldShort;
	}

	public int getFldInt() {
		return fldInt;
	}

	public void setFldInt(int fldInt) {
		this.fldInt = fldInt;
	}

	public long getFldLong() {
		return fldLong;
	}

	public void setFldLong(long fldLong) {
		this.fldLong = fldLong;
	}

	public float getFldFloat() {
		return fldFloat;
	}

	public void setFldFloat(float fldFloat) {
		this.fldFloat = fldFloat;
	}

	public double getFldDouble() {
		return fldDouble;
	}

	public void setFldDouble(double fldDouble) {
		this.fldDouble = fldDouble;
	}

	public BigDecimal getFldBigDecimal() {
		return fldBigDecimal;
	}

	public void setFldBigDecimal(BigDecimal fldBigDecimal) {
		this.fldBigDecimal = fldBigDecimal;
	}

	public Date getFldDate() {
		return fldDate;
	}

	public void setFldDate(Date fldDate) {
		this.fldDate = fldDate;
	}

}
