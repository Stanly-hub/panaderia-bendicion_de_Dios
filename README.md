##SISTEMA DE GESTION DE PEDIDOS PARA UNA PANADERIA##

## 🚀 Tecnologías

* **Lenguaje:** Java
* **Framework:** Spring Boot
* **Formato de datos:** JSON

## 📌 Endpoints

* **Método:** `GET`
* **Ruta:** `/api/panaderos/lista`
* **Proposito:** `Permite listar todos los panaderos agregados en el sistema`

## Fases de la crearcion de este sistema##
* Fase 1: Idea 
al no saber por donde empesar lo primero que hice fue pasar la idea de mi cabeza a papel y lapiz sobre el flujo de travajo de la panaderia, el cual queria que mi sistema optimizara y lo que escribi fue:
`el panadero hace su pedido al jeffe, el jeffe lo anota en su lista junto con todos los demas pedidos y lo va ordenando segun cada tipo de pan, y finalmente suma todo segun cada tipo de pan y ya estaria la lista del turno conrrespondiente.`

* Fase 2: creacion del proyecto Spring boot
Ok en esta parte intente empesar con una base de datos pero a este punto de mi conocimiento se me hiso mas facil ir creando el backend poco a poco asi que cree el proyecto de springboot con spring initializr https://start.spring.io/ le agrege algunas dependencias como spring web, lombok, spring data jpa y los drives de postgre sql por que ese gestor de base de datos es el que me han estado enseñando en la ultima materia y mas o menos recuerdo algunas cosas.

Luego decici emepesar a construr el sistema e identifique algunas entidades que eran indispensables como Panadero y  ya cree el model, el repository los dtos y los mappers y el controler de momento solo un metodo get para mostrar todos los panaderos listados los cuales solo tiene como atributo el id y el nombre.

* Fase 3: Pedidos
  
