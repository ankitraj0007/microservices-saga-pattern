package com.learnwithankit.stock.ms.repository;

import com.learnwithankit.stock.ms.entity.WareHouse;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<WareHouse, Long> {

	Iterable<WareHouse> findByItem(String item);
}
