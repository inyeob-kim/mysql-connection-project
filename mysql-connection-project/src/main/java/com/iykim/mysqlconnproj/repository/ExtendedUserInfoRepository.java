package com.iykim.mysqlconnproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iykim.mysqlconnproj.entity.ExtendedUserInfoEntity;

@Repository
public interface ExtendedUserInfoRepository extends JpaRepository<ExtendedUserInfoEntity, Long>{
	
	ExtendedUserInfoEntity findBySsn(String ssn); 

}
