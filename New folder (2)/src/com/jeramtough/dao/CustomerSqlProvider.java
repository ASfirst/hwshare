package com.jeramtough.dao;

import com.jeramtough.bean.Customer;
import org.apache.ibatis.jdbc.SQL;

public class CustomerSqlProvider {

    public String insertSelective(Customer record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("customer");
        
        if (record.getFdId() != null) {
            sql.VALUES("fd_id", "#{fdId,jdbcType=BIGINT}");
        }
        
        if (record.getMapImportId() != null) {
            sql.VALUES("map_import_id", "#{mapImportId,jdbcType=INTEGER}");
        }
        
        if (record.getMapCultureId() != null) {
            sql.VALUES("map_culture_id", "#{mapCultureId,jdbcType=INTEGER}");
        }
        
        if (record.getMapChinaId() != null) {
            sql.VALUES("map_china_id", "#{mapChinaId,jdbcType=INTEGER}");
        }
        
        if (record.getProvince() != null) {
            sql.VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getCounty() != null) {
            sql.VALUES("county", "#{county,jdbcType=VARCHAR}");
        }
        
        if (record.getCustName() != null) {
            sql.VALUES("cust_name", "#{custName,jdbcType=VARCHAR}");
        }
        
        if (record.getShortName() != null) {
            sql.VALUES("short_name", "#{shortName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustTypeName() != null) {
            sql.VALUES("cust_type_name", "#{custTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnterpriseType() != null) {
            sql.VALUES("enterprise_type", "#{enterpriseType,jdbcType=VARCHAR}");
        }
        
        if (record.getLawMan() != null) {
            sql.VALUES("law_man", "#{lawMan,jdbcType=VARCHAR}");
        }
        
        if (record.getLawReposibility() != null) {
            sql.VALUES("law_reposibility", "#{lawReposibility,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTel() != null) {
            sql.VALUES("tel", "#{tel,jdbcType=VARCHAR}");
        }
        
        if (record.getFax() != null) {
            sql.VALUES("fax", "#{fax,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPostNo() != null) {
            sql.VALUES("post_no", "#{postNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterAmount() != null) {
            sql.VALUES("register_amount", "#{registerAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFlowAmount() != null) {
            sql.VALUES("flow_amount", "#{flowAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getYearAmount() != null) {
            sql.VALUES("year_amount", "#{yearAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getIsUseFinanceSoft() != null) {
            sql.VALUES("is_use_finance_soft", "#{isUseFinanceSoft,jdbcType=VARCHAR}");
        }
        
        if (record.getSoftName() != null) {
            sql.VALUES("soft_name", "#{softName,jdbcType=VARCHAR}");
        }
        
        if (record.getIsRatePaying() != null) {
            sql.VALUES("is_rate_paying", "#{isRatePaying,jdbcType=INTEGER}");
        }
        
        if (record.getInvestigateBy() != null) {
            sql.VALUES("investigate_by", "#{investigateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getInvestigateDate() != null) {
            sql.VALUES("investigate_date", "#{investigateDate,jdbcType=DATE}");
        }
        
        if (record.getDealerTypeId() != null) {
            sql.VALUES("dealer_type_id", "#{dealerTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getIsRegister() != null) {
            sql.VALUES("is_register", "#{isRegister,jdbcType=INTEGER}");
        }
        
        if (record.getDeveloper() != null) {
            sql.VALUES("developer", "#{developer,jdbcType=VARCHAR}");
        }
        
        if (record.getStartupBusiness() != null) {
            sql.VALUES("startup_business", "#{startupBusiness,jdbcType=INTEGER}");
        }
        
        if (record.getBusinessStartDate() != null) {
            sql.VALUES("business_start_date", "#{businessStartDate,jdbcType=DATE}");
        }
        
        if (record.getBusinessEndDate() != null) {
            sql.VALUES("business_end_date", "#{businessEndDate,jdbcType=DATE}");
        }
        
        if (record.getPromiseWeight() != null) {
            sql.VALUES("promise_weight", "#{promiseWeight,jdbcType=DECIMAL}");
        }
        
        if (record.getReceiverBy() != null) {
            sql.VALUES("receiver_by", "#{receiverBy,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverMobile() != null) {
            sql.VALUES("receiver_mobile", "#{receiverMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUse() != null) {
            sql.VALUES("use", "#{use,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreaterId() != null) {
            sql.VALUES("creater_id", "#{createrId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAlterId() != null) {
            sql.VALUES("last_alter_id", "#{lastAlterId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastAlterTime() != null) {
            sql.VALUES("last_alter_time", "#{lastAlterTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Customer record) {
        SQL sql = new SQL();
        sql.UPDATE("customer");
        
        if (record.getMapImportId() != null) {
            sql.SET("map_import_id = #{mapImportId,jdbcType=INTEGER}");
        }
        
        if (record.getMapCultureId() != null) {
            sql.SET("map_culture_id = #{mapCultureId,jdbcType=INTEGER}");
        }
        
        if (record.getMapChinaId() != null) {
            sql.SET("map_china_id = #{mapChinaId,jdbcType=INTEGER}");
        }
        
        if (record.getProvince() != null) {
            sql.SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getCounty() != null) {
            sql.SET("county = #{county,jdbcType=VARCHAR}");
        }
        
        if (record.getCustName() != null) {
            sql.SET("cust_name = #{custName,jdbcType=VARCHAR}");
        }
        
        if (record.getShortName() != null) {
            sql.SET("short_name = #{shortName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustTypeName() != null) {
            sql.SET("cust_type_name = #{custTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnterpriseType() != null) {
            sql.SET("enterprise_type = #{enterpriseType,jdbcType=VARCHAR}");
        }
        
        if (record.getLawMan() != null) {
            sql.SET("law_man = #{lawMan,jdbcType=VARCHAR}");
        }
        
        if (record.getLawReposibility() != null) {
            sql.SET("law_reposibility = #{lawReposibility,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTel() != null) {
            sql.SET("tel = #{tel,jdbcType=VARCHAR}");
        }
        
        if (record.getFax() != null) {
            sql.SET("fax = #{fax,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPostNo() != null) {
            sql.SET("post_no = #{postNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterAmount() != null) {
            sql.SET("register_amount = #{registerAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFlowAmount() != null) {
            sql.SET("flow_amount = #{flowAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getYearAmount() != null) {
            sql.SET("year_amount = #{yearAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getIsUseFinanceSoft() != null) {
            sql.SET("is_use_finance_soft = #{isUseFinanceSoft,jdbcType=VARCHAR}");
        }
        
        if (record.getSoftName() != null) {
            sql.SET("soft_name = #{softName,jdbcType=VARCHAR}");
        }
        
        if (record.getIsRatePaying() != null) {
            sql.SET("is_rate_paying = #{isRatePaying,jdbcType=INTEGER}");
        }
        
        if (record.getInvestigateBy() != null) {
            sql.SET("investigate_by = #{investigateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getInvestigateDate() != null) {
            sql.SET("investigate_date = #{investigateDate,jdbcType=DATE}");
        }
        
        if (record.getDealerTypeId() != null) {
            sql.SET("dealer_type_id = #{dealerTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getIsRegister() != null) {
            sql.SET("is_register = #{isRegister,jdbcType=INTEGER}");
        }
        
        if (record.getDeveloper() != null) {
            sql.SET("developer = #{developer,jdbcType=VARCHAR}");
        }
        
        if (record.getStartupBusiness() != null) {
            sql.SET("startup_business = #{startupBusiness,jdbcType=INTEGER}");
        }
        
        if (record.getBusinessStartDate() != null) {
            sql.SET("business_start_date = #{businessStartDate,jdbcType=DATE}");
        }
        
        if (record.getBusinessEndDate() != null) {
            sql.SET("business_end_date = #{businessEndDate,jdbcType=DATE}");
        }
        
        if (record.getPromiseWeight() != null) {
            sql.SET("promise_weight = #{promiseWeight,jdbcType=DECIMAL}");
        }
        
        if (record.getReceiverBy() != null) {
            sql.SET("receiver_by = #{receiverBy,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverMobile() != null) {
            sql.SET("receiver_mobile = #{receiverMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUse() != null) {
            sql.SET("use = #{use,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreaterId() != null) {
            sql.SET("creater_id = #{createrId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAlterId() != null) {
            sql.SET("last_alter_id = #{lastAlterId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastAlterTime() != null) {
            sql.SET("last_alter_time = #{lastAlterTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("fd_id = #{fdId,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}