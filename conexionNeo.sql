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

CREATE TRIGGER TRG_ID_ALUMNO
BEFORE INSERT ON ALUMNO
FOR EACH ROW
BEGIN
SELECT INCREMENTO_ID_ALUMNO.NEXTVAL INTO :NEW.IDALUMNO FROM DUAL;
END;


select * from alumno

insert into alumno(nombres, apellidos, direccion, telefono)values('JOSE ERNESTO','ZURITA NUÑEZ','AV. LA COLINA 2, CASA#12','7845-9623');
insert into alumno(nombres, apellidos, direccion, telefono)values('DAVID ANTONIO','LOPEZ CRUZ','CALLE INDEPENDENCIA, CASA#11','7158-6242');
insert into alumno(nombres, apellidos, direccion, telefono)values('BLANCA MARGARITA','CARIAS RUIZ','AV. LAS MAGNOLIAS SUR, CASA#8','7348-958');
insert into alumno(nombres, apellidos, direccion, telefono)values('STAYCU CECILIA','MENDEZ SUEZ','COL. EL ZONTLE, CASA#2','7956-8542');
insert into alumno(nombres, apellidos, direccion, telefono)values('REBECA ABIGAIL','SERMEÑO AGUIRRE','RES. BOSQUE DE LA PAZ, POL A, CASA#29','7412-5836');