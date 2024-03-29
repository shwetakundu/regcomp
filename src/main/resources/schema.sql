CREATE TABLE ACCOUNT
(
   ACCOUNT_NUMBER INTEGER NOT NULL,
   ACCOUNT_NAME VARCHAR(255) NOT NULL,
   ACCOUNT_TYPE VARCHAR(255) NOT NULL,
   BALANCE_DATE DATE NOT NULL,
   CURRENCY VARCHAR(3) NOT NULL,
   AVAILABLE_BALANCE DECIMAL(10, 2) NOT NULL,
   PRIMARY KEY(ACCOUNT_NUMBER)
);

CREATE TABLE TRANSACTION
(
   ACCOUNT_NUM INTEGER NOT NULL,
   VALUE_DATE DATE NOT NULL,
   CURRENCY VARCHAR(3) NOT NULL,
   AMOUNT DECIMAL(10, 2),
   TRANSACTION_TYPE VARCHAR(255) NOT NULL,
   NARRATIVE VARCHAR(255),
   FOREIGN KEY(ACCOUNT_NUM) REFERENCES ACCOUNT(ACCOUNT_NUMBER)
);