**Vantagens do padrão Composite** \n
O padrão Composite resolve o problema de tratar elementos individuais e grupos da mesma forma no código.
Quando usamos este padrão, conseguimos criar métodos que funcionam tanto para componentes simples quanto para compostos, sem precisar verificar o tipo antes.
Fica muito mais fácil fazer manutenção porque podemos adicionar ou tirar elementos sem bagunçar o resto do sistema. O código também fica mais organizado e com menos repetições, já que colocamos as funções comuns numa classe base.
É especialmente útil quando precisamos representar estruturas em que um elemento pode conter outros elementos do mesmo tipo.
