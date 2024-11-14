package com.murat.customerinfo.service;


import com.murat.customerinfo.model.Log;
import com.murat.customerinfo.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public Log save(Log log){
        return logRepository.save(log);
    }

    public List<Log> findAll(){
        return logRepository.findAll();
    }

}
