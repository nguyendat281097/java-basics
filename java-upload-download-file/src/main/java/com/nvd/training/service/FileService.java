package com.nvd.training.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import com.nvd.training.entity.File;

public interface FileService {
	File store(MultipartFile file) throws IOException;

    Stream<File> getAllFiles();
}
