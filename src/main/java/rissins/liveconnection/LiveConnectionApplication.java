package rissins.liveconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class LiveConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveConnectionApplication.class, args);
	}

}
