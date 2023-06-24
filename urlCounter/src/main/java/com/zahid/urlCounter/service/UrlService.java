package com.zahid.urlCounter.service;

import com.zahid.urlCounter.model.Visitor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {

    static Map<String,Integer> map=new HashMap<>();
    public Visitor getVisits(String username) { // business logic

        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);

        Visitor visitor = new Visitor(username,count);
        return visitor;
    }
}
