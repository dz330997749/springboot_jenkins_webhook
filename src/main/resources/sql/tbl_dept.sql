/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 80017
Source Host           : 127.0.0.1:3306
Source Database       : springboot_emp

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-07-18 11:06:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_dept
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dept`;
CREATE TABLE `tbl_dept` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(30) NOT NULL,
  `dept_leader` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_dept
-- ----------------------------
INSERT INTO `tbl_dept` VALUES ('1', '管理部', '小张');
INSERT INTO `tbl_dept` VALUES ('2', '销售部', '老王');
INSERT INTO `tbl_dept` VALUES ('3', '研发部', '小徐');
