package com.example.library.controller;

import com.example.library.entity.BorrowRecord;
import com.example.library.service.BorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/borrow")
public class BorrowRecordController {

    @Autowired
    private BorrowRecordService borrowRecordService;

    @GetMapping
    public List<BorrowRecord> getAllRecords() {
        return borrowRecordService.getAllBorrowRecords();
    }

    @GetMapping("/reader/{username}")
    public List<BorrowRecord> getByUsername(@PathVariable String username) {
        return borrowRecordService.getByUsername(username);
    }

    @GetMapping("/unreturned")
    public List<BorrowRecord> getUnreturned() {
        return borrowRecordService.getUnreturnedBooks();
    }

    @PostMapping
    public BorrowRecord borrowBook(@RequestBody BorrowRecord record) {
        return borrowRecordService.saveBorrowRecord(record);
    }

    @PutMapping("/return/{recordId}")
    public void returnBook(@PathVariable Long recordId) {
        borrowRecordService.returnBook(recordId);
    }
}
