package codes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import codes.*;

public class CallDataModels {
	
	public static List<Data_Map_Model> data_map_modelList = new ArrayList<Data_Map_Model>();
	public static String JSONpath = System.getProperty("user.dir")+"\\src\\test\\java\\main\\Xpaths.json";
	
	public static void main(String[] args) {
		
		Data_Value_Model aa = get_map_details("PAGE","loginpage","iphoneXR_learnmore",JSONpath);

	}
	
	public static Data_Value_Model get_map_details(String type, String section, String identifier, String filepath) {
		
		ObjectMapper mapper = new ObjectMapper();
		try{
			data_map_modelList = mapper.readValue(new File(filepath), new TypeReference<List<Data_Map_Model>>(){});
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return search_identifier(type,section,identifier, data_map_modelList);
	}
	
	public static Data_Value_Model search_identifier(String type, String section, String identifier, List<Data_Map_Model> data_map_modelList) {
		
		for(Data_Map_Model aa: data_map_modelList) {
			if(aa.getSectionID().equalsIgnoreCase(section) && aa.getTypeID().equalsIgnoreCase(type)) {
				System.out.println(aa.getSectionID());
			}
		}
		Data_Value_Model oo = null;
		return oo;
	}
	
	

}
