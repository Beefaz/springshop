-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2020 at 02:39 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `product_id` int(10) NOT NULL,
  `user_id` int(10) DEFAULT NULL,
  `phone` varchar(15) NOT NULL,
  `city` varchar(10) NOT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_price` double(10,2) DEFAULT NULL,
  `product_category` varchar(255) DEFAULT NULL,
  `delivery_method` varchar(255) DEFAULT NULL,
  `advertisement_length` int(1) DEFAULT NULL,
  `advertisement_timestamp` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product_id`, `user_id`, `phone`, `city`, `product_name`, `product_price`, `product_category`, `delivery_method`, `advertisement_length`, `advertisement_timestamp`) VALUES
(2, 3, '', '', 'Skateboard', 200.00, 'Laisvalaikis', 'DPD', 7, '2020-04-29 23:15:42'),
(5, 6, '+37060519154', 'Alytus', 'sdfjhgkh', 54646.00, '[Audio bei video aparatūra  ]', '[Paštomatu]', 4, '2020-05-13 08:12:48'),
(8, 6, '+65468468486', 'Justinas', 'ahfduk', 12513.00, '[Mobilieji telefonai ir jų priedai]', '[Galimybė atsiimti sutartoje vietoje, Paštomatu]', 3, '2020-05-13 12:57:33'),
(12, 11, '6496133135144', 'Kaunas', 'etfrestht', 200.00, '[Mobilieji telefonai ir jų priedai]', '[Paštomatu]', 4, '2020-05-13 19:11:20'),
(14, 6, '3463446346', '346346346', '343434', 34.34, '[Sportas, laisvalaikis, turizmas]', '[Paštomatu]', 2, '2020-05-14 14:55:20'),
(15, 14, '+370605191544', 'Alytus', 'Skateboard', 100.10, '[Sportas, laisvalaikis, turizmas]', '[Paštu]', 3, '2020-05-14 15:04:01');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `user_name`, `user_password`, `user_email`) VALUES
(1, 'Justinas', 'nesamone', 'justinas@gmail.com'),
(9, 'Mantas', 'katleris', 'katleris@gmail.com'),
(10, 'Mantas', 'katleris', 'katleris@gmail.com'),
(11, 'Justinas', 'nesamone', 'justinas@gmail.com'),
(12, 'Justinas', 'nesamone', 'justinas@gmail.com'),
(13, 'Justinas', 'nesamone', 'justinas@gmail.com'),
(14, 'justinas.geryba@gmail.com', 'katleris', 'justinas@gmail.com'),
(15, 'Mantas', 'katleris', 'katleris@gmail.com'),
(16, 'Justinas', 'nesamone', 'justinas@gmail.com'),
(17, 'Justinas', 'nesamone', 'justinas@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `product_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
