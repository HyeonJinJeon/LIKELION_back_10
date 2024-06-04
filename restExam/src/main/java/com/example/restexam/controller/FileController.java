package com.example.restexam.controller;

import com.example.restexam.domain.UploadInfo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class FileController {
    @GetMapping("/download")
    public void downloadFile(HttpServletResponse response){
        Path filepath = Paths.get("/Users/jeonhyeonjin/Desktop/__run/file/cat.jpg");
        response.setContentType("image/jpeg");
        try{
            InputStream inputStream = Files.newInputStream(filepath);
            StreamUtils.copy(inputStream,response.getOutputStream());
            response.flushBuffer();
        }catch(IOException e){
            e.getStackTrace();
        }
    }
    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(
            @RequestParam("file") MultipartFile file,
            @RequestPart("info") UploadInfo uploadInfo
    ) {
        String message = "";

        System.out.println(file.getOriginalFilename() + "=============================");
        System.out.println(uploadInfo.getDescription() + "=============================");
        System.out.println(uploadInfo.getTag() + "=============================");

        try {
            InputStream inputStream = file.getInputStream();
            StreamUtils.copy(inputStream,
                    new FileOutputStream("/Users/jeonhyeonjin/Desktop/__run/file/" + file.getOriginalFilename()));

            message = "You successfully uploaded " + file.getOriginalFilename() + "!";
            return ResponseEntity.ok().body(message);
        } catch (IOException e) {
            message = "FAIL to upload " + file.getOriginalFilename() + "!";
            return ResponseEntity.badRequest().body(message);
        }
    }
}
