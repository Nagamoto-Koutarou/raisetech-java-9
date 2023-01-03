 DROP TABLE IF EXISTS names;

 CREATE TABLE names (
    id int unsigned AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
  );

  INSERT INTO names (name) VALUES ("nagamoto");
  INSERT INTO names (name) VALUES ("tanaka");
  INSERT INTO names (name) VALUES ("sato");
  INSERT INTO names (name) VALUES ("murakami");
  INSERT INTO names (name) VALUES ("yoshida");
