/* Lógico_1: */

CREATE TABLE Passagem (
    IdPassagem int PRIMARY KEY,
    Valor float
);

CREATE TABLE Cliente (
    Nome String,
    CPF int PRIMARY KEY,
    Email String
);

CREATE TABLE Destino (
    IdNome int PRIMARY KEY,
    Data date,
    fk_Passagem_IdPassagem int
);

CREATE TABLE compra (
    fk_Cliente_CPF int,
    fk_Passagem_IdPassagem int,
    IdCompra int PRIMARY KEY
);
 
ALTER TABLE Destino ADD CONSTRAINT FK_Destino_2
    FOREIGN KEY (fk_Passagem_IdPassagem)
    REFERENCES Passagem (IdPassagem)
    ON DELETE SET NULL;
 
ALTER TABLE compra ADD CONSTRAINT FK_compra_2
    FOREIGN KEY (fk_Cliente_CPF)
    REFERENCES Cliente (CPF)
    ON DELETE RESTRICT;
 
ALTER TABLE compra ADD CONSTRAINT FK_compra_3
    FOREIGN KEY (fk_Passagem_IdPassagem)
    REFERENCES Passagem (IdPassagem)
    ON DELETE SET NULL;