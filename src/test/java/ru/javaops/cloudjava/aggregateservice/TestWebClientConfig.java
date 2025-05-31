package ru.javaops.cloudjava.aggregateservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import ru.javaops.cloudjava.aggregateservice.config.props.ExternalServiceProps;

@TestConfiguration
public class TestWebClientConfig {

    @Autowired
    private ExternalServiceProps props;

    @Bean
    public WebClient menuWebClient(WebClient.Builder builder) {
        return builder.baseUrl(props.getMenuServiceUrl()).build();
    }

    @Bean
    public WebClient reviewsWebClient(WebClient.Builder builder) {
        return builder.baseUrl(props.getReviewServiceUrl()).build();
    }
}
