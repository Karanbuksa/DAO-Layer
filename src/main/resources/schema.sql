CREATE TABLE CUSTOMERS
(
    id           SERIAL PRIMARY KEY,
    name         text,
    surname      text,
    age          int,
    phone_number text
);

CREATE INDEX id
    ON CUSTOMERS (id);

CREATE TABLE ORDERS
(
    id           SERIAL PRIMARY KEY,
    date         date,
    customer_id  int,
    product_name text,
    amount       int,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);

CREATE INDEX id
    ON ORDERS (id);