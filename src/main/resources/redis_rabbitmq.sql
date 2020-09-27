/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : redis_rabbitmq

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 27/09/2020 18:14:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock`  (
  `id` int(0) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stock` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '库存表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES (1, '小米', '0');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `order_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES (21, 'watch', '5');
INSERT INTO `t_order` VALUES (22, 'watch', '56');
INSERT INTO `t_order` VALUES (23, 'watch', '1');
INSERT INTO `t_order` VALUES (24, 'watch', '84');
INSERT INTO `t_order` VALUES (25, 'watch', '66');
INSERT INTO `t_order` VALUES (26, 'watch', '85');
INSERT INTO `t_order` VALUES (27, 'watch', '85');
INSERT INTO `t_order` VALUES (28, 'watch', '53');
INSERT INTO `t_order` VALUES (29, 'watch', '91');
INSERT INTO `t_order` VALUES (30, 'watch', '38');
INSERT INTO `t_order` VALUES (31, '小米', '12');
INSERT INTO `t_order` VALUES (32, '小米', '55');
INSERT INTO `t_order` VALUES (33, '小米', '81');
INSERT INTO `t_order` VALUES (34, '小米', '74');
INSERT INTO `t_order` VALUES (35, '小米', '13');
INSERT INTO `t_order` VALUES (36, '小米', '30');
INSERT INTO `t_order` VALUES (37, '小米', '61');
INSERT INTO `t_order` VALUES (38, '小米', '10');
INSERT INTO `t_order` VALUES (39, '小米', '64');
INSERT INTO `t_order` VALUES (40, '小米', '85');

SET FOREIGN_KEY_CHECKS = 1;
