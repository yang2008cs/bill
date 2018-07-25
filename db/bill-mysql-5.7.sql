/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : bill

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-07-25 11:29:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_log`
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` varchar(36) NOT NULL,
  `user_name` varchar(32) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `param` text,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` varchar(36) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `p_id` varchar(36) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `order_num` int(4) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `menu_type` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('74c14bf78be911e8a9595cea1d790d8c', '新增', '92b8cee4810011e893b8107b44518d0a', '', '1', '2018-07-20 14:52:23', '2018-07-21 14:57:18', 'menu:add', '0');
INSERT INTO `sys_menu` VALUES ('8c360f29810011e893b8107b44518d0a', '角色管理', null, null, '1', '2018-07-06 17:41:08', '2018-07-06 17:41:08', null, '1');
INSERT INTO `sys_menu` VALUES ('920f8f147f3811e893b8107b44518d0a', '用户管理', null, null, '1', '2018-07-04 11:16:58', '2018-07-04 11:16:58', null, '1');
INSERT INTO `sys_menu` VALUES ('92b8cee4810011e893b8107b44518d0a', '菜单管理', null, null, '1', '2018-07-06 17:41:19', '2018-07-06 17:41:19', null, '1');
INSERT INTO `sys_menu` VALUES ('ac10fe9a841911e893b8107b44518d0a', '修改', '920f8f147f3811e893b8107b44518d0a', '', '3', '2018-07-10 16:18:48', '2018-07-21 14:56:51', 'user:update', '0');
INSERT INTO `sys_menu` VALUES ('bb5476228bef11e881475cea1d790d8c', ' 修改', '92b8cee4810011e893b8107b44518d0a', '', '2', '2018-07-20 15:37:19', '2018-07-20 15:54:42', 'menu:add', '0');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(255) NOT NULL,
  `role_name` varchar(255) NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('0c42106e8fb711e893035cea1d790d8c', '发的规划', '更好', '2018-07-25 11:01:38', '2018-07-25 11:01:38');
INSERT INTO `sys_role` VALUES ('4a0a99e58fb711e893035cea1d790d8c', '两节课', '返回', '2018-07-25 11:03:22', '2018-07-25 11:03:22');
INSERT INTO `sys_role` VALUES ('ae80ae558fb611e893035cea1d790d8c', '阿萨德', '阿萨德', '2018-07-25 10:59:01', '2018-07-25 10:59:01');
INSERT INTO `sys_role` VALUES ('bed7498a8fb411e893035cea1d790d8c', '规范', '多个', '2018-07-25 10:45:09', '2018-07-25 10:45:09');
INSERT INTO `sys_role` VALUES ('d79eadab8fb611e893035cea1d790d8c', '多个', '多个', '2018-07-25 11:00:10', '2018-07-25 11:00:10');
INSERT INTO `sys_role` VALUES ('e786f95b8fb411e893035cea1d790d8c', '规范', '多个', '2018-07-25 10:46:18', '2018-07-25 10:46:18');
INSERT INTO `sys_role` VALUES ('f83020d38fb311e893035cea1d790d8c', 'admin', '管理员', '2018-07-25 10:39:36', '2018-07-25 10:39:36');
INSERT INTO `sys_role` VALUES ('ff2ba05a8fb511e893035cea1d790d8c', '多个', '多个', '2018-07-25 10:54:07', '2018-07-25 10:54:07');

-- ----------------------------
-- Table structure for `sys_role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `role_id` varchar(255) DEFAULT NULL,
  `menu_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('f83020d38fb311e893035cea1d790d8c', '8c360f29810011e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('f83020d38fb311e893035cea1d790d8c', '920f8f147f3811e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('f83020d38fb311e893035cea1d790d8c', 'ac10fe9a841911e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('f83020d38fb311e893035cea1d790d8c', '92b8cee4810011e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('f83020d38fb311e893035cea1d790d8c', '74c14bf78be911e8a9595cea1d790d8c');
INSERT INTO `sys_role_menu` VALUES ('f83020d38fb311e893035cea1d790d8c', 'bb5476228bef11e881475cea1d790d8c');
INSERT INTO `sys_role_menu` VALUES ('bed7498a8fb411e893035cea1d790d8c', '920f8f147f3811e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('bed7498a8fb411e893035cea1d790d8c', 'ac10fe9a841911e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('e786f95b8fb411e893035cea1d790d8c', '920f8f147f3811e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('e786f95b8fb411e893035cea1d790d8c', 'ac10fe9a841911e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('ff2ba05a8fb511e893035cea1d790d8c', '92b8cee4810011e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('ff2ba05a8fb511e893035cea1d790d8c', '74c14bf78be911e8a9595cea1d790d8c');
INSERT INTO `sys_role_menu` VALUES ('ff2ba05a8fb511e893035cea1d790d8c', 'bb5476228bef11e881475cea1d790d8c');
INSERT INTO `sys_role_menu` VALUES ('ae80ae558fb611e893035cea1d790d8c', '92b8cee4810011e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('ae80ae558fb611e893035cea1d790d8c', '74c14bf78be911e8a9595cea1d790d8c');
INSERT INTO `sys_role_menu` VALUES ('ae80ae558fb611e893035cea1d790d8c', 'bb5476228bef11e881475cea1d790d8c');
INSERT INTO `sys_role_menu` VALUES ('d79eadab8fb611e893035cea1d790d8c', '920f8f147f3811e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('d79eadab8fb611e893035cea1d790d8c', 'ac10fe9a841911e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('0c42106e8fb711e893035cea1d790d8c', '920f8f147f3811e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('0c42106e8fb711e893035cea1d790d8c', 'ac10fe9a841911e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('4a0a99e58fb711e893035cea1d790d8c', '920f8f147f3811e893b8107b44518d0a');
INSERT INTO `sys_role_menu` VALUES ('4a0a99e58fb711e893035cea1d790d8c', 'ac10fe9a841911e893b8107b44518d0a');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(36) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` int(4) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `real_name` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `del_flag` tinyint(4) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('d5f9550079f511e893b8107b44518d0a', '18091305401', '123456', '27', '1', null, null, null, '2018-06-27 18:36:13', '2018-06-27 18:36:13', '0', null);
