package ma.enset.walletservice;

import ma.enset.walletservice.entities.Client;
import ma.enset.walletservice.entities.Wallet;
import ma.enset.walletservice.repositories.ClientRepository;
import ma.enset.walletservice.repositories.WalletRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(
			ClientRepository clientRepository,
			WalletRepositories walletRepositories
	){
		return args -> {
			Client c=new Client(null,"yassine","yassine@gmail.com",null);
			clientRepository.save(c);
			Wallet w=new Wallet(null,12,new Date(),"D1",c);
			walletRepositories.save(w);
			Wallet w2=new Wallet(null,24,new Date(),"D2",c);
			walletRepositories.save(w2);
			Collection<Wallet> wallets=new ArrayList<>();
			wallets.add(w);
			wallets.add(w2);
			clientRepository.save(c);
		};
	}
}
