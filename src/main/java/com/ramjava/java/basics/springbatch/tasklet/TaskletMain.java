package com.ramjava.java.basics.springbatch.tasklet;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan("com.ramjava.java.basics.springbatch.tasklet")
public class TaskletMain {
    public static void main(String[] args) {
        SpringApplication.run(TaskletMain.class);
    }
}
