package com.spring.rest.consumer.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.consumer.app.entity.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record,Integer>{


}
