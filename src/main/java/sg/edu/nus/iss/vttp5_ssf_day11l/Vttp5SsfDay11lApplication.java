package sg.edu.nus.iss.vttp5_ssf_day11l;

import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;

@SpringBootApplication
public class Vttp5SsfDay11lApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Vttp5SsfDay11lApplication.class);

		String port = "8081";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port")){
			port = cliOpts.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));

		app.run(args);
	}

}
