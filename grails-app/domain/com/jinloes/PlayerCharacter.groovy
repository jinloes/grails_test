package com.jinloes

import grails.rest.Resource

@Resource
class PlayerCharacter {
    Integer strength
    Integer dexterity
    Integer charisma

    static constraints = {
        strength min: 0
        dexterity min: 0
        charisma min: 0
    }

    PlayerCharacter(Integer strength, Integer dexterity, Integer charisma) {
        this.strength = strength
        this.dexterity = dexterity
        this.charisma = charisma
    }
}
