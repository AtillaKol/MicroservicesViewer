

create database if not exists MicroservicesViewer;

use MicroservicesViewer;

create table if not exists Viewers (
    viewerUsername varchar(20) not null primary key,
    viewerEMail varchar(100) not null,
    viewerPassword varchar(200) not null,
    viewerName varchar(50) not null,
    viewerSurname varchar(50) not null
);

create table if not exists Microservices (
    microserviceId int not null primary key auto_increment,
    microserviceURL varchar(200) not null,
    viewerUsername varchar(20) not null,
    foreign key(viewerUsername) references Viewers(viewerUsername)
);

create table if not exists HttpStatus (
    statusCode int not null primary key,
    statusMessage varchar(150) not null
);

create table if not exists ResBody (
    resBodyId int not null primary key auto_increment,
    resBodyResponse TEXT not null
);

create table if not exists Responses (
    responseId int not null primary key auto_increment,
    responseDate DATETIME not null,
    bodyId int not null,
    statusCode int not null,
    foreign key(bodyId) references ResBody(resBodyId),
    foreign key(statusCode) references HttpStatus(statusCode)
);


create table if not exists Requests (
    requestId int not null primary key auto_increment,
    requestDate DATETIME not null,
    requestEndpoint varchar(100) not null,
    responseId int not null,
    microserviceId int not null,
    foreign key(responseId) references Responses(responseId),
    foreign key(microserviceId) references Microservices(microserviceId)
);

create table if not exists ReqHeaders (
    reqHeaderId int not null primary key auto_increment,
    reqHeaderKey varchar(100) not null,
    reqHeaderValue varchar(100) null,
    requestId int not null,
    foreign key(requestId) references Requests(requestId)
);

create table if not exists ReqQueryParams (
    reqQueryParam int not null primary key auto_increment,
    reqQueryKey varchar(100) not null,
    reqQueryValue varchar(100) null,
    requestId int not null,
    foreign key(requestId) references Requests(requestId)
);

create table if not exists ReqBody (
    reqBodyId int not null primary key auto_increment,
    reqBodyResponse TEXT not null,
    requestId int not null,
    foreign key(requestId) references Requests(requestId)
);

