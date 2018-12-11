package com.nitie.bgyan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "files")
public class NewsAnalysis {
	@Id
	private int id;

	private String fileName;

	private String author;

	private String Date;

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	private String fileType;

	@Lob
	private byte[] data;

	public NewsAnalysis() {

	}

	public NewsAnalysis(String fileName, String author, String fileType, String date, byte[] data) {
		this.id = fileName.hashCode();
		this.fileName = fileName;
		this.author = author;
		this.data = data;
		this.Date = date;
		this.fileType = fileType;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
