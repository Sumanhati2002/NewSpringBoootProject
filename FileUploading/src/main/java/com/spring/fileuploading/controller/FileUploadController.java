package com.spring.fileuploading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.fileuploading.helper.FileUploadHelper;

@RestController
public class FileUploadController {

	@Autowired
	private FileUploadHelper fileuploahelper;
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("File") MultipartFile file){
		
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		try {
			
			boolean f=fileuploahelper.uploadFile(file);
			if (f) {
				return ResponseEntity.ok("file successfully uploaded.....");
			}
		} catch (Exception e) {
			e.printStackTrace();		}
		
		return ResponseEntity.ok("working");
	}
}
