
INSERT INTO `estudiante` (`documento_estudiante`, `tipo_documento_estudiante`, `nombre`, `apellido`, `estrato`, `direccion`, `telefono`, `usuario_institucional`, `contraseña`) 
VALUES
   ('1234567890', 'CC', 'Juan', 'Escobar', 3, 'Calle 123', '1234567890', 'juan.escobar', 'contrasena1'),
   ('9876543210', 'TI', 'Samuel', 'Montoya', 2, 'Avenida 456', '9876543210', 'samuel.montoya', 'contrasena2'),
   ('5678901234', 'CE', 'Danilo', 'Tovar', 1, 'Carrera 789', '5678901234', 'danilo.tovar', 'contrasena3'),
   ('992023', 'CC', 'Saray', 'Cubillos', 5, 'Carrera 789', '321456', 'saray.cubillos', 'contrasena4'),
   ('101200', 'CC', 'Juan', 'Guillermo', 7, 'Carrera 101', '789012', 'juan.guillermo', 'contrasena5');


INSERT INTO `materia` (`id_materia`, `nombre`, `creditos`, `habilitable`) 
VALUES
   ('M001', 'Matemáticas', '4', 'S'),
   ('M002', 'Física', '3', 'S'),
   ('M003', 'Química', '3', 'N'),
   ('M004', 'Analisis', '4', 'N'),
   ('M005', 'Arquitectura', '2', 'N'),
   ('M006', 'BDD', '5', 'N');


INSERT INTO `estudiante_materia` (`id_materia`, `documento_estudiante`, `semestre_matricula`, `estado`) 
VALUES
   ('M001', '1234567890', '2023-01', 'Cursando'),
   ('M002', '9876543210', '2023-01', 'Cursando'),
   ('M003', '9876543210', '2023-01', 'Cursando'),
   
   ('M001', '992023', '2023-01', 'Cursando'),
   ('M002', '992023', '2023-01', 'Cursando'),
   ('M003', '992023', '2022-02', 'Aprobada'),
   ('M004', '992023', '2023-01', 'Cursando'),
   ('M005', '992023', '2023-01', 'Cursando'),
   ('M006', '992023', '2023-01', 'Cursando'),
   
   ('M001', '101200', '2023-01', 'Cursando'),
   ('M002', '101200', '2023-01', 'Cursando'),
   ('M003', '101200', '2023-01', 'Aprobada'),
   ('M004', '101200', '2023-01', 'Cursando'),
   ('M005', '101200', '2023-01', 'Cursando'),
   ('M006', '101200', '2023-01', 'Cursando');


INSERT INTO `profesor` (`documento_profesor`, `tipo_documento_profesor`, `nombre`, `apellido`, `telefono`, `direccion`, `usuario_institucional`, `contraseña`) 
VALUES
   ('1111111111', 'CC', 'Carlos', 'Gómez', '1111111111', 'Carrera 123', 'carlos.gomez', 'contrasena4'),
   ('2222222222', 'TI', 'Ana', 'Ramírez', '2222222222', 'Avenida 456', 'ana.ramirez', 'contrasena5');


INSERT INTO `profesor_materia` (`id_materia`, `documento_profesor`, `semestre_matricula`) 
VALUES
   ('M001', '1111111111', '2023-01'),
   ('M002', '1111111111', '2023-01'),
   ('M003', '2222222222', '2023-01'),
   ('M004', '2222222222', '2023-01'),
   ('M005', '1111111111', '2023-01'),
   ('M006', '2222222222', '2023-01');



INSERT INTO `solicitud_cancelacion` (`id_solicitud_cancelacion`, `documento_estudiante`, `id_materia`, `documento_profesor`, `tipo_solicitud`, `estado_solicitud`, `justificacion_cancelacion`) 
VALUES
   ('SC001', '1234567890', 'M001', '1111111111', 'Cancelación', 'Pendiente', 'No puedo cumplir con los requisitos de la materia.'),
   ('SC002', '9876543210', 'M002', '1111111111', 'Cancelación', 'Aprobada', 'Tengo problemas de horario con esta materia.'),
   ('SC003', '9876543210', 'M003', '2222222222', 'Reversión', 'Rechazada', 'Cambié de opinión y quiero continuar con la materia.'),
   ('SC004', '992023', 'M003', '2222222222', 'Cancelación', 'Pendiente', 'Cambié de opinión y no quiero continuar con la materia.'),
   ('SC005', '992023', 'M005', '1111111111', 'Cancelación', 'Pendiente', 'Tengo mucha carga academica.'),
   ('SC006', '101200', 'M001', '1111111111', 'Cancelación', 'Pendiente', 'No me gustó'),
   ('SC007', '101200', 'M006', '2222222222', 'Cancelación', 'Rechazada', 'Problemas personales');


select * from estudiante_materia