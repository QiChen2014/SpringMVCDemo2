/*
Navicat MySQL Data Transfer

Source Server         : 本机服务器
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-03-16 11:11:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('20', 'qq', '123');
INSERT INTO `t_user` VALUES ('21', 'qq1', '123');
INSERT INTO `t_user` VALUES ('22', '娃儿', 'wer');
INSERT INTO `t_user` VALUES ('23', '娃儿娃儿', 'wer');
INSERT INTO `t_user` VALUES ('24', 'qqq', '123');
INSERT INTO `t_user` VALUES ('25', 'qqqq', '123');
INSERT INTO `t_user` VALUES ('26', 'dad', 'ewe');
INSERT INTO `t_user` VALUES ('27', 'qwe', 'eqe');
INSERT INTO `t_user` VALUES ('28', 'ded', 'dd');
