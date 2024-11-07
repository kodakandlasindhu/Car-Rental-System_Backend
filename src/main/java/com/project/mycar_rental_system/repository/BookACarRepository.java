package com.project.mycar_rental_system.repository;

import com.project.mycar_rental_system.entity.BookACar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookACarRepository extends JpaRepository<BookACar, Long> {
}
