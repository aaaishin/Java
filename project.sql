-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 15, 2023 at 03:39 PM
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
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `ID` int(5) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`ID`, `Email`, `Password`) VALUES
(1, 'justinfroapilongo@gmail.com', 'pilongo123'),
(2, 'markandrei.sanpedro.d1@gmail.com', 'marksanpedr0'),
(3, 'espinedahanahmae@gmail.com', 'hanahmae30'),
(4, 'lagmanjelo06@gmail.com', 'JLagman'),
(5, 'rosanarosedomingoi@gmail.com', 'leeheeseung'),
(6, 'esguerrateptep@gmail.com', 'tepteph69'),
(7, 'joshuaemilfabian@gmail.com', 'email_05');

-- --------------------------------------------------------

--
-- Table structure for table `attendant`
--

CREATE TABLE `attendant` (
  `AttendantID` int(11) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `MiddleName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) NOT NULL,
  `SuffixName` varchar(255) DEFAULT NULL,
  `BirthDate` date NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `ContactNo` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `attendant`
--

INSERT INTO `attendant` (`AttendantID`, `FirstName`, `MiddleName`, `LastName`, `SuffixName`, `BirthDate`, `Gender`, `ContactNo`) VALUES
(7, 'Lopez', 'Amie', 'Cruz', '', '1999-03-12', 'Female', 9324523345),
(8, 'Francisco', 'Mark', 'Bataanon', 'Jr.', '2000-04-09', 'Male', 9648986436),
(9, 'Santos', 'Andrea', 'Ignacio', '', '1999-06-03', 'Female', 9865421567),
(10, 'Buendia', 'Ana', 'Marin', '', '1993-04-05', 'Female', 9124637829),
(11, 'Abac', 'Jhaycee', 'Rodriguez', 'Jr.', '1992-03-08', 'Male', 9347829019);

-- --------------------------------------------------------

--
-- Table structure for table `dateofvisit`
--

CREATE TABLE `dateofvisit` (
  `VisitDate` date NOT NULL,
  `VisitTime` varchar(255) NOT NULL,
  `VisitorID` int(11) NOT NULL,
  `ElderlyID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `dateofvisit`
--

INSERT INTO `dateofvisit` (`VisitDate`, `VisitTime`, `VisitorID`, `ElderlyID`) VALUES
('2023-03-03', '9:20AM', 101, 7),
('2023-05-23', '9:30AM', 102, 8),
('2023-05-11', '10:00AM', 103, 9),
('2023-05-18', '12:00PM', 103, 10),
('2023-05-20', '10:00AM', 105, 11);

-- --------------------------------------------------------

--
-- Table structure for table `elderly`
--

CREATE TABLE `elderly` (
  `ElderlyID` int(11) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `MiddleName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) NOT NULL,
  `SuffixName` varchar(255) DEFAULT NULL,
  `BirthDate` date NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `ContactNo` bigint(20) NOT NULL,
  `GuardianName` varchar(255) NOT NULL,
  `Street` varchar(255) NOT NULL,
  `Barangay` varchar(255) NOT NULL,
  `CityMunicipality` varchar(255) NOT NULL,
  `Province` varchar(255) NOT NULL,
  `AdmitDate` date NOT NULL,
  `ElderlyRoomNo` varchar(255) NOT NULL,
  `AttendantID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `elderly`
--

INSERT INTO `elderly` (`ElderlyID`, `FirstName`, `MiddleName`, `LastName`, `SuffixName`, `BirthDate`, `Gender`, `ContactNo`, `GuardianName`, `Street`, `Barangay`, `CityMunicipality`, `Province`, `AdmitDate`, `ElderlyRoomNo`, `AttendantID`) VALUES
(7, 'Linda', 'Bartolome', 'Tomas', '', '1943-08-03', 'Female', 9765489652, 'John S. Tomas', '#21 Rizal St.', 'Sta. Monica', 'Hagonoy', 'Bulacan', '2023-04-09', '1', 7),
(8, 'Henry', 'Frances', 'Dela Cruz', 'Sr.', '1947-09-08', 'Male', 9789054344, 'Rose D. Dela Cruz', '#10 De Ocampo St.', 'Bulihan', 'Valenzuela City', 'Apalit', '2023-04-03', '2', 8),
(9, 'Karlito', 'Panganiban', 'Perez', 'Sr.', '1942-04-02', 'Male', 9765478902, 'Kevin F. Santos', '#11 Magnolia St.', 'San Agustin', 'Pasig City', 'Dalanbaka', '2023-09-04', '3', 9),
(10, 'Joselito', 'Laurel', 'Mariano', 'Sr.', '1949-07-01', 'Male', 9789213678, 'Monica R. Cruz', '#20 Bonifacio St.', 'Dangwa', 'Pasay City', 'Kutkot', '2023-07-02', '4', 10),
(11, 'Rosa', 'Enriquez', 'Salim', '', '1950-03-09', 'Female', 9738920178, 'Erwin A. Pineda', '#13 Galang St.', 'Poblacion', 'Pasig City', 'Centro', '2023-07-05', '5', 11);

-- --------------------------------------------------------

--
-- Table structure for table `visitor`
--

CREATE TABLE `visitor` (
  `VisitorID` int(11) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `MiddleName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) NOT NULL,
  `SuffixName` varchar(255) DEFAULT NULL,
  `Gender` varchar(255) NOT NULL,
  `BirthDate` date NOT NULL,
  `Relationship` varchar(255) NOT NULL,
  `ContactNo` bigint(20) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Street` varchar(255) NOT NULL,
  `Barangay` varchar(255) NOT NULL,
  `CityMunicipality` varchar(255) NOT NULL,
  `Province` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `visitor`
--

INSERT INTO `visitor` (`VisitorID`, `FirstName`, `MiddleName`, `LastName`, `SuffixName`, `Gender`, `BirthDate`, `Relationship`, `ContactNo`, `Email`, `Street`, `Barangay`, `CityMunicipality`, `Province`) VALUES
(101, 'Eren', 'Ackerman', 'Tomas', '', 'Male', '2023-03-04', 'Grandmother', 9356178927, 'ErenYG@gmail.com', '#21 Rizal St.', 'Sta Monica', 'Haganoy', 'Bulacan'),
(102, 'Amy', 'Cortez', 'Hernandez', '', 'Female', '2023-06-08', 'Daughter', 9367281902, 'ACortez@gmail.com', '#10 De Ocampo St.', 'Bulihan', 'Valenzuela City', 'Apalit'),
(103, 'Beth', 'Navarro', 'Medina', '', 'Female', '2001-05-08', 'Niece', 9673819021, 'beth@gmail.com', '#18 Norte St.', 'Quiapo', 'Quezon City', 'San Miguel'),
(104, 'Danyel', 'Torres', 'De Castro', '', 'Male', '1999-09-02', 'Friend', 9839103129, 'torresd@gmail.com', '#8 Azul St.', 'Catmon', 'Valencia City', 'San Simon'),
(105, 'Kristine', 'Candelaria', 'Pangilinan', '', 'Female', '1996-04-08', 'Friend', 9271829439, 'candelariak@gmail.com', '#11 Wano St.', 'Calizon', 'Pasig City', 'Sta Lucia');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminlogin`
--
ALTER TABLE `adminlogin`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `attendant`
--
ALTER TABLE `attendant`
  ADD PRIMARY KEY (`AttendantID`),
  ADD UNIQUE KEY `ContactNo` (`ContactNo`);

--
-- Indexes for table `dateofvisit`
--
ALTER TABLE `dateofvisit`
  ADD KEY `VisitorFK` (`VisitorID`),
  ADD KEY `DateElderlyFK` (`ElderlyID`);

--
-- Indexes for table `elderly`
--
ALTER TABLE `elderly`
  ADD PRIMARY KEY (`ElderlyID`),
  ADD UNIQUE KEY `ContactNo` (`ContactNo`),
  ADD KEY `AttendantFK` (`AttendantID`);

--
-- Indexes for table `visitor`
--
ALTER TABLE `visitor`
  ADD PRIMARY KEY (`VisitorID`),
  ADD UNIQUE KEY `ContactNo` (`ContactNo`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adminlogin`
--
ALTER TABLE `adminlogin`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `attendant`
--
ALTER TABLE `attendant`
  MODIFY `AttendantID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `elderly`
--
ALTER TABLE `elderly`
  MODIFY `ElderlyID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `visitor`
--
ALTER TABLE `visitor`
  MODIFY `VisitorID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dateofvisit`
--
ALTER TABLE `dateofvisit`
  ADD CONSTRAINT `DateElderlyFK` FOREIGN KEY (`ElderlyID`) REFERENCES `elderly` (`ElderlyID`),
  ADD CONSTRAINT `VisitorFK` FOREIGN KEY (`VisitorID`) REFERENCES `visitor` (`VisitorID`);

--
-- Constraints for table `elderly`
--
ALTER TABLE `elderly`
  ADD CONSTRAINT `AttendantFK` FOREIGN KEY (`AttendantID`) REFERENCES `attendant` (`AttendantID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
