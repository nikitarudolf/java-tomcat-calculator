CREATE TABLE IF NOT EXISTS calculations (
                              id        SERIAL PRIMARY KEY,
                              num1      DOUBLE PRECISION,
                              num2      DOUBLE PRECISION,
                              operation VARCHAR,
                              result    DOUBLE PRECISION,
                              timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);