package com.emp.demo;

import com.alianca.intercab.emp.quotation.AssociatedProductInstancesAVRO;
import com.alianca.intercab.emp.quotation.AssociatedProductsAVRO;
import com.alianca.intercab.emp.quotation.IntercabQuotation;
import com.alianca.intercab.emp.quotation.IntercabQuotationV2;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final TopicProducer topicProducer;
    @GetMapping(value = "/send")
    public void send(){
        List<AssociatedProductsAVRO> listAssociatedProductsAVRO = new ArrayList<>();
        List<AssociatedProductInstancesAVRO> listAssociatedProductInstancesAVRO = new ArrayList<>();
        AssociatedProductsAVRO associatedProductsAVRO= AssociatedProductsAVRO.newBuilder()
                .setProductId(1)
                .setQuotationId(1)
                .build();
        listAssociatedProductsAVRO.add(associatedProductsAVRO);

        AssociatedProductInstancesAVRO associatedProductInstancesAVRO = AssociatedProductInstancesAVRO.newBuilder()
                .setInstancesId(1)
                .setQuotationProductId(1)
                .build();
        listAssociatedProductInstancesAVRO.add(associatedProductInstancesAVRO);

        IntercabQuotationV2 avro = IntercabQuotationV2.newBuilder()
                .setQuotationId(1)
                .setClientName("teste KLAUSSS")
                .setStatusQuotation("Teste StatusQuotation")
                .setPortOfLoad("Teste PortOfLoad")
                .setPortOfDischarge("Teste PortOfDischarge")
                .setPortOfTransshipment("Teste PortOfTransshipment")
                .setSize("Teste Size")
                .setEquipmentType("Teste EquipmentType")
                .setOwnership("Teste Ownership")
                .setRateCurrency("Teste RateCurrency")
                .setAction("Teste Action")
                .setQuotationDateFrom(new org.joda.time.LocalDate())
                .setCustomerType("Teste CustomerType")
                .setAssociatedProducts(listAssociatedProductsAVRO)
                .setAssociatedProductInstances(listAssociatedProductInstancesAVRO)
                .build();

        topicProducer.send(avro);
    }
}