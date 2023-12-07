# Tp_Microservice:
## Les composants
### Microservice Client
Responsabilités : Pour la création et l'affichage des clients.
Technologies Utilisées :
- Spring Boot
- MySQL

### Microservice Voiture
Responsabilités : Pour la création des voitures.
Technologies Utilisées :
- Spring Boot
- MySQL

### Microservice Gateway
Responsabilités : Service de passerelle pour diriger le trafic vers les microservices.
Technologies Utilisées :
- Spring Cloud Gateway
- Netflix Eureka
- Spring Boot
- MySQL

## Configuration

### Configuration de la Gateway
- Port : 8088
- Nom du service : gateway-service
- URL d'enregistrement Eureka : http://localhost:8761/eureka/

### Configuration des Microservices

### Microservice Client
- URL d'enregistrement : http://localhost:8888/SERVICE-CLIENT/clients

### Microservice Voiture
- URL d'enregistrement : http://localhost:8888/VOITURE-CLIENT/voiture
