package com.clouddev.api.taskmanager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class TaskManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }
    @GetMapping("/api/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Developer") String name) {
        return String.format("Hello %s! Welcome to the Task Manager API.", name);
    }
    @GetMapping("/api/status")
    public String status() {
        return "Task Manager API is running successfully!";
    }
}