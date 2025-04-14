INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('João Silva', 'joao.silva@email.com', 1);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Maria Oliveira', 'maria.oliveira@email.com', 2);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Carlos Santos', 'carlos.santos@email.com', 1);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Ana Souza', 'ana.souza@email.com', 3);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Pedro Lima', 'pedro.lima@email.com', 2);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Lucas Ferreira', 'lucas.ferreira@email.com', 1);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Fernanda Costa', 'fernanda.costa@email.com', 3);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Rafael Mendes', 'rafael.mendes@email.com', 2);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Juliana Andrade', 'juliana.andrade@email.com', 1);
INSERT INTO tb_usuarios (nome, email, tipo) VALUES ('Bruno Almeida', 'bruno.almeida@email.com', 3);


INSERT INTO tb_turma (codigo, ano_escolar, id_professor) VALUES ('6A', 6, 1);
INSERT INTO tb_turma (codigo, ano_escolar, id_professor) VALUES ('7B', 7, 2);
INSERT INTO tb_turma (codigo, ano_escolar, id_professor) VALUES ('8C', 8, 3);
INSERT INTO tb_turma (codigo, ano_escolar, id_professor) VALUES ('9A', 9, 1);
INSERT INTO tb_turma (codigo, ano_escolar, id_professor) VALUES ('5B', 5, 2);

INSERT INTO tb_aluno_turma (id_aluno, id_turma) VALUES (1, 1); -- Aluno 1 na turma 6A
INSERT INTO tb_aluno_turma (id_aluno, id_turma) VALUES (2, 2); -- Aluno 2 na turma 7B
INSERT INTO tb_aluno_turma (id_aluno, id_turma) VALUES (3, 3); -- Aluno 3 na turma 8C
INSERT INTO tb_aluno_turma (id_aluno, id_turma) VALUES (4, 4); -- Aluno 4 na turma 9A
INSERT INTO tb_aluno_turma (id_aluno, id_turma) VALUES (5, 5); -- Aluno 5 na turma 5B


--INSERTS DA TABELA tb_unidade_Matematica
INSERT INTO tb_unidade_Matematica (nome, descricao) VALUES ('Números','Desenvolver a noção de número, incluindo as ideias de aproximação, proporcionalidade, equivalência e ordem');
INSERT INTO tb_unidade_Matematica (nome, descricao) VALUES ('Álgebra','Desenvolver as ideias de equivalência, proporcionalidade, variação e interdependência');
INSERT INTO tb_unidade_Matematica (nome, descricao) VALUES ('Geometria','Estudar algoritmos e fluxogramas para resolver problemas geométricos');
INSERT INTO tb_unidade_Matematica (nome, descricao) VALUES ('Grandezas e medidas','Consolidar e ampliar a noção de número, aplicar noções geométricas e estruturar o pensamento algébrico');
INSERT INTO tb_unidade_Matematica (nome, descricao) VALUES ('Probabilidade e estatística','Resolver problemas envolvendo a comparação e equivalência de valores monetários, identificar resultados possíveis, estimar probabilidades, ler e interpretar dados apresentados em tabelas e gráficos');


