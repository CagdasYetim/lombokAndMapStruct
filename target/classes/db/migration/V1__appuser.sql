CREATE TABLE app_user (
  id UUID NOT NULL,
   name VARCHAR(255) NOT NULL,
   password VARCHAR(30) NOT NULL,
   mail VARCHAR(255) NOT NULL,
   CONSTRAINT pk_app_user PRIMARY KEY (id)
);