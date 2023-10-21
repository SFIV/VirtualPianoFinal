CREATE DATABASE  IF NOT EXISTS `piano_application` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `piano_application`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: piano_application
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `game` (
  `ID` decimal(38,0) NOT NULL,
  `SEQUENCE` varchar(500) DEFAULT NULL,
  `NAME` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` VALUES (1,'etyy yuii iouu ytty etyy yuii iouu yty etyy yioo opPP popy','He is a Pirate (Demo)'),(2,'Ipsd s iooip psdfds pooioopi ipsd s iopoip psdfiopoiiiooii iiooii','See You Again'),(3,'tyt sao uyuyt','14th');
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `piano_settings`
--

DROP TABLE IF EXISTS `piano_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `piano_settings` (
  `USERNAME` varchar(50) DEFAULT NULL,
  `BUTTON` decimal(38,0) DEFAULT NULL,
  `CODE` decimal(38,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `piano_settings`
--

LOCK TABLES `piano_settings` WRITE;
/*!40000 ALTER TABLE `piano_settings` DISABLE KEYS */;
INSERT INTO `piano_settings` VALUES ('a',1,49),('a',2,549),('a',3,50),('a',4,550),('a',5,51),('a',6,52),('a',7,552),('a',8,53),('a',9,553),('a',10,54),('a',11,554),('a',12,55),('a',13,56),('a',14,556),('a',15,57),('a',16,557),('a',17,48),('a',18,81),('a',19,581),('a',20,87),('a',21,587),('a',22,69),('a',23,569),('a',24,82),('a',25,84),('a',26,584),('a',27,89),('a',28,589),('a',29,85),('a',30,73),('a',31,573),('a',32,79),('a',33,579),('a',34,80),('a',35,580),('a',36,65),('a',37,83),('a',38,583),('a',39,68),('a',40,568),('a',41,70),('a',42,71),('a',43,571),('a',44,72),('a',45,572),('a',46,74),('a',47,574),('a',48,75),('a',49,76),('a',50,576),('a',51,90),('a',52,590),('a',53,88),('a',54,67),('a',55,567),('a',56,86),('a',57,586),('a',58,66),('a',59,566),('a',60,78),('a',61,77),('inzu',1,49),('inzu',2,549),('inzu',3,50),('inzu',4,550),('inzu',5,51),('inzu',6,52),('inzu',7,552),('inzu',8,53),('inzu',9,553),('inzu',10,54),('inzu',11,554),('inzu',12,55),('inzu',13,56),('inzu',14,556),('inzu',15,57),('inzu',16,557),('inzu',17,48),('inzu',18,81),('inzu',19,581),('inzu',20,87),('inzu',21,587),('inzu',22,69),('inzu',23,569),('inzu',24,82),('inzu',25,84),('inzu',26,584),('inzu',27,89),('inzu',28,589),('inzu',29,85),('inzu',30,73),('inzu',31,573),('inzu',32,79),('inzu',33,579),('inzu',34,80),('inzu',35,580),('inzu',36,65),('inzu',37,83),('inzu',38,583),('inzu',39,68),('inzu',40,568),('inzu',41,70),('inzu',42,71),('inzu',43,571),('inzu',44,72),('inzu',45,572),('inzu',46,74),('inzu',47,574),('inzu',48,75),('inzu',49,76),('inzu',50,576),('inzu',51,90),('inzu',52,590),('inzu',53,88),('inzu',54,67),('inzu',55,567),('inzu',56,86),('inzu',57,586),('inzu',58,66),('inzu',59,566),('inzu',60,78),('inzu',61,77),('Inzamam',1,49),('Inzamam',2,549),('Inzamam',3,50),('Inzamam',4,550),('Inzamam',5,51),('Inzamam',6,52),('Inzamam',7,552),('Inzamam',8,53),('Inzamam',9,553),('Inzamam',10,54),('Inzamam',11,554),('Inzamam',12,55),('Inzamam',13,56),('Inzamam',14,556),('Inzamam',15,57),('Inzamam',16,557),('Inzamam',17,48),('Inzamam',18,81),('Inzamam',19,581),('Inzamam',20,87),('Inzamam',21,587),('Inzamam',22,69),('Inzamam',23,569),('Inzamam',24,82),('Inzamam',25,84),('Inzamam',26,584),('Inzamam',27,89),('Inzamam',28,589),('Inzamam',29,85),('Inzamam',30,73),('Inzamam',31,573),('Inzamam',32,79),('Inzamam',33,579),('Inzamam',34,80),('Inzamam',35,580),('Inzamam',36,65),('Inzamam',37,83),('Inzamam',38,583),('Inzamam',39,68),('Inzamam',40,568),('Inzamam',41,70),('Inzamam',42,71),('Inzamam',43,571),('Inzamam',44,72),('Inzamam',45,572),('Inzamam',46,74),('Inzamam',47,574),('Inzamam',48,75),('Inzamam',49,76),('Inzamam',50,576),('Inzamam',51,90),('Inzamam',52,590),('Inzamam',53,88),('Inzamam',54,67),('Inzamam',55,567),('Inzamam',56,86),('Inzamam',57,586),('Inzamam',58,66),('Inzamam',59,566),('Inzamam',60,78),('Inzamam',61,77);
/*!40000 ALTER TABLE `piano_settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scores`
--

DROP TABLE IF EXISTS `scores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scores` (
  `GAME_ID` decimal(38,0) DEFAULT NULL,
  `SCORE` decimal(38,0) DEFAULT NULL,
  `USERNAME` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scores`
--

LOCK TABLES `scores` WRITE;
/*!40000 ALTER TABLE `scores` DISABLE KEYS */;
/*!40000 ALTER TABLE `scores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `virtualpiano`
--

DROP TABLE IF EXISTS `virtualpiano`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `virtualpiano` (
  `USERNAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(30) DEFAULT NULL,
  `LASTLOGIN` date DEFAULT NULL,
  `STREAK` decimal(38,0) DEFAULT NULL,
  `DARKMODE` decimal(38,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `virtualpiano`
--

LOCK TABLES `virtualpiano` WRITE;
/*!40000 ALTER TABLE `virtualpiano` DISABLE KEYS */;
INSERT INTO `virtualpiano` VALUES ('Inzamam',')4/%','2023-09-22',1,0),('a',')4/%','2023-09-03',1,0),('inzu','!;41','2023-09-03',1,0);
/*!40000 ALTER TABLE `virtualpiano` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-20 23:32:55
