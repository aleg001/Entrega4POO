/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Clase que trabaja con el perfil del trabajador formal
Samaj-20
*****************/

public class TrabajadorFormal extends usuarioSamaj {

  //Atributos
  private int Edad;
  private int NivelEducacion;
  private int Idiomas;
  private boolean Experiencia;
  private boolean Transporte;
  private boolean HomeOffice;
  
  // Constructor
  public TrabajadorFormal( usuarioSamaj user, int eda, int nivelEd, int idioma, boolean exp, boolean trans, boolean homeof ) {
    super( user.getNombre(), user.getApellido(), user.getCorreo(), user.getTelefono(), user.getCodigo() );
    Edad = eda;
    NivelEducacion = nivelEd;
    Idiomas = idioma;
    Experiencia = exp;
    Transporte = trans;
    HomeOffice = homeof;
  }

  
  //Getters
  public int getEdad ( ) { return Edad; }
  public boolean getExperiencia ( ) { return Experiencia; }
  public int getNivelEducacion ( ) { return NivelEducacion; }
  public int getIdiomas ( ) { return Idiomas; }
  public boolean getTransporte ( ) { return Transporte; }
  public boolean getHomeOffice ( ) { return HomeOffice; }

  //Setters
  public void setNivelEducacion ( int NivelEducacion ) { this.NivelEducacion = NivelEducacion; }
  public void setIdiomas ( int Idiomas ) { this.Idiomas = Idiomas; }
  public void setExperiencia ( boolean Experiencia ) { this.Experiencia = Experiencia; }
  public void setTransporte ( boolean Transporte ) { this.Transporte = Transporte; }
  public void setHomeOffice ( boolean HomeOffice ){ this.HomeOffice = HomeOffice; }


  /**
   * Método para mostrar la información de un trabajador informal.
   * @return String Con la información.
   * @author Paola De León
   */
  public String toString ( ) {

    String mensaje = " Información de trabajador formal: \n";
    mensaje += "\n          - Nombre y apellido: " + this.Nombre + " " + this.Apellido;
    mensaje += "\n          - Edad: " + this.Edad;
    mensaje += "\n          - Telefono: " + this.Telefono;
    mensaje += "\n          - Correo: " + this.Correo;
    
    //Se utiliza la informacion relevante al nivel de educacion
    int NivelEducacion = this.NivelEducacion;
    switch ( NivelEducacion ) {
      case 1:
        mensaje += "\n          - Nivel de educacion: Primaria";
      case 2:
        mensaje += "\n          - Nivel de educacion: Secundaria";
      case 3:
        mensaje += "\n          - Nivel de educacion: Universitaria";
      case 4:
        mensaje += "\n          - Nivel de educacion: Postgrado";
    }
    //Se utiliza la informacion relevante al idioma de conocimiento
    int Idiomas = this.Idiomas;
    switch ( Idiomas ) {
      case 1:
        mensaje += "\n          - Idioma de conocimiento: Español";
      case 2:
        mensaje += "\n          - Idiomas de conocimiento: Ingles";
      case 3:
        mensaje += "\n          - Idiomas de conocimiento: Aleman";
      case 4:
        mensaje += "\n          - Idiomas de conocimiento: Frances";
      case 5:
        mensaje += "\n          - Idiomas de conocimiento: Mandarin";
      case 6:
        mensaje += "\n          - Idiomas de conocimiento: Portugués";
      case 7:
        mensaje += "\n          - Idiomas de conocimiento: Otros";
    }

    boolean Experiencia = this.Experiencia;
    if ( Experiencia == true ) {
      mensaje += "\n          - Experiencia: Sí";
    }
    else {
      mensaje += "\n          - Experiencia: No";
    }

    Boolean Transporte = this.Transporte;
    if ( Transporte == true ) {
      mensaje += "\n          - Transporte: Sí";
    }
    else {
      mensaje += "\n          - Transporte: No";
    }

    boolean HomeOffice = this.HomeOffice;
    if ( HomeOffice == true ) {
      mensaje += "\n          - Cuenta con herramientas para home office:: Sí";
    }
    else {
      mensaje += "\n          - Cuenta con herramientas para home office: No";
    }

    mensaje += "\n          - Codigo: " + this.Codigo;


    return mensaje;
  }

}