package com.project.mycar_rental_system.repository;

import com.project.mycar_rental_system.dto.BookACarDto;
import com.project.mycar_rental_system.entity.BookACar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookACarRepository extends JpaRepository<BookACar, Long> {
    List<BookACar> findAllByUserId(Long userId);
}
