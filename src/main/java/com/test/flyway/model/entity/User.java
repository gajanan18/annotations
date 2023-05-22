package com.test.flyway.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "users")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String mobile;
    private String land_line;
}
