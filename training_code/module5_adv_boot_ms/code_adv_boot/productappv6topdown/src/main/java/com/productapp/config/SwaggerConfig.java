package com.productapp.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
//@OpenAPIDefinition(info =
//   @Info(title = "Product API",
//           version = "1.2.0" ,
//           description = "SunLife ProductApp API"))
@OpenAPIDefinition(
        info = @Info(
                title = "Product API",
                description = "SunLife ProductApp API",
                version = "v1",
                contact = @Contact(
                        name = "sunlife@firefighter.com",
                        email = "firefighter@sunlife.com",
                        url = "http://localhost:8090"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.sunlife.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "pls try the doc for more details",
                url = "https://www.sunlife.com/swagger-ui.html"
        )
)
public class SwaggerConfig {
}
