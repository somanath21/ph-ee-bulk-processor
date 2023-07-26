package org.mifos.processor.bulk.config;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "payment-mode")
@Setter
@Getter
public class PaymentModeConfiguration {

    private List<PaymentModeMapping> mappings = new ArrayList<>();

    public PaymentModeMapping getByMode(String paymentMode) {
        return getMappings().stream().filter(p -> p.getId().equalsIgnoreCase(paymentMode)).findFirst().orElse(null);
    }

}
