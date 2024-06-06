CREATE TABLE `database_tables`.`training` (
  `training_id` INT NOT NULL AUTO_INCREMENT,
  `training_name` VARCHAR(45) NOT NULL,
  `start_date` DATE NULL,
  `end_date` DATE NULL,
  `trainer_id` INT NULL,
  `trainer_name` VARCHAR(50) NOT NULL,
  `location` VARCHAR(150) NULL,
  `capacity` INT NULL,
  `description` TEXT NULL,
  `status` VARCHAR(50) NULL,
  `cost` DECIMAL NULL,
  `created_by` INT NULL,
  `created_at` DATETIME NULL,
  `updated_by` INT NULL,
  `updated_at` DATETIME NULL,
  PRIMARY KEY (`training_id`),
  UNIQUE INDEX `training_id_UNIQUE` (`training_id` ASC) VISIBLE,
  UNIQUE INDEX `trainer_id_UNIQUE` (`trainer_id` ASC) VISIBLE);
