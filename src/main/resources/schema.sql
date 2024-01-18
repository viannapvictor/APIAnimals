CREATE TABLE tb_animal
(
    id                INT AUTO_INCREMENT NOT NULL,
    tipo_animal       VARCHAR(255)       NOT NULL,
    nome_provisorio   VARCHAR(255)       NOT NULL,
    idade_estimada    INT                NOT NULL,
    raca              VARCHAR(255)       NOT NULL,
    data_entrada      date               NOT NULL,
    data_adocao       date               NULL,
    condicoes_chegada VARCHAR(255)       NOT NULL,
    nome_recebedor    VARCHAR(255)       NOT NULL,
    data_obito        date               NULL,
    porte             VARCHAR(255)       NOT NULL,
    CONSTRAINT pk_tb_animal PRIMARY KEY (id)
);