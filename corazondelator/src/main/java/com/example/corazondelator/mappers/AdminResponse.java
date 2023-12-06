package com.example.corazondelator.mappers;

import com.example.corazondelator.models.User.Genre;
import com.example.corazondelator.models.User.Position;
import lombok.Data;

@Data
public class AdminResponse {
    private String name;
    private String password;
    private String user;
    private Genre genre;
    private Position position;
}
