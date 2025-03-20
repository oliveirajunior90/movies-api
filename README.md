
# MOVIES API

## Environment

#### Requirements

- `Ex: Java 17+`
#### Database

```sh
# SPRING_PROFILE
test

# URL
http://localhost:8080/h2-console

# JDBC url
jdbc:h2:mem:testdb
```

### SQL DUMP

````sql
INSERT INTO tb_user(email) VALUES ('maria@gmail.com');
INSERT INTO tb_user(email) VALUES ('joao@gmail.com');
INSERT INTO tb_user(email) VALUES ('ana@gmail.com');
INSERT INTO tb_user(email) VALUES ('lucia@gmail.com');
INSERT INTO tb_user(email) VALUES ('joaquim@gmail.com');

INSERT INTO tb_movie(score, count, title, image) VALUES (4.5, 2, 'The Witcher', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (3.3, 3, 'Venom: Tempo de Carnificina', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/vIgyYkXkg6NC2whRbYjBD7eb3Er.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg');
INSERT INTO tb_movie(score, count, title, image) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg');


INSERT INTO tb_score(movie_id, user_id, score_value) VALUES (1, 2, 4.0);
INSERT INTO tb_score(movie_id, user_id, score_value) VALUES (2, 1, 3.0);
INSERT INTO tb_score(movie_id, user_id, score_value) VALUES (2, 2, 3.0);
````

## Endpoints

### Scores

#### set score

- **URL:** `/api/v1/score`
- **Method:** `PUT`
- **Body:**

```json
    {
	    "movieId": 1,
	    "email": "rodrigo@gmail.com",
	    "score": 8
	}
```

- **response:**

    ```json
    {
		"id": 1,
	    "title": "The Witcher",
	    "score": 6.0,
	    "count": 2,
	    "image":  "https://www.themoviedb.org/thumb"
    }
    ```


### Movies

#### Paginated list

- **URL:** `/api/v1/movies`
- **Método:** `GET`
- **Response:**

    ```json
    "content": [
        {
            "id": 1,
            "title": "The Witcher",
            "score": 4.0,
            "count": 1,
            "image": "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg"
        },
        {
            "id": 2,
            "title": "Venom: Tempo de Carnificina",
            "score": 3.3,
            "count": 3,
            "image": "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/vIgyYkXkg6NC2whRbYjBD7eb3Er.jpg"
        },
        {
            "id": 3,
            "title": "Shang-Chi e a Lenda dos Dez Anéis",
            "score": 0.0,
            "count": 0,
            "image": "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg"
        },
        {
            "id": 4,
            "title": "Matrix Resurrections",
            "score": 0.0,
            "count": 0,
            "image": "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg"
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 20,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 30,
    "totalPages": 2,
    "size": 20,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 20,
    "empty": false
}
```

#### Single Movie

- **URL:** `/api/v1/movie/{id}`
- **Método:** `GET`
- **Response:**

```JSON
{
            "id": 20,
            "title": "Matrix Resurrections",
            "score": 0.0,
            "count": 0,
            "image": "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg"
        }
```