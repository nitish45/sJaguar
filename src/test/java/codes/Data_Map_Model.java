package codes;

import java.util.List;

public class Data_Map_Model {
	
	private String typeID;
	private String sectionID;
	private List<Data_Value_Model> data;
	public String getTypeID() {
		return typeID;
	}
	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}
	public String getSectionID() {
		return sectionID;
	}
	public void setSectionID(String sectionID) {
		this.sectionID = sectionID;
	}
	public List<Data_Value_Model> getData() {
		return data;
	}
	public void setData(List<Data_Value_Model> data) {
		this.data = data;
	}
	
}
