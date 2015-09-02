package com.ethan.java.XPS8700Monitor.entities;


public class XPS8700Entity {
	
	private String processor = null;
	private String harddisk = null;
	private String rom = null;
	private String gpu = null;
	private String price = null;
	private String stockinfo = null;

    
	/**
	 * Constructor
	 * 
	 * @param processor info
	 * @param harddisk info
	 * @param rom info
	 * @param gpy info
	 * @param price info
	 * @param stock info
	 */
	public XPS8700Entity(String processor, String harddisk, String rom, String gpu, String price, String stockinfo) {
		
		if(processor == null || harddisk == null || rom == null || price == null) {
			throw new IllegalArgumentException("processor, harddisk, rom and price parameters cannot be null");
		}
		
		this.processor = processor;
		this.harddisk = harddisk;
		this.rom = rom;
		this.gpu = gpu;
		this.price = price;
		this.stockinfo = stockinfo;
	}


	public String getProcessor() {
		return processor;
	}


	public void setProcessor(String processor) {
		this.processor = processor;
	}


	public String getHarddisk() {
		return harddisk;
	}


	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}


	public String getRom() {
		return rom;
	}


	public void setRom(String rom) {
		this.rom = rom;
	}


	public String getGpu() {
		return gpu;
	}


	public void setGpu(String gpu) {
		this.gpu = gpu;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getStockinfo() {
		return stockinfo;
	}


	public void setStockinfo(String stockinfo) {
		this.stockinfo = stockinfo;
	}
	
	
}
