CREATE DATABASE  IF NOT EXISTS `cancelaciones` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cancelaciones`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: cancelaciones
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `documento_estudiante` varchar(20) NOT NULL,
  `tipo_documento_estudiante` varchar(2) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `estrato` int NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `usuario_institucional` varchar(20) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  PRIMARY KEY (`documento_estudiante`,`tipo_documento_estudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante_materia`
--

DROP TABLE IF EXISTS `estudiante_materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante_materia` (
  `id_materia` varchar(20) NOT NULL,
  `documento_estudiante` varchar(20) NOT NULL,
  `semestre_matricula` varchar(10) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`id_materia`,`documento_estudiante`,`semestre_matricula`),
  KEY `documento_estudiante_idx` (`documento_estudiante`),
  CONSTRAINT `documento_estudiante_materia` FOREIGN KEY (`documento_estudiante`) REFERENCES `estudiante` (`documento_estudiante`),
  CONSTRAINT `id_materia_estudiante` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante_materia`
--

LOCK TABLES `estudiante_materia` WRITE;
/*!40000 ALTER TABLE `estudiante_materia` DISABLE KEYS */;
/*!40000 ALTER TABLE `estudiante_materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materia` (
  `id_materia` varchar(20) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `creditos` varchar(2) NOT NULL,
  `habilitable` varchar(1) NOT NULL,
  PRIMARY KEY (`id_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesor` (
  `documento_profesor` varchar(20) NOT NULL,
  `tipo_documento_profesor` varchar(2) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `usuario_institucional` varchar(20) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  PRIMARY KEY (`documento_profesor`,`tipo_documento_profesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor_materia`
--

DROP TABLE IF EXISTS `profesor_materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesor_materia` (
  `id_materia` varchar(20) NOT NULL,
  `documento_profesor` varchar(20) NOT NULL,
  `semestre_matricula` varchar(10) NOT NULL,
  PRIMARY KEY (`id_materia`,`documento_profesor`,`semestre_matricula`),
  KEY `documento_profesor_materia_idx` (`documento_profesor`),
  CONSTRAINT `documento_profesor_materia` FOREIGN KEY (`documento_profesor`) REFERENCES `profesor` (`documento_profesor`),
  CONSTRAINT `id_materia_profesor` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor_materia`
--

LOCK TABLES `profesor_materia` WRITE;
/*!40000 ALTER TABLE `profesor_materia` DISABLE KEYS */;
/*!40000 ALTER TABLE `profesor_materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitud_cancelacion`
--

DROP TABLE IF EXISTS `solicitud_cancelacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solicitud_cancelacion` (
  `id_solicitud_cancelacion` varchar(20) NOT NULL,
  `documento_estudiante` varchar(20) NOT NULL,
  `id_materia` varchar(45) DEFAULT NULL,
  `documento_profesor` varchar(20) NOT NULL,
  `tipo_solicitud` varchar(45) NOT NULL,
  `estado_solicitud` varchar(45) NOT NULL,
  `justificacion_cancelacion` varchar(200) NOT NULL,
  PRIMARY KEY (`id_solicitud_cancelacion`,`documento_estudiante`),
  KEY `documento_estudiante_idx` (`documento_estudiante`),
  KEY `documento_profesor_idx` (`documento_profesor`),
  KEY `id_materia_idx` (`id_materia`),
  CONSTRAINT `documento_estudiante_solicitud` FOREIGN KEY (`documento_estudiante`) REFERENCES `estudiante` (`documento_estudiante`),
  CONSTRAINT `documento_profesor_solicitud` FOREIGN KEY (`documento_profesor`) REFERENCES `profesor` (`documento_profesor`),
  CONSTRAINT `id_materia_solicitud` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitud_cancelacion`
--

LOCK TABLES `solicitud_cancelacion` WRITE;
/*!40000 ALTER TABLE `solicitud_cancelacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `solicitud_cancelacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-09 21:36:03
