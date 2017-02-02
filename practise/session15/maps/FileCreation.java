package practise.session15.maps;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		File simpleFile=new File();
		
		try{
			simpleFile.createNewFile();
		}catch (IOException e){
			e.printStackTrace();
		}
		try{
			FileInputStream fis=new FileInputStream(simpleFile);
			BufferedInputStream bis=new BufferedInputStream(fis);
			DataInputStream dis=new DataInputStream(bis);
			
			while(dis.available()!=0){
				System.out.println(dis.readLine());
			} catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}

}
