import com.jinloes.PlayerCharacter

class BootStrap {

    def init = { servletContext ->
        if (!PlayerCharacter.count()) {
            new PlayerCharacter(1, 2, 3).save(failOnError: true)
            new PlayerCharacter(4, 5, 6).save(failOnError: true)
        }
    }
    def destroy = {
    }
}
