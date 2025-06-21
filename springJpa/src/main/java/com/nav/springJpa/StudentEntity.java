package com.nav.springJpa;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.domain.Persistable;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity implements Persistable { //Stundet_En

    @Id
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

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
