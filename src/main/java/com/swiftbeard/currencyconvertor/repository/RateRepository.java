package com.swiftbeard.currencyconvertor.repository;

import com.swiftbeard.currencyconvertor.domain.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RateRepository extends JpaRepository<Rate, String> {
    List<Rate> findByDate(Date date);
    Rate findByDateAndCode(Date date, String code);
}
