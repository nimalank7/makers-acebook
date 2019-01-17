CREATE TABLE posts (
  id SERIAL PRIMARY KEY,
  user_id INTEGER NOT NULL REFERENCES users(id),
  time_stamp TIMESTAMP DEFAULT NOW(),
  text varchar(140) NOT NULL
);
