package test.model;

import java.math.BigDecimal;
import java.util.Date;

public class PoTransport {
    private Long fdId;

    private Long customerId;

    private String method;

    private BigDecimal price;

    private BigDecimal addPrice;

    private Date startDate;

    private Date endDate;

    private String checkedBy;

    private Date checkedDate;

    private String checkedRemark;

    private String remark;

    private Integer status;

    private String createrId;

    private Date createTime;

    private String lastAlterId;

    private Date lastAlterTime;

    public Long getFdId() {
        return fdId;
    }

    public void setFdId(Long fdId) {
        this.fdId = fdId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(BigDecimal addPrice) {
        this.addPrice = addPrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(String checkedBy) {
        this.checkedBy = checkedBy == null ? null : checkedBy.trim();
    }

    public Date getCheckedDate() {
        return checkedDate;
    }

    public void setCheckedDate(Date checkedDate) {
        this.checkedDate = checkedDate;
    }

    public String getCheckedRemark() {
        return checkedRemark;
    }

    public void setCheckedRemark(String checkedRemark) {
        this.checkedRemark = checkedRemark == null ? null : checkedRemark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId == null ? null : createrId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastAlterId() {
        return lastAlterId;
    }

    public void setLastAlterId(String lastAlterId) {
        this.lastAlterId = lastAlterId == null ? null : lastAlterId.trim();
    }

    public Date getLastAlterTime() {
        return lastAlterTime;
    }

    public void setLastAlterTime(Date lastAlterTime) {
        this.lastAlterTime = lastAlterTime;
    }
}