package tn.esprit.job.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "nameCategory")
    private String nameCategory;

    @Column(name = "descriptionCategory")
    private String descriptionCategory;
}
