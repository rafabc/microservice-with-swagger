package com.micro.tecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServiceTecApp {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceTecApp.class, args);
	}



	/*
    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("tec-api")
                .apiInfo(apiInfo())
                .select()
                .paths(tecStorePaths())
                .build()
                .securitySchemes(newArrayList(oauth()))
                .securityContexts(newArrayList(securityContext()));
    }
    
    @Bean
    SecurityScheme oauth() {
        return new OAuthBuilder()
                .name("petstore_auth")
                .grantTypes(grantTypes())
                .scopes(scopes())
                .build();
    }

    @Bean
    SecurityScheme apiKey() {
        return new ApiKey("api_key", "api_key", "header");
    }
    
    @Bean
    SecurityContext securityContext() {
        AuthorizationScope readScope = new AuthorizationScope("read:tecs", "read your tec");
        AuthorizationScope[] scopes = new AuthorizationScope[1];
        scopes[0] = readScope;
        SecurityReference securityReference = SecurityReference.builder()
                .reference("tec_auth")
                .scopes(scopes)
                .build();

        return SecurityContext.builder()
                .securityReferences(newArrayList(securityReference))
                .forPaths(ant("/api/tec.*"))
                .build();
    }
    
    private Predicate<String> petstorePaths() {
        return or(
                regex("/tec/*"),
                regex("/tecs/*")
        );
    }
    
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Technologies API")
                .description("Technologies API's commented with Swagger")
                .termsOfServiceUrl("http://springfox.io")
                .contact("springfox")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("2.0")
                .build();
    }
    
    */
}
