package org.meeuw.test.servlet;


import jakarta.xml.bind.Marshaller;
import org.meeuw.test.domain.a.A;
import org.meeuw.test.domain.b.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import java.util.Map;


@Configuration
@Component
public class Jaxb2Configurer {

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setMarshallerProperties(Map.of(
            jakarta.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true,
            jakarta.xml.bind.Marshaller.JAXB_FRAGMENT, true,
            Marshaller.JAXB_SCHEMA_LOCATION, "http://www.example.com/a.xsd"

        ));
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
