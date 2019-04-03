/*
Navicat MySQL Data Transfer

Source Server         : mock
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : main

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-12-19 18:47:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for testing_task
-- ----------------------------
DROP TABLE IF EXISTS `testing_task`;
CREATE TABLE `testing_task` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(20) CHARACTER SET gbk DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET gbk DEFAULT NULL COMMENT '内容',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `state` varchar(10) CHARACTER SET gbk DEFAULT NULL COMMENT '状态',
  `person` varchar(255) CHARACTER SET gbk DEFAULT NULL COMMENT '负责人',
  `flow_time` datetime DEFAULT NULL COMMENT '流转时间',
  `edition` varchar(20) CHARACTER SET gbk DEFAULT NULL COMMENT '迭代版本',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of testing_task
-- ----------------------------
