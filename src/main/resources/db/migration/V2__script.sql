create table tb_email(
    emailId INT (20) PRIMARY KEY,
    ownerRef VARCHAR(250) NOT NULL,
    emailFrom VARCHAR(250) NOT NULL,
    emailTo VARCHAR (250) NOT NULL,
    subject VARCHAR (250) NOT NULL,
    text VARCHAR (5000) NOT NULL
);