CREATE TABLE `database_tables`.`client` (
  `client_id` INT NOT NULL AUTO_INCREMENT,
  `client_name` VARCHAR(45) NOT NULL,
  `client_email` VARCHAR(45) NOT NULL,
  `client_mobile` VARCHAR(15) NOT NULL,
  `address` VARCHAR(200) NULL,
  `city` VARCHAR(20) NULL,
  `state` VARCHAR(20) NULL,
  `country` VARCHAR(20) NULL,
  `pincode` VARCHAR(10) NULL,
  `created_by` INT NULL,
  `created_at` DATETIME NULL,
  `updated_by` INT NULL,
  `updated_at` DATETIME NULL,
  PRIMARY KEY (`client_id`),
  UNIQUE INDEX `client_id_UNIQUE` (`client_id` ASC) VISIBLE,
  UNIQUE INDEX `client_email_UNIQUE` (`client_email` ASC) VISIBLE,

