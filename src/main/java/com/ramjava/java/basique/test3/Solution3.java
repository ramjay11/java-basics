//package com.ramjava.java.basique.test3;
//
//import org.apache.logging.log4j.message.Message;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//@SpringBootApplication
//public class Solution3 {
//
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//
//        MessageRepository messageRepository = context.getBean(MessageRepository.class);
//        AuditService auditService = context.getBean(AuditService.class);
//        NotificationService notificationService = context.getBean(NotificationService.class);
//        AlertRepository alertRepository = context.getBean(AlertRepository.class);
//        LogRepository logRepository = context.getBean(LogRepository.class);
//
//        MessageService messageService = new MessageService(messageRepository, auditService, notificationService);
//        MonitoringService monitoringService = new MonitoringService(alertRepository, logRepository, auditService);
//
//        // Creating sample messages
//        List<Message> messages = new ArrayList<>();
//        messages.add(new Message(UUID.randomUUID(), "Author 1", "Title 1", "Content 1"));
//        messages.add(new Message(UUID.randomUUID(), "Author 2", "Title 2", "Content 2"));
//
//        // Testing MessageService.sendAll
//        try {
//            messageService.sendAll(messages);
//        } catch (NotificationException e) {
//            System.out.println("NotificationException occurred: " + e.getMessage());
//        }
//
//        // Testing MessageService.send
//        Message message = new Message(UUID.randomUUID(), "Author 3", "Title 3", "Content 3");
//        try {
//            messageService.send(message);
//        } catch (AuditException e) {
//            System.out.println("AuditException occurred: " + e.getMessage());
//        }
//
//        // Testing MonitoringService.alert
//        Alert alert = new Alert(UUID.randomUUID(), "Alert Author", "Alert Title");
//        monitoringService.alert(alert);
//
//        // Testing MonitoringService.log
//        Log log = new Log(UUID.randomUUID(), "Log Title", "Log Content");
//        try {
//            monitoringService.log(log);
//        } catch (IllegalTransactionStateException e) {
//            System.out.println("IllegalTransactionStateException occurred: " + e.getMessage());
//        }
//
//        // Close the context
//        context.close();
//    }
//}
//
//
//
//
//public class MessageService {
//    private final MessageRepository messageRepository;
//    private final AuditService auditService;
//    private final NotificationService notificationService;
//
//    public MessageService(MessageRepository messageRepository) {
//        this.messageRepository = messageRepository;
//    }
//}
//
//class MessageRepository {
//    public void save(Message message) {
//        /**...*/
//    }
//}
//
//class AlertRepository {
//    public void save(Message message) {
//        /**...*/
//    }
//}
//
//class LogRepository {
//    public void save(Message message) {
//        /**...*/
//    }
//}
//
//
