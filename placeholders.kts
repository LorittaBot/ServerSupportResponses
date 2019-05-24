class Placeholders : RegExResponse() {
	init {
		patterns.add("quais|como".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("comandos|tags|place( )?holder|códigos".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\{".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\}".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))

		response = "{@mention} você pode ver tooooodos os códigos de placeholder (ou seja, algo que você coloca na mensagem e é magicamente substituido por outro!) clicando aqui! <https://loritta.website/extras/placeholders>"
	}
}

Placeholders()