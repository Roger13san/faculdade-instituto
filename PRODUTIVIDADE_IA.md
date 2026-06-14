
## Código modernizado

List<Motorista> motoristas = getMotoristasDaEmpresa();

List<Motorista> habilitados = motoristas.stream()
        .filter(Motorista::isCnhAtiva)
        .sorted(Comparator.comparingInt(Motorista::getAnosEmpresa))
        .toList();

## Relato do aprendizado

Aprendi que com as novas versões da linguagem, facilita criar um fluxo mais claro e direto. Antes, o código era muito mais "complexo" e maior, mas com Java moderno,fica mais legível. Também entendi que o Optional ajuda a evitar verificações manuais de null, deixando o código mais seguro e fácil de manter.

## Prompt de desafio

Agora, explique-me: se eu quisesse que esse filtro também removesse motoristas que não possuem um Optional de seguro ativo, como eu alteraria essa Stream? Não me dê o código, explique-me a lógica.

## Captura de tela

![Código modernizado no VS Code](prints/codigo1.png)
![Código modernizado no VS Code](prints/codigo2.png)