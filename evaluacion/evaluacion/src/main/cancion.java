public class cancion {

    private String titulo;
    private String artista;
    private int duracion;
    private String album;
    private String genero;


    public cancion(){

        this.titulo = "desconocido";
        this.artista = "desconocido";
        this.duracion = "desconocido";
        this.album = "desconocido";
        this.genero = "desconocido";

    }

    public cancion(String titulo, String artista,int duracion,String album,String genero){

        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.album = album;
        this.genero = genero;
    }

    public String getTitulo(){

        return titulo;

    }

    public void setTitulo(String titulo){

        this.titulo = titulo;

    }
    public String getArtista(){

        return artista;

    }

    public void setArtista(String artista){

        this.artista = artista;

    } public int getDuracion(){

        return duracion;

    }

    public void setDuracion(int duracion){

        this.duracion = duracion;

    } public String getAlbum(){

        return album;

    }

    public void setAlbum(String album){

        this.album = album;

    } public String getTitulo(){

        return titulo;

    }

    public void setTitulo(String titulo){

        this.titulo = titulo;

    } public String getTitulo(){

        return titulo;

    }

    public void setTitulo(String titulo){

        this.titulo = titulo;

    }

}