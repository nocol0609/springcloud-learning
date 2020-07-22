/*
Navicat MySQL Data Transfer

Source Server         : nocol
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : clouddb01

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2019-08-25 23:30:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `simba_dept`;
CREATE TABLE `simba_dept` (
  `deptno` int(10) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `dname` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `db_source` varchar(60) DEFAULT NULL COMMENT '数据库名',
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `simba_dept` VALUES ('1', '开发部', 'clouddb01');
INSERT INTO `simba_dept` VALUES ('2', '产品部', 'clouddb01');
INSERT INTO `simba_dept` VALUES ('3', '运维部', 'clouddb01');
INSERT INTO `simba_dept` VALUES ('4', '构架部', 'clouddb01');
