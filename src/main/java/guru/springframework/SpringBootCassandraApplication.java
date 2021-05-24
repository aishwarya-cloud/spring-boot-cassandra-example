package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("guru.springframework")
public class SpringBootCassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraApplication.class, args);
	}
}
