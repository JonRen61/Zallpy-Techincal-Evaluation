INSERT INTO user values(1, 'Administrador', 'administrador@zallpy.com', '$2a$10$f57ZaaJAQqJiJN9xiuWnnumTezUxBIr/eEJFhLtG9gDpgCqmbiw8u');
INSERT INTO user values(2, 'Programador 1', 'programador1@zallpy.com', '$2a$10$Zi.IXe6ERfPKC10RnvR4vOrhTwJOYOZNTRkS2qjmDu8m/t2gEm12S');
INSERT INTO user values(3, 'Programador 2', 'programador2@Zallpy.com', '$2a$10$M65NDnQyzziZk7LPgDWtx.FOv5hOigz0maYQy.WQUBTr8FpCSvnLa');

INSERT INTO project values(1, 'Projeto Cliente A', 0, null);
INSERT INTO project values(2, 'Projeto Cliente B', 0, null);

-- Administrador
INSERT INTO user_project values(1, 1);
INSERT INTO user_project values(1, 2);

-- Programador 1
INSERT INTO user_project values(2, 1);

-- Programador 2
INSERT INTO user_project values(3, 1);
INSERT INTO user_project values(3, 2);