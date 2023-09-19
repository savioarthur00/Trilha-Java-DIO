# Trilha-Java-DIO
Todo o conteúdo aprendido durante o bootcamp do Santander 2023

##DIAGRAMA DE CLASSES - PROJETO FINAL

``` mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: String
    - limit: Number
  }

  class Feature {
    - icons: String
    - description: String
  }

  class Card {
    - number: String
    - limit: Number
  }

  class News {
    - icons: String
    - description: String
  }

  User "1" *-- "1" Account
  User "1" *-- "1..N"  Feature
  User "1" *-- "1" Card 
  User "1" *-- "1..N" News 
```
