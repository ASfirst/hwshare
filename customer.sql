/*
 Navicat Premium Data Transfer

 Source Server         : hw-sp
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : 192.168.68.204:3306
 Source Schema         : hwagain_sp

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 24/06/2019 17:44:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `fd_id` bigint(20) NOT NULL COMMENT 'FdId',
  `map_import_id` int(11) DEFAULT NULL,
  `map_culture_id` int(11) DEFAULT NULL,
  `map_china_id` int(11) DEFAULT NULL,
  `province` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '省',
  `city` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '市',
  `county` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '区/县',
  `cust_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '客户名称',
  `short_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '客户简称',
  `cust_type_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '客户类型',
  `enterprise_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '企业性质',
  `law_man` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '法人代表',
  `law_reposibility` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '负责人',
  `mobile` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机',
  `tel` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `fax` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '传真',
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `post_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮编',
  `register_amount` decimal(12, 2) DEFAULT NULL COMMENT '注册资金',
  `flow_amount` decimal(12, 2) DEFAULT NULL COMMENT '流动资金',
  `year_amount` decimal(12, 2) DEFAULT NULL COMMENT '年销售额',
  `is_use_finance_soft` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '是否使用财务软件',
  `soft_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '财务软件名称',
  `is_rate_paying` int(11) DEFAULT NULL COMMENT '是否一般纳税人',
  `investigate_by` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '调查人',
  `investigate_date` date DEFAULT NULL COMMENT '调查时间',
  `dealer_type_id` int(11) DEFAULT NULL COMMENT '经销商类别',
  `is_register` int(11) DEFAULT NULL COMMENT '注册单位标记',
  `developer` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '开发人',
  `startup_business` int(11) DEFAULT NULL COMMENT '生意开发期',
  `business_start_date` date DEFAULT NULL COMMENT '生意开发期起算时间',
  `business_end_date` date DEFAULT NULL COMMENT '生意开发期结束时间',
  `promise_weight` decimal(12, 2) DEFAULT NULL COMMENT '合同约定月提货量',
  `receiver_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '短信接收人',
  `receiver_mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '短信接收号码',
  `use` bit(1) DEFAULT b'0',
  `remark` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '状态',
  `creater_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) DEFAULT NULL COMMENT '创建时间',
  `last_alter_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改人',
  `last_alter_time` datetime(0) DEFAULT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`fd_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
