#Se importa el módulo (sqlite3)
import sqlite3 as sql

#Conexióna  la base de datos mediante el método (connect())
connection = sql.connect("./db/users.db")

#Cursor para realizar (CRUD) en la base de datos
cur1 = connection.cursor()

#Añadir datos con el método (execute) usado desde el cursor creado anteriormente
#Igualmente se usa sintaxis simiñar a sql dentro del método (execute)
cur1.execute(
    '''
        INSERT INTO user (name, age) VALUES ('Santiago Rivera Marin', 18) 
    '''
)

#Hacemos un (commit) de los cambios, sin este (commit) los cambios no se verán reflejados en la tabla 
connection.commit()

#Siempre es importante cerrar la conexión a la base de datos
connection.close()