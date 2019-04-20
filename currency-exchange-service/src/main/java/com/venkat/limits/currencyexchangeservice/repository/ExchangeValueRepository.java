package com.venkat.limits.currencyexchangeservice.repository;

import com.venkat.limits.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
