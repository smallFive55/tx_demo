/*
Navicat MySQL Data Transfer

Source Server         : mydb
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : java

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-12-11 19:00:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(100) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('1001', '黑色皮鞭', '100');
INSERT INTO `t_product` VALUES ('1002', '红蜡烛', '100');
INSERT INTO `t_product` VALUES ('1003', '杜蕾斯54mm', '100');
INSERT INTO `t_product` VALUES ('1004', '亿级流量网站架构核心技术', '100');
INSERT INTO `t_product` VALUES ('1005', 'IPhoneXS', '100');
INSERT INTO `t_product` VALUES ('1006', '云析学院BATJ高级JavaVIP', '100');
INSERT INTO `t_product` VALUES ('1007', '办公室趴枕', '100');
