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


SELECT * FROM tb_aluno_turma;