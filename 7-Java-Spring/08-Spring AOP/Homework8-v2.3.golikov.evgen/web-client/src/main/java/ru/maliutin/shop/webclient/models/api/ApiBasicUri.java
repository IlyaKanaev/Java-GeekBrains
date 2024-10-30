package ru.maliutin.shop.webclient.models.api;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Data
@Component
@ConfigurationProperties("api")
public class ApiBasicUri {

    private Map<String, String> basicUri = new HashMap<>();

    public String getPaymentUri(){
        return basicUri.get("payment");
    }

    public String getStorageUri(){
        return basicUri.get("storage");
    }
}
