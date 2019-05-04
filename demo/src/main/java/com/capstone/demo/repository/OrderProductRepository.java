package com.capstone.demo.repository;

import com.capstone.demo.model.OrderProduct;
import com.capstone.demo.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
