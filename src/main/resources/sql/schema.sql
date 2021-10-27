CREATE TABLE IF NOT EXISTS users (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  firstname              VARCHAR      NOT NULL,
  lastname               VARCHAR      NOT NULL,
  mail                   VARCHAR      NOT NULL,
  password               VARCHAR      NOT NULL,
  age                    INTEGER      NOT NULL
);

CREATE TABLE IF NOT EXISTS friendships (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  user1_id               VARCHAR(60)  NOT NULL,
  user2_id               VARCHAR(60)  NOT NULL
);

CREATE TABLE IF NOT EXISTS groups (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  name                   VARCHAR      NOT NULL,
  description            VARCHAR      NOT NULL,
  admin_id               VARCHAR(60)  NOT NULL,
  privacy                VARCHAR      NOT NULL
);

CREATE TABLE IF NOT EXISTS pages (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  name                   VARCHAR      NOT NULL,
  description            VARCHAR      NOT NULL,
  admin_id               VARCHAR(60)  NOT NULL
);

CREATE TABLE IF NOT EXISTS posts (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  publisher_id           VARCHAR(60)  NOT NULL,
  content                VARCHAR      NOT NULL
);

CREATE TABLE IF NOT EXISTS textmessages (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  sender_id              VARCHAR(60)  NOT NULL,
  recipient_id           VARCHAR(60)  NOT NULL,
  content                VARCHAR      NOT NULL
);
