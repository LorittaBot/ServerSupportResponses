class ConfigureLoriResponse : RegExResponse() {
	init {
		patterns.add("como|dá|da|posso|que".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("usa|adiciona|convid|invit|faz".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("pantufa|390927821997998081".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))
	}
	
	override fun getResponse(event: LorittaMessageEvent, message: String): String? {
		val replies = listOf(
				LoriReply(
						"A Pantufinha (<@390927821997998081>) é a minha melhor amiga e é a ajudante #1 do SparklyPower!",
						prefix = "<:lori_pac:503600573741006863>"
				),
				LoriReply(
						"Ela faz coisas relacionadas com o meu servidor de Minecraft, ou seja... ela não é tão interessante para você.",
						mentionUser = false
				),
				LoriReply(
						"(E ela pode explodir o seu servidor a hora que ela quiser!!) <:canella_triste:505191542982705174>",
						mentionUser = false
				)
		)

		return replies.joinToString("\n", transform = { it.build(event.author)} )
	}
}

ConfigureLoriResponse()