package com.murat.customerinfo.controller;

import com.murat.customerinfo.model.Log;
import com.murat.customerinfo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LogRecordQueryController {

    private final LogService logService;

    public LogRecordQueryController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/log/list")
    public ResponseEntity<?> list() {
        List<Log> response = logService.findAll();
        return new ResponseEntity<List<Log>>( response, HttpStatus.OK );
    }

}
