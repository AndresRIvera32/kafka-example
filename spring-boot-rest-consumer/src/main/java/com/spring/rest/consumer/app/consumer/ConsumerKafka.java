package com.spring.rest.consumer.app.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.spring.rest.consumer.app.dao.RecordRepository;
import com.spring.rest.consumer.app.entity.Record;

public class ConsumerKafka {
	
	@Autowired
	RecordRepository dao;
	
	 @KafkaListener(id = "consumer", topics = {"${kafka.topic}"} )
	 public void onMessage(ConsumerRecord<?, ?> record) {
		 
		 System.out.println("Read Record is : " + record.value());
		 Record r = new Record();
		 r.setMensaje((String)record.value());
		 dao.save(r);
		 //ver base de datos h2
		 //http://localhost:8080/h2-console/
		 
	 }

}
