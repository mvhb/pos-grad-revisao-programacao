
public class DataDeNascimento {
	
	private String dia;
	private String mes;
	private String ano;

	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		
		String mesDescrito = "Mês inválido";
		
		if(this.mes.equals("01")) {
			mesDescrito = "Janeiro";
		}
		else if(this.mes.equals("02")) {
			mesDescrito = "Fevereiro";
		}
		else if(this.mes.equals("03")) {
			mesDescrito = "Março";
		}
		else if(this.mes.equals("04")) {
			mesDescrito = "Maio";
		}
		else if(this.mes.equals("05")) {
			mesDescrito = "Abril";
		}
		else if(this.mes.equals("06")) {
			mesDescrito = "Junho";
		}
		else if(this.mes.equals("07")) {
			mesDescrito = "Julho";
		}
		else if(this.mes.equals("08")) {
			mesDescrito = "Agosto";
		}
		else if(this.mes.equals("09")) {
			mesDescrito = "Setembro";
		}
		else if(this.mes.equals("10")) {
			mesDescrito = "Outubro";
		}
		else if(this.mes.equals("11")) {
			mesDescrito = "Novembro";
		}
		else if(this.mes.equals("12")) {
			mesDescrito = "Dezembro";
		}
		return mesDescrito;
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
}
