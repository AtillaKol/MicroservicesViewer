package ch.microservicesviewer.microservicesviewerbackend.configuration.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Instant;
import java.util.UUID;

/**
 * Grundsaetzlich fuer das Loggin bei den HTTP-Anfragen auf das Backend.
 */
public class WebInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LogManager.getLogger(WebInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if(ignoreSomeEndpoints(request.getRequestURI())) {
            request.setAttribute("uuid", UUID.randomUUID().toString());
            request.setAttribute("startTime", Instant.now().toEpochMilli());
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if(ignoreSomeEndpoints(request.getRequestURI())) {
            String uuid = (String) request.getAttribute("uuid");
            long startTime = (long) request.getAttribute("startTime");
            LOGGER.info("Request ({}) took {} ms. Request to {}", uuid, (Instant.now().toEpochMilli() - startTime), request.getRequestURI());
        }
    }

    private boolean ignoreSomeEndpoints(String url) {
        if(url.endsWith("/error")) return false;
        return true;
    }

}
