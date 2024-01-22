package com.organise.DailyTasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BackendController {

    @GetMapping("/status")
    public String getBackendStatus() {
        return "{\"message\":\"Backend is connected!\"}";
    }
}
