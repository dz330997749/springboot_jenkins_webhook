/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 80017
Source Host           : 127.0.0.1:3306
Source Database       : springboot_emp

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-07-18 11:06:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', 'xz', '123');
INSERT INTO `tbl_user` VALUES ('2', 'pzz', '123456');
INSERT INTO `tbl_user` VALUES ('3', 'ggd', 'ggdniubi');
INSERT INTO `tbl_user` VALUES ('5', '老王', '123');
