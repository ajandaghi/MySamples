package com.example.spring_boot.jms;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Kafka {

    public static void main(String[] args) {
        String topic="my_first";

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "http://127.0.0.1" + ":" + "9092");
        properties.put("client.id", "DemoProducer");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer producer = new KafkaProducer<>(properties);
        producer.send(new ProducerRecord<String, String>(topic, "key", "message"));
    }
    }


