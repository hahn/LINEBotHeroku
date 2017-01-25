
package com.linecorp.example.moviesdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app)
    {
        return app.sources(Application.class);
    }

    public static void main(String [] args)
    {
        SpringApplication.run(Application.class, args);
        SpringApplication.run(Config.class, args);
        SpringApplication.run(LineBotController.class, args);

    }
};
