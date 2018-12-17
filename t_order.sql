/*
Navicat MySQL Data Transfer

Source Server         : mydb
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : java

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-12-12 22:09:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `customer` varchar(20) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `status` int(1) DEFAULT '0',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11795 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('11685', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11686', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11687', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11688', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11689', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11690', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11691', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11692', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11693', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11694', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11695', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11696', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11697', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11698', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11699', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11700', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11701', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11702', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11703', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11704', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11705', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11706', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11707', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11708', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11709', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11710', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11711', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11712', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11713', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11714', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11715', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11716', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11717', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11718', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11719', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11720', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11721', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11722', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11723', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11724', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11725', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11726', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11727', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11728', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11729', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11730', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11731', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11732', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11733', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11734', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11735', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11736', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11737', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11738', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11739', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11740', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11741', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11742', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11743', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11744', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11745', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11746', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11747', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11748', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11749', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11750', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11751', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11752', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11753', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11754', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11755', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11756', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11757', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11758', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11759', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11760', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11761', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11762', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11763', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11764', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11765', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11766', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11767', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11768', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11769', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11770', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11771', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11772', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11773', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11774', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11775', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11776', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11777', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11778', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11779', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11780', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11781', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11782', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11783', '1006', 'Five', '1', '1');
INSERT INTO `t_order` VALUES ('11784', '1006', 'Five', '1', '1');
