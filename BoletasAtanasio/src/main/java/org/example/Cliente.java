package org.example;

import java.awt.*;

public class Cliente {

   private String nombre = "Daniel";
   private String apellido = "Caro";
   private String tipoDeDocumento = "CC";
   private String documento = "1033256388";

   public Cliente(String nombre, String apellido, String tipoDeDocumento, String documento) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.tipoDeDocumento = tipoDeDocumento;
      this.documento = documento;
   }

   public Cliente() {
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getTipoDeDocumento() {
      return tipoDeDocumento;
   }

   public void setTipoDeDocumento(String tipoDeDocumento) {
      this.tipoDeDocumento = tipoDeDocumento;
   }

   public String getDocumento() {
      return documento;
   }

   public void setDocumento(String documento) {
      this.documento = documento;
   }

}
