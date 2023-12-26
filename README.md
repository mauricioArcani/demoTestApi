# Instrucciones

## Prerrequisitos
- Instalación Sdkman
- Instalación Jdk 17
- Instalación Maven 3.6.3

## (OPCIONAL) Levantar la base de datos con Docker
Usando el archivo docker-compose del proyecto ->
[docker-compose.yml](db%2Fkernotec%2Fdocker-compose.yml)
- Si decea puede utilizar posgresql installado en su equipo

## Postgres
Una ves levantado la db de postgres, Habilitar el uso de UUID
con el siguiente comando: 
```
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
```
### configurar las variables de entorno de acuerdo a su preferencia


## NOTA
- Este proyecto tiene una organizacion sugerida, si decea puede modificar la organizacion de los package
- Calificara Buenas Practicas y funcionalidad de los API`s
- Usted es libre de agregar librerias adicionales repetando la version de uso
- Se tomara encuenta funcionalidades adicionales mejorando la performace del API 