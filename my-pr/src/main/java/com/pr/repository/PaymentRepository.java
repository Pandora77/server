package com.pr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pr.entity.PaymentEntity;


@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>{

}
