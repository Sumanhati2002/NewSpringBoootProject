package com.spring.fileuploading.helper;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	public final String UPLOAD_DIRECOTRY = "C:\\Users\\tech\\Documents\\spring_boot_new_project\\FileUploading\\src\\main\\resources\\static\\Image";
	public boolean uploadFile(MultipartFile file) {
		
		boolean f=false;
		try {
			
			//read
//			InputStream is=file.getInputStream();
//			byte data[]=new byte[is.available()];
//			is.read(data);
			
			//write
//			FileOutputStream fos=new FileOutputStream(UPLOAD_DIRECOTRY+"\\"+file.getOriginalFilename());
//			fos.write(data);
//			fos.flush();
//			fos.close();
			
			//another way
			Files.copy(file.getInputStream(), Paths.get(UPLOAD_DIRECOTRY+"\\"+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			f=true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return f;
	}
}
