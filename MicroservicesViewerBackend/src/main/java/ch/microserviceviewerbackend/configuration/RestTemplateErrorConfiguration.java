package ch.microserviceviewerbackend.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

@Component
public class RestTemplateErrorConfiguration implements ResponseErrorHandler {

    private static final Logger LOGGER = LogManager.getLogger(RestTemplateErrorConfiguration.class);

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        HttpStatus.Series result = clientHttpResponse.getStatusCode().series();
        return result == HttpStatus.Series.CLIENT_ERROR || result == HttpStatus.Series.SERVER_ERROR;
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
        if(clientHttpResponse.getStatusCode().is4xxClientError()) {
            LOGGER.error("A Client-Exception occurred. The HTTP-Status Code is {}.", clientHttpResponse.getRawStatusCode());
            throw new HttpClientErrorException(clientHttpResponse.getStatusCode());
        } else if (clientHttpResponse.getStatusCode().is5xxServerError()){
            LOGGER.error("A Server-Exception occurred. The HTTP-Status Code is {}.", clientHttpResponse.getRawStatusCode());
            throw new HttpServerErrorException(clientHttpResponse.getStatusCode());
        }
    }
}
