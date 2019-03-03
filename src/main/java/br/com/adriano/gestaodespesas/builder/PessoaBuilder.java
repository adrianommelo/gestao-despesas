package br.com.adriano.gestaodespesas.builder;

public class PessoaBuilder {
	private final boolean corpo;
	private final boolean tatuagem;
	private final boolean brinco;

	public static class Builder {
		private final boolean corpo;
		
		private boolean tatuagem = false;
		private boolean brinco = false;

		public Builder(boolean corpo) {
			this.corpo = corpo;
		}
		
		public Builder tatuagem(boolean val) {
			this.tatuagem = val;
			return this;
		}
		public Builder brinco(boolean val) {
			this.brinco = val;
			return this;
		}
		
		public PessoaBuilder build() {
			return new PessoaBuilder(this);
		}
	}
	
	private PessoaBuilder(Builder builder) {

		corpo = builder.corpo;
		tatuagem = builder.tatuagem;
		brinco = builder.brinco;
	}

	

	public boolean isCorpo() {
		return corpo;
	}

	public boolean isTatuagem() {
		return tatuagem;
	}

	public boolean isBrinco() {
		return brinco;
	}
	
	@Override
	public String toString() {
		return "PessoaBuilder [corpo=" + corpo + ", tatuagem=" + tatuagem + ", brinco=" + brinco + "]";
	}
	
	

}
