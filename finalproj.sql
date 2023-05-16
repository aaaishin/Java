-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 05, 2023 at 04:12 PM
-- Server version: 5.7.24
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `finalproj`
--

-- --------------------------------------------------------

--
-- Table structure for table `guests`
--

CREATE TABLE `guests` (
  `RoomId` int(200) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `ValidID` varchar(20) DEFAULT NULL,
  `CardNumber` bigint(16) DEFAULT NULL,
  `ContactNumber` bigint(11) DEFAULT NULL,
  `CheckInDate` varchar(200) DEFAULT NULL,
  `CheckOutDate` varchar(200) DEFAULT NULL,
  `DaysStaying` varchar(365) DEFAULT NULL,
  `TotalCost` bigint(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(5) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `OurPassword` varchar(50) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Username`, `OurPassword`) VALUES
(1, 'Franciscomarc@gmail.com', 'HelloHi'),
(2, 'SalenKiane@gmail.com', 'Hihihi12345'),
(3, 'RodriquezMarielle@gmail.com', 'HIHIHI');

-- --------------------------------------------------------

--
-- Table structure for table `roomstable`
--

CREATE TABLE `roomstable` (
  `RoomID` int(200) NOT NULL,
  `RoomType` varchar(10) NOT NULL,
  `RoomCapacity` varchar(10) NOT NULL,
  `Availability` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `roomstable`
--

INSERT INTO `roomstable` (`RoomID`, `RoomType`, `RoomCapacity`, `Availability`) VALUES
(1, 'Economy', 'Single', 'Available'),
(2, 'Economy', 'Single', 'Available'),
(3, 'Economy', 'Single', 'Available'),
(4, 'Economy', 'Single', 'Available'),
(5, 'Economy', 'Single', 'Available'),
(6, 'Economy', 'Single', 'Available'),
(7, 'Economy', 'Single', 'Available'),
(8, 'Economy', 'Single', 'Available'),
(9, 'Economy', 'Single', 'Available'),
(10, 'Economy', 'Single', 'Available'),
(11, 'Economy', 'Single', 'Available'),
(12, 'Economy', 'Single', 'Available'),
(13, 'Economy', 'Single', 'Available'),
(14, 'Economy', 'Single', 'Available'),
(15, 'Economy', 'Single', 'Available'),
(16, 'Economy', 'Single', 'Available'),
(17, 'Economy', 'Single', 'Available'),
(18, 'Economy', 'Single', 'Available'),
(19, 'Economy', 'Single', 'Available'),
(20, 'Economy', 'Single', 'Available'),
(21, 'Economy', 'Single', 'Available'),
(22, 'Economy', 'Single', 'Available'),
(23, 'Economy', 'Double', 'Available'),
(24, 'Economy', 'Double', 'Available'),
(25, 'Economy', 'Double', 'Available'),
(26, 'Economy', 'Double', 'Available'),
(27, 'Economy', 'Double', 'Available'),
(28, 'Economy', 'Double', 'Available'),
(29, 'Economy', 'Double', 'Available'),
(30, 'Economy', 'Double', 'Available'),
(31, 'Economy', 'Double', 'Available'),
(32, 'Economy', 'Double', 'Available'),
(33, 'Economy', 'Double', 'Available'),
(34, 'Economy', 'Double', 'Available'),
(35, 'Economy', 'Double', 'Available'),
(36, 'Economy', 'Double', 'Available'),
(37, 'Economy', 'Double', 'Available'),
(38, 'Economy', 'Double', 'Available'),
(39, 'Economy', 'Double', 'Available'),
(40, 'Economy', 'Double', 'Available'),
(41, 'Economy', 'Double', 'Available'),
(42, 'Economy', 'Double', 'Available'),
(43, 'Economy', 'Double', 'Available'),
(44, 'Economy', 'Double', 'Available'),
(45, 'Economy', 'Family', 'Available'),
(46, 'Economy', 'Family', 'Available'),
(47, 'Economy', 'Family', 'Available'),
(48, 'Economy', 'Family', 'Available'),
(49, 'Economy', 'Family', 'Available'),
(50, 'Economy', 'Family', 'Available'),
(51, 'Economy', 'Family', 'Available'),
(52, 'Economy', 'Family', 'Available'),
(53, 'Economy', 'Family', 'Available'),
(54, 'Economy', 'Family', 'Available'),
(55, 'Economy', 'Family', 'Available'),
(56, 'Economy', 'Family', 'Available'),
(57, 'Economy', 'Family', 'Available'),
(58, 'Economy', 'Family', 'Available'),
(59, 'Economy', 'Family', 'Available'),
(60, 'Economy', 'Family', 'Available'),
(61, 'Economy', 'Family', 'Available'),
(62, 'Economy', 'Family', 'Available'),
(63, 'Economy', 'Family', 'Available'),
(64, 'Economy', 'Family', 'Available'),
(65, 'Economy', 'Family', 'Available'),
(66, 'Economy', 'Family', 'Available'),
(67, 'Economy', 'Family', 'Available'),
(68, 'Economy', 'Family', 'Available'),
(69, 'Normal', 'Single', 'Available'),
(70, 'Normal', 'Single', 'Available'),
(71, 'Normal', 'Single', 'Available'),
(72, 'Normal', 'Single', 'Available'),
(73, 'Normal', 'Single', 'Available'),
(74, 'Normal', 'Single', 'Available'),
(75, 'Normal', 'Single', 'Available'),
(76, 'Normal', 'Single', 'Available'),
(77, 'Normal', 'Single', 'Available'),
(78, 'Normal', 'Single', 'Available'),
(79, 'Normal', 'Single', 'Available'),
(80, 'Normal', 'Single', 'Available'),
(81, 'Normal', 'Single', 'Available'),
(82, 'Normal', 'Single', 'Available'),
(83, 'Normal', 'Single', 'Available'),
(84, 'Normal', 'Single', 'Available'),
(85, 'Normal', 'Single', 'Available'),
(86, 'Normal', 'Single', 'Available'),
(87, 'Normal', 'Single', 'Available'),
(88, 'Normal', 'Single', 'Available'),
(89, 'Normal', 'Single', 'Available'),
(90, 'Normal', 'Single', 'Available'),
(91, 'Normal', 'Single', 'Available'),
(92, 'Normal', 'Double', 'Available'),
(93, 'Normal', 'Double', 'Available'),
(94, 'Normal', 'Double', 'Available'),
(95, 'Normal', 'Double', 'Available'),
(96, 'Normal', 'Double', 'Available'),
(97, 'Normal', 'Double', 'Available'),
(98, 'Normal', 'Double', 'Available'),
(99, 'Normal', 'Double', 'Available'),
(100, 'Normal', 'Double', 'Available'),
(101, 'Normal', 'Double', 'Available'),
(102, 'Normal', 'Double', 'Available'),
(103, 'Normal', 'Double', 'Available'),
(104, 'Normal', 'Double', 'Available'),
(105, 'Normal', 'Double', 'Available'),
(106, 'Normal', 'Double', 'Available'),
(107, 'Normal', 'Double', 'Available'),
(108, 'Normal', 'Double', 'Available'),
(109, 'Normal', 'Double', 'Available'),
(110, 'Normal', 'Double', 'Available'),
(111, 'Normal', 'Double', 'Available'),
(112, 'Normal', 'Double', 'Available'),
(113, 'Normal', 'Double', 'Available'),
(114, 'Normal', 'Double', 'Available'),
(115, 'Normal', 'Family', 'Available'),
(116, 'Normal', 'Family', 'Available'),
(117, 'Normal', 'Family', 'Available'),
(118, 'Normal', 'Family', 'Available'),
(119, 'Normal', 'Family', 'Available'),
(120, 'Normal', 'Family', 'Available'),
(121, 'Normal', 'Family', 'Available'),
(122, 'Normal', 'Family', 'Available'),
(123, 'Normal', 'Family', 'Available'),
(124, 'Normal', 'Family', 'Available'),
(125, 'Normal', 'Family', 'Available'),
(126, 'Normal', 'Family', 'Available'),
(127, 'Normal', 'Family', 'Available'),
(128, 'Normal', 'Family', 'Available'),
(129, 'Normal', 'Family', 'Available'),
(130, 'Normal', 'Family', 'Available'),
(131, 'Normal', 'Family', 'Available'),
(132, 'Normal', 'Family', 'Available'),
(133, 'Normal', 'Family', 'Available'),
(134, 'Normal', 'Family', 'Available'),
(135, 'Normal', 'Family', 'Available'),
(136, 'Normal', 'Family', 'Available'),
(137, 'Normal', 'Family', 'Available'),
(138, 'Normal', 'Family', 'Available'),
(139, 'VIP', 'Single', 'Available'),
(140, 'VIP', 'Single', 'Available'),
(141, 'VIP', 'Single', 'Available'),
(142, 'VIP', 'Single', 'Available'),
(143, 'VIP', 'Single', 'Available'),
(144, 'VIP', 'Single', 'Available'),
(145, 'VIP', 'Single', 'Available'),
(146, 'VIP', 'Single', 'Available'),
(147, 'VIP', 'Single', 'Available'),
(148, 'VIP', 'Single', 'Available'),
(149, 'VIP', 'Single', 'Available'),
(150, 'VIP', 'Single', 'Available'),
(151, 'VIP', 'Single', 'Available'),
(152, 'VIP', 'Single', 'Available'),
(153, 'VIP', 'Single', 'Available'),
(154, 'VIP', 'Single', 'Available'),
(155, 'VIP', 'Single', 'Available'),
(156, 'VIP', 'Single', 'Available'),
(157, 'VIP', 'Single', 'Available'),
(158, 'VIP', 'Single', 'Available'),
(159, 'VIP', 'Single', 'Available'),
(160, 'VIP', 'Single', 'Available'),
(161, 'VIP', 'Double', 'Available'),
(162, 'VIP', 'Double', 'Available'),
(163, 'VIP', 'Double', 'Available'),
(164, 'VIP', 'Double', 'Available'),
(165, 'VIP', 'Double', 'Available'),
(166, 'VIP', 'Double', 'Available'),
(167, 'VIP', 'Double', 'Available'),
(168, 'VIP', 'Double', 'Available'),
(169, 'VIP', 'Double', 'Available'),
(170, 'VIP', 'Double', 'Available'),
(171, 'VIP', 'Double', 'Available'),
(172, 'VIP', 'Double', 'Available'),
(173, 'VIP', 'Double', 'Available'),
(174, 'VIP', 'Double', 'Available'),
(175, 'VIP', 'Double', 'Available'),
(176, 'VIP', 'Double', 'Available'),
(177, 'VIP', 'Double', 'Available'),
(178, 'VIP', 'Double', 'Available'),
(179, 'VIP', 'Double', 'Available'),
(180, 'VIP', 'Double', 'Available'),
(181, 'VIP', 'Family', 'Available'),
(182, 'VIP', 'Family', 'Available'),
(183, 'VIP', 'Family', 'Available'),
(184, 'VIP', 'Family', 'Available'),
(185, 'VIP', 'Family', 'Available'),
(186, 'VIP', 'Family', 'Available'),
(187, 'VIP', 'Family', 'Available'),
(188, 'VIP', 'Family', 'Available'),
(189, 'VIP', 'Family', 'Available'),
(190, 'VIP', 'Family', 'Available'),
(191, 'VIP', 'Family', 'Available'),
(192, 'VIP', 'Family', 'Available'),
(193, 'VIP', 'Family', 'Available'),
(194, 'VIP', 'Family', 'Available'),
(195, 'VIP', 'Family', 'Available'),
(196, 'VIP', 'Family', 'Available'),
(197, 'VIP', 'Family', 'Available'),
(198, 'VIP', 'Family', 'Available'),
(199, 'VIP', 'Family', 'Available'),
(200, 'VIP', 'Family', 'Available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guests`
--
ALTER TABLE `guests`
  ADD PRIMARY KEY (`RoomId`),
  ADD UNIQUE KEY `RoomId` (`RoomId`),
  ADD UNIQUE KEY `CardNumber` (`CardNumber`),
  ADD UNIQUE KEY `Name` (`Name`),
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `ValidID` (`ValidID`),
  ADD UNIQUE KEY `ContactNumber` (`ContactNumber`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `roomstable`
--
ALTER TABLE `roomstable`
  ADD PRIMARY KEY (`RoomID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
