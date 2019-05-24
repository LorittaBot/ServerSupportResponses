class WhoIsVieirinha : RegExResponse() {
	init {
		patterns.add("quem".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("vieirinha".toPattern(Pattern.CASE_INSENSITIVE))
		patterns.add("\\?".toPattern(Pattern.CASE_INSENSITIVE))

		response = "{@mention} um amiguinho meu que conhece o `@MrPowerGamerBR#4185` (meu criador e o meu pai :3) na vida real, um parça bem gente boa que gosta de jogar Minecraft e viver a vida :3"
	}
}

WhoIsVieirinha()