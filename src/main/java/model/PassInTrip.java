package model;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "pass_in_trip")
public class PassInTrip implements Serializable {

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "place", nullable = false, length = 50)
    private String place;

    @Id
    @Column(name = "id_psg", nullable = false)
    private Long psgId;

    @Id
    @Column(name = "id_trip", nullable = false)
    private Long tripId;


    public PassInTrip() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getPsgId() {
        return psgId;
    }

    public void setPsgId(Long psgId) {
        this.psgId = psgId;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassInTrip that = (PassInTrip) o;
        return Objects.equals(date, that.date) && Objects.equals(place, that.place) && Objects.equals(psgId, that.psgId) && Objects.equals(tripId, that.tripId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, place, psgId, tripId);
    }

    @Override
    public String toString() {
        return "PassInTrip{" +
                "date=" + date +
                ", place='" + place + '\'' +
                ", psgId=" + psgId +
                ", tripId=" + tripId +
                '}';
    }
}
