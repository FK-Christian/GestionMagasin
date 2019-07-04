/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : gestionmagasinbd

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-02-02 12:19:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `idAddress` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `numtel` varchar(45) DEFAULT NULL,
  `lieu_de_residense` varchar(50) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `boitePostal` varchar(45) DEFAULT NULL,
  `siteWeb` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAddress`),
  UNIQUE KEY `numtel_UNIQUE` (`numtel`,`boitePostal`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('1', '(+237)78132186', 'MVog-betsi', 'fodoup@gmail.com', 'Yaounde', 'www.facebook.com/FKC_Christian');
INSERT INTO `address` VALUES ('2', '(+237)XXXXXXXX', 'Lieu_Default_FOURNISSEUR', 'fournisseur@fournisseur.com', 'VILLE', 'SiteWeb');
INSERT INTO `address` VALUES ('3', '(+237)XXXXXXXXX', 'Lieu_Default_Client', 'client@client.com', 'VILLE', 'siteweb');
INSERT INTO `address` VALUES ('4', '691851897', 'brazzaville', 'alexepoh60@gmail.com', '', '');
INSERT INTO `address` VALUES ('5', '650448197', '', '', ' ', '');
INSERT INTO `address` VALUES ('6', '694095075', '', 'tchuemobert@yahoo.fr', '', '');
INSERT INTO `address` VALUES ('7', '679697307', '', '', ' ', '');
INSERT INTO `address` VALUES ('8', '691716273', '', '', ' ', '');

-- ----------------------------
-- Table structure for `categories`
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories` (
  `idCategories` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `designation` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `GrandeCategorie_idGrandeCategorie` int(11) NOT NULL,
  PRIMARY KEY (`idCategories`),
  KEY `fk_categories_GrandeCategorie1_idx` (`GrandeCategorie_idGrandeCategorie`),
  CONSTRAINT `fk_categories_GrandeCategorie1` FOREIGN KEY (`GrandeCategorie_idGrandeCategorie`) REFERENCES `grandecategorie` (`idGrandeCategorie`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES ('1', 'XL', '', '1');
INSERT INTO `categories` VALUES ('2', 'XL', '', '4');
INSERT INTO `categories` VALUES ('3', 'M', '', '1');
INSERT INTO `categories` VALUES ('4', 'XXL', '', '1');
INSERT INTO `categories` VALUES ('5', 'L', '', '1');
INSERT INTO `categories` VALUES ('6', 'taille52', '', '2');
INSERT INTO `categories` VALUES ('7', 'XL', '', '2');
INSERT INTO `categories` VALUES ('8', 'taille38', '', '5');
INSERT INTO `categories` VALUES ('9', 'taille34', '', '5');
INSERT INTO `categories` VALUES ('10', 'taille32', '', '3');
INSERT INTO `categories` VALUES ('11', 'taille30', '', '5');
INSERT INTO `categories` VALUES ('12', 'taille32', '', '5');
INSERT INTO `categories` VALUES ('13', 'taille36', '', '5');
INSERT INTO `categories` VALUES ('14', 'S', '', '6');
INSERT INTO `categories` VALUES ('15', 'L', '', '6');
INSERT INTO `categories` VALUES ('16', 'XL', '', '6');
INSERT INTO `categories` VALUES ('17', 'M', '', '6');
INSERT INTO `categories` VALUES ('18', '3XL', '', '6');
INSERT INTO `categories` VALUES ('19', 'M', '', '8');
INSERT INTO `categories` VALUES ('20', 'XL', '', '8');
INSERT INTO `categories` VALUES ('21', 'taille34', '', '8');
INSERT INTO `categories` VALUES ('22', 'L', '', '8');
INSERT INTO `categories` VALUES ('23', 'XXL', '', '8');
INSERT INTO `categories` VALUES ('24', 'S', '', '8');
INSERT INTO `categories` VALUES ('25', 'taille 40', '', '6');
INSERT INTO `categories` VALUES ('26', 'taille 42', '', '6');
INSERT INTO `categories` VALUES ('27', 'XXL', '', '6');
INSERT INTO `categories` VALUES ('28', '4XL', '', '6');
INSERT INTO `categories` VALUES ('29', '2XL', '', '6');
INSERT INTO `categories` VALUES ('30', 'XXL', '', '6');
INSERT INTO `categories` VALUES ('31', 'OR', '', '23');
INSERT INTO `categories` VALUES ('32', 'ARGEN', '', '23');
INSERT INTO `categories` VALUES ('33', 'MARRON', '', '23');
INSERT INTO `categories` VALUES ('34', 'JAUNE', '', '23');
INSERT INTO `categories` VALUES ('35', 'ROSE', '', '23');
INSERT INTO `categories` VALUES ('36', 'NOIR', '', '23');
INSERT INTO `categories` VALUES ('37', 'ROUGE', '', '23');
INSERT INTO `categories` VALUES ('38', 'VIOLET', '', '23');
INSERT INTO `categories` VALUES ('39', 'NOIR', '', '22');
INSERT INTO `categories` VALUES ('40', 'SPORTIF', '', '22');
INSERT INTO `categories` VALUES ('41', 'OR', '', '24');
INSERT INTO `categories` VALUES ('42', '2XL', '', '1');
INSERT INTO `categories` VALUES ('43', '2XL', '', '8');
INSERT INTO `categories` VALUES ('44', '46', '', '17');
INSERT INTO `categories` VALUES ('45', '44', '', '17');
INSERT INTO `categories` VALUES ('46', 'HAT 04', '', '18');
INSERT INTO `categories` VALUES ('47', '43', '', '17');
INSERT INTO `categories` VALUES ('48', '42', '', '17');
INSERT INTO `categories` VALUES ('49', '40', '', '17');
INSERT INTO `categories` VALUES ('50', '45', '', '17');
INSERT INTO `categories` VALUES ('51', 'hat 04', '', '21');
INSERT INTO `categories` VALUES ('52', 'taille 36', '', '6');
INSERT INTO `categories` VALUES ('53', 'taille 43', '', '6');
INSERT INTO `categories` VALUES ('54', 'taille 41', '', '6');
INSERT INTO `categories` VALUES ('55', 'taille 38', '', '6');
INSERT INTO `categories` VALUES ('56', 'XS', '', '6');
INSERT INTO `categories` VALUES ('57', 'taille 34', '', '6');
INSERT INTO `categories` VALUES ('58', 'taille 39', '', '6');
INSERT INTO `categories` VALUES ('59', 'taillle 37', '', '6');
INSERT INTO `categories` VALUES ('60', 'taille 44', '', '6');
INSERT INTO `categories` VALUES ('61', 'taille 46', '', '6');
INSERT INTO `categories` VALUES ('62', '36', '', '25');
INSERT INTO `categories` VALUES ('63', '10', '', '25');
INSERT INTO `categories` VALUES ('64', '40', '', '25');
INSERT INTO `categories` VALUES ('65', '42', '', '8');
INSERT INTO `categories` VALUES ('66', '26', '', '8');
INSERT INTO `categories` VALUES ('67', '38', '', '8');
INSERT INTO `categories` VALUES ('68', '42', '', '25');
INSERT INTO `categories` VALUES ('69', '42', '', '8');
INSERT INTO `categories` VALUES ('70', '26', '', '25');
INSERT INTO `categories` VALUES ('71', '38', '', '25');
INSERT INTO `categories` VALUES ('72', '32', '', '25');
INSERT INTO `categories` VALUES ('73', '29', '', '3');
INSERT INTO `categories` VALUES ('74', '30', '', '3');
INSERT INTO `categories` VALUES ('75', '31', '', '3');
INSERT INTO `categories` VALUES ('76', '34', '', '3');
INSERT INTO `categories` VALUES ('77', '33', '', '3');
INSERT INTO `categories` VALUES ('78', 'S', '', '11');
INSERT INTO `categories` VALUES ('79', 'F', '', '11');
INSERT INTO `categories` VALUES ('80', 'M', '', '11');
INSERT INTO `categories` VALUES ('81', 'M', '', '10');
INSERT INTO `categories` VALUES ('82', 'XL', '', '10');
INSERT INTO `categories` VALUES ('83', '12', '', '11');
INSERT INTO `categories` VALUES ('84', 'M', '', '15');
INSERT INTO `categories` VALUES ('85', 'XL ', '', '14');
INSERT INTO `categories` VALUES ('86', 'L', '', '13');
INSERT INTO `categories` VALUES ('87', '28', '', '14');
INSERT INTO `categories` VALUES ('88', 'L', '', '14');
INSERT INTO `categories` VALUES ('89', 'XXL', '', '10');
INSERT INTO `categories` VALUES ('90', 'L', '', '12');
INSERT INTO `categories` VALUES ('91', 'M', '', '12');
INSERT INTO `categories` VALUES ('92', '14', '', '12');
INSERT INTO `categories` VALUES ('93', 'XXL', '', '12');
INSERT INTO `categories` VALUES ('94', 'X', '', '9');

-- ----------------------------
-- Table structure for `charges`
-- ----------------------------
DROP TABLE IF EXISTS `charges`;
CREATE TABLE `charges` (
  `idcharges` int(11) NOT NULL AUTO_INCREMENT,
  `designation` varchar(45) NOT NULL,
  `montant` int(11) NOT NULL,
  `type` varchar(3) NOT NULL,
  `date` date NOT NULL,
  `description` varchar(300) DEFAULT NULL,
  `prisEnCompte` tinyint(1) NOT NULL,
  PRIMARY KEY (`idcharges`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of charges
-- ----------------------------

-- ----------------------------
-- Table structure for `client`
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `idClient` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `addressidAddress` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idClient`),
  UNIQUE KEY `addressidAddress_UNIQUE` (`prenom`,`nom`),
  KEY `FKclient837908` (`addressidAddress`),
  CONSTRAINT `FKclient837908` FOREIGN KEY (`addressidAddress`) REFERENCES `address` (`idAddress`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES ('1', 'Inconnu', ' ', '3');
INSERT INTO `client` VALUES ('2', 'FABRICE', '', '5');
INSERT INTO `client` VALUES ('3', 'dikoussa', '', '7');
INSERT INTO `client` VALUES ('4', 'Cedric', '', '8');

-- ----------------------------
-- Table structure for `fournisseur`
-- ----------------------------
DROP TABLE IF EXISTS `fournisseur`;
CREATE TABLE `fournisseur` (
  `idfournisseur` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `addressidAddress` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idfournisseur`),
  UNIQUE KEY `addressidAddress_UNIQUE` (`nom`,`addressidAddress`),
  KEY `FKfournisseu33300` (`addressidAddress`),
  CONSTRAINT `FKfournisseu33300` FOREIGN KEY (`addressidAddress`) REFERENCES `address` (`idAddress`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of fournisseur
-- ----------------------------
INSERT INTO `fournisseur` VALUES ('1', 'Fournisseur Par Defaut', '3');

-- ----------------------------
-- Table structure for `fournisseur_produit`
-- ----------------------------
DROP TABLE IF EXISTS `fournisseur_produit`;
CREATE TABLE `fournisseur_produit` (
  `fournisseuridfournisseur` int(10) unsigned NOT NULL,
  `produitidProduit` int(10) unsigned NOT NULL,
  PRIMARY KEY (`fournisseuridfournisseur`,`produitidProduit`),
  KEY `FKfournisseu133776` (`fournisseuridfournisseur`),
  KEY `FKfournisseu947703` (`produitidProduit`),
  CONSTRAINT `FKfournisseu133776` FOREIGN KEY (`fournisseuridfournisseur`) REFERENCES `fournisseur` (`idfournisseur`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKfournisseu947703` FOREIGN KEY (`produitidProduit`) REFERENCES `produit` (`idProduit`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of fournisseur_produit
-- ----------------------------
INSERT INTO `fournisseur_produit` VALUES ('1', '1');
INSERT INTO `fournisseur_produit` VALUES ('1', '2');
INSERT INTO `fournisseur_produit` VALUES ('1', '3');
INSERT INTO `fournisseur_produit` VALUES ('1', '4');
INSERT INTO `fournisseur_produit` VALUES ('1', '5');
INSERT INTO `fournisseur_produit` VALUES ('1', '6');
INSERT INTO `fournisseur_produit` VALUES ('1', '7');
INSERT INTO `fournisseur_produit` VALUES ('1', '8');
INSERT INTO `fournisseur_produit` VALUES ('1', '9');
INSERT INTO `fournisseur_produit` VALUES ('1', '10');
INSERT INTO `fournisseur_produit` VALUES ('1', '11');
INSERT INTO `fournisseur_produit` VALUES ('1', '12');
INSERT INTO `fournisseur_produit` VALUES ('1', '13');
INSERT INTO `fournisseur_produit` VALUES ('1', '14');
INSERT INTO `fournisseur_produit` VALUES ('1', '15');
INSERT INTO `fournisseur_produit` VALUES ('1', '16');
INSERT INTO `fournisseur_produit` VALUES ('1', '17');
INSERT INTO `fournisseur_produit` VALUES ('1', '18');
INSERT INTO `fournisseur_produit` VALUES ('1', '19');
INSERT INTO `fournisseur_produit` VALUES ('1', '20');
INSERT INTO `fournisseur_produit` VALUES ('1', '21');
INSERT INTO `fournisseur_produit` VALUES ('1', '22');
INSERT INTO `fournisseur_produit` VALUES ('1', '23');
INSERT INTO `fournisseur_produit` VALUES ('1', '24');
INSERT INTO `fournisseur_produit` VALUES ('1', '25');
INSERT INTO `fournisseur_produit` VALUES ('1', '26');
INSERT INTO `fournisseur_produit` VALUES ('1', '27');
INSERT INTO `fournisseur_produit` VALUES ('1', '28');
INSERT INTO `fournisseur_produit` VALUES ('1', '29');
INSERT INTO `fournisseur_produit` VALUES ('1', '30');
INSERT INTO `fournisseur_produit` VALUES ('1', '31');
INSERT INTO `fournisseur_produit` VALUES ('1', '32');
INSERT INTO `fournisseur_produit` VALUES ('1', '33');
INSERT INTO `fournisseur_produit` VALUES ('1', '34');
INSERT INTO `fournisseur_produit` VALUES ('1', '35');
INSERT INTO `fournisseur_produit` VALUES ('1', '36');
INSERT INTO `fournisseur_produit` VALUES ('1', '37');
INSERT INTO `fournisseur_produit` VALUES ('1', '38');
INSERT INTO `fournisseur_produit` VALUES ('1', '39');
INSERT INTO `fournisseur_produit` VALUES ('1', '40');
INSERT INTO `fournisseur_produit` VALUES ('1', '41');
INSERT INTO `fournisseur_produit` VALUES ('1', '42');
INSERT INTO `fournisseur_produit` VALUES ('1', '43');
INSERT INTO `fournisseur_produit` VALUES ('1', '44');
INSERT INTO `fournisseur_produit` VALUES ('1', '45');
INSERT INTO `fournisseur_produit` VALUES ('1', '46');
INSERT INTO `fournisseur_produit` VALUES ('1', '47');
INSERT INTO `fournisseur_produit` VALUES ('1', '48');
INSERT INTO `fournisseur_produit` VALUES ('1', '49');
INSERT INTO `fournisseur_produit` VALUES ('1', '50');
INSERT INTO `fournisseur_produit` VALUES ('1', '51');
INSERT INTO `fournisseur_produit` VALUES ('1', '52');
INSERT INTO `fournisseur_produit` VALUES ('1', '53');
INSERT INTO `fournisseur_produit` VALUES ('1', '54');
INSERT INTO `fournisseur_produit` VALUES ('1', '55');
INSERT INTO `fournisseur_produit` VALUES ('1', '56');
INSERT INTO `fournisseur_produit` VALUES ('1', '57');
INSERT INTO `fournisseur_produit` VALUES ('1', '58');
INSERT INTO `fournisseur_produit` VALUES ('1', '59');
INSERT INTO `fournisseur_produit` VALUES ('1', '60');
INSERT INTO `fournisseur_produit` VALUES ('1', '61');
INSERT INTO `fournisseur_produit` VALUES ('1', '62');
INSERT INTO `fournisseur_produit` VALUES ('1', '63');
INSERT INTO `fournisseur_produit` VALUES ('1', '64');
INSERT INTO `fournisseur_produit` VALUES ('1', '65');
INSERT INTO `fournisseur_produit` VALUES ('1', '66');
INSERT INTO `fournisseur_produit` VALUES ('1', '67');
INSERT INTO `fournisseur_produit` VALUES ('1', '68');
INSERT INTO `fournisseur_produit` VALUES ('1', '69');
INSERT INTO `fournisseur_produit` VALUES ('1', '70');
INSERT INTO `fournisseur_produit` VALUES ('1', '71');
INSERT INTO `fournisseur_produit` VALUES ('1', '72');
INSERT INTO `fournisseur_produit` VALUES ('1', '73');
INSERT INTO `fournisseur_produit` VALUES ('1', '74');
INSERT INTO `fournisseur_produit` VALUES ('1', '75');
INSERT INTO `fournisseur_produit` VALUES ('1', '76');
INSERT INTO `fournisseur_produit` VALUES ('1', '77');
INSERT INTO `fournisseur_produit` VALUES ('1', '78');
INSERT INTO `fournisseur_produit` VALUES ('1', '79');
INSERT INTO `fournisseur_produit` VALUES ('1', '80');
INSERT INTO `fournisseur_produit` VALUES ('1', '81');
INSERT INTO `fournisseur_produit` VALUES ('1', '82');
INSERT INTO `fournisseur_produit` VALUES ('1', '83');
INSERT INTO `fournisseur_produit` VALUES ('1', '84');
INSERT INTO `fournisseur_produit` VALUES ('1', '85');
INSERT INTO `fournisseur_produit` VALUES ('1', '86');
INSERT INTO `fournisseur_produit` VALUES ('1', '87');
INSERT INTO `fournisseur_produit` VALUES ('1', '88');
INSERT INTO `fournisseur_produit` VALUES ('1', '89');
INSERT INTO `fournisseur_produit` VALUES ('1', '90');
INSERT INTO `fournisseur_produit` VALUES ('1', '91');
INSERT INTO `fournisseur_produit` VALUES ('1', '92');
INSERT INTO `fournisseur_produit` VALUES ('1', '93');
INSERT INTO `fournisseur_produit` VALUES ('1', '94');
INSERT INTO `fournisseur_produit` VALUES ('1', '95');
INSERT INTO `fournisseur_produit` VALUES ('1', '96');
INSERT INTO `fournisseur_produit` VALUES ('1', '97');
INSERT INTO `fournisseur_produit` VALUES ('1', '98');
INSERT INTO `fournisseur_produit` VALUES ('1', '99');
INSERT INTO `fournisseur_produit` VALUES ('1', '100');
INSERT INTO `fournisseur_produit` VALUES ('1', '101');
INSERT INTO `fournisseur_produit` VALUES ('1', '102');
INSERT INTO `fournisseur_produit` VALUES ('1', '103');
INSERT INTO `fournisseur_produit` VALUES ('1', '104');
INSERT INTO `fournisseur_produit` VALUES ('1', '105');
INSERT INTO `fournisseur_produit` VALUES ('1', '106');
INSERT INTO `fournisseur_produit` VALUES ('1', '107');
INSERT INTO `fournisseur_produit` VALUES ('1', '108');
INSERT INTO `fournisseur_produit` VALUES ('1', '109');
INSERT INTO `fournisseur_produit` VALUES ('1', '110');
INSERT INTO `fournisseur_produit` VALUES ('1', '111');
INSERT INTO `fournisseur_produit` VALUES ('1', '112');
INSERT INTO `fournisseur_produit` VALUES ('1', '113');
INSERT INTO `fournisseur_produit` VALUES ('1', '114');
INSERT INTO `fournisseur_produit` VALUES ('1', '115');
INSERT INTO `fournisseur_produit` VALUES ('1', '116');
INSERT INTO `fournisseur_produit` VALUES ('1', '117');
INSERT INTO `fournisseur_produit` VALUES ('1', '118');
INSERT INTO `fournisseur_produit` VALUES ('1', '119');
INSERT INTO `fournisseur_produit` VALUES ('1', '120');
INSERT INTO `fournisseur_produit` VALUES ('1', '121');
INSERT INTO `fournisseur_produit` VALUES ('1', '122');
INSERT INTO `fournisseur_produit` VALUES ('1', '123');
INSERT INTO `fournisseur_produit` VALUES ('1', '124');
INSERT INTO `fournisseur_produit` VALUES ('1', '125');
INSERT INTO `fournisseur_produit` VALUES ('1', '126');
INSERT INTO `fournisseur_produit` VALUES ('1', '127');
INSERT INTO `fournisseur_produit` VALUES ('1', '128');
INSERT INTO `fournisseur_produit` VALUES ('1', '129');
INSERT INTO `fournisseur_produit` VALUES ('1', '130');
INSERT INTO `fournisseur_produit` VALUES ('1', '131');
INSERT INTO `fournisseur_produit` VALUES ('1', '132');
INSERT INTO `fournisseur_produit` VALUES ('1', '133');
INSERT INTO `fournisseur_produit` VALUES ('1', '134');
INSERT INTO `fournisseur_produit` VALUES ('1', '135');
INSERT INTO `fournisseur_produit` VALUES ('1', '136');
INSERT INTO `fournisseur_produit` VALUES ('1', '137');
INSERT INTO `fournisseur_produit` VALUES ('1', '138');
INSERT INTO `fournisseur_produit` VALUES ('1', '139');
INSERT INTO `fournisseur_produit` VALUES ('1', '140');
INSERT INTO `fournisseur_produit` VALUES ('1', '141');
INSERT INTO `fournisseur_produit` VALUES ('1', '142');
INSERT INTO `fournisseur_produit` VALUES ('1', '143');
INSERT INTO `fournisseur_produit` VALUES ('1', '144');
INSERT INTO `fournisseur_produit` VALUES ('1', '145');
INSERT INTO `fournisseur_produit` VALUES ('1', '146');
INSERT INTO `fournisseur_produit` VALUES ('1', '147');
INSERT INTO `fournisseur_produit` VALUES ('1', '148');
INSERT INTO `fournisseur_produit` VALUES ('1', '149');
INSERT INTO `fournisseur_produit` VALUES ('1', '150');
INSERT INTO `fournisseur_produit` VALUES ('1', '151');
INSERT INTO `fournisseur_produit` VALUES ('1', '152');
INSERT INTO `fournisseur_produit` VALUES ('1', '153');
INSERT INTO `fournisseur_produit` VALUES ('1', '154');
INSERT INTO `fournisseur_produit` VALUES ('1', '155');
INSERT INTO `fournisseur_produit` VALUES ('1', '156');
INSERT INTO `fournisseur_produit` VALUES ('1', '157');
INSERT INTO `fournisseur_produit` VALUES ('1', '158');
INSERT INTO `fournisseur_produit` VALUES ('1', '159');
INSERT INTO `fournisseur_produit` VALUES ('1', '160');
INSERT INTO `fournisseur_produit` VALUES ('1', '161');
INSERT INTO `fournisseur_produit` VALUES ('1', '162');
INSERT INTO `fournisseur_produit` VALUES ('1', '163');
INSERT INTO `fournisseur_produit` VALUES ('1', '164');
INSERT INTO `fournisseur_produit` VALUES ('1', '165');
INSERT INTO `fournisseur_produit` VALUES ('1', '166');
INSERT INTO `fournisseur_produit` VALUES ('1', '167');
INSERT INTO `fournisseur_produit` VALUES ('1', '168');
INSERT INTO `fournisseur_produit` VALUES ('1', '169');
INSERT INTO `fournisseur_produit` VALUES ('1', '170');
INSERT INTO `fournisseur_produit` VALUES ('1', '171');
INSERT INTO `fournisseur_produit` VALUES ('1', '172');
INSERT INTO `fournisseur_produit` VALUES ('1', '173');
INSERT INTO `fournisseur_produit` VALUES ('1', '174');
INSERT INTO `fournisseur_produit` VALUES ('1', '175');
INSERT INTO `fournisseur_produit` VALUES ('1', '176');
INSERT INTO `fournisseur_produit` VALUES ('1', '177');
INSERT INTO `fournisseur_produit` VALUES ('1', '178');
INSERT INTO `fournisseur_produit` VALUES ('1', '179');
INSERT INTO `fournisseur_produit` VALUES ('1', '180');
INSERT INTO `fournisseur_produit` VALUES ('1', '181');
INSERT INTO `fournisseur_produit` VALUES ('1', '182');
INSERT INTO `fournisseur_produit` VALUES ('1', '183');
INSERT INTO `fournisseur_produit` VALUES ('1', '184');
INSERT INTO `fournisseur_produit` VALUES ('1', '185');
INSERT INTO `fournisseur_produit` VALUES ('1', '186');
INSERT INTO `fournisseur_produit` VALUES ('1', '187');
INSERT INTO `fournisseur_produit` VALUES ('1', '188');
INSERT INTO `fournisseur_produit` VALUES ('1', '189');
INSERT INTO `fournisseur_produit` VALUES ('1', '190');
INSERT INTO `fournisseur_produit` VALUES ('1', '191');
INSERT INTO `fournisseur_produit` VALUES ('1', '192');
INSERT INTO `fournisseur_produit` VALUES ('1', '193');
INSERT INTO `fournisseur_produit` VALUES ('1', '194');
INSERT INTO `fournisseur_produit` VALUES ('1', '195');
INSERT INTO `fournisseur_produit` VALUES ('1', '196');
INSERT INTO `fournisseur_produit` VALUES ('1', '197');
INSERT INTO `fournisseur_produit` VALUES ('1', '198');
INSERT INTO `fournisseur_produit` VALUES ('1', '199');
INSERT INTO `fournisseur_produit` VALUES ('1', '200');
INSERT INTO `fournisseur_produit` VALUES ('1', '201');
INSERT INTO `fournisseur_produit` VALUES ('1', '202');
INSERT INTO `fournisseur_produit` VALUES ('1', '203');
INSERT INTO `fournisseur_produit` VALUES ('1', '204');
INSERT INTO `fournisseur_produit` VALUES ('1', '205');
INSERT INTO `fournisseur_produit` VALUES ('1', '206');
INSERT INTO `fournisseur_produit` VALUES ('1', '207');
INSERT INTO `fournisseur_produit` VALUES ('1', '208');
INSERT INTO `fournisseur_produit` VALUES ('1', '209');
INSERT INTO `fournisseur_produit` VALUES ('1', '210');
INSERT INTO `fournisseur_produit` VALUES ('1', '211');
INSERT INTO `fournisseur_produit` VALUES ('1', '212');
INSERT INTO `fournisseur_produit` VALUES ('1', '213');
INSERT INTO `fournisseur_produit` VALUES ('1', '214');
INSERT INTO `fournisseur_produit` VALUES ('1', '215');
INSERT INTO `fournisseur_produit` VALUES ('1', '216');
INSERT INTO `fournisseur_produit` VALUES ('1', '217');
INSERT INTO `fournisseur_produit` VALUES ('1', '218');
INSERT INTO `fournisseur_produit` VALUES ('1', '219');
INSERT INTO `fournisseur_produit` VALUES ('1', '220');
INSERT INTO `fournisseur_produit` VALUES ('1', '221');
INSERT INTO `fournisseur_produit` VALUES ('1', '222');
INSERT INTO `fournisseur_produit` VALUES ('1', '223');
INSERT INTO `fournisseur_produit` VALUES ('1', '224');
INSERT INTO `fournisseur_produit` VALUES ('1', '225');
INSERT INTO `fournisseur_produit` VALUES ('1', '226');
INSERT INTO `fournisseur_produit` VALUES ('1', '227');
INSERT INTO `fournisseur_produit` VALUES ('1', '228');
INSERT INTO `fournisseur_produit` VALUES ('1', '229');
INSERT INTO `fournisseur_produit` VALUES ('1', '230');
INSERT INTO `fournisseur_produit` VALUES ('1', '231');
INSERT INTO `fournisseur_produit` VALUES ('1', '232');
INSERT INTO `fournisseur_produit` VALUES ('1', '233');
INSERT INTO `fournisseur_produit` VALUES ('1', '234');
INSERT INTO `fournisseur_produit` VALUES ('1', '235');
INSERT INTO `fournisseur_produit` VALUES ('1', '236');
INSERT INTO `fournisseur_produit` VALUES ('1', '237');
INSERT INTO `fournisseur_produit` VALUES ('1', '238');
INSERT INTO `fournisseur_produit` VALUES ('1', '239');
INSERT INTO `fournisseur_produit` VALUES ('1', '240');
INSERT INTO `fournisseur_produit` VALUES ('1', '241');
INSERT INTO `fournisseur_produit` VALUES ('1', '242');
INSERT INTO `fournisseur_produit` VALUES ('1', '243');
INSERT INTO `fournisseur_produit` VALUES ('1', '244');
INSERT INTO `fournisseur_produit` VALUES ('1', '245');
INSERT INTO `fournisseur_produit` VALUES ('1', '246');
INSERT INTO `fournisseur_produit` VALUES ('1', '247');
INSERT INTO `fournisseur_produit` VALUES ('1', '248');
INSERT INTO `fournisseur_produit` VALUES ('1', '249');
INSERT INTO `fournisseur_produit` VALUES ('1', '250');
INSERT INTO `fournisseur_produit` VALUES ('1', '251');
INSERT INTO `fournisseur_produit` VALUES ('1', '252');
INSERT INTO `fournisseur_produit` VALUES ('1', '253');
INSERT INTO `fournisseur_produit` VALUES ('1', '254');
INSERT INTO `fournisseur_produit` VALUES ('1', '255');
INSERT INTO `fournisseur_produit` VALUES ('1', '256');
INSERT INTO `fournisseur_produit` VALUES ('1', '257');
INSERT INTO `fournisseur_produit` VALUES ('1', '258');
INSERT INTO `fournisseur_produit` VALUES ('1', '259');
INSERT INTO `fournisseur_produit` VALUES ('1', '260');
INSERT INTO `fournisseur_produit` VALUES ('1', '261');
INSERT INTO `fournisseur_produit` VALUES ('1', '262');
INSERT INTO `fournisseur_produit` VALUES ('1', '263');
INSERT INTO `fournisseur_produit` VALUES ('1', '264');
INSERT INTO `fournisseur_produit` VALUES ('1', '265');
INSERT INTO `fournisseur_produit` VALUES ('1', '266');
INSERT INTO `fournisseur_produit` VALUES ('1', '267');
INSERT INTO `fournisseur_produit` VALUES ('1', '268');
INSERT INTO `fournisseur_produit` VALUES ('1', '269');
INSERT INTO `fournisseur_produit` VALUES ('1', '270');
INSERT INTO `fournisseur_produit` VALUES ('1', '271');
INSERT INTO `fournisseur_produit` VALUES ('1', '272');
INSERT INTO `fournisseur_produit` VALUES ('1', '273');
INSERT INTO `fournisseur_produit` VALUES ('1', '274');
INSERT INTO `fournisseur_produit` VALUES ('1', '275');
INSERT INTO `fournisseur_produit` VALUES ('1', '276');
INSERT INTO `fournisseur_produit` VALUES ('1', '277');
INSERT INTO `fournisseur_produit` VALUES ('1', '278');
INSERT INTO `fournisseur_produit` VALUES ('1', '279');
INSERT INTO `fournisseur_produit` VALUES ('1', '280');
INSERT INTO `fournisseur_produit` VALUES ('1', '281');
INSERT INTO `fournisseur_produit` VALUES ('1', '282');
INSERT INTO `fournisseur_produit` VALUES ('1', '283');
INSERT INTO `fournisseur_produit` VALUES ('1', '284');
INSERT INTO `fournisseur_produit` VALUES ('1', '285');

-- ----------------------------
-- Table structure for `grandecategorie`
-- ----------------------------
DROP TABLE IF EXISTS `grandecategorie`;
CREATE TABLE `grandecategorie` (
  `idGrandeCategorie` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `description` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`idGrandeCategorie`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of grandecategorie
-- ----------------------------
INSERT INTO `grandecategorie` VALUES ('1', 'H/POLO', '');
INSERT INTO `grandecategorie` VALUES ('2', 'H/PULL', '');
INSERT INTO `grandecategorie` VALUES ('3', 'H/DINE', '');
INSERT INTO `grandecategorie` VALUES ('4', 'H/CULOTTE', '');
INSERT INTO `grandecategorie` VALUES ('5', 'H/PANTALON TISSUS', '');
INSERT INTO `grandecategorie` VALUES ('6', 'H/CHEMISE', '');
INSERT INTO `grandecategorie` VALUES ('7', 'H/ SOUS-VETEMENT', '');
INSERT INTO `grandecategorie` VALUES ('8', 'H/ T-SHIRT', '');
INSERT INTO `grandecategorie` VALUES ('9', 'H/ VESTE', '');
INSERT INTO `grandecategorie` VALUES ('10', 'F/ CHEMISE', '');
INSERT INTO `grandecategorie` VALUES ('11', 'F/ T-SHIRT', '');
INSERT INTO `grandecategorie` VALUES ('12', 'F/ ROBE', '');
INSERT INTO `grandecategorie` VALUES ('13', 'F/ JUPE', '');
INSERT INTO `grandecategorie` VALUES ('14', 'F/ PANTALON', '');
INSERT INTO `grandecategorie` VALUES ('15', 'F/ CULOTTE', '');
INSERT INTO `grandecategorie` VALUES ('16', 'H/ TENIS', '');
INSERT INTO `grandecategorie` VALUES ('17', 'H/ PAIRE MONSIEUR', '');
INSERT INTO `grandecategorie` VALUES ('18', 'H/ CASQUETTE', '');
INSERT INTO `grandecategorie` VALUES ('19', 'F/ CHAUSSURE', '');
INSERT INTO `grandecategorie` VALUES ('20', 'F/ SAC', '');
INSERT INTO `grandecategorie` VALUES ('21', 'F/ CHAPEAU', '');
INSERT INTO `grandecategorie` VALUES ('22', 'H/MONTRE', '');
INSERT INTO `grandecategorie` VALUES ('23', 'F/MONTRE', '');
INSERT INTO `grandecategorie` VALUES ('24', 'F/CHAINE', '');
INSERT INTO `grandecategorie` VALUES ('25', 'F/DINE', '');

-- ----------------------------
-- Table structure for `produit`
-- ----------------------------
DROP TABLE IF EXISTS `produit`;
CREATE TABLE `produit` (
  `idProduit` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `designation` varchar(45) NOT NULL,
  `prix_unitaire_de_vente` int(11) NOT NULL,
  `prix_d_achat` int(11) NOT NULL,
  `date_de_peremtion` date DEFAULT NULL,
  `quantite` int(11) NOT NULL,
  `code` varchar(300) NOT NULL,
  `seuil_de_vente` int(11) NOT NULL,
  PRIMARY KEY (`idProduit`)
) ENGINE=InnoDB AUTO_INCREMENT=286 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of produit
-- ----------------------------
INSERT INTO `produit` VALUES ('1', 'By Ralph Lauren	 ', '10000', '1', '2017-01-22', '0', 'AA001', '8000');
INSERT INTO `produit` VALUES ('2', 'By Ralph Lauren	 ', '10000', '1', '2017-01-22', '0', 'AA002', '8000');
INSERT INTO `produit` VALUES ('3', 'By Ralph Lauren	 ', '10000', '1', '2017-01-22', '0', 'AA003', '7000');
INSERT INTO `produit` VALUES ('4', 'Xoos noir ', '10000', '1', '2017-01-22', '1', 'AA004', '7000');
INSERT INTO `produit` VALUES ('5', 'paul & shark', '10000', '1', '2017-01-22', '1', 'AA005', '7000');
INSERT INTO `produit` VALUES ('6', 'TOMMY HILFIGER blanc', '10000', '1', '2017-01-22', '1', 'AA006', '7000');
INSERT INTO `produit` VALUES ('7', 'Xoos orange', '10000', '1', '2017-01-22', '1', 'AA007', '7000');
INSERT INTO `produit` VALUES ('8', 'eden & park', '10000', '1', '2017-01-22', '1', 'AA008', '7000');
INSERT INTO `produit` VALUES ('9', 'paul & shark', '10000', '1', '2017-01-22', '1', 'AA009', '7000');
INSERT INTO `produit` VALUES ('10', 'mantmax', '10000', '1', '2017-01-22', '1', 'AA010', '7000');
INSERT INTO `produit` VALUES ('11', 'Xoos vert-citron', '10000', '1', '2017-01-22', '1', 'AA011', '8000');
INSERT INTO `produit` VALUES ('12', 'Xoos  rose', '10000', '1', '2017-01-22', '1', 'AA012', '8000');
INSERT INTO `produit` VALUES ('13', 'eden & park  blanc', '11000', '1', '2017-01-22', '1', 'AA013', '8000');
INSERT INTO `produit` VALUES ('14', 'eden & park vert-citron', '10000', '1', '2017-01-22', '1', 'AA014', '8000');
INSERT INTO `produit` VALUES ('15', 'Xoos jaune', '10000', '1', '2017-01-22', '1', 'AA015', '8000');
INSERT INTO `produit` VALUES ('16', 'eden & park blanc', '10000', '1', '2017-01-22', '1', 'AA016', '8000');
INSERT INTO `produit` VALUES ('17', 'HC Italie	 ', '10000', '1', '2017-01-22', '1', 'AA017', '8000');
INSERT INTO `produit` VALUES ('18', 'Cooperstown	 ', '25000', '1', '2017-01-22', '1', 'AA018', '17000');
INSERT INTO `produit` VALUES ('19', 'diesel bleu', '15000', '1', '2017-01-22', '1', 'AA019', '10000');
INSERT INTO `produit` VALUES ('20', 'elegant & avenoe vert', '15000', '1', '2017-01-22', '1', 'AA020', '10000');
INSERT INTO `produit` VALUES ('21', 'elegant & avenoe bleu foncé', '15000', '1', '2017-01-22', '1', 'AA021', '10000');
INSERT INTO `produit` VALUES ('22', 'A/X noir', '15000', '1', '2017-01-22', '1', 'AA022', '10000');
INSERT INTO `produit` VALUES ('23', 'TDNMY FASHION noir', '15000', '1', '2017-01-22', '1', 'AA023', '10000');
INSERT INTO `produit` VALUES ('24', 'oucool', '15000', '1', '2017-01-22', '1', 'AA024', '10000');
INSERT INTO `produit` VALUES ('25', 'swordb king', '15000', '1', '2017-01-22', '1', 'AA025', '10000');
INSERT INTO `produit` VALUES ('26', 'gentryglad', '15000', '1', '2017-01-22', '1', 'AA026', '10000');
INSERT INTO `produit` VALUES ('27', 'elegant & avenoe orange', '15000', '1', '2017-01-22', '1', 'AA027', '10000');
INSERT INTO `produit` VALUES ('28', 'rag & bone', '15000', '1', '2017-01-22', '1', 'AA028', '10000');
INSERT INTO `produit` VALUES ('29', 'rag & bone', '15000', '1', '2017-01-22', '1', 'AA029', '10000');
INSERT INTO `produit` VALUES ('30', 'alberto smalto noir', '15000', '1', '2017-01-22', '1', 'AA030', '10000');
INSERT INTO `produit` VALUES ('31', 'sword king noir', '15000', '1', '2017-01-22', '1', 'AA031', '10000');
INSERT INTO `produit` VALUES ('32', 'next', '15000', '1', '2017-01-24', '1', 'AA032', '10000');
INSERT INTO `produit` VALUES ('33', 'peter giant', '12000', '1', '2017-01-24', '1', 'AA033', '9000');
INSERT INTO `produit` VALUES ('34', 'loensee', '15000', '1', '2017-01-24', '1', 'AA034', '10000');
INSERT INTO `produit` VALUES ('35', 'next marron foncé', '15000', '1', '2017-01-24', '1', 'AA035', '10000');
INSERT INTO `produit` VALUES ('36', 'leonsee carrelé', '12000', '1', '2017-01-24', '1', 'AA036', '9000');
INSERT INTO `produit` VALUES ('37', 'next bleu ciel', '15000', '1', '2017-01-24', '1', 'AA037', '10000');
INSERT INTO `produit` VALUES ('38', 'pascalos capinni', '15000', '1', '2017-01-24', '1', 'AA038', '10000');
INSERT INTO `produit` VALUES ('39', 'pascalos capinni', '15000', '1', '2017-01-24', '1', 'AA039', '10000');
INSERT INTO `produit` VALUES ('40', 'pierre cardin', '15000', '1', '2017-01-24', '1', 'AA040', '10000');
INSERT INTO `produit` VALUES ('41', 'alexandro ,ancini', '15000', '1', '2017-01-24', '1', 'AA041', '10000');
INSERT INTO `produit` VALUES ('42', 'next', '15000', '1', '2017-01-24', '1', 'AA042', '10000');
INSERT INTO `produit` VALUES ('43', 'alexandro ,ancini', '15000', '1', '2017-01-24', '1', 'AA043', '10000');
INSERT INTO `produit` VALUES ('44', 'peter giant', '15000', '1', '2017-01-24', '1', 'AA044', '1');
INSERT INTO `produit` VALUES ('45', 'daniel alaves', '12000', '1', '2017-01-24', '1', 'AA045', '10000');
INSERT INTO `produit` VALUES ('46', 'alexandro mancini', '15000', '1', '2017-01-24', '1', 'AA046', '10000');
INSERT INTO `produit` VALUES ('47', 'leonsee', '12000', '1', '2017-01-24', '1', 'AA047', '10000');
INSERT INTO `produit` VALUES ('48', 'pascalos capinni', '12000', '1', '2017-01-24', '1', 'AA048', '10000');
INSERT INTO `produit` VALUES ('49', 'alexandro mancini', '15000', '1', '2017-01-24', '1', 'AA049', '10000');
INSERT INTO `produit` VALUES ('50', 'petergiant', '18000', '1', '2017-01-24', '1', 'AA050', '12000');
INSERT INTO `produit` VALUES ('51', 'zara', '12000', '1', '2017-01-24', '1', 'AA051', '9000');
INSERT INTO `produit` VALUES ('52', 'YEEZY', '6000', '1', '2017-01-24', '1', 'AA052', '4000');
INSERT INTO `produit` VALUES ('53', 'AJ', '6000', '1', '2017-01-24', '1', 'AA053', '4000');
INSERT INTO `produit` VALUES ('54', 'AJ', '6000', '1', '2017-01-24', '1', 'AA054', '4000');
INSERT INTO `produit` VALUES ('55', 'peace corps', '9000', '1', '2017-01-24', '1', 'AA055', '6000');
INSERT INTO `produit` VALUES ('56', 'By Ralph Lauren	 ', '6000', '1', '2017-01-24', '1', 'AA056', '4000');
INSERT INTO `produit` VALUES ('57', 'jeason', '7000', '1', '2017-01-24', '1', 'AA057', '5000');
INSERT INTO `produit` VALUES ('58', 'JRB', '6000', '1', '2017-01-24', '1', 'AA058', '4000');
INSERT INTO `produit` VALUES ('59', 'bleu angels', '12000', '1', '2017-01-24', '1', 'AA059', '9000');
INSERT INTO `produit` VALUES ('60', 'poolman', '6000', '1', '2017-01-24', '1', 'AA060', '4000');
INSERT INTO `produit` VALUES ('61', 'coongie', '6000', '1', '2017-01-24', '1', 'AA061', '4000');
INSERT INTO `produit` VALUES ('62', 'A/X', '6000', '1', '2017-01-24', '1', 'AA062', '4000');
INSERT INTO `produit` VALUES ('63', 'A/X', '6000', '1', '2017-01-24', '1', 'AA063', '4000');
INSERT INTO `produit` VALUES ('64', 'BURBERRY BRIT', '6000', '1', '2017-01-24', '1', 'AA064', '4000');
INSERT INTO `produit` VALUES ('65', 'EKzisiens', '6000', '1', '2017-01-24', '1', 'AA065', '4000');
INSERT INTO `produit` VALUES ('66', 'levesedu', '6000', '1', '2017-01-24', '1', 'AA066', '4000');
INSERT INTO `produit` VALUES ('67', 'Q P / 78', '6000', '1', '2017-01-24', '1', 'AA067', '4000');
INSERT INTO `produit` VALUES ('68', 'O.CM', '6000', '1', '2017-01-24', '1', 'AA068', '4000');
INSERT INTO `produit` VALUES ('69', 'By Ralph Lauren	 ', '6000', '1', '2017-01-24', '1', 'AA069', '4000');
INSERT INTO `produit` VALUES ('70', 'Coongie', '6000', '1', '2017-01-24', '1', 'AA070', '4000');
INSERT INTO `produit` VALUES ('71', 'black', '6000', '1', '2017-01-24', '1', 'AA071', '4000');
INSERT INTO `produit` VALUES ('72', 'By Ralph Lauren	 ', '6000', '1', '2017-01-24', '1', 'AA072', '4000');
INSERT INTO `produit` VALUES ('73', 'MEG-AN', '10000', '1', '2017-01-24', '1', 'AA073', '7000');
INSERT INTO `produit` VALUES ('74', 'no name ( manche bleu foncé )', '12000', '1', '2017-01-25', '1', 'AA074', '10000');
INSERT INTO `produit` VALUES ('75', 'king mashalino', '12000', '1', '2017-01-25', '1', 'AA075', '10000');
INSERT INTO `produit` VALUES ('76', 'next ', '12000', '1', '2017-01-25', '1', 'AA076', '10000');
INSERT INTO `produit` VALUES ('77', 'no name (double colle)', '10000', '1', '2017-01-25', '1', 'AA077', '8000');
INSERT INTO `produit` VALUES ('78', 'to5men', '9000', '1', '2017-01-25', '1', 'AA078', '5000');
INSERT INTO `produit` VALUES ('79', 'scotch&solo', '12000', '1', '2017-01-25', '1', 'AA079', '10000');
INSERT INTO `produit` VALUES ('80', '424', '12000', '1', '2017-01-25', '1', 'AA080', '10000');
INSERT INTO `produit` VALUES ('81', 'babuxini', '10000', '1', '2017-01-25', '1', 'AA081', '7000');
INSERT INTO `produit` VALUES ('82', 'TEDDY SCARES', '11000', '1', '2017-01-25', '1', 'AA082', '7000');
INSERT INTO `produit` VALUES ('83', 'PHILLIPP PLIEN', '10000', '1', '2017-01-25', '1', 'AA083', '7000');
INSERT INTO `produit` VALUES ('84', 'Svnbird', '11000', '1', '2017-01-25', '1', 'AA084', '7000');
INSERT INTO `produit` VALUES ('85', 'phillip plien (noir)', '12000', '1', '2017-01-25', '1', 'AA085', '8000');
INSERT INTO `produit` VALUES ('86', 'm-hbenny', '12000', '1', '2017-01-25', '1', 'AA086', '7000');
INSERT INTO `produit` VALUES ('87', 'teddy scares', '12000', '1', '2017-01-25', '1', 'AA087', '7000');
INSERT INTO `produit` VALUES ('88', 'terry scares', '12000', '1', '2017-01-25', '1', 'AA088', '7000');
INSERT INTO `produit` VALUES ('89', 'all saints', '12000', '1', '2017-01-25', '1', 'AA089', '7000');
INSERT INTO `produit` VALUES ('90', 'Zara	 ', '12000', '1', '2017-01-25', '1', 'AA090', '7000');
INSERT INTO `produit` VALUES ('91', 'BANUXINI', '12000', '1', '2017-01-25', '1', 'AA091', '7000');
INSERT INTO `produit` VALUES ('92', 'ZOLA', '12000', '1', '2017-01-25', '1', 'AA092', '7000');
INSERT INTO `produit` VALUES ('93', 'inside shops', '12000', '1', '2017-01-25', '1', 'AA093', '7000');
INSERT INTO `produit` VALUES ('94', 'CK', '12000', '1', '2017-01-25', '1', 'AA094', '7000');
INSERT INTO `produit` VALUES ('95', 'CK', '12000', '1', '2017-01-25', '1', 'AA095', '7000');
INSERT INTO `produit` VALUES ('96', 'CARTIER', '12000', '1', '2017-01-25', '1', 'AA096', '7000');
INSERT INTO `produit` VALUES ('97', 'RADO', '35000', '1', '2017-01-25', '1', 'AA097', '20000');
INSERT INTO `produit` VALUES ('98', 'RADO', '35000', '1', '2017-01-25', '1', 'AA098', '20000');
INSERT INTO `produit` VALUES ('99', 'CK', '12000', '1', '2017-01-25', '1', 'AA099', '7000');
INSERT INTO `produit` VALUES ('100', 'CK', '12000', '1', '2017-01-25', '1', 'AA100', '7000');
INSERT INTO `produit` VALUES ('101', 'CK', '12000', '1', '2017-01-25', '1', 'AA101', '7000');
INSERT INTO `produit` VALUES ('102', 'NORIS', '5000', '1', '2017-01-25', '1', 'AA102', '3000');
INSERT INTO `produit` VALUES ('103', 'JOYRISS', '5000', '1', '2017-01-25', '1', 'AA103', '2000');
INSERT INTO `produit` VALUES ('104', 'NORIS', '5000', '1', '2017-01-25', '1', 'AA104', '2000');
INSERT INTO `produit` VALUES ('105', 'PAKFOOT', '5000', '1', '2017-01-25', '1', 'AA105', '2000');
INSERT INTO `produit` VALUES ('106', 'JOYRISS', '5000', '1', '2017-01-25', '1', 'AA106', '2000');
INSERT INTO `produit` VALUES ('107', 'NORIS', '5000', '1', '2017-01-25', '1', 'AA107', '2000');
INSERT INTO `produit` VALUES ('108', 'JOYRISS', '5000', '1', '2017-01-25', '1', 'AA108', '2000');
INSERT INTO `produit` VALUES ('109', 'CHOPARD', '60000', '1', '2017-01-25', '1', 'AA109', '30000');
INSERT INTO `produit` VALUES ('110', 'ADIDAS', '5000', '1', '2017-01-25', '1', 'AA110', '2000');
INSERT INTO `produit` VALUES ('111', 'MONTBLANC', '60000', '1', '2017-01-25', '1', 'AA111', '30000');
INSERT INTO `produit` VALUES ('112', 'SPORT', '5000', '1', '2017-01-25', '1', 'AA112', '2000');
INSERT INTO `produit` VALUES ('113', 'CHANEL', '12000', '1', '2017-01-25', '1', 'AA113', '7000');
INSERT INTO `produit` VALUES ('114', 'CHANEL', '12000', '1', '2017-01-25', '1', 'AA114', '7000');
INSERT INTO `produit` VALUES ('115', 'GUCCI', '12000', '1', '2017-01-25', '1', 'AA115', '7000');
INSERT INTO `produit` VALUES ('116', 'SQUARTZ', '12000', '1', '2017-01-25', '1', 'AA116', '7000');
INSERT INTO `produit` VALUES ('117', 'by ralph lauren', '10000', '1', '2017-01-25', '1', 'AA117', '7000');
INSERT INTO `produit` VALUES ('118', 'NO NAME', '15000', '1', '2017-01-25', '1', 'AA118', '7000');
INSERT INTO `produit` VALUES ('119', 'NO NAME', '15000', '1', '2017-01-25', '1', 'AA119', '7000');
INSERT INTO `produit` VALUES ('120', 'by balph lauren', '10000', '1', '2017-01-25', '1', 'AA120', '7000');
INSERT INTO `produit` VALUES ('121', 'by ralph lauren', '10000', '1', '2017-01-25', '1', 'AA121', '7000');
INSERT INTO `produit` VALUES ('122', 'by ralph lauren', '10000', '1', '2017-01-25', '0', 'AA122', '7000');
INSERT INTO `produit` VALUES ('123', 'by ralph lauren', '10000', '1', '2017-01-25', '1', 'AA123', '7000');
INSERT INTO `produit` VALUES ('124', 'by ralph lauren', '10000', '1', '2017-01-25', '1', 'AA124', '7000');
INSERT INTO `produit` VALUES ('125', 'by ralph lauren', '10000', '1', '2017-01-25', '1', 'AA125', '7000');
INSERT INTO `produit` VALUES ('126', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA126', '7000');
INSERT INTO `produit` VALUES ('127', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA127', '7000');
INSERT INTO `produit` VALUES ('128', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA128', '7000');
INSERT INTO `produit` VALUES ('129', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA129', '7000');
INSERT INTO `produit` VALUES ('130', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA130', '7000');
INSERT INTO `produit` VALUES ('131', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA131', '7000');
INSERT INTO `produit` VALUES ('132', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA132', '7000');
INSERT INTO `produit` VALUES ('133', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA133', '7000');
INSERT INTO `produit` VALUES ('134', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA134', '7000');
INSERT INTO `produit` VALUES ('135', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA135', '7000');
INSERT INTO `produit` VALUES ('136', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA136', '7000');
INSERT INTO `produit` VALUES ('137', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA137', '7000');
INSERT INTO `produit` VALUES ('138', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA138', '7000');
INSERT INTO `produit` VALUES ('139', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA139', '7000');
INSERT INTO `produit` VALUES ('140', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA140', '7000');
INSERT INTO `produit` VALUES ('141', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA141', '7000');
INSERT INTO `produit` VALUES ('142', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA142', '7000');
INSERT INTO `produit` VALUES ('143', 'By Ralph Lauren	 ', '10000', '1', '2017-01-25', '1', 'AA143', '7000');
INSERT INTO `produit` VALUES ('144', 'westbur ( marron)', '50000', '1', '2017-01-27', '1', 'AA144', '30000');
INSERT INTO `produit` VALUES ('145', 'misterstone ( noir)', '500000', '1', '2017-01-27', '1', 'AA145', '30000');
INSERT INTO `produit` VALUES ('146', 'misterstone (noir )', '50000', '1', '2017-01-27', '1', 'AA146', '30000');
INSERT INTO `produit` VALUES ('147', 'by ralph lauren( rose)', '6000', '1', '2017-01-27', '1', 'AA147', '4000');
INSERT INTO `produit` VALUES ('148', 'Westbury (marron)', '50000', '1', '2017-01-27', '1', 'AA148', '30000');
INSERT INTO `produit` VALUES ('149', 'mazzaro (noir )', '50000', '1', '2017-01-27', '1', 'AA149', '30000');
INSERT INTO `produit` VALUES ('150', 'van donald ( bleu foncé )', '45000', '1', '2017-01-27', '1', 'AA150', '25000');
INSERT INTO `produit` VALUES ('151', 'cesare paciotti (noir)', '45000', '1', '2017-01-27', '1', 'AA151', '25000');
INSERT INTO `produit` VALUES ('152', 'westbury ( marron )', '50000', '1', '2017-01-27', '1', 'AA152', '30000');
INSERT INTO `produit` VALUES ('153', 'mazzare ( noir)', '50000', '1', '2017-01-27', '1', 'AA153', '30000');
INSERT INTO `produit` VALUES ('154', 'hand made ( marron )', '45000', '1', '2017-01-27', '1', 'AA154', '25000');
INSERT INTO `produit` VALUES ('155', 'guiseppe zanotti design ', '50000', '1', '2017-01-27', '1', 'AA155', '30000');
INSERT INTO `produit` VALUES ('156', 'hand made ( noir )', '50000', '1', '2017-01-27', '1', 'AA156', '30000');
INSERT INTO `produit` VALUES ('157', 'guiseppe zanotti design ', '50000', '1', '2017-01-27', '1', 'AA157', '30000');
INSERT INTO `produit` VALUES ('158', 'guiseppe zanotti design ', '50000', '1', '2017-01-27', '1', 'AA158', '30000');
INSERT INTO `produit` VALUES ('159', 'mazzaro ( noir )', '50000', '1', '2017-01-27', '1', 'AA159', '30000');
INSERT INTO `produit` VALUES ('160', 'westbury ( marron )', '45000', '1', '2017-01-27', '1', 'AA160', '25000');
INSERT INTO `produit` VALUES ('161', 'billionaire (noir )', '50000', '1', '2017-01-27', '1', 'AA161', '30000');
INSERT INTO `produit` VALUES ('162', 'basconi ( noir )', '25000', '1', '2017-01-27', '1', 'AA162', '15000');
INSERT INTO `produit` VALUES ('163', 'cesare paciotti ( noir )', '50000', '1', '2017-01-27', '1', 'AA163', '30000');
INSERT INTO `produit` VALUES ('164', 'by ralph lauren ( jaune )', '6000', '1', '2017-01-27', '1', 'AA164', '4000');
INSERT INTO `produit` VALUES ('165', 'philipp plein ( blanc )', '6000', '1', '2017-01-27', '1', 'AA165', '4000');
INSERT INTO `produit` VALUES ('166', 'by ralph laure', '6000', '1', '2017-01-27', '1', 'AA166', '4000');
INSERT INTO `produit` VALUES ('167', 'by ralph lauren (noir étoille)', '6000', '1', '2017-01-27', '1', 'AA167', '4000');
INSERT INTO `produit` VALUES ('168', 'pyrex23', '6000', '1', '2017-01-27', '1', 'AA168', '4000');
INSERT INTO `produit` VALUES ('169', 'philipp plein ( blanc )', '6000', '1', '2017-01-27', '1', 'AA169', '4000');
INSERT INTO `produit` VALUES ('170', 'philipp plein (blanc )', '6000', '1', '2017-01-27', '1', 'AA170', '4000');
INSERT INTO `produit` VALUES ('171', ' no name (peau serpent )', '6000', '1', '2017-01-27', '1', 'AA171', '4000');
INSERT INTO `produit` VALUES ('172', 'no name ( marron )', '6000', '1', '2017-01-27', '1', 'AA172', '4000');
INSERT INTO `produit` VALUES ('173', 'no name (noir)', '5000', '1', '2017-01-27', '1', 'AA173', '2500');
INSERT INTO `produit` VALUES ('174', 'no name (bleu )', '5000', '1', '2017-01-27', '1', 'AA174', '2500');
INSERT INTO `produit` VALUES ('175', 'white&stag ( marron )', '5000', '1', '2017-01-27', '1', 'AA175', '2500');
INSERT INTO `produit` VALUES ('176', 'charlsmo hat( rouge)', '5000', '1', '2017-01-27', '1', 'AA176', '2500');
INSERT INTO `produit` VALUES ('177', 'BMP (rouge )', '5000', '1', '2017-01-27', '1', 'AA177', '2500');
INSERT INTO `produit` VALUES ('178', 'no name (rouge)', '5000', '1', '2017-01-27', '1', 'AA178', '2500');
INSERT INTO `produit` VALUES ('179', 'no name (jaune)', '5000', '1', '2017-01-27', '1', 'AA179', '2500');
INSERT INTO `produit` VALUES ('180', 'no name ( rose )', '5000', '1', '2017-01-27', '1', 'AA180', '2500');
INSERT INTO `produit` VALUES ('181', 'no name (rouge)', '5000', '1', '2017-01-27', '1', 'AA181', '2500');
INSERT INTO `produit` VALUES ('182', 'next ( bleu foncé )', '15000', '1', '2017-01-28', '1', 'AA182', '10000');
INSERT INTO `produit` VALUES ('183', 'alexandro mancini', '15000', '1', '2017-01-28', '1', 'AA183', '10000');
INSERT INTO `produit` VALUES ('184', 'next ( marron )', '15000', '1', '2017-01-28', '1', 'AA184', '10000');
INSERT INTO `produit` VALUES ('185', 'veiken-co (dine )', '15000', '1', '2017-01-28', '1', 'AA185', '10000');
INSERT INTO `produit` VALUES ('186', 'america aegle', '15000', '1', '2017-01-28', '1', 'AA186', '10000');
INSERT INTO `produit` VALUES ('187', 'zapa', '20000', '1', '2017-01-28', '1', 'AA187', '15000');
INSERT INTO `produit` VALUES ('188', 'zapa ( marron foncé )', '20000', '1', '2017-01-28', '1', 'AA188', '15000');
INSERT INTO `produit` VALUES ('189', 'serge blanco ( bleu )', '20000', '1', '2017-01-28', '1', 'AA189', '15000');
INSERT INTO `produit` VALUES ('190', 'sandro ( zebre )', '20000', '1', '2017-01-28', '1', 'AA190', '15000');
INSERT INTO `produit` VALUES ('191', 'sandro ( bleu-ciel )', '20000', '1', '2017-01-28', '1', 'AA191', '15000');
INSERT INTO `produit` VALUES ('192', 'curling', '20000', '1', '2017-01-28', '1', 'AA192', '15000');
INSERT INTO `produit` VALUES ('193', 'foxman (bleu )', '20000', '1', '2017-01-28', '1', 'AA193', '15000');
INSERT INTO `produit` VALUES ('194', 'foxman ( bleu )', '20000', '1', '2017-01-28', '1', 'AA194', '15000');
INSERT INTO `produit` VALUES ('195', 'no name ( bleu foncé )', '20000', '1', '2017-01-28', '1', 'AA195', '15000');
INSERT INTO `produit` VALUES ('196', 'zapa ( bleu foncé )', '20000', '1', '2017-01-28', '1', 'AA196', '15000');
INSERT INTO `produit` VALUES ('197', 'foxman ( bleu-ciel )', '20000', '1', '2017-01-28', '1', 'AA197', '15000');
INSERT INTO `produit` VALUES ('198', 'sandro ( tigre-blanc )', '20000', '1', '2017-01-28', '1', 'AA198', '15000');
INSERT INTO `produit` VALUES ('199', 'zapa ( noir )', '20000', '1', '2017-01-28', '1', 'AA199', '15000');
INSERT INTO `produit` VALUES ('200', 'sandro ( bleu )', '20000', '1', '2017-01-28', '1', 'AA200', '15000');
INSERT INTO `produit` VALUES ('201', 'zapa ( rayer blanc/noir )', '20000', '1', '2017-01-28', '1', 'AA201', '15000');
INSERT INTO `produit` VALUES ('202', 'sandro ( blanc )', '20000', '1', '2017-01-28', '1', 'AA202', '15000');
INSERT INTO `produit` VALUES ('203', 'KN.S (blanc )', '20000', '1', '2017-01-28', '1', 'AA203', '15000');
INSERT INTO `produit` VALUES ('204', 'foxman ( bleu-ciel )', '20000', '1', '2017-01-28', '1', 'AA204', '15000');
INSERT INTO `produit` VALUES ('205', 'zapa (bleu foncé )', '20000', '1', '2017-01-28', '1', 'AA205', '15000');
INSERT INTO `produit` VALUES ('206', 'zapa (rayer bleu foncé )', '20000', '1', '2017-01-28', '1', 'AA206', '15000');
INSERT INTO `produit` VALUES ('207', 'baige ( blanc )', '20000', '1', '2017-01-28', '1', 'AA207', '15000');
INSERT INTO `produit` VALUES ('208', 'foxman ( bleu-ciel )', '20000', '1', '2017-01-28', '1', 'AA208', '15000');
INSERT INTO `produit` VALUES ('209', 'sandro', '20000', '1', '2017-01-28', '1', 'AA209', '15000');
INSERT INTO `produit` VALUES ('210', 'foxman ( bleu-ciel )', '20000', '1', '2017-01-28', '1', 'AA210', '15000');
INSERT INTO `produit` VALUES ('211', 'foxman (bleu(ciel )', '20000', '1', '2017-01-28', '1', 'AA211', '15000');
INSERT INTO `produit` VALUES ('212', 'foxman (bleu(ciel )', '20000', '1', '2017-01-28', '1', 'AA212', '15000');
INSERT INTO `produit` VALUES ('213', 'sandro ( fleuri-bleu )', '20000', '1', '2017-01-28', '1', 'AA213', '15000');
INSERT INTO `produit` VALUES ('214', 'foxman (rayer blancl )', '20000', '1', '2017-01-28', '1', 'AA214', '15000');
INSERT INTO `produit` VALUES ('215', 'foxman (bleu(ciel )', '20000', '1', '2017-01-28', '1', 'AA215', '15000');
INSERT INTO `produit` VALUES ('216', 'weimaio ', '10000', '1', '2017-01-28', '1', 'AA216', '7000');
INSERT INTO `produit` VALUES ('217', 're-jegging', '10000', '1', '2017-01-28', '1', 'AA217', '7000');
INSERT INTO `produit` VALUES ('218', 'janina (noir)', '12000', '1', '2017-01-28', '1', 'AA218', '9000');
INSERT INTO `produit` VALUES ('219', 'yix & eni (noir )', '8000', '1', '2017-01-28', '1', 'AA219', '5000');
INSERT INTO `produit` VALUES ('220', 'yix & eni', '8000', '1', '2017-01-28', '1', 'AA220', '5000');
INSERT INTO `produit` VALUES ('221', 'salsa life', '10000', '1', '2017-01-28', '1', 'AA221', '7000');
INSERT INTO `produit` VALUES ('222', 'vs miss', '10000', '1', '2017-01-28', '1', 'AA222', '7000');
INSERT INTO `produit` VALUES ('223', 'salsa life', '10000', '1', '2017-01-28', '1', 'AA223', '7000');
INSERT INTO `produit` VALUES ('224', 'jomana', '10000', '1', '2017-01-28', '1', 'AA224', '7000');
INSERT INTO `produit` VALUES ('225', 'SALSA', '10000', '1', '2017-01-28', '1', 'AA225', '7000');
INSERT INTO `produit` VALUES ('226', 'JOMANA', '130000', '1', '2017-01-28', '1', 'AA226', '10000');
INSERT INTO `produit` VALUES ('227', 'REFUGE', '12000', '1', '2017-01-28', '1', 'AA227', '10000');
INSERT INTO `produit` VALUES ('228', ' STYLE 1159', '13000', '1', '2017-01-28', '1', 'AA228', '10000');
INSERT INTO `produit` VALUES ('229', 'red jolly ( bleu )', '15000', '1', '2017-01-30', '1', 'AA229', '10000');
INSERT INTO `produit` VALUES ('230', 'kuxuan denim ( bleu )', '15000', '1', '2017-01-30', '1', 'AA230', '10000');
INSERT INTO `produit` VALUES ('231', 'zne king ( bleu délarvé )', '15000', '1', '2017-01-30', '1', 'AA231', '10000');
INSERT INTO `produit` VALUES ('232', 'diesel jean ( bleu délarvé )', '15000', '1', '2017-01-30', '1', 'AA232', '10000');
INSERT INTO `produit` VALUES ('233', 'red jolly ( bleu )', '15000', '1', '2017-01-30', '1', 'AA233', '10000');
INSERT INTO `produit` VALUES ('234', 'Y.TWO (bleu )', '15000', '1', '2017-01-30', '1', 'AA234', '10000');
INSERT INTO `produit` VALUES ('235', 'EST:1975 ( bleu )', '15000', '1', '2017-01-30', '1', 'AA235', '10000');
INSERT INTO `produit` VALUES ('236', 'H & H best', '15000', '1', '2017-01-30', '1', 'AA236', '10000');
INSERT INTO `produit` VALUES ('237', 'new sosoo ( blanc )', '15000', '1', '2017-01-30', '1', 'AA237', '10000');
INSERT INTO `produit` VALUES ('238', 'lulihua classics ', '15000', '1', '2017-01-30', '1', 'AA238', '10000');
INSERT INTO `produit` VALUES ('239', 'jeans ( bleu )', '15000', '1', '2017-01-30', '1', 'AA239', '10000');
INSERT INTO `produit` VALUES ('240', 'vancl ( bleu )', '15000', '1', '2017-01-30', '1', 'AA240', '10000');
INSERT INTO `produit` VALUES ('241', 'phillipp plien', '15000', '1', '2017-01-30', '1', 'AA241', '10000');
INSERT INTO `produit` VALUES ('242', 'fashion chuanot ( bleu )', '15000', '1', '2017-01-30', '1', 'AA242', '10000');
INSERT INTO `produit` VALUES ('243', 'red jollly ( bleu )', '15000', '1', '2017-01-30', '1', 'AA243', '10000');
INSERT INTO `produit` VALUES ('244', 'morris ( bleu )', '15000', '1', '2017-01-30', '1', 'AA244', '10000');
INSERT INTO `produit` VALUES ('245', 'skinny fit (bleu )', '15000', '1', '2017-01-30', '1', 'AA245', '10000');
INSERT INTO `produit` VALUES ('246', 'V-PULL (bleu)', '15000', '1', '2017-01-30', '1', 'AA246', '10000');
INSERT INTO `produit` VALUES ('247', 'my michelle', '8000', '1', '2017-01-30', '1', 'AA247', '5000');
INSERT INTO `produit` VALUES ('248', '1516 ', '8000', '1', '2017-01-30', '1', 'AA248', '5000');
INSERT INTO `produit` VALUES ('249', 'sigens gaard ( bleu )', '10000', '1', '2017-01-30', '1', 'AA249', '7000');
INSERT INTO `produit` VALUES ('250', 'francescapizarro ( blanc )', '8000', '1', '2017-01-30', '1', 'AA250', '5000');
INSERT INTO `produit` VALUES ('251', 'N R E ( dine )', '10000', '1', '2017-01-30', '1', 'AA251', '8000');
INSERT INTO `produit` VALUES ('252', 'sabala ( bleu )', '8000', '1', '2017-01-30', '1', 'AA252', '5000');
INSERT INTO `produit` VALUES ('253', 'kivenrt ', '8000', '1', '2017-01-30', '1', 'AA253', '5000');
INSERT INTO `produit` VALUES ('254', 'kivenrt ', '8000', '1', '2017-01-30', '1', 'AA254', '5000');
INSERT INTO `produit` VALUES ('255', 'vangeliza ', '20000', '1', '2017-01-30', '1', 'AA255', '15000');
INSERT INTO `produit` VALUES ('256', '66.77( rouge )', '10000', '1', '2017-01-30', '1', 'AA256', '8000');
INSERT INTO `produit` VALUES ('257', 'connection ', '8000', '1', '2017-01-30', '1', 'AA257', '5000');
INSERT INTO `produit` VALUES ('258', 'kaside ( blanc )', '10000', '1', '2017-01-30', '1', 'AA258', '8000');
INSERT INTO `produit` VALUES ('259', 'AIKEYI ( rouge )', '10000', '1', '2017-01-30', '1', 'AA259', '7000');
INSERT INTO `produit` VALUES ('260', 'no name violette', '7000', '1', '2017-01-30', '1', 'AA260', '4000');
INSERT INTO `produit` VALUES ('261', 'chaoran jeans ', '15000', '1', '2017-01-30', '1', 'AA261', '10000');
INSERT INTO `produit` VALUES ('262', 'clynn couture ', '17000', '1', '2017-01-30', '1', 'AA262', '13000');
INSERT INTO `produit` VALUES ('263', 'KENYELO ', '10000', '1', '2017-01-30', '1', 'AA263', '7000');
INSERT INTO `produit` VALUES ('264', '59', '6000', '1', '2017-01-30', '1', 'AA264', '4000');
INSERT INTO `produit` VALUES ('265', 'bluss ( blanc )', '8000', '1', '2017-01-30', '1', 'AA265', '5000');
INSERT INTO `produit` VALUES ('266', 'royal ', '7000', '1', '2017-01-30', '1', 'AA266', '4000');
INSERT INTO `produit` VALUES ('267', 'no name ', '7000', '1', '2017-01-30', '1', 'AA267', '4000');
INSERT INTO `produit` VALUES ('268', '1516 (verte )', '9000', '1', '2017-01-30', '1', 'AA268', '6000');
INSERT INTO `produit` VALUES ('269', 'no name ( rose délavé )', '10000', '1', '2017-01-31', '1', 'AA269', '7000');
INSERT INTO `produit` VALUES ('270', 'klimlar ( voilet )', '10000', '1', '2017-01-31', '1', 'AA270', '7000');
INSERT INTO `produit` VALUES ('271', 'yi long short ( rayer blanc-noir )', '10000', '1', '2017-01-31', '1', 'AA271', '7000');
INSERT INTO `produit` VALUES ('272', 'no name', '25000', '1', '2017-01-31', '1', 'AA272', '20000');
INSERT INTO `produit` VALUES ('273', 'R/nikibiki ( blanc )', '20000', '1', '2017-01-31', '1', 'AA273', '15000');
INSERT INTO `produit` VALUES ('274', 'new look (blanc )', '10000', '1', '2017-01-31', '1', 'AA274', '7000');
INSERT INTO `produit` VALUES ('275', 'cals (  rouge/or ) ', '12000', '1', '2017-01-31', '1', 'AA275', '9000');
INSERT INTO `produit` VALUES ('276', 'justyle ', '10000', '1', '2017-01-31', '1', 'AA276', '7000');
INSERT INTO `produit` VALUES ('277', 'mnogcc (blanc )', '18000', '1', '2017-01-31', '1', 'AA277', '15000');
INSERT INTO `produit` VALUES ('278', 'haokadun	 ', '50000', '1', '2017-01-31', '1', 'AA278', '35000');
INSERT INTO `produit` VALUES ('279', 'john oxford	 ', '50000', '1', '2017-01-31', '1', 'AA279', '35000');
INSERT INTO `produit` VALUES ('280', 'paricalano	 ', '50000', '1', '2017-01-31', '1', 'AA280', '35000');
INSERT INTO `produit` VALUES ('281', 'KENNETH', '75000', '1', '2017-01-31', '1', 'AA281', '55000');
INSERT INTO `produit` VALUES ('282', 'king mashalino	 ', '40000', '1', '2017-01-31', '1', 'AA282', '25000');
INSERT INTO `produit` VALUES ('283', 'sub & tle	 ', '50000', '1', '2017-01-31', '1', 'AA283', '35000');
INSERT INTO `produit` VALUES ('284', 'dikelong	 ', '50000', '1', '2017-01-31', '1', 'AA284', '35000');
INSERT INTO `produit` VALUES ('285', 'ZARA', '50000', '1', '2017-01-31', '1', 'AA285', '35000');

-- ----------------------------
-- Table structure for `produit_categories`
-- ----------------------------
DROP TABLE IF EXISTS `produit_categories`;
CREATE TABLE `produit_categories` (
  `produitidProduit` int(10) unsigned NOT NULL,
  `categoriesidCategories` int(10) unsigned NOT NULL,
  PRIMARY KEY (`produitidProduit`,`categoriesidCategories`),
  KEY `FKproduit_ca270886` (`produitidProduit`),
  KEY `FKproduit_ca295154` (`categoriesidCategories`),
  CONSTRAINT `FKproduit_ca270886` FOREIGN KEY (`produitidProduit`) REFERENCES `produit` (`idProduit`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKproduit_ca295154` FOREIGN KEY (`categoriesidCategories`) REFERENCES `categories` (`idCategories`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of produit_categories
-- ----------------------------
INSERT INTO `produit_categories` VALUES ('1', '1');
INSERT INTO `produit_categories` VALUES ('2', '1');
INSERT INTO `produit_categories` VALUES ('3', '2');
INSERT INTO `produit_categories` VALUES ('4', '3');
INSERT INTO `produit_categories` VALUES ('5', '4');
INSERT INTO `produit_categories` VALUES ('6', '1');
INSERT INTO `produit_categories` VALUES ('7', '3');
INSERT INTO `produit_categories` VALUES ('8', '3');
INSERT INTO `produit_categories` VALUES ('9', '1');
INSERT INTO `produit_categories` VALUES ('10', '3');
INSERT INTO `produit_categories` VALUES ('11', '3');
INSERT INTO `produit_categories` VALUES ('12', '3');
INSERT INTO `produit_categories` VALUES ('13', '5');
INSERT INTO `produit_categories` VALUES ('14', '1');
INSERT INTO `produit_categories` VALUES ('15', '3');
INSERT INTO `produit_categories` VALUES ('16', '1');
INSERT INTO `produit_categories` VALUES ('17', '6');
INSERT INTO `produit_categories` VALUES ('18', '6');
INSERT INTO `produit_categories` VALUES ('19', '8');
INSERT INTO `produit_categories` VALUES ('20', '9');
INSERT INTO `produit_categories` VALUES ('21', '9');
INSERT INTO `produit_categories` VALUES ('22', '10');
INSERT INTO `produit_categories` VALUES ('23', '9');
INSERT INTO `produit_categories` VALUES ('24', '11');
INSERT INTO `produit_categories` VALUES ('25', '12');
INSERT INTO `produit_categories` VALUES ('26', '13');
INSERT INTO `produit_categories` VALUES ('27', '13');
INSERT INTO `produit_categories` VALUES ('28', '9');
INSERT INTO `produit_categories` VALUES ('29', '9');
INSERT INTO `produit_categories` VALUES ('30', '12');
INSERT INTO `produit_categories` VALUES ('31', '12');
INSERT INTO `produit_categories` VALUES ('32', '14');
INSERT INTO `produit_categories` VALUES ('33', '14');
INSERT INTO `produit_categories` VALUES ('34', '16');
INSERT INTO `produit_categories` VALUES ('35', '17');
INSERT INTO `produit_categories` VALUES ('36', '17');
INSERT INTO `produit_categories` VALUES ('37', '14');
INSERT INTO `produit_categories` VALUES ('38', '17');
INSERT INTO `produit_categories` VALUES ('39', '18');
INSERT INTO `produit_categories` VALUES ('40', '14');
INSERT INTO `produit_categories` VALUES ('41', '15');
INSERT INTO `produit_categories` VALUES ('42', '14');
INSERT INTO `produit_categories` VALUES ('43', '14');
INSERT INTO `produit_categories` VALUES ('44', '17');
INSERT INTO `produit_categories` VALUES ('45', '17');
INSERT INTO `produit_categories` VALUES ('46', '17');
INSERT INTO `produit_categories` VALUES ('47', '17');
INSERT INTO `produit_categories` VALUES ('48', '15');
INSERT INTO `produit_categories` VALUES ('49', '17');
INSERT INTO `produit_categories` VALUES ('50', '14');
INSERT INTO `produit_categories` VALUES ('51', '15');
INSERT INTO `produit_categories` VALUES ('52', '19');
INSERT INTO `produit_categories` VALUES ('53', '20');
INSERT INTO `produit_categories` VALUES ('54', '19');
INSERT INTO `produit_categories` VALUES ('55', '21');
INSERT INTO `produit_categories` VALUES ('56', '22');
INSERT INTO `produit_categories` VALUES ('57', '23');
INSERT INTO `produit_categories` VALUES ('58', '20');
INSERT INTO `produit_categories` VALUES ('59', '20');
INSERT INTO `produit_categories` VALUES ('60', '24');
INSERT INTO `produit_categories` VALUES ('61', '24');
INSERT INTO `produit_categories` VALUES ('62', '20');
INSERT INTO `produit_categories` VALUES ('63', '20');
INSERT INTO `produit_categories` VALUES ('64', '19');
INSERT INTO `produit_categories` VALUES ('65', '20');
INSERT INTO `produit_categories` VALUES ('66', '23');
INSERT INTO `produit_categories` VALUES ('67', '19');
INSERT INTO `produit_categories` VALUES ('68', '23');
INSERT INTO `produit_categories` VALUES ('69', '19');
INSERT INTO `produit_categories` VALUES ('70', '20');
INSERT INTO `produit_categories` VALUES ('71', '22');
INSERT INTO `produit_categories` VALUES ('72', '22');
INSERT INTO `produit_categories` VALUES ('73', '23');
INSERT INTO `produit_categories` VALUES ('74', '25');
INSERT INTO `produit_categories` VALUES ('75', '16');
INSERT INTO `produit_categories` VALUES ('76', '16');
INSERT INTO `produit_categories` VALUES ('77', '26');
INSERT INTO `produit_categories` VALUES ('78', '16');
INSERT INTO `produit_categories` VALUES ('79', '15');
INSERT INTO `produit_categories` VALUES ('80', '15');
INSERT INTO `produit_categories` VALUES ('81', '27');
INSERT INTO `produit_categories` VALUES ('82', '28');
INSERT INTO `produit_categories` VALUES ('83', '15');
INSERT INTO `produit_categories` VALUES ('84', '28');
INSERT INTO `produit_categories` VALUES ('85', '16');
INSERT INTO `produit_categories` VALUES ('86', '15');
INSERT INTO `produit_categories` VALUES ('87', '28');
INSERT INTO `produit_categories` VALUES ('88', '14');
INSERT INTO `produit_categories` VALUES ('89', '17');
INSERT INTO `produit_categories` VALUES ('90', '27');
INSERT INTO `produit_categories` VALUES ('91', '27');
INSERT INTO `produit_categories` VALUES ('92', '16');
INSERT INTO `produit_categories` VALUES ('93', '17');
INSERT INTO `produit_categories` VALUES ('94', '31');
INSERT INTO `produit_categories` VALUES ('95', '31');
INSERT INTO `produit_categories` VALUES ('96', '31');
INSERT INTO `produit_categories` VALUES ('97', '32');
INSERT INTO `produit_categories` VALUES ('98', '32');
INSERT INTO `produit_categories` VALUES ('99', '31');
INSERT INTO `produit_categories` VALUES ('100', '31');
INSERT INTO `produit_categories` VALUES ('101', '31');
INSERT INTO `produit_categories` VALUES ('102', '33');
INSERT INTO `produit_categories` VALUES ('103', '35');
INSERT INTO `produit_categories` VALUES ('104', '35');
INSERT INTO `produit_categories` VALUES ('105', '37');
INSERT INTO `produit_categories` VALUES ('106', '34');
INSERT INTO `produit_categories` VALUES ('107', '37');
INSERT INTO `produit_categories` VALUES ('108', '38');
INSERT INTO `produit_categories` VALUES ('109', '39');
INSERT INTO `produit_categories` VALUES ('110', '39');
INSERT INTO `produit_categories` VALUES ('111', '39');
INSERT INTO `produit_categories` VALUES ('112', '40');
INSERT INTO `produit_categories` VALUES ('113', '31');
INSERT INTO `produit_categories` VALUES ('114', '31');
INSERT INTO `produit_categories` VALUES ('115', '31');
INSERT INTO `produit_categories` VALUES ('116', '31');
INSERT INTO `produit_categories` VALUES ('117', '1');
INSERT INTO `produit_categories` VALUES ('118', '41');
INSERT INTO `produit_categories` VALUES ('119', '41');
INSERT INTO `produit_categories` VALUES ('120', '42');
INSERT INTO `produit_categories` VALUES ('121', '42');
INSERT INTO `produit_categories` VALUES ('122', '3');
INSERT INTO `produit_categories` VALUES ('123', '1');
INSERT INTO `produit_categories` VALUES ('124', '1');
INSERT INTO `produit_categories` VALUES ('125', '1');
INSERT INTO `produit_categories` VALUES ('126', '1');
INSERT INTO `produit_categories` VALUES ('127', '5');
INSERT INTO `produit_categories` VALUES ('128', '1');
INSERT INTO `produit_categories` VALUES ('129', '5');
INSERT INTO `produit_categories` VALUES ('130', '1');
INSERT INTO `produit_categories` VALUES ('131', '5');
INSERT INTO `produit_categories` VALUES ('132', '1');
INSERT INTO `produit_categories` VALUES ('133', '3');
INSERT INTO `produit_categories` VALUES ('134', '1');
INSERT INTO `produit_categories` VALUES ('135', '5');
INSERT INTO `produit_categories` VALUES ('136', '42');
INSERT INTO `produit_categories` VALUES ('137', '1');
INSERT INTO `produit_categories` VALUES ('138', '5');
INSERT INTO `produit_categories` VALUES ('139', '3');
INSERT INTO `produit_categories` VALUES ('140', '5');
INSERT INTO `produit_categories` VALUES ('141', '5');
INSERT INTO `produit_categories` VALUES ('142', '5');
INSERT INTO `produit_categories` VALUES ('143', '5');
INSERT INTO `produit_categories` VALUES ('144', '44');
INSERT INTO `produit_categories` VALUES ('145', '45');
INSERT INTO `produit_categories` VALUES ('146', '45');
INSERT INTO `produit_categories` VALUES ('147', '46');
INSERT INTO `produit_categories` VALUES ('148', '45');
INSERT INTO `produit_categories` VALUES ('149', '47');
INSERT INTO `produit_categories` VALUES ('150', '45');
INSERT INTO `produit_categories` VALUES ('151', '47');
INSERT INTO `produit_categories` VALUES ('152', '48');
INSERT INTO `produit_categories` VALUES ('153', '49');
INSERT INTO `produit_categories` VALUES ('154', '48');
INSERT INTO `produit_categories` VALUES ('155', '45');
INSERT INTO `produit_categories` VALUES ('156', '49');
INSERT INTO `produit_categories` VALUES ('157', '47');
INSERT INTO `produit_categories` VALUES ('158', '48');
INSERT INTO `produit_categories` VALUES ('159', '50');
INSERT INTO `produit_categories` VALUES ('160', '47');
INSERT INTO `produit_categories` VALUES ('161', '45');
INSERT INTO `produit_categories` VALUES ('162', '49');
INSERT INTO `produit_categories` VALUES ('163', '47');
INSERT INTO `produit_categories` VALUES ('164', '46');
INSERT INTO `produit_categories` VALUES ('165', '46');
INSERT INTO `produit_categories` VALUES ('166', '46');
INSERT INTO `produit_categories` VALUES ('167', '46');
INSERT INTO `produit_categories` VALUES ('168', '46');
INSERT INTO `produit_categories` VALUES ('169', '46');
INSERT INTO `produit_categories` VALUES ('170', '46');
INSERT INTO `produit_categories` VALUES ('171', '46');
INSERT INTO `produit_categories` VALUES ('172', '46');
INSERT INTO `produit_categories` VALUES ('173', '51');
INSERT INTO `produit_categories` VALUES ('174', '51');
INSERT INTO `produit_categories` VALUES ('175', '51');
INSERT INTO `produit_categories` VALUES ('176', '51');
INSERT INTO `produit_categories` VALUES ('177', '51');
INSERT INTO `produit_categories` VALUES ('178', '51');
INSERT INTO `produit_categories` VALUES ('179', '51');
INSERT INTO `produit_categories` VALUES ('180', '51');
INSERT INTO `produit_categories` VALUES ('181', '51');
INSERT INTO `produit_categories` VALUES ('182', '14');
INSERT INTO `produit_categories` VALUES ('183', '15');
INSERT INTO `produit_categories` VALUES ('184', '14');
INSERT INTO `produit_categories` VALUES ('185', '16');
INSERT INTO `produit_categories` VALUES ('186', '16');
INSERT INTO `produit_categories` VALUES ('187', '52');
INSERT INTO `produit_categories` VALUES ('188', '53');
INSERT INTO `produit_categories` VALUES ('189', '16');
INSERT INTO `produit_categories` VALUES ('190', '16');
INSERT INTO `produit_categories` VALUES ('191', '54');
INSERT INTO `produit_categories` VALUES ('192', '54');
INSERT INTO `produit_categories` VALUES ('193', '26');
INSERT INTO `produit_categories` VALUES ('194', '53');
INSERT INTO `produit_categories` VALUES ('195', '26');
INSERT INTO `produit_categories` VALUES ('196', '54');
INSERT INTO `produit_categories` VALUES ('197', '26');
INSERT INTO `produit_categories` VALUES ('198', '16');
INSERT INTO `produit_categories` VALUES ('199', '29');
INSERT INTO `produit_categories` VALUES ('200', '56');
INSERT INTO `produit_categories` VALUES ('201', '57');
INSERT INTO `produit_categories` VALUES ('202', '55');
INSERT INTO `produit_categories` VALUES ('203', '55');
INSERT INTO `produit_categories` VALUES ('204', '26');
INSERT INTO `produit_categories` VALUES ('205', '54');
INSERT INTO `produit_categories` VALUES ('206', '26');
INSERT INTO `produit_categories` VALUES ('207', '16');
INSERT INTO `produit_categories` VALUES ('208', '53');
INSERT INTO `produit_categories` VALUES ('209', '17');
INSERT INTO `produit_categories` VALUES ('210', '58');
INSERT INTO `produit_categories` VALUES ('211', '59');
INSERT INTO `produit_categories` VALUES ('212', '54');
INSERT INTO `produit_categories` VALUES ('213', '15');
INSERT INTO `produit_categories` VALUES ('214', '60');
INSERT INTO `produit_categories` VALUES ('215', '61');
INSERT INTO `produit_categories` VALUES ('216', '62');
INSERT INTO `produit_categories` VALUES ('217', '63');
INSERT INTO `produit_categories` VALUES ('218', '64');
INSERT INTO `produit_categories` VALUES ('219', '63');
INSERT INTO `produit_categories` VALUES ('220', '63');
INSERT INTO `produit_categories` VALUES ('221', '24');
INSERT INTO `produit_categories` VALUES ('222', '65');
INSERT INTO `produit_categories` VALUES ('223', '68');
INSERT INTO `produit_categories` VALUES ('224', '62');
INSERT INTO `produit_categories` VALUES ('225', '70');
INSERT INTO `produit_categories` VALUES ('226', '71');
INSERT INTO `produit_categories` VALUES ('227', '71');
INSERT INTO `produit_categories` VALUES ('228', '62');
INSERT INTO `produit_categories` VALUES ('229', '10');
INSERT INTO `produit_categories` VALUES ('230', '73');
INSERT INTO `produit_categories` VALUES ('231', '74');
INSERT INTO `produit_categories` VALUES ('232', '74');
INSERT INTO `produit_categories` VALUES ('233', '10');
INSERT INTO `produit_categories` VALUES ('234', '74');
INSERT INTO `produit_categories` VALUES ('235', '74');
INSERT INTO `produit_categories` VALUES ('236', '74');
INSERT INTO `produit_categories` VALUES ('237', '73');
INSERT INTO `produit_categories` VALUES ('238', '76');
INSERT INTO `produit_categories` VALUES ('239', '77');
INSERT INTO `produit_categories` VALUES ('240', '10');
INSERT INTO `produit_categories` VALUES ('241', '10');
INSERT INTO `produit_categories` VALUES ('242', '10');
INSERT INTO `produit_categories` VALUES ('243', '10');
INSERT INTO `produit_categories` VALUES ('244', '10');
INSERT INTO `produit_categories` VALUES ('245', '74');
INSERT INTO `produit_categories` VALUES ('246', '75');
INSERT INTO `produit_categories` VALUES ('247', '78');
INSERT INTO `produit_categories` VALUES ('248', '79');
INSERT INTO `produit_categories` VALUES ('249', '81');
INSERT INTO `produit_categories` VALUES ('250', '81');
INSERT INTO `produit_categories` VALUES ('251', '82');
INSERT INTO `produit_categories` VALUES ('252', '81');
INSERT INTO `produit_categories` VALUES ('253', '78');
INSERT INTO `produit_categories` VALUES ('254', '78');
INSERT INTO `produit_categories` VALUES ('255', '78');
INSERT INTO `produit_categories` VALUES ('256', '83');
INSERT INTO `produit_categories` VALUES ('257', '84');
INSERT INTO `produit_categories` VALUES ('258', '85');
INSERT INTO `produit_categories` VALUES ('259', '86');
INSERT INTO `produit_categories` VALUES ('260', '83');
INSERT INTO `produit_categories` VALUES ('261', '87');
INSERT INTO `produit_categories` VALUES ('262', '88');
INSERT INTO `produit_categories` VALUES ('263', '82');
INSERT INTO `produit_categories` VALUES ('264', '83');
INSERT INTO `produit_categories` VALUES ('265', '81');
INSERT INTO `produit_categories` VALUES ('266', '81');
INSERT INTO `produit_categories` VALUES ('267', '81');
INSERT INTO `produit_categories` VALUES ('268', '81');
INSERT INTO `produit_categories` VALUES ('269', '90');
INSERT INTO `produit_categories` VALUES ('270', '90');
INSERT INTO `produit_categories` VALUES ('271', '90');
INSERT INTO `produit_categories` VALUES ('272', '90');
INSERT INTO `produit_categories` VALUES ('273', '91');
INSERT INTO `produit_categories` VALUES ('274', '92');
INSERT INTO `produit_categories` VALUES ('275', '91');
INSERT INTO `produit_categories` VALUES ('276', '82');
INSERT INTO `produit_categories` VALUES ('277', '93');
INSERT INTO `produit_categories` VALUES ('278', '94');
INSERT INTO `produit_categories` VALUES ('279', '94');
INSERT INTO `produit_categories` VALUES ('280', '94');
INSERT INTO `produit_categories` VALUES ('281', '94');
INSERT INTO `produit_categories` VALUES ('282', '94');
INSERT INTO `produit_categories` VALUES ('283', '94');
INSERT INTO `produit_categories` VALUES ('284', '94');
INSERT INTO `produit_categories` VALUES ('285', '94');

-- ----------------------------
-- Table structure for `produit_vente`
-- ----------------------------
DROP TABLE IF EXISTS `produit_vente`;
CREATE TABLE `produit_vente` (
  `produitidProduit` int(10) unsigned NOT NULL,
  `venteidVente` int(10) unsigned NOT NULL,
  `nombre_article` int(10) unsigned DEFAULT NULL,
  `prix_unitaire_de_vente_reel` int(10) DEFAULT NULL,
  PRIMARY KEY (`produitidProduit`,`venteidVente`),
  KEY `FKproduit_ve335167` (`produitidProduit`),
  KEY `FKproduit_ve800781` (`venteidVente`),
  CONSTRAINT `FKproduit_ve335167` FOREIGN KEY (`produitidProduit`) REFERENCES `produit` (`idProduit`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKproduit_ve800781` FOREIGN KEY (`venteidVente`) REFERENCES `vente` (`idVente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of produit_vente
-- ----------------------------
INSERT INTO `produit_vente` VALUES ('1', '1', '1', '8000');
INSERT INTO `produit_vente` VALUES ('2', '1', '1', '8000');
INSERT INTO `produit_vente` VALUES ('3', '1', '1', '7000');
INSERT INTO `produit_vente` VALUES ('122', '3', '1', '7000');

-- ----------------------------
-- Table structure for `typeusers`
-- ----------------------------
DROP TABLE IF EXISTS `typeusers`;
CREATE TABLE `typeusers` (
  `idTypeUsers` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `typeuser` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `usersrightsidUsersRights` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idTypeUsers`),
  UNIQUE KEY `usersrightsidUsersRights_UNIQUE` (`typeuser`),
  KEY `FKtypeusers629409` (`usersrightsidUsersRights`),
  CONSTRAINT `FKtypeusers629409` FOREIGN KEY (`usersrightsidUsersRights`) REFERENCES `usersrights` (`idUsersRights`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of typeusers
-- ----------------------------
INSERT INTO `typeusers` VALUES ('1', 'ROOT', 'ROOT PRINCIPAL', '1');
INSERT INTO `typeusers` VALUES ('2', 'Gestionnaire', 'Administrateur', '2');
INSERT INTO `typeusers` VALUES ('3', 'Vendeur', 'Vendeur', '3');

-- ----------------------------
-- Table structure for `usersrights`
-- ----------------------------
DROP TABLE IF EXISTS `usersrights`;
CREATE TABLE `usersrights` (
  `idUsersRights` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `creerUnUser` int(11) NOT NULL,
  `modifierUnUsers` int(11) NOT NULL,
  `supprimerUnUsers` int(11) NOT NULL,
  `vendre` int(11) NOT NULL,
  `modifierUneVente` int(11) NOT NULL,
  `supprimerUneVente` int(11) NOT NULL,
  `enregistrerUnproduit` int(11) NOT NULL,
  `modifierUnProduit` int(11) NOT NULL,
  `supprimerUnProduit` int(11) NOT NULL,
  `voirLesStatistiques` int(11) NOT NULL,
  `ConsulterLesProduits` int(11) NOT NULL,
  `AjouterUnfournisseur` int(11) NOT NULL,
  `ModifierUnFournisseur` int(11) NOT NULL,
  `supprimerUnfournisseur` int(11) NOT NULL,
  `ajouterUneAddresse` int(11) NOT NULL,
  `modifierUneAddresse` int(11) NOT NULL,
  `supprimerUneAddresse` int(11) NOT NULL,
  `ajouterUneCategorie` int(11) NOT NULL,
  `modifierUneCategorie` int(11) NOT NULL,
  `supprimerUneCategorie` int(11) NOT NULL,
  `ajouterUnClient` int(11) NOT NULL,
  `modifierUnClient` int(11) NOT NULL,
  `supprimerunClient` int(11) NOT NULL,
  `ajouterUneCharge` int(11) NOT NULL,
  `modifierUneCharge` int(11) NOT NULL,
  `supprimerunecharge` int(11) NOT NULL,
  `privilegeRoot` int(11) NOT NULL,
  PRIMARY KEY (`idUsersRights`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of usersrights
-- ----------------------------
INSERT INTO `usersrights` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `usersrights` VALUES ('2', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0');
INSERT INTO `usersrights` VALUES ('3', '0', '1', '0', '1', '0', '0', '0', '0', '0', '1', '1', '0', '0', '0', '1', '1', '0', '0', '0', '0', '1', '1', '0', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for `utilisateur`
-- ----------------------------
DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE `utilisateur` (
  `idUser` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `motdepass` varchar(130) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `typeusersidTypeUsers` int(10) unsigned NOT NULL,
  `addressidAddress` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `login_UNIQUE` (`login`,`motdepass`),
  KEY `FKutilisateu373372` (`typeusersidTypeUsers`),
  KEY `FKutilisateu803536` (`addressidAddress`),
  CONSTRAINT `FKutilisateu373372` FOREIGN KEY (`typeusersidTypeUsers`) REFERENCES `typeusers` (`idTypeUsers`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKutilisateu803536` FOREIGN KEY (`addressidAddress`) REFERENCES `address` (`idAddress`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of utilisateur
-- ----------------------------
INSERT INTO `utilisateur` VALUES ('1', 'Fodoup', 'Christian', 'root', '96c1dfcdf25706952dfb9b5153b170f11b0d69ba210cbf800c05a63e062d8a58', 'Le root', '1', '1');
INSERT INTO `utilisateur` VALUES ('2', 'VEGAS', 'SHOPPING', 'login', 'b77189c7cb9e0b96e40ac5b4012c0dde7fb06281b6d3a2dd84f37930ec33221a', 'Le Proprietaire', '2', '2');
INSERT INTO `utilisateur` VALUES ('3', 'epoh', 'stephane', 'epoh', '834733d984e36a22b13f0a2af87758224765e8e7d0397e837b8c155ee4cf8b9b', '', '2', '4');
INSERT INTO `utilisateur` VALUES ('4', 'TCHUEM TCHUENTE', 'OBERT', 'OBERT', '9584015a6fa67a851fe9d1c26e0c8eae6d8cba2445b7f662aa649fe313c2c9b6', '', '2', '6');

-- ----------------------------
-- Table structure for `vente`
-- ----------------------------
DROP TABLE IF EXISTS `vente`;
CREATE TABLE `vente` (
  `idVente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `prix_de_vente` int(11) NOT NULL,
  `date_de_vente` datetime NOT NULL,
  `clientidClient` int(10) unsigned NOT NULL,
  `utilisateuridUser` int(10) unsigned NOT NULL,
  `etat` int(11) NOT NULL,
  `tva` int(11) NOT NULL,
  `benefices` int(11) NOT NULL,
  `montant_de_dette` int(11) DEFAULT NULL,
  `date_de_solde` datetime DEFAULT NULL,
  `type_enregistrement` varchar(5) NOT NULL,
  `Description` varchar(500) DEFAULT NULL,
  `usersoldeur` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`idVente`),
  UNIQUE KEY `idVente_UNIQUE` (`idVente`),
  KEY `FKvente589755` (`clientidClient`),
  KEY `FKvente904218` (`utilisateuridUser`),
  KEY `fk_vente_utilisateur1_idx` (`usersoldeur`),
  CONSTRAINT `FKvente589755` FOREIGN KEY (`clientidClient`) REFERENCES `client` (`idClient`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKvente904218` FOREIGN KEY (`utilisateuridUser`) REFERENCES `utilisateur` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_vente_utilisateur1` FOREIGN KEY (`usersoldeur`) REFERENCES `utilisateur` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of vente
-- ----------------------------
INSERT INTO `vente` VALUES ('1', '23000', '2017-01-22 13:56:26', '2', '1', '1', '0', '22997', '0', null, 'vente', ' ', null);
INSERT INTO `vente` VALUES ('3', '7000', '2017-01-27 14:54:34', '2', '3', '1', '0', '6999', '0', null, 'vente', ' ', null);
