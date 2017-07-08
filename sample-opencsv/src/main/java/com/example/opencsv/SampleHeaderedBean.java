package com.example.opencsv;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class SampleHeaderedBean {

	@CsvBindByName(column = "fldフィールド１")
	private String fldField1;
	@CsvBindByName(required = true)
	private char fldChar;
	@CsvBindByName(required = true)
	private boolean fldBoolean;
	@CsvBindByName(required = true)
	private short fldShort;
	@CsvBindByName(required = true)
	private int fldInt;
	@CsvBindByName(required = true)
	private long fldLong;
	@CsvBindByName(required = true)
	private float fldFloat;
	@CsvBindByName(required = true)
	private double fldDouble;
	@CsvBindByName
	private BigDecimal fldBigDecimal;
	@CsvBindByName
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
