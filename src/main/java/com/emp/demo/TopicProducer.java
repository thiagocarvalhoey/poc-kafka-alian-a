package com.emp.demo;

import com.alianca.intercab.emp.quotation.IntercabQuotation;
import com.alianca.intercab.emp.quotation.IntercabQuotationV2;
import com.alianca.intercab.emp.quotation.KeySchema;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.SendResult;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import scala.App;

import javax.annotation.processing.Processor;
import java.util.Properties;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    private String topicName;


    @Autowired
    private final KafkaTemplate<String, IntercabQuotationV2> kafkaTemplate;
    @Autowired
    private KafkaTemplate<String, IntercabQuotationV2> kafkaTemplate2;
   public void send(IntercabQuotationV2 message) {
     //topicName = "ANL.intercab.transactionreturn.topic.internal.any.v1";
       topicName = "ANL.intercab.quotation.topic.internal.any.v2";


       Message<IntercabQuotationV2> messagePay = MessageBuilder
               .withPayload(message)
               .setHeader(KafkaHeaders.TOPIC, topicName)
               .build();

       //kafkaTemplate.send(message);
        kafkaTemplate.send( topicName,"1",message);


    }

}

