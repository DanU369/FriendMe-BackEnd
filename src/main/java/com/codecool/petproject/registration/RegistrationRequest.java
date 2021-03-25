package com.codecool.petproject.registration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;
    private final String password;


    @JsonCreator
    public RegistrationRequest(@JsonProperty("firstName")String firstName,@JsonProperty("lastName") String lastName, @JsonProperty("username")String username,@JsonProperty("email") String email,@JsonProperty("password") String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
