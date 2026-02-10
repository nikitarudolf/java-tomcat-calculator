CREATE TABLE IF NOT EXISTS operations
(
    op_name VARCHAR CONSTRAINT operations_pk PRIMARY KEY,
    count   INTEGER DEFAULT 0
);

INSERT INTO operations (op_name, count) VALUES
                                            ('sum', 0),
                                            ('sub', 0),
                                            ('mul', 0),
                                            ('div', 0);

CREATE OR REPLACE FUNCTION increment_count()
RETURNS TRIGGER AS $$
BEGIN
UPDATE operations
SET count = count + 1
WHERE op_name = NEW.operation;
RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER insert_trigger
    AFTER INSERT ON calculations
    FOR EACH ROW EXECUTE FUNCTION increment_count();