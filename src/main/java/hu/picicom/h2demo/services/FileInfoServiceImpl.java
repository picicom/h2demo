package hu.picicom.h2demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hu.picicom.h2demo.entity.FileInfo;
import hu.picicom.h2demo.repository.FileInfoDao;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FileInfoServiceImpl implements FileInfoService {

	private final FileInfoDao fileInfoDao;
	
	@Override
	public long addFile(String fileName, String desc) {
		
		FileInfo fileInfo = new FileInfo();
		fileInfo.setName(fileName);
		fileInfo.setDescription(desc);
		FileInfo saved = fileInfoDao.save(fileInfo);
		return saved.getId();
	}

	@Override
	public List<FileInfo> getAllFiles() {
		return fileInfoDao.findAll();
	}

}
