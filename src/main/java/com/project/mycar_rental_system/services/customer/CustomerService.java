package com.project.mycar_rental_system.services.customer;

import com.project.mycar_rental_system.dto.BookACarDto;
import com.project.mycar_rental_system.dto.CarDto;
import com.project.mycar_rental_system.entity.BookACar;

import java.util.List;

public interface CustomerService {


    List<CarDto> getAllCars();

    boolean bookACar(Long carId,BookACarDto bookACarDto);

    CarDto getCarById(Long carId);

    List<BookACarDto> getBookingsByUserId(Long userId);
}
