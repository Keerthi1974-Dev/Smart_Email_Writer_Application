package com.example.writer;

import com.example.writer.app.EmailGenaratorService;
import com.example.writer.app.EmailRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailGenaratorController {

    private final EmailGenaratorService emailGenaratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> genarateEmail(@RequestBody EmailRequest emailRequest) {
        String response = emailGenaratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
