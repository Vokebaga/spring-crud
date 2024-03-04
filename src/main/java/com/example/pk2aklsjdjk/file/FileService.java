package com.example.pk2aklsjdjk.file;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


public interface FileService {
    List<FileEntity> getAllFiles();

    void uploadFile(MultipartFile file, int region, String youtubeLink, String date, int numAssignments) throws IOException;

    void deleteFile(Long id);

    Optional<FileEntity> getFileById(Long id);

    void downloadFile(Long id, HttpServletResponse response) throws IOException;

    void updateFile(Long id, int region, String youtubeLink, String date, int numAssignments);

}