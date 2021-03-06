package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by DengrongGuan on 2016/7/14.
 */
@Entity(name = "inquiry")
public class Inquiry implements Serializable {
    protected int id;
    protected int styleId;
    protected Timestamp createTime = new Timestamp(new Date().getTime());//创建时间
    protected double technologyPrice;
    protected double producePrice;
    protected double purchasePrice;
    protected double plateMakePrice;
    private String techRemark;
    private String prodRemark;
    private String purcRemark;
    private String platRemark;
    protected InquiryState state = InquiryState.NOCHECK;

    @Column(name = "state",nullable = false)
    @Enumerated(EnumType.STRING)
    public InquiryState getState() {
        return state;
    }

    public void setState(InquiryState state) {
        this.state = state;
    }

    @Column(name = "style_id",nullable = false)
    public int getStyleId() {
        return styleId;
    }

    public void setStyleId(int styleId) {
        this.styleId = styleId;
    }

    @Column(name = "check_time")
    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    private Timestamp checkTime;

    @Id
    @Column(name="id",length = 32,nullable = true)
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator",strategy = "increment")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "create_time", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Column(name = "technology_price")
    public double getTechnologyPrice() {
        return technologyPrice;
    }

    public void setTechnologyPrice(double technologyPrice) {
        this.technologyPrice = technologyPrice;
    }

    @Column(name = "produce_price")
    public double getProducePrice() {
        return producePrice;
    }

    public void setProducePrice(double producePrice) {
        this.producePrice = producePrice;
    }

    @Column(name = "purchase_price")
    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Column(name = "platemake_price")
    public double getPlateMakePrice() {
        return plateMakePrice;
    }


    public void setPlateMakePrice(double plateMakePrice) {
        this.plateMakePrice = plateMakePrice;
    }

    @Column(name = "tech_remark")
    public String getTechRemark() {
        return techRemark;
    }

    public void setTechRemark(String techRemark) {
        this.techRemark = techRemark;
    }

    @Column(name = "prod_remark")
    public String getProdRemark() {
        return prodRemark;
    }

    public void setProdRemark(String prodRemark) {
        this.prodRemark = prodRemark;
    }

    @Column(name = "purc_remark")
    public String getPurcRemark() {
        return purcRemark;
    }

    public void setPurcRemark(String purcRemark) {
        this.purcRemark = purcRemark;
    }

    @Column(name = "plat_remark")
    public String getPlatRemark() {
        return platRemark;
    }

    public void setPlatRemark(String platRemark) {
        this.platRemark = platRemark;
    }

}
