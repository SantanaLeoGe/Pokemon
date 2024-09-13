Examen SERTI

Este proyecto fue elaborado mediante el JDK 21 de Oracle java y con el IDE intellij Idea

Realizar un servicio REST que se le envíe un id de Pokémon y muestre el Pokémon, así como su
cadena de evolución. Se guarden en una base de datos los accesos a las APIs y algunos de los datos
del Pokémon retornados por la API original (a elección del programador) con al menos un par de
niveles de relación en BD

Arquitectura en capas claramente separadas
Springboot, Java 17 o 21 y gradle o maven
Spring Actuator solo con status
AutenƟcación en Spring Security y logs de auditoría en BD
Acceso a datos con Hibernate/JPA
Entre mas herramientas se uƟlicen, mejor (Mappers, hƩpclient5, etc)
Junit de los servicios con diferentes slices con Jupiter
Sistema de logs (log4J o similar) con el correcto uso de los levels y los appenders
Documentación con Swagger o similar
Diagrama ER para base de datos
La entrega se hará vía Github o Google Drive

URL de local host:
http://localhost:8080/pokemon-api/api/pokemon/ + id 
ejemplo: http://localhost:8080/pokemon-api/api/pokemon/7

Autentificacion:
usuario: user
contraseña: password

## Características
- Consulta información de cualquier Pokémon.
- Registra los accesos a la API en una base de datos.

## Estructura del Proyecto
/src/main/java: Código fuente del backend.
    -controller
    -dto
    -model
    -repository
    -security
    -service
    PokemonApplication
/src/main/resources: Archivos de configuración y plantillas.
  -application.properties
  log4j2.xml

