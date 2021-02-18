package com.ex.springbootuploadfiles;

import com.ex.springbootuploadfiles.service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringBootUploadFilesApplication implements CommandLineRunner {

	@Resource
	FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadFilesApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}
