/*
Navicat MySQL Data Transfer

Source Server         : ssh
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : test3

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2017-07-21 18:08:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) NOT NULL,
  `reg_time` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_gnu0k8vv6ptioedbxbfsnan9g` (`email`),
  UNIQUE KEY `UK_nd4xxe4sfscx08oods9gi8y2v` (`user_name`),
  UNIQUE KEY `UK_1sree0oh1v7qhmst1ufkv17qn` (`nick_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'aa', 'aa123456', 'aa@126.com', '2017年7月21日 下午05时06分08秒', 'aa1');
INSERT INTO `user_info` VALUES ('2', 'bb', 'bb123456', 'bb@126.com', '2017年7月21日 下午05时06分08秒', 'bb2');
INSERT INTO `user_info` VALUES ('3', 'cc', 'cc123456', 'cc@126.com', '2017年7月21日 下午05时06分08秒', 'cc3');
