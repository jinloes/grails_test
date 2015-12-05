package spring

import com.jinloes.PlayerCharacter
import grails.rest.render.hal.HalJsonCollectionRenderer
import grails.rest.render.hal.HalJsonRenderer

// Place your Spring DSL code here
beans = {
    playerCharacterRenderer(HalJsonRenderer, PlayerCharacter) {
    }
    playerCharacterColletionRenderer(HalJsonCollectionRenderer, PlayerCharacter) {
    }
}
