INSERT INTO CUSTOMERS (name, surname, age, phone_number)
VALUES
    ('John', 'Doe', 25, '1234567890'),
    ('Jane', 'Smith', 30, '9876543210'),
    ('Michael', 'Johnson', 35, '5555555555'),
    ('Emily', 'Brown', 28, '1111111111'),
    ('Alexey', 'Ivanov', 32, '9998887777'),
    ('Alexey', 'Petrov', 27, '4443332222'),
    ('Alexey', 'Sidorov', 40, '6667778888'),
    ('Sarah', 'Wilson', 33, '5551112222'),
    ('David', 'Thompson', 29, '7772223333'),
    ('Olivia', 'Anderson', 31, '8884445555'),
    ('Ivan', 'Demin', 22, '88005553535');

INSERT INTO ORDERS (date, customer_id, product_name, amount)
VALUES
    ('2023-06-21', (SELECT id FROM CUSTOMERS WHERE surname = 'Doe'), 'Product A', 10),
    ('2023-06-22', (SELECT id FROM CUSTOMERS WHERE surname = 'Petrov'), 'Product B', 5),
    ('2023-06-23', (SELECT id FROM CUSTOMERS WHERE surname = 'Johnson'), 'Product C', 8),
    ('2023-06-24', (SELECT id FROM CUSTOMERS WHERE surname = 'Brown'), 'Product D', 15),
    ('2023-06-25', (SELECT id FROM CUSTOMERS WHERE surname = 'Ivanov'), 'Product E', 12),
    ('2023-06-26', (SELECT id FROM CUSTOMERS WHERE surname = 'Sidorov'), 'Product F', 7),
    ('2023-06-27', (SELECT id FROM CUSTOMERS WHERE surname = 'Smith'), 'Product G', 9),
    ('2023-06-28', (SELECT id FROM CUSTOMERS WHERE surname = 'Wilson'), 'Product H', 6),
    ('2023-06-29', (SELECT id FROM CUSTOMERS WHERE surname = 'Thompson'), 'Product I', 11),
    ('2023-06-30', (SELECT id FROM CUSTOMERS WHERE surname = 'Anderson'), 'Product J', 8),
    ('2023-06-23', (SELECT id FROM CUSTOMERS WHERE surname = 'Demin'), 'Product K', 8);