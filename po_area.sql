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

 Date: 24/06/2019 17:43:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for po_area
-- ----------------------------
DROP TABLE IF EXISTS `po_area`;
CREATE TABLE `po_area`  (
  `fd_id` bigint(20) NOT NULL,
  `customer_id` bigint(20) NOT NULL,
  `amount` decimal(12, 2) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date DEFAULT NULL,
  `checked_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `checked_date` datetime(0) DEFAULT NULL,
  `checked_remark` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `remark` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `status` int(11) NOT NULL,
  `creater_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` datetime(0) NOT NULL,
  `last_alter_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `last_alter_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`fd_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
