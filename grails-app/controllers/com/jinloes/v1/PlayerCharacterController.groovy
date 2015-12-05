package com.jinloes.v1

import com.jinloes.PlayerCharacter
import grails.rest.RestfulController

class PlayerCharacterController extends RestfulController {
    static namespace = 'v1'
    static responseFormats = ['hal', 'json', 'xml']

    List playerCharacters

    PlayerCharacterController() {
        super(PlayerCharacter)
    }

    @Override
    def index() {
        playerCharacters = PlayerCharacter.list()
        println(playerCharacters)
        respond playerCharacters
    }
}
