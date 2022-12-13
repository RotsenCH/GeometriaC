public class geom {
    //Creacion de los atributos
    int nlados;
    private double lado, altura, base, radio, NPi = 3.141516, apotema;
    private int valorSecreto;//Public private... son modificadores de acceso
    //Por default si no se specifica el modificador queda como public

    public geom(int nlados, double lado, double altura, double base, double radio, double NPi, double apotema, int valorSecreto) {
        this.nlados = nlados;
        this.lado = lado;
        this.altura = altura;
        this.base = base;
        this.radio = radio;
        this.NPi = NPi;
        this.apotema = apotema;
        this.valorSecreto = valorSecreto;
    }
    public geom() {
    }
    public geom(double lado) {//Constructor para el cuadrado
        this.lado = lado;
    }
    public geom(double altura, double base) {//geom es palabra reserveda de la clase geom
        this.altura = altura;
        this.base = base;
    }

    public geom(int nlados, double lado, double apotema) {
        this.nlados = nlados;
        this.lado = lado;
        this.apotema = apotema;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setNPi(double NPi) {
        this.NPi = NPi;
    }

    public int getNlados() {
        return nlados;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getRadio() {
        return radio;
    }

    public double getNPi() {
        return NPi;
    }

    public double areaCuadrado(geom Cuadrado){
        return (Math.pow(Cuadrado.getLado(),2));
    }

    public double perimetroCuadrado(geom Cuadrado){
        return (4 * Cuadrado.getLado());
    }

    public double calcular_areaRectagulo(geom Rectagulo){
        double areaRectagulo = Rectagulo.getAltura() * Rectagulo.getBase(); // area = lado menor * lado mayor
        return areaRectagulo;
    }

    public double calcular_perimetroRectagulo(geom Rectagulo){
        double perimetroRectagulo = (Rectagulo.getBase() + Rectagulo.getAltura()) * 2; // p = (base + altura )*2
        return perimetroRectagulo;
    }

    //Area del Paralelogramoo:
    public double calcular_areaParalelogramo(geom Paralelogramo){
        double areaParalelogramo = Paralelogramo.getAltura() * Paralelogramo.getBase(); // area = Altura * lado mayor
        return areaParalelogramo;
    }

    // Perimetro del Paralelogramo:
    public double calcular_perimetroParalelogramo(geom Paralelogramo){
        double perimetroParalelogramo = (Paralelogramo.getAltura() + Paralelogramo.getAltura()) * 2; // p = (lado menor + lado mayor) * 2)
        return perimetroParalelogramo;
    }

    public double areaTriangulo(geom Triangulo){
        return ((Triangulo.getBase() * Triangulo.getAltura())/2);
    }

    //Area del Triangulo:
    public double calcular_areaTriangulo(geom Triangulo){
        double areaTriangulo = (Triangulo.getAltura() * Triangulo.getBase())/2; // area = base * altura / 2
        return areaTriangulo;
    }

    // Perimetro del Triangulo:
    public double calcular_perimetroTriangulo(geom Triangulo){
        double perimetroTriangulo = Triangulo.getLado()+ Triangulo.getLado() + Triangulo.getLado(); // p = a + b + c
        return perimetroTriangulo;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
//Area del Rombo

    public double areaRombo(geom Rombo){
        return ((Rombo.getBase() * Rombo.getAltura())/2);
    }

    // Perimetro del Poligono:
    public double calcular_perimetroPoligono(geom Poligono){
        double perimetroPoligono = Poligono.getNlados() * Poligono.getLado(); // p = a + b + c
        return perimetroPoligono;
    }

    //Area del Poligono
    public double calcular_areaPoligono(geom Poligono) {
        double areaPoligono = (Poligono.calcular_perimetroPoligono(Poligono) * Poligono.getApotema())/2;
        return areaPoligono;
    }

    //Volumen Piramide
    public double calcularVolumenPiramide(geom Piramide){
        double volumenPiramide =  ((Math.pow(Piramide.getLado(), 3)) * (Math.pow(2,0.5))/12);
        return volumenPiramide;
    }

    //Volumen del Cubo
    public double calcularVolumenCubo(geom Cubo){
        double volumenCubo =  Math.pow(Cubo.getLado(), 3);
        return volumenCubo;
    }

    //Volumen del Octaedro
    public double calcularVolumenOctaedro(geom Octaedro){
        double volumenOctaedro = Math.pow(Octaedro.getLado(), 3)*(Math.pow(2,0.5)/3);
        return volumenOctaedro;
    }

    //Volumen del Cilindro

    public double calcularVolumenCilindro(geom Cilindro){
        double volumenCilindro = Cilindro.getNPi() * Math.pow(Cilindro.getBase(),2) * Cilindro.getAltura();
        return volumenCilindro;
    }
}

