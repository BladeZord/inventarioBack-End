package gm.inventarios.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // Notacion de entidad
@Data
@Table(name = "producto", schema = "public") // 👈 Nombre y esquema
@NoArgsConstructor  // Constructor vacio a la clase
@AllArgsConstructor // Constructor con todos los argumentos de la clase
@ToString //
public class Producto {
    @Id // Identificacion de PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoinclementable
    Integer idProducto;
    String descripcion;
    Double precio;
    Integer existencia;
    LocalDateTime fechaCreacion;
    LocalDateTime fechaActualizacion;
}
