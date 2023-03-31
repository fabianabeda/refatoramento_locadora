package classificacoes;

public enum TipoConsole {
  PS5("PS5"),
  XBOX_SERIES_S("Xbox serie s"),
  XBOX_SERIES_X("Xbox serie X"),
  NINTENDO_SWITCH("Nitendo switch");

  private final String codTipoConsole;

  TipoConsole(String codTipoConsole){
    this.codTipoConsole = codTipoConsole;
  }

  public String getTipoConsole(){
    return codTipoConsole;
  }
  
}