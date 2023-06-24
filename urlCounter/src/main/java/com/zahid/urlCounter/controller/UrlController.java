package com.zahid.urlCounter.controller;

import com.zahid.urlCounter.model.Visitor;
import com.zahid.urlCounter.service.UrlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitors-count")
public class UrlController {

    //@Autowired
    private UrlService urlService; // dependency injection

    public UrlController(UrlService urlService) {
        this.urlService=urlService;
    }

    @GetMapping("/username/{username}/count")
    public Visitor getCount(@PathVariable String username) {
        Visitor visitor = urlService.getVisits(username);
        return visitor;
    }

}
