class ConfigureLoriResponse : RegExResponse() {
	init {
		patterns.add("configu|painel".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("lori|297153970613387264|painel".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))

		response = "{@mention} para você mexer nas configurações do seu servidor é só clicar aqui! <https://loritta.website/dashboard> <:lori_owo:417813932380520448>"
	}
	
	override fun getPriority(): Int {
		return -999
	}
}

ConfigureLoriResponse()