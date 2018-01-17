CREATE TABLE Players(
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(30) NOT NULL,
    player_level INT NOT NULL,
    overall_xp INT NOT NULL,
    cat_attack_xp INT NOT NULL,
    cat_defense_xp INT NOT NULL,
    cat_magic_xp INT NOT NULL,
    cat_cooking_xp INT NOT NULL,
    cat_crafting_xp INT NOT NULL,
     UNIQUE (id)
);