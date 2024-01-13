create database testrojo;

\c testrojo;

create table Etudiant (
                          ETU serial primary key,
                          nom varchar,
                          prenom varchar,
                          date_naissance date
);

create table Semestre (
                          idSemestre serial primary key,
                          nomSemestre varchar
);

create table Inscription (
                             idInscription serial primary key,
                             dateInscription date,
                             ETU int,
                             idSemestre int,
                             foreign key (ETU) references Etudiant (ETU),
                             foreign key (idSemestre) references Semestre (idSemestre)
);

create table Matiere (
                         idMatiere serial primary key,
                         nomMatiere varchar,
                         coefficient int
);

create table Note (
                      idNote serial primary key,
                      dateNote date,
                      ETU int,
                      idMatiere int,
                      valeurNote double precision,
                      foreign key (ETU) references Etudiant (ETU),
                      foreign key (idMatiere) references Matiere (idMatiere)
);

create table Option (
                        idOption serial primary key,
                        nomOption varchar
);

create table Groupe (
                        idGroupe serial primary key,
                        groupe varchar
);

create table SemestreMatiere (
                                 idSemestre int,
                                 idMatiere int,
                                 idGroupe int,
                                 idOption int,
                                 foreign key (idSemestre) references Semestre (idSemestre),
                                 foreign key (idGroupe) references Groupe (idGroupe),
                                 foreign key (idMatiere) references Matiere (idMatiere),
                                 foreign key (idOption) references Option (idOption)
);