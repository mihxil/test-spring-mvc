package org.meeuw.test;


import org.meeuw.test.domain.a.A;
import org.meeuw.test.domain.b.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class Jaxb2Configurer {

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        Map<String, Object> properties = new HashMap<>();


        marshaller.setMarshallerProperties(properties);
        marshaller.setContextPaths(
            A.class.getPackage().getName(),
            B.class.getPackage().getName()
        );
        return marshaller;
    }

    @Bean
    public MarshallingHttpMessageConverter marshaller(Jaxb2Marshaller marshaller) {
        return new MarshallingHttpMessageConverter(marshaller);
    }


}
