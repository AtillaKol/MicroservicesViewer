package ch.microserviceviewerbackend.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

@Component
public class RestTemplateErrorConfiguration implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        HttpStatus.Series result = clientHttpResponse.getStatusCode().series();
        return result == HttpStatus.Series.CLIENT_ERROR || result == HttpStatus.Series.SERVER_ERROR;
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {

    }
}
