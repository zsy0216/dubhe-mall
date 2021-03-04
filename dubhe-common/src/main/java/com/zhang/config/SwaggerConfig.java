package com.zhang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: zhangshuaiyin
 * @date: 2021/3/4 14:26
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * DocumentationType.SWAGGER_2 固定的，代表swagger2
     * .groupName("name") // 如果配置多个文档的时候，那么需要配置groupName来分组标识
     * .apiInfo(apiInfo()) // 用于生成API信息
     * .select() // select()函数返回一个ApiSelectorBuilder实例,用来控制接口被swagger做成文档
     * .apis(RequestHandlerSelectors.basePackage("c.z.controller"))  // 用于指定扫描哪个包下的接口
     * .paths(PathSelectors.any())// 选择所有的API,如果你想只为部分API生成文档，可以配置这里
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhang.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 用于定义API主界面的信息，比如可以声明所有的API的总标题、描述、版本
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Dubhe-Mall")
                .description("天枢商城API文档管理")
                .termsOfServiceUrl("127.0.0.1")
                .version("1.0")
                .build();
    }
}
