package hu.picicom.h2demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.picicom.h2demo.entity.FileInfo;
import hu.picicom.h2demo.services.FileInfoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FileInfoController {
	
	private final FileInfoService fileInfoService;

	@PostMapping()
	public long addFile(@RequestParam("name") String fileName, @RequestParam("desc") String desc) {
		return fileInfoService.addFile(fileName, desc);
	}
	
	
	@GetMapping("/all")
	public List<FileInfo> getAllFiles(){
		return fileInfoService.getAllFiles(); 
	}
	
	
}
