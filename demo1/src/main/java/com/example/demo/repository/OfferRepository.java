package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Offer;
import com.example.demo.entity.Operator;

public interface OfferRepository extends JpaRepository <Offer,Integer>{
	
	
	@Query(value = "select * from plan o where o.operator_operator_id =:operatorId",nativeQuery = true)
	List<Offer> findByOperator(@Param("operatorId") int operator);
	
	
	@Query(value = "select * from plan o where o.plan_id =:planId",nativeQuery = true)
	List<Offer> findByPlanId(@Param("planId") int plan);
	
	


}
