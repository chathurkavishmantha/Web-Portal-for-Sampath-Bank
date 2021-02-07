CREATE DATABASE `customer` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;

CREATE TABLE `addloan` (
  `loanid` int(11) NOT NULL AUTO_INCREMENT,
  `loantype` varchar(45) NOT NULL,
  `loanrate` varchar(45) NOT NULL,
  PRIMARY KEY (`loanid`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


'63', 'home loan', '5.5'
'64', 'personal Loan', '4.3'
'65', 'vehical loan', '5.9'


CREATE TABLE `calculator` (
  `loanid` int(11) NOT NULL AUTO_INCREMENT,
  `loantype` varchar(45) NOT NULL,
  `loanamount` double NOT NULL,
  `loanduration` int(20) NOT NULL,
  `loanrate` varchar(45) NOT NULL,
  PRIMARY KEY (`loanid`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


'1', 'HomeLoan', '7777', '1', '66.0'


CREATE TABLE `register` (
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

'Admin', 'Admin', 'admin@gmail.com', 'colombo'

CREATE TABLE `signup` (
  `fname` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`fname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



