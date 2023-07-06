package Alugar;

import java.time.LocalDate;

public class Reserva {
	
	private int id;
	private int idQuarto;
	private int idCama;
	private int idCliente;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	
	public Reserva(int id, int idQuarto, int idCama, int idCliente, LocalDate dataEntrada, LocalDate dataSaida) {
		this.id = id;
		this.idQuarto = idQuarto;
		this.idCama = idCama;
		this.idCliente = idCliente;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	
	public int getId() {
		return id;
	}

	public int getIdQuarto() {
		return idQuarto;
	}

	public int getIdCama() {
		return idCama;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}
	
}
