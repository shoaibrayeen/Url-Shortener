package com.demo.UrlShortner.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class url {

	@Id
	@Column(name = "ShortUrl")
	private String sUrl;

	@Column(name = "LongUrl")
	private String lUrl;

	public url() {
		
	}
	
	public url(String sUrl, String lUrl) {
		this.setShortUrl(sUrl);
		this.setLongUrl(lUrl);
	}

	public void setLongUrl(String lUrl) {
		this.lUrl = lUrl;
	}
	
	public void setShortUrl(String sUrl) {
		this.sUrl = sUrl;
	}
	
	public String getLongUrl() {
		return lUrl;
	}
	
	public String getShortUrl() {
		return sUrl;
	}
}