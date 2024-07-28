package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class RestApiBook {

    @GetMapping("/")
    public ResponseEntity<String> listBook(@RequestParam String message) {
        return ResponseEntity.ok(message);
    }
}
