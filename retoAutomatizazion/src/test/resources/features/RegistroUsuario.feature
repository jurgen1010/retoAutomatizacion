# language:es

Característica: Registro de nuevos usuarios
  Yo como usuarios del portal uTest
  necesito registrarme en la pagina
  para encontrar oportunidades laborales, conectarme con expertos y mejorar mis habilidades como tester de software

  Escenario: Registro de usuario exitoso
    Dado que el usuario se encuentra dentro del registro de nuevo usuario
    Cuando el ingresa la informacion solicitada para registarse
      | primerNombre        | pepito               |
      | apellido            | perez                |
      | email               | pepito77@yopmail.com |
      | mesNacimiento       | June                 |
      | diaNacimiento       | 12                   |
      | ano                 | 1980                 |
      | osMiComputador      | Windows              |
      | versionMiComputador | XP                   |
      | movilMarca          | No Mobile Device     |
      | contrasena          | Contrasena01         |
      | confirmarContrasena | Contrasena01         |

    Entonces visualizara un mensaje de bienvenida por haberse registrado






