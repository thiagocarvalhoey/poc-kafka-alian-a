package com.emp.demo;

import com.alianca.intercab.emp.quotation.IntercabQuotationV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    private String topicName;


    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;


   public void send(IntercabQuotationV2 message) {
     //topicName = "ANL.intercab.transactionreturn.topic.internal.any.v1";
       topicName = "ANL.intercab.quotation.topic.internal.any.v2";
       //ProducerRecord rec = new ProducerRecord(topicName,message.toString());

       kafkaTemplate.send( topicName,"1",message.toString());


    }

}

