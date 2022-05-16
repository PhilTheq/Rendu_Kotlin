# MBUYI-MUZUNGU Arthur, HENRY Philippe
## Chuck Norris Joke App

<p align="center" href="https://api.chucknorris.io/">
    <img src="https://api.chucknorris.io/img/chucknorris_logo_coloured_small@2x.png" height="200">
<p/>


## Objectif principal

Notre objectif principal était de construire une application pour afficher des blagues sur Chuck Norris et pour cela nous utiliserons :

* dynamic list
* json data struct
* public web api call
* asynchronous code
* activity instance state
* data share with other apps

Notre projet sera divisé en 4 parties, la première partie créera une interface utilisateur avec une liste statique, la deuxième partie reliera l'api chukcnorris avec notre application afin de supprimer la liste statique, la troisième partie se concentrera sur le design de l'affichage des blagues et la dernière partie "Make UI great again" sera utile car vous pourrez sauvegarder et partager les blagues que vous aimez.

## Part 1 - Create a UI List component <a name="part1"/>
Le principal composant android utile pour afficher des listes est le [RecyclerView]. Le but de cette partie est de construire un `RecyclerView` simple. Créez un nouveau projet Android Studio avec une activité vide.

#### 1. Create a static list of jokes

Dans cette première question, nous créons une liste statique de 10 blagues que nous allons afficher.

#### 2. RecyclerView instantiation

Nous allons créer un recyclerView pour avoir un affichage sur notre écran.

#### 3. Custom Adapter

Dans cette question nous allons créer une classe JokeAdapter, nou permettant de faire le lien entre notre recyclerview et notre liste.

#### 4. Custom view for items

Nous allons créer un nouveau layout nommé joke_layout.xml nous permettant d'embelir et d'afficher nos blagues.

#### 5. Conclusion

Nous sommes dersormais capable de créer notre propre RecyclerView.

## Part 2 - Fetch jokes <a name="part2"/>

Dans cette partie l'objectif et d'être capable de récupérer les blagues via l'api chucknorris.io

#### 1. Create the data model matching the API

La réponse JSON : 
```json
{
  "categories": [
    
  ],
  "created_at": "2020-01-05 13:42:26.766831",
  "icon_url": "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
  "id": "pyNXTV7WThiNLRykGsQmrg",
  "updated_at": "2020-01-05 13:42:26.766831",
  "url": "https://api.chucknorris.io/jokes/pyNXTV7WThiNLRykGsQmrg",
  "value": "The hills are alive with the sound of Chuck Norris' dong slapping against his legs while he walks."
}
```
Nous allons importer la librairie serialization afin de convertir le fichier json en liste.
  
#### 2. Import Retrofit & Rx Java

Nous allons simplement importer retrofit et Rx Java.

#### 3. Retrofit usage

Nous allons créer une interface nommée JokeApiService, stockant uen fonction nommée "giveMeAJoke" qui retourne un Single<joke>.
C'est une variante de Rx qui nous permettra d'émettre soit une valeur soit une erreur.

#### 4. Call Api to get one Joke

Nous allons ensuite chercher à appeler l'api afin de ne récupérer qu'une seule blague nous permettant ensuite de n'afficher que cette dernière.
Nous n'avons pas réussi à appeler l'api 'chucknorris.io' néanmoins nous avons donc essayé d'appeler une autre api ce qui a conduit à la modification de ce qui était attendu nous avons cepedant laisser en commentaire nos tentives d'appel à l'api 'chucknorris'.

## Part 3 - Display jokes on screen <a name="part3"/>

Nous n'avons pas réussi à faire fonctionner l'api 'chucknorris.io' du coup l'appel à une seule blague ne fonctionne pas.


## Conclusion

Ce projet nous a permis de créer notre 1ere application utilisant des méthodes plus complexe que celles vu au début de l'unité. Ca nous a également permis d'en apprendre plus sur le langage kotlin, que nous avons eu un peu de mal à prendre en main au début. Malheureusement, nous n'avons pas pu compléter l'entièreté de ce qui était attendu notamment car nous sommes rester bloqué longtemps sur l'appel de l'API. Cependant, ce fut une première approche de kotlin et d'Android Studio plutôt interéssante.