insert into HttpStatus(statusCode, statusMessage) values (100, 'Continue');
insert into HttpStatus(statusCode, statusMessage) values (101, 'Switching Protocols');
insert into HttpStatus(statusCode, statusMessage) values (102, 'Processing');
insert into HttpStatus(statusCode, statusMessage) values (103, 'Early Hints');
insert into HttpStatus(statusCode, statusMessage) values (200, 'Ok');
insert into HttpStatus(statusCode, statusMessage) values (201, 'Created');
insert into HttpStatus(statusCode, statusMessage) values (202, 'Accepted');
insert into HttpStatus(statusCode, statusMessage) values (203, 'Non-Authoritative Information');
insert into HttpStatus(statusCode, statusMessage) values (204, 'No Content');
insert into HttpStatus(statusCode, statusMessage) values (205, 'Reset Content');
insert into HttpStatus(statusCode, statusMessage) values (206, 'Partial Content');
insert into HttpStatus(statusCode, statusMessage) values (207, 'Multi-Status');
insert into HttpStatus(statusCode, statusMessage) values (208, 'Already Reported');
insert into HttpStatus(statusCode, statusMessage) values (226, 'IM Used');
insert into HttpStatus(statusCode, statusMessage) values (300, 'Multiple Choices');
insert into HttpStatus(statusCode, statusMessage) values (301, 'Moved Permanently');
insert into HttpStatus(statusCode, statusMessage) values (302, 'Found (Moved Temporarily)');
insert into HttpStatus(statusCode, statusMessage) values (303, 'See Other');
insert into HttpStatus(statusCode, statusMessage) values (304, 'Not Modified');
insert into HttpStatus(statusCode, statusMessage) values (305, 'Use Proxy');
insert into HttpStatus(statusCode, statusMessage) values (307, 'Temporary Redirect');
insert into HttpStatus(statusCode, statusMessage) values (308, 'Permanent Redirect');
insert into HttpStatus(statusCode, statusMessage) values (400, 'Bad Request');
insert into HttpStatus(statusCode, statusMessage) values (401, 'Unauthorized');
insert into HttpStatus(statusCode, statusMessage) values (402, 'Payment Required');
insert into HttpStatus(statusCode, statusMessage) values (403, 'Forbidden');
insert into HttpStatus(statusCode, statusMessage) values (404, 'Not Found');
insert into HttpStatus(statusCode, statusMessage) values (405, 'Method Not Allowed');
insert into HttpStatus(statusCode, statusMessage) values (406, 'Not Acceptable');
insert into HttpStatus(statusCode, statusMessage) values (407, 'Proxy Authentication Required');
insert into HttpStatus(statusCode, statusMessage) values (408, 'Request Timeout');
insert into HttpStatus(statusCode, statusMessage) values (409, 'Conflict');
insert into HttpStatus(statusCode, statusMessage) values (410, 'Gone');
insert into HttpStatus(statusCode, statusMessage) values (411, 'Length Required');
insert into HttpStatus(statusCode, statusMessage) values (412, 'Precondition Failed');
insert into HttpStatus(statusCode, statusMessage) values (413, 'Payload Too Large');
insert into HttpStatus(statusCode, statusMessage) values (414, 'URI Too Long');
insert into HttpStatus(statusCode, statusMessage) values (415, 'Unsupported Media Type');
insert into HttpStatus(statusCode, statusMessage) values (416, 'Range Not Satisfiable');
insert into HttpStatus(statusCode, statusMessage) values (417, 'Expectation Failed');
insert into HttpStatus(statusCode, statusMessage) values (418, 'I’m a teapot');
insert into HttpStatus(statusCode, statusMessage) values (420, 'Policy Not Fulfilled');
insert into HttpStatus(statusCode, statusMessage) values (421, 'Misdirected Request');
insert into HttpStatus(statusCode, statusMessage) values (422, 'Unprocessable Entity');
insert into HttpStatus(statusCode, statusMessage) values (423, 'Locked');
insert into HttpStatus(statusCode, statusMessage) values (424, 'Failed Dependency');
insert into HttpStatus(statusCode, statusMessage) values (425, 'Too Early');
insert into HttpStatus(statusCode, statusMessage) values (426, 'Upgrade Required');
insert into HttpStatus(statusCode, statusMessage) values (428, 'Precondition Required');
insert into HttpStatus(statusCode, statusMessage) values (429, 'Too Many Requests');
insert into HttpStatus(statusCode, statusMessage) values (431, 'Request Header Fields Too Large');
insert into HttpStatus(statusCode, statusMessage) values (444, 'No Response');
insert into HttpStatus(statusCode, statusMessage) values (449, 'The request should be retried after doing the appropriate action');
insert into HttpStatus(statusCode, statusMessage) values (451, 'Unavailable For Legal Reasons');
insert into HttpStatus(statusCode, statusMessage) values (499, 'Client Closed Request');
insert into HttpStatus(statusCode, statusMessage) values (500, 'Internal Server Error');
insert into HttpStatus(statusCode, statusMessage) values (501, 'Not Implemented');
insert into HttpStatus(statusCode, statusMessage) values (502, 'Bad Gateway');
insert into HttpStatus(statusCode, statusMessage) values (503, 'Service Unavailable');
insert into HttpStatus(statusCode, statusMessage) values (504, 'Gateway Timeout');
insert into HttpStatus(statusCode, statusMessage) values (505, 'HTTP Version not supported');
insert into HttpStatus(statusCode, statusMessage) values (506, 'Variant Also Negotiates');
insert into HttpStatus(statusCode, statusMessage) values (507, 'Insufficient Storage');
insert into HttpStatus(statusCode, statusMessage) values (508, 'Loop Detected');
insert into HttpStatus(statusCode, statusMessage) values (509, 'Bandwidth Limit Exceeded');
insert into HttpStatus(statusCode, statusMessage) values (510, 'Not Extended');
insert into HttpStatus(statusCode, statusMessage) values (511, 'Network Authentication Required');