package com.jinloes

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

@TestFor(PlayerCharacter)
class PlayerCharacterSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test constructor with valid attributes"() {
        when:
        def pc = new PlayerCharacter(1, 2, 3)
        then: "validation should succeed"
        pc.validate()
    }

    void "Test constructor with invalid attributes"() {
        when:
        def pc = new PlayerCharacter(-1, 2, 3)
        then: "validation should not succeed"
        !pc.validate()
    }
}
