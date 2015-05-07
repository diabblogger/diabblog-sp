package org.diabblog.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Entry {

    /**
     */
    @DecimalMin("0.0")
    @DecimalMax("99.9")
    private Float bloodSugarLevel;

    /**
     */
    @DecimalMin("0.0")
    @DecimalMax("99.9")
    private Float slowInsulin;

    /**
     */
    @DecimalMin("0.0")
    @DecimalMax("99.9")
    private Float fastInsulin;

    /**
     */
    private String correction;

    /**
     */
    private String carbs;

    /**
     */
    private String comments;

    /**
     */
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date created = new Date();
}
