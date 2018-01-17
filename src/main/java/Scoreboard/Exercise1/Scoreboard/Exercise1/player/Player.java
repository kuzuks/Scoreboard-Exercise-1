package Scoreboard.Exercise1.Scoreboard.Exercise1.player;

import javax.persistence.*;


@Entity
@Table(name = "Players")
public class Player {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private Integer playerLevel;
    private Integer overallXp;
    private Integer CatAttackXp;
    private Integer CatDefenseXp;
    private Integer CatMagicXp;
    private Integer CatCookingXp;
    private Integer CatCraftingXp;

    public Player(){

    }

    public Player(Integer id, String name, Integer level, Integer overallXp, Integer catAttackXp, Integer catDefenseXp, Integer catMagicXp, Integer catCookingXp, Integer catCraftingXp) {
        this.id = id;
        this.name = name;
        this.playerLevel = level;
        this.overallXp = overallXp;
        this.CatAttackXp = catAttackXp;
        this.CatDefenseXp = catDefenseXp;
        this.CatMagicXp = catMagicXp;
        this.CatCookingXp = catCookingXp;
        this.CatCraftingXp = catCraftingXp;
    }

    public Integer getCatValue(String category){

        switch(category){
            case "overallXp":
                return this.getOverallXp();

            case "catAttackXp":
                return this.getCatAttackXp();

            case "catDefenseXp":
                return this.getCatDefenseXp();

            case "catMagicXp":
                return this.getCatMagicXp();

            case "catCookingXp":
                return this.getCatCookingXp();

            case "catCraftingXp":
                return this.getCatCraftingXp();

            default: return 0;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return playerLevel;
    }

    public void setLevel(Integer level) {
        this.playerLevel = level;
    }

    public Integer getOverallXp() {
        return overallXp;
    }

    public void setOverallXp(Integer overallXp) {
        this.overallXp = overallXp;
    }

    public Integer getCatAttackXp() {
        return CatAttackXp;
    }

    public void setCatAttackXp(Integer catAttackXp) {
        CatAttackXp = catAttackXp;
    }

    public Integer getCatDefenseXp() {
        return CatDefenseXp;
    }

    public void setCatDefenseXp(Integer catDefenseXp) {
        CatDefenseXp = catDefenseXp;
    }

    public Integer getCatMagicXp() {
        return CatMagicXp;
    }

    public void setCatMagicXp(Integer catMagicXp) {
        CatMagicXp = catMagicXp;
    }

    public Integer getCatCookingXp() {
        return CatCookingXp;
    }

    public void setCatCookingXp(Integer catCookingXp) {
        CatCookingXp = catCookingXp;
    }

    public Integer getCatCraftingXp() {
        return CatCraftingXp;
    }

    public void setCatCraftingXp(Integer catCraftingXp) {
        CatCraftingXp = catCraftingXp;
    }
}
