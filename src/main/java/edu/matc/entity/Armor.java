package edu.matc.entity;

import jakarta.persistence.*;

/**
 * Represents an armor piece in the Armor Inventory Manager.
 *
 */
@Entity(name = "Armor")
@Table(name = "armor")
public class Armor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "armor_id")
    private int armorId;

    @Column(name = "armor_name")
    private String armorName;

    @Column(name = "armor_slot")
    private String armorSlot;

    @Column(name = "effect_one")
    private String effectOne;

    @Column(name = "effect_two")
    private String effectTwo;

    @Column(name = "effect_three")
    private String effectThree;

    @Column(name = "effect_four")
    private String effectFour;

    /**
     * Instantiates a new Armor.
     */
    public Armor() {
    }

    /**
     * Instantiates a new Armor.
     *
     * @param armorName   the armor name
     * @param armorSlot   the armor slot
     * @param effectOne   the effect one
     * @param effectTwo   the effect two
     * @param effectThree the effect three
     * @param effectFour  the effect four
     */
    public Armor(String armorName, String armorSlot, String effectOne, String effectTwo, String effectThree, String effectFour) {
        this.armorName = armorName;
        this.armorSlot = armorSlot;
        this.effectOne = effectOne;
        this.effectTwo = effectTwo;
        this.effectThree = effectThree;
        this.effectFour = effectFour;
    }

    /**
     * Gets armor id.
     *
     * @return the armor id
     */
    public int getArmorId() {
        return armorId;
    }

    /**
     * Sets armor id.
     *
     * @param armorId the armor id
     */
    public void setArmorId(int armorId) {
        this.armorId = armorId;
    }

    /**
     * Gets armor name.
     *
     * @return the armor name
     */
    public String getArmorName() {
        return armorName;
    }

    /**
     * Sets armor name.
     *
     * @param armorName the armor name
     */
    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    /**
     * Gets armor slot.
     *
     * @return the armor slot
     */
    public String getArmorSlot() {
        return armorSlot;
    }

    /**
     * Sets armor slot.
     *
     * @param armorSlot the armor slot
     */
    public void setArmorSlot(String armorSlot) {
        this.armorSlot = armorSlot;
    }

    /**
     * Gets effect one.
     *
     * @return the effect one
     */
    public String getEffectOne() {
        return effectOne;
    }

    /**
     * Sets effect one.
     *
     * @param effectOne the effect one
     */
    public void setEffectOne(String effectOne) {
        this.effectOne = effectOne;
    }

    /**
     * Gets effect two.
     *
     * @return the effect two
     */
    public String getEffectTwo() {
        return effectTwo;
    }

    /**
     * Sets effect two.
     *
     * @param effectTwo the effect two
     */
    public void setEffectTwo(String effectTwo) {
        this.effectTwo = effectTwo;
    }

    /**
     * Gets effect three.
     *
     * @return the effect three
     */
    public String getEffectThree() {
        return effectThree;
    }

    /**
     * Sets effect three.
     *
     * @param effectThree the effect three
     */
    public void setEffectThree(String effectThree) {
        this.effectThree = effectThree;
    }

    /**
     * Gets effect four.
     *
     * @return the effect four
     */
    public String getEffectFour() {
        return effectFour;
    }

    /**
     * Sets effect four.
     *
     * @param effectFour the effect four
     */
    public void setEffectFour(String effectFour) {
        this.effectFour = effectFour;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "armorId=" + armorId +
                ", armorName='" + armorName + '\'' +
                ", armorSlot='" + armorSlot + '\'' +
                ", effectOne='" + effectOne + '\'' +
                ", effectTwo='" + effectTwo + '\'' +
                ", effectThree='" + effectThree + '\'' +
                ", effectFour='" + effectFour + '\'' +
                '}';
    }
}
