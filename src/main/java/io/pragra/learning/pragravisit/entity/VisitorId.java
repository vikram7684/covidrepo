package io.pragra.learning.pragravisit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "VISITOR_ID_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitorId {
    @Id
    private String uuid;
    private IDTypeEnum idType;
}
