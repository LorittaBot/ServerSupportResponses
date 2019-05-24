class EmbedsResponse : RegExResponse() {
	init {
		patterns.add("ativ|coloc|uso|adicion|faç|fass".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("(embed)".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE)) }

	override fun getResponse(event: LorittaMessageEvent, message: String): String? {
		val replies = listOf(
				LoriReply(
						"**Existem vários jeitos de você utilizar embeds!**",
						prefix = "<:lori_pac:503600573741006863>"
				),
				LoriReply(
						"Veja como usar embeds no meu website! <https://loritta.website/extras/embeds>",
						mentionUser = false
				),
				LoriReply(
						"Você pode usar embeds em qualquer mensagem do painel! Apenas substitua o conteúdo da mensagem pelo o código do mini tutorial acima!",
						mentionUser = false
				),
				LoriReply(
						"Você também pode usar os mesmos códigos no `+say`!",
						mentionUser = false
				)
		)

		return replies.joinToString("\n", transform = { it.build(event.author)} )
	}
}

EmbedsResponse()