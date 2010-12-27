/*
Navicat MySQL Data Transfer

Source Server         : localDB
Source Server Version : 50045
Source Host           : localhost:12581
Source Database       : webmail

Target Server Type    : MYSQL
Target Server Version : 50045
File Encoding         : 65001

Date: 2010-12-27 16:00:24
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
