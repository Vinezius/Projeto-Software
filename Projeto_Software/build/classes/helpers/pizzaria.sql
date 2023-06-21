-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21/06/2023 às 05:21
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pizzaria`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `dataCadastro` varchar(20) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `telefone` varchar(10) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nome`, `cpf`, `dataCadastro`, `endereco`, `telefone`, `ativo`) VALUES
(1, 'teste', '10938086910', 'teste', 'teste', 'testes', 1),
(2, 'testeCliente', '94856479123', '20/06/2023', 'teste', 'teste', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `entregador`
--

CREATE TABLE `entregador` (
  `idEntregador` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `placa` varchar(10) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Despejando dados para a tabela `entregador`
--

INSERT INTO `entregador` (`idEntregador`, `nome`, `cpf`, `placa`, `ativo`) VALUES
(1, 'teste', '80049782146', 'ABC1234', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `idFuncionario` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cargo` varchar(25) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Despejando dados para a tabela `funcionario`
--

INSERT INTO `funcionario` (`idFuncionario`, `nome`, `cargo`, `ativo`) VALUES
(2, 'teste funcionário', 'teste', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `modalidade`
--

CREATE TABLE `modalidade` (
  `idModalidade` int(11) NOT NULL,
  `modalidade` varchar(50) DEFAULT NULL,
  `preco` decimal(4,2) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Despejando dados para a tabela `modalidade`
--

INSERT INTO `modalidade` (`idModalidade`, `modalidade`, `preco`, `ativo`) VALUES
(1, 'Entrega', 8.00, 1),
(2, 'Retirada', 0.00, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedido`
--

CREATE TABLE `pedido` (
  `numPedido` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `data` varchar(20) NOT NULL,
  `hora` varchar(10) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `funcionario` varchar(50) NOT NULL,
  `entregador` varchar(50) NOT NULL,
  `promocao` varchar(50) NOT NULL,
  `quantidade` varchar(50) NOT NULL,
  `sabor` varchar(50) NOT NULL,
  `tamanho` varchar(50) NOT NULL,
  `numFatias` varchar(50) NOT NULL,
  `acrescimo` varchar(20) NOT NULL,
  `observacoes` varchar(50) NOT NULL,
  `status` varchar(20) NOT NULL,
  `pedido` varchar(50) NOT NULL,
  `modalidade` varchar(50) NOT NULL,
  `valorFinal` varchar(50) NOT NULL,
  `placa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `promocao`
--

CREATE TABLE `promocao` (
  `idPromocao` int(11) NOT NULL,
  `promocao` varchar(50) DEFAULT NULL,
  `desconto` decimal(4,2) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT NULL,
  `observacao` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Despejando dados para a tabela `promocao`
--

INSERT INTO `promocao` (`idPromocao`, `promocao`, `desconto`, `ativo`, `observacao`) VALUES
(2, 'Natal', 10.00, 1, 'natal');

-- --------------------------------------------------------

--
-- Estrutura para tabela `sabor`
--

CREATE TABLE `sabor` (
  `idSabor` int(11) NOT NULL,
  `sabor` varchar(30) NOT NULL,
  `observacao` varchar(50) NOT NULL,
  `ativo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Despejando dados para a tabela `sabor`
--

INSERT INTO `sabor` (`idSabor`, `sabor`, `observacao`, `ativo`) VALUES
(2, 'Calabresa', 'Calabresa', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `tamanho`
--

CREATE TABLE `tamanho` (
  `idTamanho` int(11) NOT NULL,
  `tamanho` varchar(20) NOT NULL,
  `preco` varchar(20) NOT NULL,
  `numFatias` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Despejando dados para a tabela `tamanho`
--

INSERT INTO `tamanho` (`idTamanho`, `tamanho`, `preco`, `numFatias`) VALUES
(2, 'Pequena', '20,99', '6'),
(3, 'Média', '30,99', '8');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Índices de tabela `entregador`
--
ALTER TABLE `entregador`
  ADD PRIMARY KEY (`idEntregador`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`idFuncionario`);

--
-- Índices de tabela `modalidade`
--
ALTER TABLE `modalidade`
  ADD PRIMARY KEY (`idModalidade`);

--
-- Índices de tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`numPedido`);

--
-- Índices de tabela `promocao`
--
ALTER TABLE `promocao`
  ADD PRIMARY KEY (`idPromocao`);

--
-- Índices de tabela `sabor`
--
ALTER TABLE `sabor`
  ADD PRIMARY KEY (`idSabor`);

--
-- Índices de tabela `tamanho`
--
ALTER TABLE `tamanho`
  ADD PRIMARY KEY (`idTamanho`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `entregador`
--
ALTER TABLE `entregador`
  MODIFY `idEntregador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `idFuncionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `modalidade`
--
ALTER TABLE `modalidade`
  MODIFY `idModalidade` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `numPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `promocao`
--
ALTER TABLE `promocao`
  MODIFY `idPromocao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `sabor`
--
ALTER TABLE `sabor`
  MODIFY `idSabor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `tamanho`
--
ALTER TABLE `tamanho`
  MODIFY `idTamanho` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
