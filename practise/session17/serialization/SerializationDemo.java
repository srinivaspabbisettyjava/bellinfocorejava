package practise.session17.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) {
		String fileName="Site.txt";
		String absPath=System.getProperty("user.dir");
		String fullPath=absPath+File.separator+fileName;
		
		Site ws=new Site();
		ws.setName("Google");
		ws.setPurpose("Searching");
		ws.setRank(1);
		try(FileOutputStream fos=new FileOutputStream(fullPath);
				
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			oos.writeObject(ws);
			oos.flush();
		}catch (IOException io){
		   io.printStackTrace();
		}

	}

}

class Site implements Serializable{
	private  String name;
	private int rank;
	private String purpose;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	@Override
	public String toString() {
		return "Site [name=" + name + ", rank=" + rank + ", purpose=" + purpose
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
		result = prime * result + rank;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Site other = (Site) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (purpose == null) {
			if (other.purpose != null)
				return false;
		} else if (!purpose.equals(other.purpose))
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}
	
	
}
