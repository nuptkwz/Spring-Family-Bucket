package com.example.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 * Date 2021/1/22 0:02
 * Created by kwz
 */
@Component
@ConfigurationProperties(prefix = "score.subject")
@Data
public class ScoreConfig {
    private Map<String, String> scores = new HashMap<>();
}
