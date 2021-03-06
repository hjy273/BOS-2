package cn.bos.domain.qp;
// Generated 2017-7-27 15:22:17 by Hibernate Tools 3.2.2.GA


import cn.bos.domain.base.Staff;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * Workbill generated by hbm2java
 */
@Entity
@Table(name="qp_workbill"
    ,catalog="bos"
)
public class Workbill  implements java.io.Serializable {


     private String id;
     private Noticebill noticebill;
     private Staff staff;
     private String type;
     private String pickstate;
     private Date buildtime;
     private Integer attachbilltimes;
     private String remark;

    public Workbill() {
    }

	
    public Workbill(Date buildtime) {
        this.buildtime = buildtime;
    }
    public Workbill(Noticebill noticebill, Staff staff, String type, String pickstate, Date buildtime, Integer attachbilltimes, String remark) {
       this.noticebill = noticebill;
       this.staff = staff;
       this.type = type;
       this.pickstate = pickstate;
       this.buildtime = buildtime;
       this.attachbilltimes = attachbilltimes;
       this.remark = remark;
    }
   
     @GenericGenerator(name="generator", strategy="uuid")@Id @GeneratedValue(generator="generator")
    
    @Column(name="ID", unique=true, nullable=false, length=32)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NOTICEBILL_ID")
    public Noticebill getNoticebill() {
        return this.noticebill;
    }
    
    public void setNoticebill(Noticebill noticebill) {
        this.noticebill = noticebill;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STAFF_ID")
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    
    @Column(name="TYPE", length=20)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="PICKSTATE", length=20)
    public String getPickstate() {
        return this.pickstate;
    }
    
    public void setPickstate(String pickstate) {
        this.pickstate = pickstate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="BUILDTIME", nullable=false, length=0)
    public Date getBuildtime() {
        return this.buildtime;
    }
    
    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }
    
    @Column(name="ATTACHBILLTIMES", precision=8, scale=0)
    public Integer getAttachbilltimes() {
        return this.attachbilltimes;
    }
    
    public void setAttachbilltimes(Integer attachbilltimes) {
        this.attachbilltimes = attachbilltimes;
    }
    
    @Column(name="REMARK")
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }




}


