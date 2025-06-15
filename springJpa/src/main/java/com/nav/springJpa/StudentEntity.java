package com.nav.springJpa;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stundet")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity { //Stundet_En

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
    @Column(name = "First_Name")
    String firstName;
    String lastName;
    String middleName;
    String address;

    @Enumerated(EnumType.STRING)
    StudentType studentType;

    @Transient
    public String fullName;

    public String getFullName() {
        return this.firstName +" "+this.middleName +" "+this.lastName;
    }

}
