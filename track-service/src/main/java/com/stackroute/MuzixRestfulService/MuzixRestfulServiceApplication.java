package com.stackroute.MuzixRestfulService;

import com.stackroute.MuzixRestfulService.domain.Track;
import com.stackroute.MuzixRestfulService.repository.TrackRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class MuzixRestfulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzixRestfulServiceApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner demoData(TrackRepository trackRepo) {

		Track track = new Track(5,"Photograph","Ed Sheeran");
		Track track1 = new Track(7,"Shape of You","Ed Sheeran");

		return args -> {
			trackRepo.save(track);
			trackRepo.save(track1);
		};
	}*/

}

//@RefreshScope
//@RestController
//class MessageRestController {
////
////		@Value("${msg:Hello world - Config Server is not working..pelase check}")
////		private String msg;
//
//	@RequestMapping
//	String getMsg() {
//		String msg;
//		msg = "stackroute";
//		return msg;
//
//	}
//}

