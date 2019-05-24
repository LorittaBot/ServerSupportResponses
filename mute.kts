class MuteResponse : RegExResponse() {
	init {
		patterns.add("como|dá|sistema".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("(silencia|muta|mute)".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))
	}
	
	override fun getResponse(event: LorittaMessageEvent, message: String): String? {
		val replies = listOf(
				LoriReply(
						"Para silenciar um usuário, basta usar `+mute`",
						prefix = "<:lori_pac:503600573741006863>"
				),
				LoriReply(
						"Para tirar o silenciamento de um usuário, basta usar `+unmute`",
						mentionUser = false
				),
				LoriReply(
						"Ao silenciar, eu irei dar um cargo de `Silenciado` para o usuário!",
						prefix = "<:lori_owo:417813932380520448>",
						mentionUser = false
				)
		)

		return replies.joinToString("\n", transform = { it.build(event.author)} )
	}
}

MuteResponse()