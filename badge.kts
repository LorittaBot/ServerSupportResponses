class BadgeResponse : RegExResponse() {
    init {
        patterns.add("como".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("ter|cons[e|i]g[o|uir]".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("[í|i]con[e|es]|badg[e|s]|emblema|emblemas".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))

        response = "{@mention}, você pode ganhar badges fazendo essas coisas: <https://discordapp.com/channels/297732013006389252/398987569485971466/531532139842502668>, ou estando em servidores doadores/parceiros que tenham badges personalizadas"
    }
}

BadgeResponse()
