package codes;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import main.stepDefinations;

@JsonIgnoreProperties
public class StringPractice {

	public static void main(String[] args) {
		
		//Object2String();
		//StringOperations();
		palindromeString("palap");
		
		
	}
	
	public static String palindromeString(String pal) {
		
		String temp = pal;
		char[] aa = null;
		
		for(int i = 0;i<pal.length();i++) {
			aa[i] = pal.charAt(pal.length()-1-i);
		}
		
		temp = aa.toString();
		return temp;
	}
	
	public static void StringOperations() {
		
		// String is immutable
		
//		String ss = "String is immutabe";
//		System.out.println(ss.concat(" hao r u today"));
//		ss.concat("this will not be assigned");
//		System.out.println(ss);
//		ss = ss.concat("assign it explicitly");
//		System.out.println(ss);
		
		//but stringbuffer and stringbuilder get assigned implicitly as well
		
//		StringBuffer dd = new StringBuffer("htddthdht");
//		System.out.println(dd);
//		dd.append("hhh hhh hhh");
//		System.out.println(dd);
//		
//		StringBuilder hh = new StringBuilder("yyyyyyyyyy");
//		System.out.println(hh);
//		hh.append("jjjjj jjjjj jj");
//		System.out.println(hh);
		
		//CONTAINS, endsWith, equals, equalsIgnoreCase function string
		
		String h = "poiuy lkjhmnb mnbb";
//		if(h.contains("poiuy")) {
//			System.out.println("voila");
//		}
		if(h.endsWith(" mnbb")) {
			System.out.println("voila");
		}
		
	}
	
	public static void Object2String() {
		Datapack aa = new Datapack(33,"heyu");
		String p1 = aa.toString();
		System.out.println(p1);
		String p2 = String.valueOf(aa);
		System.out.println(p2);
		
		aa.setA1(122);
		aa.setS1("ooo");
		p1=aa.toString();
		p2=String.valueOf(aa);
		System.out.println(aa.getA1());
		System.out.println(aa.getS1());
		
		int r =300;
		String ee = String.valueOf(r);
		System.out.println(ee);
	}
}
