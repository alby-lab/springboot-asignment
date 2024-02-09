package com.agridence.microservice.Assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.agridence.microservice.Assignment.entity.PersonalNote;

public interface PersonalNoteRepository extends JpaRepository<PersonalNote, Integer>{

	@Modifying 
    @Query(value = "SELECT *FROM personalnote WHERE userId = :userId",nativeQuery = true)
	List<PersonalNote> findAllByUserId(int userId);
	@Modifying 
    @Query(value = "DELETE FROM personalnote WHERE noteTitile = :noteTitile",nativeQuery = true)
	void deleteByNoteTitle(String noteTitile);

}
