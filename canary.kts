class ConfigureLoriResponse : RegExResponse() {
	init {
		patterns.add("como|dá|da|posso|que".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("usa|adiciona|convid|invit|faz".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("canary|beta|395935916952256523".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))
	}
	
	override fun getResponse(event: LorittaMessageEvent, message: String): String? {
		val replies = listOf(
				LoriReply(
						"A Loritta Canary (<@395935916952256523>) é a versão experimental da <@297153970613387264> (sim, eu tenho duas contas, não me julge)",
						prefix = "<:lori_pac:503600573741006863>"
				),
				LoriReply(
						"Ou seja, as novidades vão primeiro para lá, depois vão para a minha conta principal!",
						mentionUser = false
				),
				LoriReply(
						"Você pode adicionar usando `..convidar`... mas lembre-se, tem várias coisas com problemas (já que é instável) e eu posso explodir o seu servidor a hora que eu quiser! <:canella_triste:505191542982705174>",
						mentionUser = false
				)
		)

		return replies.joinToString("\n", transform = { it.build(event.author)} )
	}
}

ConfigureLoriResponse()