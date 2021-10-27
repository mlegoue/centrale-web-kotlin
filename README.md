# A faire

- interface ok
- null ? :? ok
- custom operator : A + B
- varargs ok
- val/var ok
- enum ok
- list/map/set ok


Pour remplir la base de données :

```
curl -X POST --location "http://localhost:8080" -H "Content-Type: application/json" -d "{ \"firstName\": \"Marie\",  \"lastName\": \"Le Goué\", \"mail\": \"marie@test.fr\", \"password\": \"testtest\", \"age\": 22}"
```
