# 🎵 DiscographyX 🎵

DiscographyX es una API RESTful desarrollada como práctica para el examen de ADAT de segundo de DAM. Ha sido realizada con Spring Boot y permite gestionar información sobre artistas, álbumes y canciones.

Facilita operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para cada entidad, proporcionando una solución completa para la gestión de discografías.

## ✨ Características principales
✅ Gestión de Artistas: Permite agregar, consultar, actualizar y eliminar artistas.

✅ Gestión de Álbumes: Facilita la administración de álbumes asociados a artistas específicos.

✅ Gestión de Canciones: Ofrece funcionalidades para manejar canciones dentro de los álbumes.

## ⚙️ Requisitos utilizados para facilitar la publicación del proyecto en Railway
🔹 Java 17: Asegúrate de tener instalada la versión 17 de Java.

🔹 Maven: Utilizado para la gestión de dependencias y construcción del proyecto.

🔹 Base de datos: Configura una base de datos compatible y actualiza las propiedades de conexión en application.properties.

## 📄 Documentación publicada
Para más detalles sobre la API y ejemplos de uso, consulta la documentación completa en Postman:

📌 [Documentación de DiscographyX en Postman](https://documenter.getpostman.com/view/34655755/2sAYX6ogYw)

## 📂 Estructura del proyecto
📌 Controladores: Manejan las solicitudes HTTP y definen los endpoints de la API.

📌 Servicios: Contienen la lógica de negocio y gestionan las operaciones sobre las entidades.

📌 Repositorios: Interactúan con la base de datos para realizar operaciones CRUD.

## 🔗 Endpoints principales
A continuación, se detallan los endpoints disponibles para cada entidad:

### 🎤 Artistas
Crear un artista: POST /api/v1/discography/artists

Obtener todos los artistas: GET /api/v1/discography/artists

Obtener un artista por ID: GET /api/v1/discography/artists/{idArtist}

Buscar artistas por nombre: GET /api/v1/discography/artists/search?name={name}

Actualizar un artista: PUT /api/v1/discography/artists/{idArtist}

Eliminar un artista: DELETE /api/v1/discography/artists/{idArtist}

### 💿 Álbumes
Crear un álbum: POST /api/v1/discography/albums

Obtener todos los álbumes: GET /api/v1/discography/albums

Obtener un álbum por ID: GET /api/v1/discography/albums/{idAlbum}

Buscar álbumes por título: GET /api/v1/discography/albums/search?title={title}

Actualizar un álbum: PUT /api/v1/discography/albums/{idAlbum}

Eliminar un álbum: DELETE /api/v1/discography/albums/{idAlbum}

### 🎶 Canciones
Crear una canción: POST /api/v1/discography/songs

Obtener todas las canciones: GET /api/v1/discography/songs

Obtener una canción por ID: GET /api/v1/discography/songs/{idSong}

Buscar canciones por título: GET /api/v1/discography/songs/search?title={title}

Actualizar una canción: PUT /api/v1/discography/songs/{idSong}

Eliminar una canción: DELETE /api/v1/discography/songs/{idSong}
