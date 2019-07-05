package com.jeramtough.dao;

import com.jeramtough.bean.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CustomerMapper {
    @Delete({
        "delete from customer",
        "where fd_id = #{fdId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long fdId);

    @Insert({
        "insert into customer (fd_id, map_import_id, ",
        "map_culture_id, map_china_id, ",
        "province, city, ",
        "county, cust_name, ",
        "short_name, cust_type_name, ",
        "enterprise_type, law_man, ",
        "law_reposibility, mobile, ",
        "tel, fax, address, ",
        "post_no, register_amount, ",
        "flow_amount, year_amount, ",
        "is_use_finance_soft, soft_name, ",
        "is_rate_paying, investigate_by, ",
        "investigate_date, dealer_type_id, ",
        "is_register, developer, ",
        "startup_business, business_start_date, ",
        "business_end_date, promise_weight, ",
        "receiver_by, receiver_mobile, ",
        "use, remark, status, ",
        "creater_id, create_time, ",
        "last_alter_id, last_alter_time)",
        "values (#{fdId,jdbcType=BIGINT}, #{mapImportId,jdbcType=INTEGER}, ",
        "#{mapCultureId,jdbcType=INTEGER}, #{mapChinaId,jdbcType=INTEGER}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{county,jdbcType=VARCHAR}, #{custName,jdbcType=VARCHAR}, ",
        "#{shortName,jdbcType=VARCHAR}, #{custTypeName,jdbcType=VARCHAR}, ",
        "#{enterpriseType,jdbcType=VARCHAR}, #{lawMan,jdbcType=VARCHAR}, ",
        "#{lawReposibility,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, ",
        "#{tel,jdbcType=VARCHAR}, #{fax,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{postNo,jdbcType=VARCHAR}, #{registerAmount,jdbcType=DECIMAL}, ",
        "#{flowAmount,jdbcType=DECIMAL}, #{yearAmount,jdbcType=DECIMAL}, ",
        "#{isUseFinanceSoft,jdbcType=VARCHAR}, #{softName,jdbcType=VARCHAR}, ",
        "#{isRatePaying,jdbcType=INTEGER}, #{investigateBy,jdbcType=VARCHAR}, ",
        "#{investigateDate,jdbcType=DATE}, #{dealerTypeId,jdbcType=INTEGER}, ",
        "#{isRegister,jdbcType=INTEGER}, #{developer,jdbcType=VARCHAR}, ",
        "#{startupBusiness,jdbcType=INTEGER}, #{businessStartDate,jdbcType=DATE}, ",
        "#{businessEndDate,jdbcType=DATE}, #{promiseWeight,jdbcType=DECIMAL}, ",
        "#{receiverBy,jdbcType=VARCHAR}, #{receiverMobile,jdbcType=VARCHAR}, ",
        "#{use,jdbcType=BIT}, #{remark,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{createrId,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{lastAlterId,jdbcType=VARCHAR}, #{lastAlterTime,jdbcType=TIMESTAMP})"
    })
    int insert(Customer record);

    @InsertProvider(type=CustomerSqlProvider.class, method="insertSelective")
    int insertSelective(Customer record);

    @Select({
        "select",
        "fd_id, map_import_id, map_culture_id, map_china_id, province, city, county, ",
        "cust_name, short_name, cust_type_name, enterprise_type, law_man, law_reposibility, ",
        "mobile, tel, fax, address, post_no, register_amount, flow_amount, year_amount, ",
        "is_use_finance_soft, soft_name, is_rate_paying, investigate_by, investigate_date, ",
        "dealer_type_id, is_register, developer, startup_business, business_start_date, ",
        "business_end_date, promise_weight, receiver_by, receiver_mobile, use, remark, ",
        "status, creater_id, create_time, last_alter_id, last_alter_time",
        "from customer",
        "where fd_id = #{fdId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="map_import_id", property="mapImportId", jdbcType=JdbcType.INTEGER),
        @Result(column="map_culture_id", property="mapCultureId", jdbcType=JdbcType.INTEGER),
        @Result(column="map_china_id", property="mapChinaId", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="county", property="county", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_name", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="short_name", property="shortName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_type_name", property="custTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="enterprise_type", property="enterpriseType", jdbcType=JdbcType.VARCHAR),
        @Result(column="law_man", property="lawMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="law_reposibility", property="lawReposibility", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR),
        @Result(column="fax", property="fax", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="post_no", property="postNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_amount", property="registerAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="flow_amount", property="flowAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="year_amount", property="yearAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="is_use_finance_soft", property="isUseFinanceSoft", jdbcType=JdbcType.VARCHAR),
        @Result(column="soft_name", property="softName", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_rate_paying", property="isRatePaying", jdbcType=JdbcType.INTEGER),
        @Result(column="investigate_by", property="investigateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="investigate_date", property="investigateDate", jdbcType=JdbcType.DATE),
        @Result(column="dealer_type_id", property="dealerTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_register", property="isRegister", jdbcType=JdbcType.INTEGER),
        @Result(column="developer", property="developer", jdbcType=JdbcType.VARCHAR),
        @Result(column="startup_business", property="startupBusiness", jdbcType=JdbcType.INTEGER),
        @Result(column="business_start_date", property="businessStartDate", jdbcType=JdbcType.DATE),
        @Result(column="business_end_date", property="businessEndDate", jdbcType=JdbcType.DATE),
        @Result(column="promise_weight", property="promiseWeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="receiver_by", property="receiverBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_mobile", property="receiverMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="use", property="use", jdbcType=JdbcType.BIT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="creater_id", property="createrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_alter_id", property="lastAlterId", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_alter_time", property="lastAlterTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Customer selectByPrimaryKey(Long fdId);

    @UpdateProvider(type=CustomerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Customer record);

    @Update({
        "update customer",
        "set map_import_id = #{mapImportId,jdbcType=INTEGER},",
          "map_culture_id = #{mapCultureId,jdbcType=INTEGER},",
          "map_china_id = #{mapChinaId,jdbcType=INTEGER},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "county = #{county,jdbcType=VARCHAR},",
          "cust_name = #{custName,jdbcType=VARCHAR},",
          "short_name = #{shortName,jdbcType=VARCHAR},",
          "cust_type_name = #{custTypeName,jdbcType=VARCHAR},",
          "enterprise_type = #{enterpriseType,jdbcType=VARCHAR},",
          "law_man = #{lawMan,jdbcType=VARCHAR},",
          "law_reposibility = #{lawReposibility,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "tel = #{tel,jdbcType=VARCHAR},",
          "fax = #{fax,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "post_no = #{postNo,jdbcType=VARCHAR},",
          "register_amount = #{registerAmount,jdbcType=DECIMAL},",
          "flow_amount = #{flowAmount,jdbcType=DECIMAL},",
          "year_amount = #{yearAmount,jdbcType=DECIMAL},",
          "is_use_finance_soft = #{isUseFinanceSoft,jdbcType=VARCHAR},",
          "soft_name = #{softName,jdbcType=VARCHAR},",
          "is_rate_paying = #{isRatePaying,jdbcType=INTEGER},",
          "investigate_by = #{investigateBy,jdbcType=VARCHAR},",
          "investigate_date = #{investigateDate,jdbcType=DATE},",
          "dealer_type_id = #{dealerTypeId,jdbcType=INTEGER},",
          "is_register = #{isRegister,jdbcType=INTEGER},",
          "developer = #{developer,jdbcType=VARCHAR},",
          "startup_business = #{startupBusiness,jdbcType=INTEGER},",
          "business_start_date = #{businessStartDate,jdbcType=DATE},",
          "business_end_date = #{businessEndDate,jdbcType=DATE},",
          "promise_weight = #{promiseWeight,jdbcType=DECIMAL},",
          "receiver_by = #{receiverBy,jdbcType=VARCHAR},",
          "receiver_mobile = #{receiverMobile,jdbcType=VARCHAR},",
          "use = #{use,jdbcType=BIT},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "creater_id = #{createrId,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_alter_id = #{lastAlterId,jdbcType=VARCHAR},",
          "last_alter_time = #{lastAlterTime,jdbcType=TIMESTAMP}",
        "where fd_id = #{fdId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Customer record);
}