-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 05 juin 2018 à 14:57
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `ShowLevelByID`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `ShowLevelByID` (IN `id` INT)  NO SQL
    COMMENT 'Give the level receiving the id of the level.'
SELECT *
FROM level
WHERE level.ID_Level = id$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `level`
--

DROP TABLE IF EXISTS `level`;
CREATE TABLE IF NOT EXISTS `level` (
  `ID_Level` int(11) NOT NULL AUTO_INCREMENT,
  `Lev_Texte` varchar(350) NOT NULL,
  PRIMARY KEY (`ID_Level`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `level`
--

INSERT INTO `level` (`ID_Level`, `Lev_Texte`) VALUES
(1, '......o-o---------o.\r\n...o--o.1.........oo\r\n...1....1..........1\r\no--o....1...i......1\r\n1.i.o---o-----o....o\r\n1i....w.....u...P.H1\r\n1.i.o---o-----o....o\r\no--o....1...i......1\r\n...1....1..........1\r\n...o--o.1.........oo\r\n......o-o---------o.\r\n....................'),
(2, '...o-o..oooo..o-o...\r\n...1.1.oo..oo.1u1...\r\n...1.1oo....oo1.1...\r\n...1.oo......oo.1...\r\n...1............1...\r\n...oo..........oo...\r\n..oo.P........H.oo..\r\n.oo..............oo.\r\noo---o........o---oo\r\no...yoo......ooy...o\r\no.w..............w.o\r\noo----------------oo'),
(3, 'o---------------oo..\r\noo...............oo.\r\n.oo...............oo\r\n..oo...ooooo.......o\r\n...oo....u.oo......1\r\n...o...y....oo.....1\r\n...o.zz..H.P.......1\r\n...oo..x....oo.....1\r\n..oo.......oo......o\r\n.oo....ooooo......oo\r\noo...............oo.\r\no---------------oo..'),
(4, '.....o---o..........\r\no----ooy.oo..o-----o\r\n1.oo......oo.1o....1\r\n1.o........o-o...P.1\r\n1y.....u...........1\r\n1..o-o...o-o..oo...1\r\n1..1.1...1.1z.1o---o\r\noo.1.1w..1.ooH1.....\r\n.o-o.ooii1.oooo.....\r\n......o--o..11......\r\n............oo......\r\n....................'),
(5, '...o----------o.....\r\n..ooz.........oo....\r\n..1...........x1....\r\n..1............1....\r\n..1Pu.o....H...1....\r\n..oo..........oo....\r\n...oo........oo.....\r\n....oo......oo......\r\n..o--o......o--o....\r\n.....1.o-zo.1.......\r\n.....oo....oo.......\r\n......o----o........');

-- --------------------------------------------------------

--
-- Structure de la table `save`
--

DROP TABLE IF EXISTS `save`;
CREATE TABLE IF NOT EXISTS `save` (
  `ID_Save` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Level` int(11) NOT NULL,
  `ID_Monster` int(11) NOT NULL,
  `ID_Heroes` int(11) NOT NULL,
  PRIMARY KEY (`ID_Save`),
  KEY `Save_Saved_Level_FK` (`ID_Level`),
  KEY `Save_Saved_Monster0_FK` (`ID_Monster`),
  KEY `Save_Saved_Heroes1_FK` (`ID_Heroes`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `saved_heroes`
--

DROP TABLE IF EXISTS `saved_heroes`;
CREATE TABLE IF NOT EXISTS `saved_heroes` (
  `ID_Heroes` int(11) NOT NULL AUTO_INCREMENT,
  `Her_XPosition` int(11) NOT NULL,
  `Her_YPosition` int(11) NOT NULL,
  `Her_IsAlive` tinyint(1) NOT NULL,
  `Her_HasSpell` tinyint(1) NOT NULL,
  `Her_HasKey` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID_Heroes`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `saved_level`
--

DROP TABLE IF EXISTS `saved_level`;
CREATE TABLE IF NOT EXISTS `saved_level` (
  `ID_Level` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Level`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `saved_monster`
--

DROP TABLE IF EXISTS `saved_monster`;
CREATE TABLE IF NOT EXISTS `saved_monster` (
  `ID_Monster` int(11) NOT NULL AUTO_INCREMENT,
  `Mon_XPosition` int(11) NOT NULL,
  `Mon_YPosition` int(11) NOT NULL,
  `Mon_IsAlive` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID_Monster`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `save`
--
ALTER TABLE `save`
  ADD CONSTRAINT `Save_Saved_Heroes1_FK` FOREIGN KEY (`ID_Heroes`) REFERENCES `saved_heroes` (`ID_Heroes`),
  ADD CONSTRAINT `Save_Saved_Level_FK` FOREIGN KEY (`ID_Level`) REFERENCES `saved_level` (`ID_Level`),
  ADD CONSTRAINT `Save_Saved_Monster0_FK` FOREIGN KEY (`ID_Monster`) REFERENCES `saved_monster` (`ID_Monster`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
