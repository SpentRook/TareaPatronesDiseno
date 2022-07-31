# Ejercicio usando patrón Proxy

## Contexto

Un estudiante desea crear una aplicacion la cual le permita
mover dinero entre sus cuentas bancarias (ej: nequi y daviplata)
de forma sencilla y centralizada por medio de sus APIs. Debido a razones de seguridad,
se desea registrar cada movimiento/operacion con un logger y enviar 
un correo a su cuenta personal indicando cual fue la operación. 
Adicionalmente, mientras se use la aplicación se busca ahorrar peticiones
a las API, para ello se desea guardar en "cache" el saldo de la cuenta
y solo realizar la peticion para obtener este dato cuando este desactualizado el valor.

## Nota:

**la clase ApiBankExample (junto con Nequi y Daviplata) son solo para simular una comunicación con sus respectivas API y facilitar el ejemplo.**
