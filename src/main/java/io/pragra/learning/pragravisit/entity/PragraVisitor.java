package io.pragra.learning.pragravisit.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity(name = "visitor")
@Data
@Table(name = "TABLE_VISITOR")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class PragraVisitor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "visitor_id", updatable = false)
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    @Column(unique = true, nullable = false)
    private String email;
    private Instant createDate;
    private Instant updateDate;

    @Column()
    private StatusEnum status;

    //@Transient
    @Column(length = 3000)
    private String greetingOfDay;


    @OneToMany
    @JoinColumn(name = "visitor_id")
    private List<CovidDetail> covidDetails;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private VisitorId visitorId;
}
