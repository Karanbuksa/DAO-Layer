-- changeset hw:6
INSERT INTO public.ORDERS (date, customer_id, product_name, amount)
VALUES ('2023-06-21', (SELECT id FROM CUSTOMERS WHERE surname = 'Doe'), 'Product A', 10),
       ('2023-06-22', (SELECT id FROM CUSTOMERS WHERE surname = 'Petrov'), 'Product B', 5),
       ('2023-06-23', (SELECT id FROM CUSTOMERS WHERE surname = 'Johnson'), 'Product C', 8),
       ('2023-06-24', (SELECT id FROM CUSTOMERS WHERE surname = 'Brown'), 'Product D', 15),
       ('2023-06-25', (SELECT id FROM CUSTOMERS WHERE surname = 'Ivanov'), 'Product E', 12),
       ('2023-06-26', (SELECT id FROM CUSTOMERS WHERE surname = 'Sidorov'), 'Product F', 7),
       ('2023-06-27', (SELECT id FROM CUSTOMERS WHERE surname = 'Smith'), 'Product G', 9),
       ('2023-06-28', (SELECT id FROM CUSTOMERS WHERE surname = 'Wilson'), 'Product H', 6),
       ('2023-06-29', (SELECT id FROM CUSTOMERS WHERE surname = 'Thompson'), 'Product I', 11),
       ('2023-06-30', (SELECT id FROM CUSTOMERS WHERE surname = 'Anderson'), 'Product J', 8),
       ('2023-06-23', (SELECT id FROM CUSTOMERS WHERE surname = 'Demin'), 'Product K', 8)
-- rollback delete from public.ORDERS