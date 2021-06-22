package hu.picicom.h2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.picicom.h2demo.entity.FileInfo;

public interface FileInfoDao  extends JpaRepository<FileInfo, Long>{
	
	
	

}
