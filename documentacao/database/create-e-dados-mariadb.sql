-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.6.8-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para viagem-benezinho
CREATE DATABASE IF NOT EXISTS `viagem-benezinho` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `viagem-benezinho`;

-- Copiando estrutura para tabela viagem-benezinho.sq_authority
CREATE TABLE IF NOT EXISTS `sq_authority` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Copiando dados para a tabela viagem-benezinho.sq_authority: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `sq_authority` DISABLE KEYS */;
INSERT IGNORE INTO `sq_authority` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(1001, 1, 9223372036854775806, 1, 1, 1000, 0, 0);
/*!40000 ALTER TABLE `sq_authority` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.sq_pessoa
CREATE TABLE IF NOT EXISTS `sq_pessoa` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Copiando dados para a tabela viagem-benezinho.sq_pessoa: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `sq_pessoa` DISABLE KEYS */;
INSERT IGNORE INTO `sq_pessoa` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(1001, 1, 9223372036854775806, 1, 1, 1000, 0, 0);
/*!40000 ALTER TABLE `sq_pessoa` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.sq_transportavel
CREATE TABLE IF NOT EXISTS `sq_transportavel` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Copiando dados para a tabela viagem-benezinho.sq_transportavel: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `sq_transportavel` DISABLE KEYS */;
INSERT IGNORE INTO `sq_transportavel` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(1001, 1, 9223372036854775806, 1, 1, 1000, 0, 0);
/*!40000 ALTER TABLE `sq_transportavel` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.sq_user
CREATE TABLE IF NOT EXISTS `sq_user` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Copiando dados para a tabela viagem-benezinho.sq_user: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `sq_user` DISABLE KEYS */;
INSERT IGNORE INTO `sq_user` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(1001, 1, 9223372036854775806, 1, 1, 1000, 0, 0);
/*!40000 ALTER TABLE `sq_user` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.sq_viagem
CREATE TABLE IF NOT EXISTS `sq_viagem` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Copiando dados para a tabela viagem-benezinho.sq_viagem: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `sq_viagem` DISABLE KEYS */;
INSERT IGNORE INTO `sq_viagem` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(1001, 1, 9223372036854775806, 1, 1, 1000, 0, 0);
/*!40000 ALTER TABLE `sq_viagem` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_authority
CREATE TABLE IF NOT EXISTS `tb_authority` (
  `ID_AUTHORITY` bigint(20) NOT NULL,
  `NM_AUTHORITY` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_AUTHORITY`),
  UNIQUE KEY `UK_NM_AUTHORITY` (`NM_AUTHORITY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_authority: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_authority` DISABLE KEYS */;
INSERT IGNORE INTO `tb_authority` (`ID_AUTHORITY`, `NM_AUTHORITY`) VALUES
	(1, 'cliente');
/*!40000 ALTER TABLE `tb_authority` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_authority_usuario
CREATE TABLE IF NOT EXISTS `tb_authority_usuario` (
  `AUTHORITY` bigint(20) NOT NULL,
  `USUARIO` bigint(20) NOT NULL,
  PRIMARY KEY (`AUTHORITY`,`USUARIO`),
  KEY `FK_AUTHORIRY_USER` (`USUARIO`),
  CONSTRAINT `FK_AUTHORIRY_USER` FOREIGN KEY (`USUARIO`) REFERENCES `tb_user` (`ID_USUARIO`),
  CONSTRAINT `FK_USER_AUTHORITY` FOREIGN KEY (`AUTHORITY`) REFERENCES `tb_authority` (`ID_AUTHORITY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_authority_usuario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_authority_usuario` DISABLE KEYS */;
INSERT IGNORE INTO `tb_authority_usuario` (`AUTHORITY`, `USUARIO`) VALUES
	(1, 1),
	(1, 2),
	(1, 3),
	(1, 4);
/*!40000 ALTER TABLE `tb_authority_usuario` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_endereco
CREATE TABLE IF NOT EXISTS `tb_endereco` (
  `PESSOA` bigint(20) NOT NULL,
  `CEP` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `ddd` varchar(255) DEFAULT NULL,
  `gia` varchar(255) DEFAULT NULL,
  `ibge` varchar(255) DEFAULT NULL,
  `localidade` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `siafi` varchar(255) DEFAULT NULL,
  `uf` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PESSOA`),
  UNIQUE KEY `UK_END_PESSOA` (`PESSOA`,`CEP`),
  CONSTRAINT `FK_ENDERECO_PESSOA` FOREIGN KEY (`PESSOA`) REFERENCES `tb_pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_endereco: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_endereco` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_passageiro
CREATE TABLE IF NOT EXISTS `tb_passageiro` (
  `ID_TRANSPORTAVEL` bigint(20) NOT NULL,
  `PESSOA` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID_TRANSPORTAVEL`),
  KEY `FK_TB_PASSAGEIRO_PESSOA` (`PESSOA`),
  CONSTRAINT `FK_TB_PASSAGEIRO_PESSOA` FOREIGN KEY (`PESSOA`) REFERENCES `tb_pf` (`ID_PESSOA`),
  CONSTRAINT `FKddk0o6ub7c7cjwhafphd2k9r9` FOREIGN KEY (`ID_TRANSPORTAVEL`) REFERENCES `tb_transportavel` (`ID_TRANSPORTAVEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_passageiro: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_passageiro` DISABLE KEYS */;
