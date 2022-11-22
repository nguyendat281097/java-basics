package com.nvd.training.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.nvd.training.entity.File;
import com.nvd.training.repository.FileRepository;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	private FileRepository fileRepository;

	@Override
	public File store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		File image = new File(fileName, file.getContentType(), file.getBytes());

		return fileRepository.save(image);
	}

	@Override
	public Stream<File> getAllFiles() {
		return fileRepository.findAll().stream();
	}
}