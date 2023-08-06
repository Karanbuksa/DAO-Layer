-- changeset hw:3
CREATE TABLE public.ORDERS
(
    id           SERIAL PRIMARY KEY,
    date         date,
    customer_id  int,
    product_name text,
    amount       int,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);

-- rollback drop table public.ORDERS

-- changeset hw:4
CREATE INDEX order_id
    ON public.ORDERS (id);

-- rollback drop index id on public.ORDERS
