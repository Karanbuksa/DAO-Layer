-- changeset hw:1
CREATE TABLE public.CUSTOMERS
(
    id           SERIAL PRIMARY KEY,
    name         text,
    surname      text,
    age          int,
    phone_number text
);
-- rollback drop table public.CUSTOMERS

-- changeset hw:2
CREATE INDEX id
    ON public.CUSTOMERS (id);
-- rollback drop index id on public.CUSTOMERS