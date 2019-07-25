package com.polpid.polpiduserservice.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ServiceProperties {

    @Value("${application.name}")
    private String name;


}
