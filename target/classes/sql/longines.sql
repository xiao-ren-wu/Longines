-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.16


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema longines
--

CREATE DATABASE IF NOT EXISTS longines;
USE longines;

--
-- Definition of table `tb_admin`
--

DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `a_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `aname` varchar(45) NOT NULL,
  `a_pw` varchar(45) NOT NULL,
  `a_tel` varchar(45) NOT NULL,
  `catagory` varchar(45) NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_admin`
--

/*!40000 ALTER TABLE `tb_admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_admin` ENABLE KEYS */;


--
-- Definition of table `tb_c_pic`
--

DROP TABLE IF EXISTS `tb_c_pic`;
CREATE TABLE `tb_c_pic` (
  `c_id` int(10) unsigned NOT NULL,
  `c_inv` int(10) unsigned NOT NULL,
  `c_pic` varchar(100) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_c_pic`
--

/*!40000 ALTER TABLE `tb_c_pic` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_c_pic` ENABLE KEYS */;


--
-- Definition of table `tb_collection`
--

DROP TABLE IF EXISTS `tb_collection`;
CREATE TABLE `tb_collection` (
  `u_id` int(10) unsigned NOT NULL,
  `g_id` int(10) unsigned NOT NULL,
  `coll_time` datetime NOT NULL,
  `c_price` decimal(10,0) NOT NULL,
  `pur` int(10) unsigned NOT NULL,
  `invalid` int(10) unsigned NOT NULL,
  PRIMARY KEY (`u_id`,`g_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_collection`
--

/*!40000 ALTER TABLE `tb_collection` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_collection` ENABLE KEYS */;


--
-- Definition of table `tb_coupons`
--

DROP TABLE IF EXISTS `tb_coupons`;
CREATE TABLE `tb_coupons` (
  `c_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `m_id` int(10) unsigned NOT NULL,
  `u_id` varchar(45) NOT NULL,
  `discount` varchar(45) NOT NULL,
  `number` int(10) unsigned NOT NULL,
  `t_limit` varchar(45) NOT NULL,
  PRIMARY KEY (`c_id`,`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_coupons`
--

/*!40000 ALTER TABLE `tb_coupons` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_coupons` ENABLE KEYS */;


--
-- Definition of table `tb_goods_info`
--

DROP TABLE IF EXISTS `tb_goods_info`;
CREATE TABLE `tb_goods_info` (
  `g_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `gname` varchar(45) NOT NULL,
  `brand` varchar(45) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `theme` varchar(45) NOT NULL,
  `mov` varchar(45) DEFAULT NULL,
  `func` varchar(45) DEFAULT NULL,
  `a_peo` varchar(45) DEFAULT NULL,
  `dial` varchar(45) DEFAULT NULL,
  `strap` varchar(45) DEFAULT NULL,
  `w_but` varchar(45) DEFAULT NULL,
  `g_pic` varchar(100) NOT NULL,
  PRIMARY KEY (`g_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_goods_info`
--

/*!40000 ALTER TABLE `tb_goods_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_goods_info` ENABLE KEYS */;


--
-- Definition of table `tb_merce`
--

DROP TABLE IF EXISTS `tb_merce`;
CREATE TABLE `tb_merce` (
  `m_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `sname` varchar(45) NOT NULL,
  `s_cred` varchar(45) NOT NULL,
  `s_time` varchar(45) NOT NULL,
  `home` varchar(45) NOT NULL,
  `c_intro` varchar(45) NOT NULL,
  `m_tel` varchar(45) NOT NULL,
  `s_manager` varchar(45) NOT NULL,
  `b_card` varchar(45) NOT NULL,
  `p_ser` varchar(45) NOT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_merce`
--

/*!40000 ALTER TABLE `tb_merce` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_merce` ENABLE KEYS */;


--
-- Definition of table `tb_mg_associated`
--

DROP TABLE IF EXISTS `tb_mg_associated`;
CREATE TABLE `tb_mg_associated` (
  `m_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `g_id` varchar(45) NOT NULL,
  `inv` int(10) unsigned NOT NULL,
  `s_time` datetime NOT NULL,
  PRIMARY KEY (`m_id`,`g_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_mg_associated`
--

/*!40000 ALTER TABLE `tb_mg_associated` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_mg_associated` ENABLE KEYS */;


--
-- Definition of table `tb_order`
--

DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `o_id` int(10) unsigned NOT NULL,
  `g_id` int(10) unsigned NOT NULL,
  `g_num` int(10) unsigned NOT NULL,
  PRIMARY KEY (`o_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_order`
--

/*!40000 ALTER TABLE `tb_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_order` ENABLE KEYS */;


--
-- Definition of table `tb_order_info`
--

DROP TABLE IF EXISTS `tb_order_info`;
CREATE TABLE `tb_order_info` (
  `o_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `u_id` int(10) unsigned NOT NULL,
  `a_id` int(10) unsigned NOT NULL,
  `cre_date` datetime NOT NULL,
  `del_date` datetime NOT NULL,
  `tb_date` datetime NOT NULL,
  `a_amount` decimal(10,0) NOT NULL,
  `freight` decimal(10,0) NOT NULL,
  `s_num` int(10) unsigned NOT NULL,
  `d_method` varchar(45) NOT NULL,
  PRIMARY KEY (`o_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_order_info`
--

/*!40000 ALTER TABLE `tb_order_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_order_info` ENABLE KEYS */;


--
-- Definition of table `tb_pay`
--

DROP TABLE IF EXISTS `tb_pay`;
CREATE TABLE `tb_pay` (
  `p_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `u_id` int(10) unsigned NOT NULL,
  `o_id` int(10) unsigned NOT NULL,
  `p_method` varchar(45) NOT NULL,
  `t_num` varchar(45) NOT NULL,
  `pm_data` datetime NOT NULL,
  PRIMARY KEY (`p_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_pay`
--

/*!40000 ALTER TABLE `tb_pay` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_pay` ENABLE KEYS */;


--
-- Definition of table `tb_rec_info`
--

DROP TABLE IF EXISTS `tb_rec_info`;
CREATE TABLE `tb_rec_info` (
  `u_id` int(10) unsigned NOT NULL,
  `a_id` int(10) unsigned NOT NULL,
  `consignee` varchar(45) NOT NULL,
  `s_add` varchar(45) NOT NULL,
  `c_tel` varchar(45) NOT NULL,
  `postcode` varchar(45) NOT NULL,
  PRIMARY KEY (`u_id`,`a_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_rec_info`
--

/*!40000 ALTER TABLE `tb_rec_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_rec_info` ENABLE KEYS */;


--
-- Definition of table `tb_shopping_cart`
--

DROP TABLE IF EXISTS `tb_shopping_cart`;
CREATE TABLE `tb_shopping_cart` (
  `u_id` int(10) unsigned NOT NULL,
  `g_id` int(10) unsigned NOT NULL,
  `g_num` int(10) unsigned NOT NULL,
  `t_amount` decimal(10,0) NOT NULL,
  `status` int(10) unsigned NOT NULL,
  PRIMARY KEY (`u_id`,`g_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_shopping_cart`
--

/*!40000 ALTER TABLE `tb_shopping_cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_shopping_cart` ENABLE KEYS */;


--
-- Definition of table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `u_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uname` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `tel_num` varchar(45) NOT NULL,
  `pw` varchar(100) NOT NULL,
  `ac_balance` decimal(10,0) NOT NULL,
  `label` varchar(45) DEFAULT NULL,
  `birth` varchar(45) DEFAULT NULL,
  `pic` varchar(45) DEFAULT NULL,
  `sug` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_user`
--

/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
