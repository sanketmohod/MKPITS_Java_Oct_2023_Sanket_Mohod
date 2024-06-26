
CREATE TABLE `database_tables`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(20) NOT NULL,
  `last_name` VARCHAR(20) NOT NULL,
  `age` VARCHAR(20) NULL,
  `email` VARCHAR(45) NULL,
  `mobile` VARCHAR(45) NULL,
  `department` VARCHAR(45) NULL,
  `location` VARCHAR(200) NULL,
  `salary` DECIMAL NOT NULL,
  `joining_date` DATE NULL,
  `created_by` INT NULL,
  `created_at` DATETIME NULL,
  `updatede_by` INT NULL,
  `updated_at` DATETIME NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `employee_id_UNIQUE` (`id` ASC) VISIBLE,