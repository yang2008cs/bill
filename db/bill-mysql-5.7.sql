/*
Navicat MySQL Data Transfer

Source Server         : 192.168.0.110
Source Server Version : 50717
Source Host           : 192.168.0.110:3306
Source Database       : bill

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-07-20 14:14:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_log
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
-- Table structure for sys_menu
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
INSERT INTO `sys_menu` VALUES ('7934dc0b810011e893b8107b44518d0a', ' 添加用户页面', '920f8f147f3811e893b8107b44518d0a', 'addUser', '2', '2018-07-06 17:40:36', '2018-07-06 17:40:36', 'user:show', '2');
INSERT INTO `sys_menu` VALUES ('7e0d8f6f841911e893b8107b44518d0a', '新增', 'ad68b690810011e893b8107b44518d0a', '', '1', '2018-07-10 16:17:31', '2018-07-10 16:17:31', 'as', '0');
INSERT INTO `sys_menu` VALUES ('8c360f29810011e893b8107b44518d0a', '角色管理', null, null, '1', '2018-07-06 17:41:08', '2018-07-06 17:41:08', null, '1');
INSERT INTO `sys_menu` VALUES ('920f8f147f3811e893b8107b44518d0a', '用户管理', null, null, '1', '2018-07-04 11:16:58', '2018-07-04 11:16:58', null, '1');
INSERT INTO `sys_menu` VALUES ('92b8cee4810011e893b8107b44518d0a', '菜单管理', null, null, '1', '2018-07-06 17:41:19', '2018-07-06 17:41:19', null, '1');
INSERT INTO `sys_menu` VALUES ('ac10fe9a841911e893b8107b44518d0a', '添加', '7934dc0b810011e893b8107b44518d0a', '', '3', '2018-07-10 16:18:48', '2018-07-10 16:18:48', '萨达', '0');
INSERT INTO `sys_menu` VALUES ('ad68b690810011e893b8107b44518d0a', '添加角色页面', '8c360f29810011e893b8107b44518d0a', 'addRole', '2', '2018-07-06 17:42:04', '2018-07-06 17:42:04', 'role:show', '2');

-- ----------------------------
-- Table structure for sys_user
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
