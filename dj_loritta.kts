class DjLorittaResponse : RegExResponse() {
    init {
        patterns.add("como".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("coloc[ar|a|o]|toc[ar|a]|adicion[a|o|ar]".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("musicas|musica|música|músicas".toPattern(Pattern.CASE_INSENSITIVE))
        patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))

        response = "{@mention}, bom, O YouTube e a Google fizeram alterações e os comandos de música estão temporariamente desativados. Quer saber mais? Veja este artigo no meu blog: https://loritta.website/br/blog/youtube-google-block?utm_source=discord&utm_medium=link&utm_campaign=update_cmd"
    }
}

DjLorittaResponse()
