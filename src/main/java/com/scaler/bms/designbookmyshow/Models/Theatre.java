package com.scaler.bms.designbookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String TheatreName;
    private String TheatreAddress;
    private long TheatrePincode;
    @OneToMany
    private List<Screen> Screens= new ArrayList<>();
    @OneToMany
    private List<Show> Shows= new ArrayList<>();
}
