package test.bastianb.alphanetworkstest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "animal")
@NoArgsConstructor
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    @JsonIgnore
    @Transient
    private AnimalType animalType;

    @ManyToOne
    private User owner;

    public Animal(String name, String type, User owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    public Animal(String name, AnimalType animalType, User owner) {
        this.name = name;
        this.animalType = animalType;
        this.owner = owner;
    }
    
    @PostLoad
    void fillTransient() {
        if (type != null) {
            this.animalType = AnimalType.of(type);
        }
    }

    @PrePersist
    void fillPersistent() {
        if (animalType != null) {
            this.type = animalType.getType();
        }
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", name=" + name + ", type=" + type + ", animalType=" + animalType + ", owner="
                + owner + "]";
    }

}


