package com.scaler.bms.designbookmyshow.Models;

import com.scaler.bms.bookmyshow.Enums.Features;
import com.scaler.bms.bookmyshow.Enums.LanguageType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "shows")
public class Show extends BaseModel{
    @ManyToOne
    private Movie MovieDetails;
    private LocalDateTime ShowDateTime;
    private String ShowDuration;
    @ManyToOne
    private Screen ScreenDetails;
    @ElementCollection
    @Enumerated
    private List<Features> ShowFeatures= new ArrayList<>();
    @OneToMany
    private List<ShowSeatMapping> ShowSeat= new ArrayList<>();
}
