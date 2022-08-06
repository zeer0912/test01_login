/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : test01_user

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 02/08/2022 22:38:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `password` varchar(45) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `studentID` varchar(45) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '123567', '20A7C44F959AC8E79A2EA3E1490C5557', 'hhh');
INSERT INTO `users` VALUES (2, 'Swift', '7AB6D090F85DF5C6A7412E68B1EBD4D5', '12345');
INSERT INTO `users` VALUES (3, 'Taylor', '4C64FE67FC9DCDCFD4A4140498A0D905', 'abcdefg');
INSERT INTO `users` VALUES (4, 'grthr', '0F1A3DE0DEF28E2C4D3134BAB4960B57', 'gzx1234');
INSERT INTO `users` VALUES (15, '东方不败', '4931105AC90C9C10B98ABE1D1CA0D4D5', 'ABCD');
INSERT INTO `users` VALUES (16, '令狐冲', '1770332F09DFA278DF501ABB82A7B258', '1234');
INSERT INTO `users` VALUES (17, '东方不败1', 'CB14BDF6E8BD07F68C7FA14CB5DD8EA6', '123456');
INSERT INTO `users` VALUES (19, 'zeer', 'CB14BDF6E8BD07F68C7FA14CB5DD8EA6', '123456');
INSERT INTO `users` VALUES (21, 'hhhh', '7D0249C3EFEC5623AB84E375C70D12D6', '1234567');

SET FOREIGN_KEY_CHECKS = 1;
