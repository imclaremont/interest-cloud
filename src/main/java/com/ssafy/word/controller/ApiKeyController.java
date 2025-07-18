package com.ssafy.word.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiKeyController {

    @Value("${openai.api.key}")
    private String openaiApiKey;

    @GetMapping("/api/keys")
    public Map<String, String> getApiKeys() {
        Map<String, String> keys = new HashMap<>();
        keys.put("openaiApiKey", openaiApiKey);
        return keys;
    }
}
