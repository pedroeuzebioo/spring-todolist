package br.com.pedrohenrique.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

// @Getter vai colocar somente os getters
// @Setter vai colocar somente os setters
// @Data vai colocar os dois

@Data
@Entity(name = "tb_users")
public class UserModel {

  // UUID é um identificador mais seguro que o de auto icrementação.
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  // @Column(name="algo") vai colocar na tabela o nome que está entre as aspas
  @Column(unique = true)
  private String username;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
