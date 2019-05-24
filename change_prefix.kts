class PrefixResponse : RegExResponse() {
	init {
		patterns.add("troc|mud".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("(prefixo|\\+)".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))
	}
	
	override fun getResponse(event: LorittaMessageEvent, message: String): String? {
		val replies = listOf(
				LoriReply(
						"**Alterar o prefixo no seu servidor é fácil!**",
						prefix = "<:lori_pac:503600573741006863>"
				),
				LoriReply(
						"Vá no painel de administração clicando aqui <https://loritta.website/dashboard> e escolha o servidor que você deseja alterar o prefixo! (O meu prefixo padrão é `+`)",
						mentionUser = false
				),
				LoriReply(
						"Agora é só alterar o prefixo nas configurações de prefixo!",
						prefix = "<:lori_owo:417813932380520448>",
						mentionUser = false
				)
		)

		return replies.joinToString("\n", transform = { it.build(event.author)} )
	}
}

PrefixResponse()