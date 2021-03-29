package com.demo.UrlShortner.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.UrlShortner.Model.url;
import com.demo.UrlShortner.Repository.UrlRepository;
//For Checking A URL is valid or not
import java.net.URL; 

@Service
public class UrlShort {

	@Autowired
	public UrlRepository repoObject;

	 public static boolean isValid(String url) 
	 {
		 try {
			 if (url.substring(0,4) != "http" && url.substring(6,7)== "/" ) {
				 url = "http://" + url; 
			 }
			 new URL(url).toURI(); 
	         return true; 
	     }
	     catch (Exception e) { 
	         return false; 
	     } 
	 } 
	 
	public String convert(int number) {
		String result = "";
		Random rand = new Random();
		while (number > 0) {
			int randomInt = rand.nextInt(62);
			if (randomInt >= 0 && randomInt <= 9) {
				result += Integer.toString(randomInt);
			} else if (randomInt >= 10 && randomInt < 36) {
				randomInt += 65 - 10;
				result += (char) randomInt;
			} else {
				randomInt += 97 - 36;
				result += (char) randomInt;
			}
			number = number / 10;
		}
		return result;
	}

	public String Shortner(String longUrl) {
		
		if (longUrl == "") {
			return "Kindly Enter Long Url. It can't be NULL.";
		} 
		else if (longUrl.length() < 10) {
			return "Minimum Url Length Should be 10.";
		}
		else if (!isValid(longUrl)) {
			return "Kindly Enter A Valid URL.";
		}
		//url object = repoObject.findBylUrl(longUrl);
		//if (object != null ) 
		//{
		//	return "my.url/" + object.getShortUrl();
		//}
		Random rand = new Random();
		int rand_int = rand.nextInt(1000000000);
		String result = convert(rand_int);
		repoObject.save(new url(result, longUrl));
		return "my.url/" + result;
	}
}
