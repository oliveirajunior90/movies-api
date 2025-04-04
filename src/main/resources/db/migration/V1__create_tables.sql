CREATE TABLE tb_user (
     id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
     email VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE tb_movie (
      id SERIAL PRIMARY KEY,
      title VARCHAR(255) NOT NULL,
      score NUMERIC(2,1) CHECK (score >= 0 AND score <= 5),
      count INTEGER DEFAULT 0,
      image VARCHAR(500)
);

CREATE TABLE tb_score (
      movie_id BIGINT NOT NULL,
      user_id BIGINT NOT NULL,
      score_value NUMERIC(2,1) CHECK (score_value >= 0 AND score_value <= 5),
      PRIMARY KEY (movie_id, user_id),
      CONSTRAINT fk_score_movie FOREIGN KEY (movie_id) REFERENCES tb_movie (id) ON DELETE CASCADE,
      CONSTRAINT fk_score_user FOREIGN KEY (user_id) REFERENCES tb_user (id) ON DELETE CASCADE
);


