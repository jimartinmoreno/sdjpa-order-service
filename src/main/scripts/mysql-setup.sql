DROP DATABASE IF EXISTS 'sdjpa-order-service';
DROP USER IF EXISTS `orderadmin`@`%`;
DROP USER IF EXISTS `orderuser`@`%`;
CREATE DATABASE IF NOT EXISTS 'sdjpa-order-service' CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `orderadmin`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
    CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `sdjpa-order-service`.* TO `orderadmin`@`%`;
CREATE USER IF NOT EXISTS `orderuser`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, SHOW VIEW ON `sdjpa-order-service`.* TO `orderuser`@`%`;
FLUSH PRIVILEGES;