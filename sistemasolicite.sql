-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 04-Nov-2019 às 04:53
-- Versão do servidor: 5.7.26
-- versão do PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistemasolicite`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(50) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `usuario1` varchar(100) NOT NULL,
  `usuario2` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `situacao` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientesareceber`
--

DROP TABLE IF EXISTS `clientesareceber`;
CREATE TABLE IF NOT EXISTS `clientesareceber` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `idcliente` int(11) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `vencimento` date NOT NULL,
  `valor` double NOT NULL,
  `datapagamento` date DEFAULT NULL,
  `valorpago` double DEFAULT NULL,
  `situacao` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idcliente` (`idcliente`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `descontoexcedente`
--

DROP TABLE IF EXISTS `descontoexcedente`;
CREATE TABLE IF NOT EXISTS `descontoexcedente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` tinyint(1) NOT NULL,
  `valor` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `entradasestoque`
--

DROP TABLE IF EXISTS `entradasestoque`;
CREATE TABLE IF NOT EXISTS `entradasestoque` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigoproduto` varchar(100) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `data` varchar(50) NOT NULL,
  `custototal` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `codigoproduto` (`codigoproduto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamentos`
--

DROP TABLE IF EXISTS `pagamentos`;
CREATE TABLE IF NOT EXISTS `pagamentos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `motivo` varchar(100) NOT NULL,
  `fornecedor` varchar(100) NOT NULL,
  `valortotal` double NOT NULL,
  `responsavel` varchar(100) NOT NULL,
  `valoresapagar` double NOT NULL,
  `vencimento` date NOT NULL,
  `valorespagos` double NOT NULL,
  `classificacao` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `perdausopapelaria`
--

DROP TABLE IF EXISTS `perdausopapelaria`;
CREATE TABLE IF NOT EXISTS `perdausopapelaria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(50) NOT NULL,
  `responsavel` varchar(100) NOT NULL,
  `codigoproduto` varchar(100) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `codigoproduto` (`codigoproduto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `perdausoservico`
--

DROP TABLE IF EXISTS `perdausoservico`;
CREATE TABLE IF NOT EXISTS `perdausoservico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(50) NOT NULL,
  `responsavel` varchar(100) NOT NULL,
  `servico` varchar(100) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

DROP TABLE IF EXISTS `produtos`;
CREATE TABLE IF NOT EXISTS `produtos` (
  `codigo` varchar(100) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `custounitario` double NOT NULL,
  `preco` double NOT NULL,
  `estoqueminimo` int(11) NOT NULL,
  `estoqueatual` int(11) NOT NULL,
  `fornecedor` varchar(100) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `funcao` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendapapelaria`
--

DROP TABLE IF EXISTS `vendapapelaria`;
CREATE TABLE IF NOT EXISTS `vendapapelaria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `responsavel` varchar(100) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor` double NOT NULL,
  `codigoproduto` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `codigoproduto` (`codigoproduto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendaservicos`
--

DROP TABLE IF EXISTS `vendaservicos`;
CREATE TABLE IF NOT EXISTS `vendaservicos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `responsavel` varchar(100) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
