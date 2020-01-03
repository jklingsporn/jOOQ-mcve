CREATE TABLE issue_9679 (
id SERIAL,
payload JSONB,
PRIMARY KEY ("id")
);
INSERT INTO issue_9679 VALUES (DEFAULT,'[{"foo":"bar"},{"foo":"baz"}]');