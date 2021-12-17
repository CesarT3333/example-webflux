# example-webflux

> Projeto criado para atender e exemplificar a implementação de Apis `REST` utilizando
> a biblioteca de componentes reativos `Webflux`.

Este projeto conta com três projetos de exemplo.

- `examples:`
    - Contém exemplos de programação reativa utilizando `Webflux`

- `with-webflux:`
    - Contém exemplo de uma api `REST` utilizando o paradigma de programação reativa

- `without-webflux:`
    - Contém exemplo de uma api `REST` utilizando o paradigma tradicional sem a implementação de reatividade

## Ferramentas utilizadas

- Spring Framework
- Prometheus
- Grafana
- Docker

---

## Execução da aplaicação

- Crie um arquivo em ./docker/mongo/mongo-init.js
    - O arquivo deve conter uma massa de dados.
        - Para sua geração confira as informações a baixo

> Exemplo de arquivo:

````js
db = db.getSiblingDB('webflux-db-example');

db.createCollection('bins');

db.bins.insertMany([
    /* MASSA DE DADOS */
])

````

## Template de geração de massa de dados.

> Para geração da massa de dados utilize esse  ![link](https://www.json-generator.com/)

```js
[
    '{{repeat(10000)}}',
    {
        _id: '{{objectId()}}',
        binCode: '{{index()}}',
        description: function (tags) {
            var cardTypes = ['AMEX', 'MASTER', 'VISA', 'ALELO'];
            return cardTypes[tags.integer(0, cardTypes.length - 1)];
        },
        minimumPANSize: '{{integer(20, 438069)}}',
        maximumPANSize: '{{integer(20, 40)}}',
        encryptedPositiveIdRuleTableIndex: '{{integer(20, 40)}}',
        openPositiveIdRuleTableIndex: '{{integer(20, 40)}}',
        binConfiguration: {
            disableISO7813StandardForCcardTracks: '{{bool()}}'
        },
        brandId: '{{firstName()}} {{surname()}}'
    }
]
```

# Conceitos importantes

A seguir, algumas informações pertinentes para o entendimento dos conceitos apresentados

## Sobre o padrão de projeto Observer:

> "O Observer é um padrão de projeto comportamental que permite que um objeto notifique
> outros objetos sobre alterações em seu estado. O padrão Observer fornece uma maneira
> de assinar e cancelar a assinatura desses eventos para qualquer objeto que implemente
> uma interface de assinante."

## Diferença Flux<> x Mono<>

> As duas principais maneiras de adequar o código ao reactor é 
> utilizando o `Mono` ou o `Flux`

- Flux: Emite `0` até `n` elementos
- Mono: Emite `0` até 1 elemento

---

# Referências:

- ![Vídeo: O que é programação reativa com Spring?](https://www.youtube.com/watch?v=sR54-qSQnqk&ab_channel=AluraCursosOnline)
- ![Playlist no YouTube: Spring WebFlux + Mongodb](https://www.youtube.com/watch?v=jW1YdAb3GZo&list=PL8iIphQOyG-CyD9uuRTMiqxEut5QAKHga&ab_channel=MichelliBrito)
- ![Reactive Programming (Project Reactor + Spring WebFlux) em uma Arquitetura de Microsserviços](https://medium.com/@marcelomg21/reactive-programming-project-reactor-spring-webflux-em-uma-arquitetura-de-micro-servi%C3%A7os-e4351028ff9a)
- ![Intro To Reactor Core](https://www.baeldung.com/reactor-core)
- ![Sobre o Flux](https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html)
- ![Padrão de projeto `Observer`](https://refactoring.guru/design-patterns/observer)
- ![Sobre o `Spring WebFlux`](https://medium.com/@michellibrito/spring-webflux-f611c8256c53)

---


