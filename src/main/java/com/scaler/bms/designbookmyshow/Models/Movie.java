package com.scaler.bms.designbookmyshow.Models;

import com.scaler.bms.bookmyshow.Enums.Features;
import com.scaler.bms.bookmyshow.Enums.Genre;
import com.scaler.bms.bookmyshow.Enums.LanguageType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String MovieName;
    @ElementCollection
    @Enumerated
    private List<Features> MovieFeature= new ArrayList<>();
    private String MovieDuration;
    private Double Rating;
    @ElementCollection
    @Enumerated
    private List<Genre> MovieGenre= new ArrayList<>();
    @ElementCollection
    @Enumerated
    private List<LanguageType> MovieLanguage= new ArrayList<>();
}
