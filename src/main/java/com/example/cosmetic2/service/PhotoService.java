package com.example.cosmetic2.service;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class PhotoService {

    public String imageUpload(MultipartFile file) throws IOException {
        File imageFile = new File (  "./photo/" + file.getOriginalFilename());
        imageFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(imageFile);
        fos.write(file.getBytes());
        fos.close();
        String test = file.getOriginalFilename();
        return file.getOriginalFilename();

    }

    public ResponseEntity<byte[]> getPhoto(String file) throws IOException {
        System.out.println("Filename : " + file);
        FileInputStream fileInputStream = new FileInputStream("photo" + "/" + file);
        byte[] image = fileInputStream.readAllBytes();
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }

}
