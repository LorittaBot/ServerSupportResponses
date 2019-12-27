class ProfileBackgroundResponse : RegExResponse() {
    init {
        patterns.add("como".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("coloc[ar|a|o]|mud[a|o]|troc[a|o]|alter[a|o]".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("banner|background|imagem|fundo|foto".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("perfil|profile".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))

        response = "{@mention}, se você quer mudar a imagem de fundo do seu perfil, digite \"+background\"! Caso você queira mudar o tema do seu perfil, entre em https://loritta.website/br/user/@me/dashboard/profiles"
    }
}

ProfileBackgroundResponse()
