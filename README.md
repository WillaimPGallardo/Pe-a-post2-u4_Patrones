Patrones de Diseño - Observer y Strategy




Objetivo

Implementar los patrones de diseño **Observer** y **Strategy** en un sistema de notificaciones, permitiendo:

* Notificar a múltiples usuarios cuando ocurre un evento
* Cambiar dinámicamente el canal de envío de notificaciones


 Patrón Observer

El patrón **Observer** permite que múltiples objetos (observadores) sean notificados automáticamente cuando ocurre un cambio en otro objeto (sujeto).




Funcionamiento

1. Los usuarios se suscriben al sistema
2. Se genera un evento
3. El sujeto notifica a todos los observadores
4. Cada usuario recibe el mensaje



Evidencias

Se incluyen capturas de:

<img width="1630" height="998" alt="image" src="https://github.com/user-attachments/assets/bdb768b7-63c5-4b2c-ab0b-0b80a0502683" />


<img width="1103" height="467" alt="image" src="https://github.com/user-attachments/assets/71f35312-18f3-4b24-8382-08f7e227c645" />


Conclusiones

* El patrón **Observer** permite gestionar notificaciones de forma eficiente.
* El patrón **Strategy** facilita el cambio de comportamiento dinámico.
* Ambos patrones mejoran la modularidad y mantenibilidad del sistema.

