-- changeset hw:5
INSERT INTO public.CUSTOMERS (name, surname, age, phone_number)
VALUES ('John', 'Doe', 25, '1234567890'),
       ('Jane', 'Smith', 30, '9876543210'),
       ('Michael', 'Johnson', 35, '5555555555'),
       ('Emily', 'Brown', 28, '1111111111'),
       ('Alexey', 'Ivanov', 32, '9998887777'),
       ('Alexey', 'Petrov', 27, '4443332222'),
       ('Alexey', 'Sidorov', 40, '6667778888'),
       ('Sarah', 'Wilson', 33, '5551112222'),
       ('David', 'Thompson', 29, '7772223333'),
       ('Olivia', 'Anderson', 31, '8884445555'),
       ('Ivan', 'Demin', 22, '88005553535')
-- rollback delete from public.CUSTOMERS