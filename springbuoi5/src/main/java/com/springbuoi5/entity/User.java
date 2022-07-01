package com.springbuoi5.entity;

import com.springbuoi5.validation.Birthday;
import com.springbuoi5.validation.Email;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username")
    @Size(min = 5 , message = "Username is at least 5 characters!")
    private String username;

    @Column(name = "email")
    @NotBlank(message = "Please enter the email!")
    @Email
    private String email;

    @Column(name = "birthday")
    @NotBlank(message = "Please enter the birthday!")
    @Birthday
    private String birthday;

    public User(Long id, String username, String email, Date birthday) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").format(birthday);
    }

    public User() {
    }
}