INSERT IGNORE INTO `tb_passageiro` (`ID_TRANSPORTAVEL`, `PESSOA`) VALUES
	(3, 1);
/*!40000 ALTER TABLE `tb_passageiro` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_pessoa
CREATE TABLE IF NOT EXISTS `tb_pessoa` (
  `DT_NASCIMENTO` date DEFAULT NULL,
  `ID_PESSOA` bigint(20) NOT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NM_PESSOA` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_pessoa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_pessoa` DISABLE KEYS */;
INSERT IGNORE INTO `tb_pessoa` (`DT_NASCIMENTO`, `ID_PESSOA`, `EMAIL`, `NM_PESSOA`) VALUES
	('1977-03-08', 1, 'benefrancis@gmail.com', 'Benefrancis do Nascimento'),
	('2000-03-08', 2, 'holding@benezinho.com', 'Benezinho Holding SA'),
	('2000-03-08', 3, 'bank@benezinho.com', 'Benezinho Bank SA'),
	('2000-05-15', 4, 'bruninhosudre@gmail.com', 'Bruno sudré do Nascimento');
/*!40000 ALTER TABLE `tb_pessoa` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_pf
CREATE TABLE IF NOT EXISTS `tb_pf` (
  `ID_PESSOA` bigint(20) NOT NULL,
  `NR_CPF` varchar(255) NOT NULL,
  `sexo` enum('FEMININO','MASCULINO') DEFAULT NULL,
  PRIMARY KEY (`ID_PESSOA`),
  UNIQUE KEY `UK_PF_CPF` (`NR_CPF`),
  CONSTRAINT `FKo14w6uw4ru9105ls0g72jayei` FOREIGN KEY (`ID_PESSOA`) REFERENCES `tb_pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_pf: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_pf` DISABLE KEYS */;
INSERT IGNORE INTO `tb_pf` (`ID_PESSOA`, `NR_CPF`, `sexo`) VALUES
	(1, '24378891874', 'MASCULINO'),
	(4, '24318891874', 'MASCULINO');
/*!40000 ALTER TABLE `tb_pf` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_pj
CREATE TABLE IF NOT EXISTS `tb_pj` (
  `ID_PESSOA` bigint(20) NOT NULL,
  `NR_CNPJ` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_PESSOA`),
  UNIQUE KEY `UK_PJ_CNPJ` (`NR_CNPJ`),
  CONSTRAINT `FK2f1f5uwwiv1xqrn1dxg9r5mqm` FOREIGN KEY (`ID_PESSOA`) REFERENCES `tb_pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_pj: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_pj` DISABLE KEYS */;
INSERT IGNORE INTO `tb_pj` (`ID_PESSOA`, `NR_CNPJ`) VALUES
	(3, '010238728900164'),
	(2, '01023872891864');
/*!40000 ALTER TABLE `tb_pj` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_produto
CREATE TABLE IF NOT EXISTS `tb_produto` (
  `altura` float DEFAULT NULL,
  `largura` float DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `profundidade` float DEFAULT NULL,
  `ID_TRANSPORTAVEL` bigint(20) NOT NULL,
  `etiqueta` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TRANSPORTAVEL`),
  CONSTRAINT `FKhmy27wrj3adedm6tt4slo11jq` FOREIGN KEY (`ID_TRANSPORTAVEL`) REFERENCES `tb_transportavel` (`ID_TRANSPORTAVEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_produto: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_produto` DISABLE KEYS */;
INSERT IGNORE INTO `tb_produto` (`altura`, `largura`, `peso`, `profundidade`, `ID_TRANSPORTAVEL`, `etiqueta`, `nome`) VALUES
	(1.5, 0.5, 300, 1, 1, '12132', 'Tablet'),
	(0.5, 0.5, 1300, 0.3, 2, '121356465dASD2', 'Iphone 15');
