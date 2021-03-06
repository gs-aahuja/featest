package com.gainsight.cloud.featest.model.execution;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;


/**
 * A Build is a collection of test cases run to test a Project
 * <p>
 * It can be seen as Test Run kind of an entity wrapping one test cycle run
 */

@Component
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Build {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String buildName;
    private Set<FeatureGroup> featureGroups;

}
