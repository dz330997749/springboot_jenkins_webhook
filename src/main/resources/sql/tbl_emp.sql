/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 80017
Source Host           : 127.0.0.1:3306
Source Database       : springboot_emp

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-07-18 11:06:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_emp
-- ----------------------------
DROP TABLE IF EXISTS `tbl_emp`;
CREATE TABLE `tbl_emp` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `salary` double(10,2) DEFAULT NULL,
  `dept_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dpet_foreignKey` (`dept_id`),
  CONSTRAINT `dpet_foreignKey` FOREIGN KEY (`dept_id`) REFERENCES `tbl_dept` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_emp
-- ----------------------------
INSERT INTO `tbl_emp` VALUES ('1', '老大', '18', 'M', '8000.00', '2');
INSERT INTO `tbl_emp` VALUES ('2', '123asdazc', '1231', 'F', '123.00', '1');
INSERT INTO `tbl_emp` VALUES ('4', '老二', '17', 'M', '2800.00', '3');
INSERT INTO `tbl_emp` VALUES ('5', '老三123', '16', 'M', '2000.00', '1');
INSERT INTO `tbl_emp` VALUES ('6', '二姐', '16', 'F', '1444.00', '2');
INSERT INTO `tbl_emp` VALUES ('7', '老幺', '14', 'M', '200.00', '3');
INSERT INTO `tbl_emp` VALUES ('8', '三姐', '15', 'F', '4000.00', '2');
INSERT INTO `tbl_emp` VALUES ('11', '1dac', '11', 'F', '412.00', '1');
INSERT INTO `tbl_emp` VALUES ('13', 'zcxcz', '123', 'M', '213123.00', '3');
INSERT INTO `tbl_emp` VALUES ('14', 'azxc', '2131111', 'F', '1231111.00', '1');
INSERT INTO `tbl_emp` VALUES ('16', '16', '1616', 'M', '161616.00', '1');
INSERT INTO `tbl_emp` VALUES ('17', '123', '123', 'F', '123.00', '2');
INSERT INTO `tbl_emp` VALUES ('18', 'adad', '123', 'M', '123.00', '1');
INSERT INTO `tbl_emp` VALUES ('19', 'zxcz', '213', 'F', '123.00', '2');
INSERT INTO `tbl_emp` VALUES ('20', '123123131231', '213', 'F', '1231.00', '3');
INSERT INTO `tbl_emp` VALUES ('22', '1231', '1231', 'M', '123.00', '1');
INSERT INTO `tbl_emp` VALUES ('24', '645', '12312', 'M', '454.00', '1');
INSERT INTO `tbl_emp` VALUES ('25', 'xzc', '2313', 'F', '12.00', '1');
INSERT INTO `tbl_emp` VALUES ('26', 'zcz', '13123', 'M', '123.00', '1');
INSERT INTO `tbl_emp` VALUES ('28', '1231', '3123', 'F', '123.00', '1');
INSERT INTO `tbl_emp` VALUES ('29', '123', '123', 'M', '123.00', '2');
INSERT INTO `tbl_emp` VALUES ('30', '12312', '123', 'F', '123123.00', '1');
INSERT INTO `tbl_emp` VALUES ('31', '123', '123', 'F', '123.00', '1');
INSERT INTO `tbl_emp` VALUES ('33', 'xz', '1312', 'M', '213.00', '1');
INSERT INTO `tbl_emp` VALUES ('36', 'asd', '123', 'F', '213.00', '1');
INSERT INTO `tbl_emp` VALUES ('37', '21312', '23', 'M', '123.00', '2');
