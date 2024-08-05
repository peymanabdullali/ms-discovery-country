package com.example.discovery_country.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "activities")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ActivityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    double price;

    Long viewed;
    Long likeCount;
    Double averageRating;

    String mapUrl;
    @Column(nullable = false)
    double latitude;
    @Column(nullable = false)
    double longitude;
    @Column(columnDefinition = "TEXT")
    String description;
    boolean deleted;
    @Column(nullable = false)
    LocalDateTime startDate;

    @Column(nullable = false)
    LocalDateTime endDate;

    @Column(nullable = false)
    LocalDateTime registrationDeadline;

    @Column(nullable = false)
    String contact;

    @Column(columnDefinition = "TEXT")
    String requirements;

    @Column(nullable = false)
    Integer numberOfPeople;

//    @ManyToOne
//    @JoinColumn(nullable = false)
//    ImageEntity image;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "activity_id", referencedColumnName = "id")
//    ActivityCategoryEntity activityCategory;

    @OneToMany(mappedBy = "activity" ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<ImageEntity> images;
  
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)

    @JoinColumn
    ActivityCategoryEntity activityCategory;

}