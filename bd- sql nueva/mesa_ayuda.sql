-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: mesa_ayuda
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.14-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `configuracion_tipocaso`
--

DROP TABLE IF EXISTS `configuracion_tipocaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configuracion_tipocaso` (
  `OIDConfiguracionTipoCaso` varchar(100) NOT NULL,
  `nroConfig` int(11) NOT NULL,
  `fechaInicioVigencia` datetime DEFAULT NULL,
  `fechaFinVigencia` datetime DEFAULT NULL,
  `fechaVerificacion` datetime DEFAULT NULL,
  `OIDTipoCaso` varchar(100) NOT NULL,
  PRIMARY KEY (`OIDConfiguracionTipoCaso`),
  KEY `configuracion_tipocaso_FK` (`OIDTipoCaso`),
  CONSTRAINT `configuracion_tipocaso_FK` FOREIGN KEY (`OIDTipoCaso`) REFERENCES `tipocaso` (`OIDTipoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuracion_tipocaso`
--

LOCK TABLES `configuracion_tipocaso` WRITE;
/*!40000 ALTER TABLE `configuracion_tipocaso` DISABLE KEYS */;
/*!40000 ALTER TABLE `configuracion_tipocaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sector`
--

DROP TABLE IF EXISTS `sector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sector` (
  `OIDSector` varchar(100) NOT NULL,
  `codSector` int(11) NOT NULL,
  `nombreSector` varchar(100) NOT NULL,
  `descripcionSector` varchar(100) DEFAULT NULL,
  `fechaHoraFinVigenciaSector` datetime DEFAULT NULL,
  PRIMARY KEY (`OIDSector`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sector`
--

LOCK TABLES `sector` WRITE;
/*!40000 ALTER TABLE `sector` DISABLE KEYS */;
/*!40000 ALTER TABLE `sector` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipocaso`
--

DROP TABLE IF EXISTS `tipocaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipocaso` (
  `OIDTipoCaso` varchar(100) NOT NULL,
  `codTipoCaso` int(11) NOT NULL,
  `nombreTipoCaso` varchar(100) NOT NULL,
  `fechaFinVigenciaTipoCaso` datetime DEFAULT NULL,
  PRIMARY KEY (`OIDTipoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipocaso`
--

LOCK TABLES `tipocaso` WRITE;
/*!40000 ALTER TABLE `tipocaso` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipocaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipocaso_tipoinstancia`
--

DROP TABLE IF EXISTS `tipocaso_tipoinstancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipocaso_tipoinstancia` (
  `OIDTipoCasoTipoInstancia` varchar(100) NOT NULL,
  `minutosMaximoResolucion` int(11) DEFAULT NULL,
  `ordenTipoCasoTipoInstancia` int(11) DEFAULT NULL,
  `OIDTipoInstancia` varchar(100) NOT NULL,
  `OIDConfiguracionTipoCaso` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`OIDTipoCasoTipoInstancia`),
  KEY `tipocaso_tipoinstacia_FK` (`OIDTipoInstancia`),
  KEY `tipocaso_tipoinstancia_FK` (`OIDConfiguracionTipoCaso`),
  CONSTRAINT `tipocaso_tipoinstacia_FK` FOREIGN KEY (`OIDTipoInstancia`) REFERENCES `tipoinstancia` (`OIDTipoInstancia`),
  CONSTRAINT `tipocaso_tipoinstancia_FK` FOREIGN KEY (`OIDConfiguracionTipoCaso`) REFERENCES `configuracion_tipocaso` (`OIDConfiguracionTipoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipocaso_tipoinstancia`
--

LOCK TABLES `tipocaso_tipoinstancia` WRITE;
/*!40000 ALTER TABLE `tipocaso_tipoinstancia` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipocaso_tipoinstancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoinstancia`
--

DROP TABLE IF EXISTS `tipoinstancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoinstancia` (
  `OIDTipoInstancia` varchar(100) NOT NULL,
  `codTipoInstancia` int(11) NOT NULL,
  `nombreTipoInstancia` varchar(100) DEFAULT NULL,
  `fechaHoraFinVigenciaTipoInstancia` datetime DEFAULT NULL,
  `OIDSector` varchar(100) NOT NULL,
  `OIDTipoTarea` varchar(100) NOT NULL,
  PRIMARY KEY (`OIDTipoInstancia`),
  KEY `tipoinstancia_FK` (`OIDSector`),
  KEY `tipoinstancia_FK_1` (`OIDTipoTarea`),
  CONSTRAINT `tipoinstancia_FK` FOREIGN KEY (`OIDSector`) REFERENCES `sector` (`OIDSector`),
  CONSTRAINT `tipoinstancia_FK_1` FOREIGN KEY (`OIDTipoTarea`) REFERENCES `tipotarea` (`OIDTipoTarea`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoinstancia`
--

LOCK TABLES `tipoinstancia` WRITE;
/*!40000 ALTER TABLE `tipoinstancia` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipoinstancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipotarea`
--

DROP TABLE IF EXISTS `tipotarea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipotarea` (
  `OIDTipoTarea` varchar(100) NOT NULL,
  `codTipoTarea` int(11) NOT NULL,
  `nombreTipoTarea` varchar(100) NOT NULL,
  `descripcionTipoTarea` varchar(100) DEFAULT NULL,
  `fechaHoraFinVigenciaTipoTarea` datetime DEFAULT NULL,
  PRIMARY KEY (`OIDTipoTarea`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipotarea`
--

LOCK TABLES `tipotarea` WRITE;
/*!40000 ALTER TABLE `tipotarea` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipotarea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'mesa_ayuda'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-20 11:28:26
