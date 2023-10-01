-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: alura_hotel
-- ------------------------------------------------------
-- Server version	8.1.0

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
-- Table structure for table `huespedes`
--

DROP TABLE IF EXISTS `huespedes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `huespedes` (
  `id_huesped` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `nacionalidad` varchar(35) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `id_reserva` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id_huesped`),
  KEY `id_reserva` (`id_reserva`),
  CONSTRAINT `huespedes_ibfk_1` FOREIGN KEY (`id_reserva`) REFERENCES `reservas` (`id_reserva`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huespedes`
--

LOCK TABLES `huespedes` WRITE;
/*!40000 ALTER TABLE `huespedes` DISABLE KEYS */;
INSERT INTO `huespedes` VALUES (3,'Oscar','Mendoza','1999-05-27','Mexican – mexicano','11-33-22-44-33','4798a389-132c-4c79-aa67-8569470dcf4a'),(4,'Maricela','Lopez','1976-09-23','Nicaraguan – nicaraguense','22-11-22-33-44','b2e8ad3b-a131-4179-ac36-36723d086594'),(5,'Carlos','Lopez Bautista','1987-06-27','Guatemalan – guatemalteco','22-33-44-43-33','ce477aea-cb4c-4a12-acad-8a5fa6412369'),(6,'Raquel','Jaramillo Hernandez','1987-06-18','Colombian – colombiano','44-33-22-33-44','96fa6714-2c5c-4954-80f2-9eb1fdf06078'),(7,'Francisco','Hernández Reyes','1998-03-18','Mexican – mexicano','44-33-44-33-44','b920b5bf-c982-4cf6-881c-731b4e801828'),(8,'Paulina','Dominguez Sanchez','1977-06-10','Argentinian – argentino','33-44-33-22-44','72a2b3b2-335f-4945-be5e-d9287ee6f60f');
/*!40000 ALTER TABLE `huespedes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-01 16:36:37
