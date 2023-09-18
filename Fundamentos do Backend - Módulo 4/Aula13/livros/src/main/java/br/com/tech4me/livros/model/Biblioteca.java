package br.com.tech4me.livros.model;

public class Biblioteca {
        private String id;
        private String nomeEstante;
        private int quantidadeDeLivros;
        private Double valorDosLivros;
    
    
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getNomeEstante() {
            return nomeEstante;
        }
    
        public void setNomeEstante(String nomeEstante) {
            this.nomeEstante = nomeEstante;
        }
    
    
        public Integer getQuantidadeDeLivros() {
            return quantidadeDeLivros;
        }
    
        public void setQuantidadeDeLivros(int quantidadeLivros) {
            this.quantidadeDeLivros = quantidadeLivros;
        }
    
        public Double getValorDosLivros() {
            return valorDosLivros;
        }
    
        public void setValorDosLivros(Double valorDosLivros) {
            this.valorDosLivros = valorDosLivros;
        }
    
}
