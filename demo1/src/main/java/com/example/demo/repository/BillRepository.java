package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Offer;

public interface BillRepository extends JpaRepository<Bill,Long> {
	
	


}