--=================TB_HABILIDADES========================= *Bimestre conforme
--INSERTS DO ANO 6
--Habilidades NÚMEROS do 6º ano: MA01 - MA18
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA01', 'Comparar, ordenar, ler e escrever números naturais e números racionais cuja representação decimal é finita, fazendo uso da reta numérica.','Sistema de numeração decimal: características, leitura, escrita e comparação de números naturais e de números racionais representados na forma decimal', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA02', 'Reconhecer o sistema de numeração decimal, como o que prevaleceu no mundo ocidental, e destacar semelhanças e diferenças com outros sistemas, de modo a sistematizar suas principais características (base, valor posicional e função do zero), utilizando, inclusive, a composição e decomposição de números naturais e números racionais em sua representação decimal.','Sistema de numeração decimal: características, leitura, escrita e comparação de números naturais e de números racionais representados na forma decimal', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA03', 'Resolver e elaborar problemas que envolvam cálculos (mentais ou escritos, exatos ou aproximados) com números naturais, por meio de estratégias variadas, com compreensão dos processos neles envolvidos com e sem uso de calculadora.','Operações (adição, subtração, multiplicação, divisão e potenciação) com números naturais. Divisão euclidiana', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA04', 'Construir algoritmo em linguagem natural e representá-lo por fluxograma que indique a resolução de um problema simples (por exemplo, se um número natural qualquer é par).', 'Fluxograma para determinar a paridade de um número natural. Múltiplos e divisores de um número natural.  Números primos e compostos', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA05', 'Classificar números naturais em primos e compostos, estabelecer relações entre números, expressas pelos termos “é múltiplo de”, “é divisor de”, “é fator de”, e estabelecer, por meio de investigações, critérios de divisibilidade por 2, 3, 4, 5, 6, 8, 9, 10, 100 e 1000.', 'Fluxograma para determinar a paridade de um número natural. Múltiplos e divisores de um número natural.  Números primos e compostos', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA06', 'Resolver e elaborar problemas que envolvam as ideias de múltiplo e de divisor.', 'Fluxograma para determinar a paridade de um número natural. Múltiplos e divisores de um número natural.  Números primos e compostos', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA07', 'Compreender, comparar e ordenar frações associadas às ideias de partes de inteiros e resultado de divisão, identificando frações equivalentes.', 'Frações: significados (parte/todo, quociente), equivalência, comparação, adição e subtração; cálculo da fração de um número natural; adição e subtração de frações', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA08', 'Reconhecer que os números racionais positivos podem ser expressos nas formas fracionária e decimal, estabelecer relações entre essas representações, passando de uma representação para outra, e relacionálos a pontos na reta numérica.', 'Frações: significados (parte/todo, quociente), equivalência, comparação, adição e subtração; cálculo da fração de um número natural; adição e subtração de frações', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA09', 'Resolver e elaborar problemas que envolvam o cálculo da fração de uma quantidade e cujo resultado seja um número natural, com e sem uso de calculadora.', 'Frações: significados (parte/todo, quociente), equivalência, comparação, adição e subtração; cálculo da fração de um número natural; adição e subtração de frações', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA10', 'Resolver e elaborar problemas que envolvam adição ou subtração com números racionais positivos na representação fracionária.', 'Frações: significados (parte/todo, quociente), equivalência, comparação, adição e subtração; cálculo da fração de um número natural; adição e subtração de frações', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA11', 'Resolver e elaborar problemas com números racionais positivos na representação decimal, envolvendo as quatro operações fundamentais e a potenciação, por meio de estratégias diversas, utilizando estimativas e arredondamentos para verificar a razoabilidade de respostas, com e sem uso de calculadora.', 'Operações (adição, subtração, multiplicação, divisão e potenciação) com números racionais', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA12', 'Fazer estimativas de quantidades e aproximar números para múltiplos da potência de 10 mais próxima.', 'Aproximação de números para múltiplos de potências de 10', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 6, 'EF06MA13', 'Resolver e elaborar problemas que envolvam porcentagens, com base na ideia de proporcionalidade, sem fazer uso da “regra de três”, utilizando estratégias pessoais, cálculo mental e calculadora, em contextos de educação financeira, entre outros.', 'Cálculo de porcentagens por meio de estratégias diversas, sem fazer uso da “regra de três”', 3);
--Habilidades ÁLGEBRA do 6º ano: MA14 - MA15
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 6, 'EF06MA14', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 6, 'EF06MA15', 'descricao', 'OBJETO', 4);
--Habilidades GEOMETRIA do 6º ano: MA16 - MA23
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 6, 'EF06MA16', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 6, 'EF06MA17', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 6, 'EF06MA18', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 6, 'EF06MA19', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 6, 'EF06MA20', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 6, 'EF06MA21', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 6, 'EF06MA22', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 6, 'EF06MA23', 'descricao', 'OBJETO', 0);
--Habilidades GRANDEZAS e MEDIDAS do 6º ano: MA24 - MA29
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 6, 'EF06MA24', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 6, 'EF06MA25', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 6, 'EF06MA26', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 6, 'EF06MA27', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 6, 'EF06MA28', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 6, 'EF06MA29', 'descricao', 'OBJETO', 0);
--Habilidades PROBABILIDADE E ESTATÍSTICA do 6º ano: MA30 - MA34
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 6, 'EF06MA30', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 6, 'EF06MA31', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 6, 'EF06MA32', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 6, 'EF06MA33', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 6, 'EF06MA34', 'descricao', 'OBJETO', 0);
--INSERTS DO ANO 7
--Habilidades NÚMEROS do 7º ano: MA01 - MA12
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA01', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA02', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA03', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA04', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA05', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA06', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA07', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA08', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA09', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA10', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA11', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 7, 'EF07MA12', 'descricao', 'OBJETO', 3);
--Habilidades ÁLGEBRA do 7º ano: MA13 - MA18
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 7, 'EF07MA13', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 7, 'EF07MA14', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 7, 'EF07MA15', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 7, 'EF07MA16', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 7, 'EF07MA17', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 7, 'EF07MA18', 'descricao', 'OBJETO', 4);
--Habilidades GEOMETRIA do 7º ano: MA19 - MA28
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA19', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA20', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA21', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA22', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA23', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA24', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA25', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA26', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA27', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 7, 'EF07MA28', 'descricao', 'OBJETO', 0);
--Habilidades GRANDEZAS E MEDIDAS do 7º ano: MA29 - MA33
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 7, 'EF07MA29', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 7, 'EF07MA30', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 7, 'EF07MA31', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 7, 'EF07MA32', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 7, 'EF07MA33', 'descricao', 'OBJETO', 0);
--Habilidades PROBABILIDADE E ESTATÍSTICA do 7º ano: MA34 - MA37
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 7, 'EF07MA34', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 7, 'EF07MA35', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 7, 'EF07MA36', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 7, 'EF07MA37', 'descricao', 'OBJETO', 0);
--INSERTS DO ANO 8
--Habilidades NÚMEROS do 8º ano: MA01 - MA05
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 8, 'EF08MA01', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 8, 'EF08MA02', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 8, 'EF08MA03', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 8, 'EF08MA04', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 8, 'EF08MA05', 'descricao', 'OBJETO', 0);
--Habilidades ÁLGEBRA do 8º ano: MA06 - MA13
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 8, 'EF08MA06', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 8, 'EF08MA07', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 8, 'EF08MA08', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 8, 'EF08MA09', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 8, 'EF08MA10', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 8, 'EF08MA11', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 8, 'EF08MA12', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 8, 'EF08MA13', 'descricao', 'OBJETO', 2);
--Habilidades GEOMETRIA do 8º ano: MA14 - MA18
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 8, 'EF08MA14', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 8, 'EF08MA15', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 8, 'EF08MA16', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 8, 'EF08MA17', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 8, 'EF08MA18', 'descricao', 'OBJETO', 0);
--Habilidades MEDIDAS E GRANDEZAS do 8º ano: MA19 - MA21
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 8, 'EF08MA19', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 8, 'EF08MA20', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 8, 'EF08MA21', 'descricao', 'OBJETO', 4);
--Habilidades PROBABILIDADE E ESTATÍSTICA do 8º ano: MA22 - MA27
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 8, 'EF08MA22', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 8, 'EF08MA23', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 8, 'EF08MA24', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 8, 'EF08MA25', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 8, 'EF08MA26', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 8, 'EF08MA27', 'descricao', 'OBJETO', 0);
--INSERTS DO ANO 9
--Habilidades NÚMEROS do 9º ano: MA01 - MA05
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 9, 'EF09MA01', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 9, 'EF09MA02', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 9, 'EF09MA03', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 9, 'EF09MA04', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (1, 9, 'EF09MA05', 'descricao', 'OBJETO', 4);
--Habilidades ÁLGEBRA do 9º ano: MA06 - MA09
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 9, 'EF09MA06', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 9, 'EF09MA07', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 9, 'EF09MA08', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (2, 9, 'EF09MA09', 'descricao', 'OBJETO', 2);
--Habilidades GEOMETRIA do 9º ano: MA10 - MA17
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 9, 'EF09MA10', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 9, 'EF09MA11', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 9, 'EF09MA12', 'descricao', 'OBJETO', 1);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 9, 'EF09MA13', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 9, 'EF09MA14', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 9, 'EF09MA15', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 9, 'EF09MA16', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (3, 9, 'EF09MA17', 'descricao', 'OBJETO', 0);
--Habilidades GRANDEZAS E MEDIDAS do 9º ano: MA18 - MA19
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 9, 'EF09MA18', 'descricao', 'OBJETO', 2);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (4, 9, 'EF09MA19', 'descricao', 'OBJETO', 4);
--Habilidades GRANDEZAS E MEDIDAS do 9º ano: MA20 - MA23
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 9, 'EF09MA20', 'descricao', 'OBJETO', 4);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 9, 'EF09MA21', 'descricao', 'OBJETO', 0);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 9, 'EF09MA22', 'descricao', 'OBJETO', 3);
INSERT INTO tb_habilidades (id_unidade, ano_Escolar, sigla, descricao, objeto_Conhecimento, bimestre) VALUES (5, 9, 'EF09MA23', 'descricao', 'OBJETO', 3);





