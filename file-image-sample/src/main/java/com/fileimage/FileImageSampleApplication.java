package com.fileimage;
/*
 * https://pangsblog.tistory.com/71 참고
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileUploadProperties.class})
public class FileImageSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileImageSampleApplication.class, args);
	}

}
