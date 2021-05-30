create table alumno(
idAlumno number primary key,
nombres varchar2(50) not null,
apellidos varchar2(50)not null,
direccion varchar2(100)not null,
telefono VARCHAR2(15) not null
);

CREATE SEQUENCE incremento_id_alumno
INCREMENT BY 1
START WITH 1;