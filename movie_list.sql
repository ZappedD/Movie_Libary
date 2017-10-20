-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Värd: 127.0.0.1
-- Tid vid skapande: 20 okt 2017 kl 09:33
-- Serverversion: 10.1.26-MariaDB
-- PHP-version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Databas: `datamovies`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `movie_list`
--

CREATE TABLE `movie_list` (
  `Title` text NOT NULL,
  `Plot` text NOT NULL,
  `Time` int(11) NOT NULL,
  `Rating` int(10) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `movie_list`
--

INSERT INTO `movie_list` (`Title`, `Plot`, `Time`, `Rating`, `ID`) VALUES
('Nyckeln till frihet', 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.', 122, 9, 32),
('Seven', 'Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.', 127, 8, 33),
('De sju samurajerna', 'A poor village under attack by bandits recruits seven unemployed samurai to help them defend themselves.', 182, 8, 34),
('Pans labyrint', 'In the falangist Spain of 1944, the bookish young stepdaughter of a sadistic army officer escapes into an eerie but captivating fantasy world.', 65, 8, 36);

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `movie_list`
--
ALTER TABLE `movie_list`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT för dumpade tabeller
--

--
-- AUTO_INCREMENT för tabell `movie_list`
--
ALTER TABLE `movie_list`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