/*!40000 ALTER TABLE `tb_produto` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_transportavel
CREATE TABLE IF NOT EXISTS `tb_transportavel` (
  `ID_TRANSPORTAVEL` bigint(20) NOT NULL,
  `TP_TRANSPORTAVEL` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_TRANSPORTAVEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_transportavel: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_transportavel` DISABLE KEYS */;
INSERT IGNORE INTO `tb_transportavel` (`ID_TRANSPORTAVEL`, `TP_TRANSPORTAVEL`) VALUES
	(1, 'PRODUTO'),
	(2, 'PRODUTO'),
	(3, 'PASSAGEIRO');
/*!40000 ALTER TABLE `tb_transportavel` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_user
CREATE TABLE IF NOT EXISTS `tb_user` (
  `ID_USUARIO` bigint(20) NOT NULL,
  `PESSOA` bigint(20) DEFAULT NULL,
  `USER_EMAIL` varchar(255) NOT NULL,
  `USER_PASSWORD` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_USUARIO`),
  UNIQUE KEY `UK_USER_EMAIL` (`USER_EMAIL`),
  UNIQUE KEY `UK_exmaa2wsgprggfak42w4pwkb7` (`PESSOA`),
  CONSTRAINT `FK_USER_PESSOA` FOREIGN KEY (`PESSOA`) REFERENCES `tb_pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_user: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT IGNORE INTO `tb_user` (`ID_USUARIO`, `PESSOA`, `USER_EMAIL`, `USER_PASSWORD`) VALUES
	(1, 1, 'benefrancis@gmail.com', '8D969EEF6ECAD3C29A3A629280E686CF0C3F5D5A86AFF3CA12020C923ADC6C92'),
	(2, 2, 'holding@benezinho.com', '8D969EEF6ECAD3C29A3A629280E686CF0C3F5D5A86AFF3CA12020C923ADC6C92'),
	(3, 3, 'bank@benezinho.com', '8D969EEF6ECAD3C29A3A629280E686CF0C3F5D5A86AFF3CA12020C923ADC6C92'),
	(4, 4, 'bruninhosudre@gmail.com', '8D969EEF6ECAD3C29A3A629280E686CF0C3F5D5A86AFF3CA12020C923ADC6C92');
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_viagem
CREATE TABLE IF NOT EXISTS `tb_viagem` (
  `CLIENTE` bigint(20) DEFAULT NULL,
  `DT_CHEGADA` datetime(6) DEFAULT NULL,
  `DT_SAIDA` datetime(6) DEFAULT NULL,
  `ID_VIAGEM` bigint(20) NOT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `origem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_VIAGEM`),
  KEY `FK_TB_VIAGEM_CLIENTE` (`CLIENTE`),
  CONSTRAINT `FK_TB_VIAGEM_CLIENTE` FOREIGN KEY (`CLIENTE`) REFERENCES `tb_pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_viagem: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_viagem` DISABLE KEYS */;
INSERT IGNORE INTO `tb_viagem` (`CLIENTE`, `DT_CHEGADA`, `DT_SAIDA`, `ID_VIAGEM`, `destino`, `origem`) VALUES
	(1, NULL, NULL, 1, '06086120', '05818250'),
	(1, NULL, NULL, 2, '06086120', '05818250'),
	(1, NULL, NULL, 3, '06086120', '05818250');
/*!40000 ALTER TABLE `tb_viagem` ENABLE KEYS */;

-- Copiando estrutura para tabela viagem-benezinho.tb_viagem_transportavel
CREATE TABLE IF NOT EXISTS `tb_viagem_transportavel` (
  `TRASPORTAVEL` bigint(20) NOT NULL,
  `VIAGEM` bigint(20) NOT NULL,
  PRIMARY KEY (`TRASPORTAVEL`,`VIAGEM`),
  KEY `FK_TB_VIAGEM_VIAGEM` (`VIAGEM`),
  CONSTRAINT `FK_TB_VIAGEM_TRANSPORTAVEL` FOREIGN KEY (`TRASPORTAVEL`) REFERENCES `tb_transportavel` (`ID_TRANSPORTAVEL`),
  CONSTRAINT `FK_TB_VIAGEM_VIAGEM` FOREIGN KEY (`VIAGEM`) REFERENCES `tb_viagem` (`ID_VIAGEM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela viagem-benezinho.tb_viagem_transportavel: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_viagem_transportavel` DISABLE KEYS */;
INSERT IGNORE INTO `tb_viagem_transportavel` (`TRASPORTAVEL`, `VIAGEM`) VALUES
	(1, 1),
	(1, 3),
	(2, 1),
	(2, 3),
	(3, 2),
	(3, 3);
/*!40000 ALTER TABLE `tb_viagem_transportavel` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
