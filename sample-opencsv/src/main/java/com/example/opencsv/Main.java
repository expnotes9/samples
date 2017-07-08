package com.example.opencsv;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class Main {
	private static final Charset CHARSET = Charset.forName("windows-31j");

	public static void main(String[] args) throws IOException {
		System.out.println(CHARSET);
		// ヘッダあり
		// read, write, read, write
		List<SampleHeaderedBean> beans1 = parseHeaderedCsv();
		writeHeadered(beans1, "out_headered1.csv");
		System.out.println(beans1.toString());
		beans1 = parseHeaderedCsv();
		writeHeadered(beans1, "out_headered2.csv");
		assert Files.readAllLines(Paths.get("out_headered1.csv"), CHARSET)
				.equals(Files.readAllLines(Paths.get("out_headered2.csv"), CHARSET));
		System.out.println(beans1.toString());

		// ヘッダなし
		// read, write, read, write
		List<SampleHeaderlessBean> beans2 = parseHeaderlessCsv();
		writeHeaderless(beans2, "out_headerless1.csv");
		System.out.println(beans2.toString());
		beans2 = parseHeaderlessCsv();
		writeHeaderless(beans2, "out_headerless2.csv");
		System.out.println(beans2.toString());
		assert Files.readAllLines(Paths.get("out_headerless1.csv"), CHARSET)
				.equals(Files.readAllLines(Paths.get("out_headerless2.csv"), CHARSET));

		System.out.println("terminated.");
	}

	private static List<SampleHeaderedBean> parseHeaderedCsv() throws IOException {
		try (InputStream is = Main.class.getResourceAsStream("/sampleheaderedbean.csv");
				InputStreamReader isr = new InputStreamReader(is, CHARSET);) {
			@SuppressWarnings("unchecked")
			CsvToBean<SampleHeaderedBean> parser = new CsvToBeanBuilder<SampleHeaderedBean>(isr)
					.withType(SampleHeaderedBean.class).build();
			List<SampleHeaderedBean> beans = parser.parse();
			return beans;
		}
	}

	private static void writeHeadered(List<SampleHeaderedBean> beans1, String path) throws IOException {
		try (OutputStream os = Files.newOutputStream(Paths.get(path));
				OutputStreamWriter writer = new OutputStreamWriter(os, CHARSET);) {
			@SuppressWarnings("unchecked")
			StatefulBeanToCsv<SampleHeaderedBean> beanToCsv = new StatefulBeanToCsvBuilder<SampleHeaderedBean>(writer)
					.build();
			beanToCsv.write(beans1);
		} catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
			throw new IOException(e);
		}
	}

	private static List<SampleHeaderlessBean> parseHeaderlessCsv() throws IOException {
		try (InputStream is = Main.class.getResourceAsStream("/sampleheaderlessbean.csv");
				InputStreamReader isr = new InputStreamReader(is, CHARSET);) {
			@SuppressWarnings("unchecked")
			CsvToBean<SampleHeaderlessBean> parser = new CsvToBeanBuilder<SampleHeaderlessBean>(isr)
					.withType(SampleHeaderlessBean.class).build();
			List<SampleHeaderlessBean> beans = parser.parse();
			return beans;
		}
	}

	private static void writeHeaderless(List<SampleHeaderlessBean> beans2, String path) throws IOException {
		try (OutputStream os = Files.newOutputStream(Paths.get(path));
				OutputStreamWriter writer = new OutputStreamWriter(os, CHARSET);) {
			@SuppressWarnings("unchecked")
			StatefulBeanToCsv<SampleHeaderlessBean> beanToCsv = new StatefulBeanToCsvBuilder<SampleHeaderlessBean>(
					writer).build();
			beanToCsv.write(beans2);
		} catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
			throw new IOException(e);
		}
	}

}
