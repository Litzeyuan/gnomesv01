package gnomes.spring.gnomesv01.models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(exclude={"beds","location"})
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "areas")
public class Area extends BaseEntity{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String name;

    @Column(nullable = true)
    private int totalBeds;

    //CascadeType.ALL if deletes an area, will casecade down to delete all beds
    @OneToMany(cascade=CascadeType.ALL, mappedBy="area")
    private List<Bed> beds;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Builder
    public Area(Long id, String name) {
        super(id);
        this.name = name;
    }


    // helper method
    public int getTotalBeds() {
        if (beds == null)
            return 0;
        else
            return beds.size();
    }

    // helper method
    public void addBed(Bed bed){
        bed.setArea(this);
        this.beds.add(bed);
    }
}
