package hu.picicom.h2demo.services;

import java.util.List;

import hu.picicom.h2demo.entity.FileInfo;

public interface FileInfoService {

	public long addFile(String fileName, String desc);
	
	
	public List<FileInfo> getAllFiles();
	
	
}
