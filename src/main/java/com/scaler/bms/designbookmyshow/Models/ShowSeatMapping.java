package com.scaler.bms.designbookmyshow.Models;

import com.scaler.bms.bookmyshow.Enums.SeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "showseatmapping")
public class ShowSeatMapping extends BaseModel{
    @ManyToOne
    private Show ShowDetail;
    @ManyToOne
    private Seat SeatDetail;
    @Enumerated
    private SeatStatus Status;
}
