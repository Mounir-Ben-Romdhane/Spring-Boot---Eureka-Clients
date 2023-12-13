# Documentation du Projet Microservices avec Spring Boot

## Vue d'Ensemble
Ce document décrit la configuration et les fonctionnalités du projet de microservices avec Spring Boot, y compris le client Eureka et la passerelle API (API Gateway), pour notre projet microservice 4 TWIN 6.

### Configuration du Client Eureka

Le client Eureka est configuré pour enregistrer des services afin qu'ils puissent être découverts. Ci-dessous, le statut des instances enregistrées :

- Le service `FEEDBACK-SERVICE` est enregistré et actuellement actif (UP).

    ![FeedBack eureka client](documentation/image-1.png)

## Passerelle API (API Gateway)

La passerelle API sert d'intermédiaire qui traite les requêtes provenant du front end et les transmet au back end.

### Fonctionnalités

1. **Restriction d'accès** : La passerelle API est configurée pour restreindre l'accès aux utilisateurs depuis Israël.

    ```java
    // Exemple de configuration du filtre dans la passerelle API
    if (countryName != null && countryName.equals("IL")) {
        throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Pays Non Autorisé");
    }
    ```

    ![ajout d'un filtre](image-13.png)
    ![test du filtre](image-14.png)

2. **Configuration du Port** : Pour gérer les changements de port dynamiques, la passerelle API est utilisée pour centraliser le traitement des requêtes.

    - Test des requêtes GET et POST sur le port 9000 en utilisant Postman via la passerelle API.

    ![utilisation de postman pour tester le port 9000 avec la passerelle API](image-10.png)

## Enregistrement et Découverte de Service

Les microservices sont enregistrés auprès de Eureka, et le statut des instances est affiché sur le tableau de bord.

- Tableau de bord Eureka indiquant le statut des services.

    ![2 serveurs fonctionnent](image-6.png)

## Tests

Le filtre de la passerelle API a été ajouté pour restreindre l'accès en fonction du code pays dans l'en-tête de la requête. La fonctionnalité du filtre a été testée et confirmée comme étant correcte.

- Logique de filtrage dans la passerelle API pour restreindre l'accès.

    ![ajout d'un filtre](image-13.png)

- Résultats des tests du filtre avec Postman.

    ![test du filtre](image-14.png)

## Monitoring avec Spring Boot Admin

### Ajout de la Dépendance Spring Boot Admin

Intégration de Spring Boot Admin pour le monitoring et la gestion des microservices.

- Ajout de la dépendance dans le fichier `pom.xml` du serveur admin :

    ```xml
    <dependencies>
        <dependency>
            <groupId>de.codecentric</groupId>
            <artifactId>spring-boot-admin-starter-server</artifactId>
            <version>${spring-boot.admin.version}</version>
        </dependency>
    </dependencies>
    ```

    ![Ajout de la dépendance Spring Boot Admin](image-15.png)

### Gestion des Dépendances

Configuration de la version de Spring Boot Admin à utiliser dans la section `dependencyManagement` du `pom.xml` :

- Extrait de la gestion des dépendances :

    ```xml
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>de.codecentric</groupId>
                <artifactId>spring-boot-admin-starter-server</artifactId>
                <version>${spring-boot-admin.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
    ```

    ![Gestion des dépendances](image-16.png)

### Activation du Serveur Admin

Activation du serveur admin pour surveiller et gérer les applications Spring Boot :

- Annotation dans la classe principale de l'application admin :

    ```java
    @SpringBootApplication
    @EnableAdminServer
    public class AdminserverApplication {
        public static void main(String[] args) {
            SpringApplication.run(AdminserverApplication.class, args);
        }
    }
    ```

    ![Activation du serveur admin](image-17.png)

### Configuration de l'Admin Server

Configuration du serveur admin pour exposer les endpoints et détailler l'état de santé des services :

- Contenu du fichier `application.properties` du serveur admin :

    ```properties
    server.port=8888
    management.endpoints.web.exposure.include=*
    management.endpoint.health.show-details=always
    ```

    ![Configuration de l'Admin Server](image-18.png)

### Test du Serveur Web Admin

Vérification du fonctionnement du serveur admin via le tableau de bord accessible sur le port configuré :

- Tableau de bord de Spring Boot Admin :

    ![Test du serveur web admin](image-19.png)

### Configuration du Client

Configuration du microservice client pour s'enregistrer auprès du serveur admin via le fichier `application.properties` :

- Paramètres ajoutés au fichier de configuration du client :

    ```properties
    spring.boot.admin.client.url=http://localhost:8888
    eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
    server.servlet.context-path=/feedback
    ```

    ![Configuration du client](image-20.png)

### Dépendance Client dans `pom.xml`

Ajout de la dépendance client admin dans le fichier `pom.xml` du microservice client pour permettre l'enregistrement auprès du serveur admin :

- Extrait du fichier `pom.xml` du client :

    ```xml
    <dependencies>
        <dependency>
            <groupId>de.codecentric</groupId>
            <artifactId>spring-boot-admin-starter-client</artifactId>
            <version>${spring-boot-admin.version}</version>
        </dependency>
    </dependencies>
    ```

    ![Dépendance client dans pom.xml](image-21.png)

### Vérification du Service Client

Confirmation de l'opérationnalité du service client affiché sur le tableau de bord de Spring Boot Admin :

- Service client enregistré et fonctionnel :

    ![Service client opérationnel](image-22.png)





Très bien, je vais intégrer les nouvelles informations sur Docker et Kubernetes dans la structure de votre documentation en Markdown.

```markdown


## Docker et Kubernetes

### Docker Compose

Utilisation de Docker Compose pour orchestrer le déploiement des services microservices :

```plaintext
docker-compose up
```

L'exécution de cette commande lance tous les services définis dans le fichier `docker-compose.yml`.

![docker compose](image-40.png)

### Installation du Cluster Kubernetes via Docker Desktop

Kubernetes est utilisé pour gérer les déploiements dans un environnement de production. Docker Desktop inclut une fonctionnalité pour installer et configurer un cluster Kubernetes local :

![Installation du cluster Kubernetes via Docker Desktop](image-41.png)

### Test avec Kubectl

La commande `kubectl` est un outil en ligne de commande pour interagir avec le cluster Kubernetes. Voici comment vérifier l'état des nœuds du cluster :

```bash
kubectl get nodes
```

![kubectl fonctionne, test avec get nodes](image-43.png)

### Installation de Lens pour Kubernetes

Lens offre une interface utilisateur graphique pour gérer et observer les ressources Kubernetes, rendant la gestion des clusters plus intuitive :

![Installation de Lens pour Kubernetes](image-42.png)

### Vérification des Services avec Kubectl

Pour lister tous les services dans le cluster et vérifier leur état :

```bash
kubectl get services
```

![kubectl get services](image-44.png)

### Docker Hub et Gestion des Images

#### Connexion à Docker Hub

Connexion au registre d'images Docker pour pouvoir pousser et tirer des images :

```bash
docker login
```

![docker login](image-45.png)

#### Push des Images sur Docker Hub

Après avoir construit et tagué les images localement, elles sont poussées sur Docker Hub pour le partage et le déploiement :

```bash
docker push <username>/<repository>:<tag>
```

![docker push image tag into Docker Hub](image-46.png)

#### Image Poussée sur Docker Hub

Confirmation que l'image est disponible sur Docker Hub :

![docker image pushed to Docker Hub](image-47.png)

#### Push d'une Autre Image (Currency Service)

Poussée de l'image du service de gestion de la monnaie :

```bash
docker push <username>/currency:latest
```

![pushing currency image](image-48.png)

### Déploiement avec Kubernetes

Déploiement de l'application sur le cluster Kubernetes en utilisant l'image Docker précédemment poussée :

```bash
kubectl create deployment feedback-deployment --image=<username>/feedback
```

Cette commande crée un déploiement Kubernetes qui orchestre la création et la gestion des pods basés sur l'image spécifiée.

![Création du déploiement Kubernetes pour le service de feedback](image-49.png)

# Continuation de la Documentation du Projet Microservices

## Docker et Kubernetes

L'orchestration des containers avec Docker Compose et Kubernetes offre une gestion et un déploiement efficaces des services microservices.

### Docker Compose

Utilisation de Docker Compose pour orchestrer le déploiement de multiples services.

![docker compose](image-40.png)

### Kubernetes

Installation et configuration du cluster Kubernetes via Docker Desktop.

![install k8s cluster from docker desktop](image-41.png)

Vérification du fonctionnement de kubectl et de l'état des noeuds.

![kubectl working get nodes to test](image-43.png)

Installation et utilisation de Lens, un outil de gestion Kubernetes.

![install kb8 lens](image-42.png)

Liste des services et de leurs états via kubectl.

![kubectl get services](image-44.png)

### Intégration avec Docker Hub

Connexion à Docker Hub et poussée des images de containers.

![docker login](image-45.png)

![docker push image tag into docker hub](image-46.png)

Confirmation de la poussée des images sur Docker Hub.

![docker image pushed to docker hub](image-47.png)

![pushing currency image](image-48.png)

### Déploiement et Exposition sur Kubernetes

Création de déploiements pour les microservices et exposition des services via kubectl.

![expose port service kb8](image-50.png)

![deployment create for other images from docker hub](image-51.png)

Exposition de tous les services avec la commande `kubectl expose`.

![expose all other services](image-52.png)

Visualisation des services exposés dans Kubernetes.

![services](image-53.png)

### Gestion et Mise à l'échelle

Mise à l'échelle des déploiements pour répondre à la demande.

![scale up](image-54.png)

Redémarrage et test des déploiements pour assurer la résilience.

![restart test](image-55.png)

### Tests avec Postman

Utilisation de Postman pour tester les endpoints des microservices.

![testing with postman](image-56.png)

## Conclusion

Ce projet illustre une architecture microservices robuste et évolutive en utilisant Spring Boot pour le développement, Eureka pour la découverte de services, et une combinaison de Docker et Kubernetes pour l'orchestration des containers. 



```
