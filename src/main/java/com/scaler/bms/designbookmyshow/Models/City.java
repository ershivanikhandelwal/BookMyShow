package com.scaler.bms.designbookmyshow.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel{
    private String CityName;
    @OneToMany
    private List<Theatre> Theatres= new ArrayList<>();
}
