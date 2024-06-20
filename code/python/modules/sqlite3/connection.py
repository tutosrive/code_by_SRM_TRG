#Se debe importar el módulo (sqlite3) (as - es opcional para darle un nombre más corto y trabajar más comodos)
import sqlite3 as sql3 

#Conection
#Se usa el método (connect()) del módulo (sqlite3)
conection = sql3.connect("./db/users.db")

#Cursor para ejecutar acciones dentro de la base de datos (CRUD)
cur = conection.cursor()

#Crear tabla 1 (user)
#Se usa el método (execute), este se usa apartir del cursor anteriormente creado
#Dentro se escriben (query) consultas a las bases de datos mediante sintaxis similar a (sql)
cur.execute(
    '''
        CREATE TABLE IF NOT EXISTS user (id INTEGER PRIMARY KEY, name TEXT NOT NULL, age INTEGER NOT NULL)
    '''
)

#Siempre es importante cerrar la conexión a la base de datos
conection.close()