class EmbedsResponse : RegExResponse() {
	init {
		patterns.add("faç|fass|faz".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("mensage".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("assim|jeito|caixinha".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE)) }

	override fun getResponse(event: LorittaMessageEvent, message: String): String? {
		val replies = listOf(
				LoriReply(
						"Bem... eu acho que você quer colocar uma mensagem em uma `embed`, certo? Se sim, veja aqui! <https://loritta.website/extras/embeds>",
						prefix = "<:lori_pac:503600573741006863>"
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