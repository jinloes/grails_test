class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/v1/playerCharacters"(resources: "playerCharacter", namespace: "v1")

        "/"(view: "/index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
