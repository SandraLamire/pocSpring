package fr.eni.ecole.pocSpring;

import fr.eni.ecole.pocSpring.service.BonjourService;
import fr.eni.ecole.pocSpring.service.CoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocSpringApplication implements CommandLineRunner {

	// Injection de dépendances par autowired
	// @Autowired
	// Appelle le bonjourServiceImpl qui affiche le texte en rouge
	// @Qualifier("rouge")
	// public BonjourService service;

	// @Autowired
	// @Qualifier("lower")
	// public CoderService coderServiceL;

	// @Autowired
	// @Qualifier("upper")
	// public CoderService coderServiceU;

	// @Autowired
	// @Qualifier("revert")
	// public CoderService coderServiceR;

	private final CoderService coderServiceL;
	private final CoderService coderServiceU;
	private final CoderService coderServiceR;

	//	OU Constructeur au lieu de @Autowired
	public PocSpringApplication(@Qualifier("lower") CoderService coderServiceL, @Qualifier("upper") CoderService coderServiceU, @Qualifier("revert") CoderService coderServiceR) {
		this.coderServiceL = coderServiceL;
		this.coderServiceU = coderServiceU;
		this.coderServiceR = coderServiceR;
	}


	public static void main(String[] args) {
		SpringApplication.run(PocSpringApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
	// service.disBonjour();

	String message = "Bonjour";
	coderServiceL.afficheString(message);
	coderServiceU.afficheString(message);
	coderServiceR.afficheString(message);
	}
}
