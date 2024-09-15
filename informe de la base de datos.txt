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
