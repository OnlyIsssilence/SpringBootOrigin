/*
Navicat MySQL Data Transfer

Source Server         : ssh
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : test3

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2017-07-21 18:06:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `projectinfo`
-- ----------------------------
DROP TABLE IF EXISTS `projectinfo`;
CREATE TABLE `projectinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `createtime` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `modify_time` datetime NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) NOT NULL,
  `project_id` varchar(255) DEFAULT NULL,
  `reg_time` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projectinfo
-- ----------------------------
INSERT INTO `projectinfo` VALUES ('1', '2017-07-21 17:45:10', 'www.baidu.com', '2017-07-21 17:45:10', '李阳:0', 'c0355d67-e7f9-43d6-81a1-37b1cc327dfc', 'c0355d67-e7f9-43d6-81a1-37b1cc327dfc', 'Fri Jul 21 17:45:09 CST 2017');
INSERT INTO `projectinfo` VALUES ('2', '2017-07-21 17:45:10', 'www.baidu.com', '2017-07-21 17:45:10', '李阳:1', '3d5c21e7-7fc8-421f-9f6e-3dfaafface59', '3d5c21e7-7fc8-421f-9f6e-3dfaafface59', 'Fri Jul 21 17:45:09 CST 2017');
INSERT INTO `projectinfo` VALUES ('3', '2017-07-21 17:45:10', 'www.baidu.com', '2017-07-21 17:45:10', '李阳:2', '13f241e1-e771-476c-ba38-05f730eff7df', '13f241e1-e771-476c-ba38-05f730eff7df', 'Fri Jul 21 17:45:09 CST 2017');
INSERT INTO `projectinfo` VALUES ('4', '2017-07-21 17:45:10', 'www.baidu.com', '2017-07-21 17:45:10', '李阳:3', '9974bd0f-a306-466b-b677-c0df834051e6', '9974bd0f-a306-466b-b677-c0df834051e6', 'Fri Jul 21 17:45:09 CST 2017');
INSERT INTO `projectinfo` VALUES ('5', '2017-07-21 17:45:10', 'www.baidu.com', '2017-07-21 17:45:10', '李阳:4', '1cc201f7-a3ca-4251-b736-14f04028b8b5', '1cc201f7-a3ca-4251-b736-14f04028b8b5', 'Fri Jul 21 17:45:09 CST 2017');
INSERT INTO `projectinfo` VALUES ('6', '2017-07-21 17:46:22', 'www.baidu.com', '2017-07-21 17:46:22', '李阳:0', '84009593-36ee-49d6-aa4e-d3c47e409a20', '84009593-36ee-49d6-aa4e-d3c47e409a20', 'Fri Jul 21 17:46:22 CST 2017');
INSERT INTO `projectinfo` VALUES ('7', '2017-07-21 17:46:22', 'www.baidu.com', '2017-07-21 17:46:22', '李阳:1', '5eff08ed-4dd8-4a5c-afde-e6669daf384a', '5eff08ed-4dd8-4a5c-afde-e6669daf384a', 'Fri Jul 21 17:46:22 CST 2017');
INSERT INTO `projectinfo` VALUES ('8', '2017-07-21 17:46:22', 'www.baidu.com', '2017-07-21 17:46:22', '李阳:2', 'b766803e-8df5-4ebc-b544-49a103db55fb', 'b766803e-8df5-4ebc-b544-49a103db55fb', 'Fri Jul 21 17:46:22 CST 2017');
INSERT INTO `projectinfo` VALUES ('9', '2017-07-21 17:46:22', 'www.baidu.com', '2017-07-21 17:46:22', '李阳:3', '15dcab29-79f9-4a17-99a5-ba7569a8723f', '15dcab29-79f9-4a17-99a5-ba7569a8723f', 'Fri Jul 21 17:46:22 CST 2017');
INSERT INTO `projectinfo` VALUES ('10', '2017-07-21 17:46:22', 'www.baidu.com', '2017-07-21 17:46:22', '李阳:4', 'c115ca0d-9e38-4930-96eb-a96a781d163c', 'c115ca0d-9e38-4930-96eb-a96a781d163c', 'Fri Jul 21 17:46:22 CST 2017');
INSERT INTO `projectinfo` VALUES ('11', '2017-07-21 17:52:47', 'www.baidu.com', '2017-07-21 17:52:47', '李阳:0', '28a8f0e2-7dad-48bd-9d66-d8be49541ea1', '28a8f0e2-7dad-48bd-9d66-d8be49541ea1', 'Fri Jul 21 17:52:46 CST 2017');
INSERT INTO `projectinfo` VALUES ('12', '2017-07-21 17:52:47', 'www.baidu.com', '2017-07-21 17:52:47', '李阳:1', 'ef6a48ac-f564-499a-b20e-3f29ba0b8a3d', 'ef6a48ac-f564-499a-b20e-3f29ba0b8a3d', 'Fri Jul 21 17:52:46 CST 2017');
INSERT INTO `projectinfo` VALUES ('13', '2017-07-21 17:52:47', 'www.baidu.com', '2017-07-21 17:52:47', '李阳:2', '0e6239e4-b973-4ed0-a737-491a62dea04c', '0e6239e4-b973-4ed0-a737-491a62dea04c', 'Fri Jul 21 17:52:46 CST 2017');
INSERT INTO `projectinfo` VALUES ('14', '2017-07-21 17:52:47', 'www.baidu.com', '2017-07-21 17:52:47', '李阳:3', 'a4773e71-ada7-4f0f-98f1-5cbaf9f58fd5', 'a4773e71-ada7-4f0f-98f1-5cbaf9f58fd5', 'Fri Jul 21 17:52:46 CST 2017');
INSERT INTO `projectinfo` VALUES ('15', '2017-07-21 17:52:47', 'www.baidu.com', '2017-07-21 17:52:47', '李阳:4', '82271059-d281-492d-8856-c72a29f325e2', '82271059-d281-492d-8856-c72a29f325e2', 'Fri Jul 21 17:52:46 CST 2017');
