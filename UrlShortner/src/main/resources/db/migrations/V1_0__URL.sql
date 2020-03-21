CREATE TABLE IF NOT EXISTS urlShortner.url (
  short_url varchar(20), 
  long_url varchar(40),
  PRIMARY KEY (short_url, long_url))
ENGINE = InnoDB;