package ma.enset.walletservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Wallet {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private double solde;
    private Date createdAt;
    private String devise;
    @ManyToOne
    private Client client;


}
