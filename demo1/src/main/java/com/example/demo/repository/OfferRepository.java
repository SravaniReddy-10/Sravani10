package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Offer;
import com.example.demo.entity.Operator;

public interface OfferRepository extends JpaRepository <Offer,Integer>{
	
	List<Offer> findByOperator(Integer oId);

}
