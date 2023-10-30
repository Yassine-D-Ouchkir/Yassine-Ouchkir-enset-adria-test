package ma.enset.walletservice.repositories;

import ma.enset.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepositories extends JpaRepository<Wallet,String> {
}
