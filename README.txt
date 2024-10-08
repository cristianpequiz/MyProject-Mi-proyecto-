"My proyecto" es una plicación web desarrollada con SpringBoot 
que permite ralizar operaciones  CRUD sobre una base de datos que 
almacena información de empleados y departamentos. La aplicación
utiliza HTML para la interfaz de usuario y se conecta a una
base de datos relacional mediante JPA

Base de datos:


1ra tabla departamento:

atributos

id_departamento INT NOT NULL PRIMARY KEY AUTO_INCREMENT

nombre VARCHAR<10> NOT NULL


2da tabla empleado:

atributos

id_emleado INT NOT NULL PRIMARY KEY AUTO_INCREMENT

nombre VARCHAR<10> NOT NULL

edad INT NOT NULL

telefono INT NOT NULL

empleados_departamentos INT NOT NULL FOREIGN KEY (id_departamento)
