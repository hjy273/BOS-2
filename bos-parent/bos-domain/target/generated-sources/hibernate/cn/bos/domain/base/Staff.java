package cn.bos.domain.base;
// Generated 2017-7-27 15:22:17 by Hibernate Tools 3.2.2.GA


import cn.bos.domain.qp.Noticebill;
import cn.bos.domain.qp.Workbill;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Staff generated by hbm2java
 */
@Entity
@Table(name="bc_staff"
    ,catalog="bos"
)
public class Staff  implements java.io.Serializable {


     private String id;
     private String name;
     private String telephone;
     private Character haspda;
     private Character deltag;
     private String station;
     private String standard;
     private Set<Workbill> workbills = new HashSet<Workbill>(0);
     private Set<Noticebill> noticebills = new HashSet<Noticebill>(0);
     private Set<DecidedZone> decidedZones = new HashSet<DecidedZone>(0);

    public Staff() {
    }

    public Staff(String name, String telephone, Character haspda, Character deltag, String station, String standard, Set<Workbill> workbills, Set<Noticebill> noticebills, Set<DecidedZone> decidedZones) {
       this.name = name;
       this.telephone = telephone;
       this.haspda = haspda;
       this.deltag = deltag;
       this.station = station;
       this.standard = standard;
       this.workbills = workbills;
       this.noticebills = noticebills;
       this.decidedZones = decidedZones;
    }
   
     @GenericGenerator(name="generator", strategy="uuid")@Id @GeneratedValue(generator="generator")
    
    @Column(name="ID", unique=true, nullable=false, length=32)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="NAME", length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="TELEPHONE", length=20)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="HASPDA", length=1)
    public Character getHaspda() {
        return this.haspda;
    }
    
    public void setHaspda(Character haspda) {
        this.haspda = haspda;
    }
    
    @Column(name="DELTAG", length=1)
    public Character getDeltag() {
        return this.deltag;
    }
    
    public void setDeltag(Character deltag) {
        this.deltag = deltag;
    }
    
    @Column(name="STATION", length=40)
    public String getStation() {
        return this.station;
    }
    
    public void setStation(String station) {
        this.station = station;
    }
    
    @Column(name="STANDARD", length=100)
    public String getStandard() {
        return this.standard;
    }
    
    public void setStandard(String standard) {
        this.standard = standard;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="staff")
    public Set<Workbill> getWorkbills() {
        return this.workbills;
    }
    
    public void setWorkbills(Set<Workbill> workbills) {
        this.workbills = workbills;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="staff")
    public Set<Noticebill> getNoticebills() {
        return this.noticebills;
    }
    
    public void setNoticebills(Set<Noticebill> noticebills) {
        this.noticebills = noticebills;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="staff")
    public Set<DecidedZone> getDecidedZones() {
        return this.decidedZones;
    }
    
    public void setDecidedZones(Set<DecidedZone> decidedZones) {
        this.decidedZones = decidedZones;
    }




}


