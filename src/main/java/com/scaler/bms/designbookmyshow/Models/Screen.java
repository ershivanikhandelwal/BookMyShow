package com.scaler.bms.designbookmyshow.Models;

import com.scaler.bms.bookmyshow.Enums.Features;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Screen extends BaseModel{
    @OneToMany
    private List<Seat> Seats = new ArrayList<>();
    @ElementCollection
    @Enumerated
    private List<Features> Feature= new ArrayList<>();
}
