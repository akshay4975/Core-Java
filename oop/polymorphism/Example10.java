class Music{
    public void display(){
        System.out.println("Music is played");
    }
}
class Spotify extends Music{
    public void display(){
        System.out.println("Music is displayed on spotify");
    }
}
class Youtube extends Music{
    public void display(){
        System.out.println("Music is displayed on Youtuble Music");
    }
}
class Gaana extends Music{
    public void display(){
        System.out.println("Music is displayed on GAANA");
    }
}
class Example10{
    public static void main(String[] args) {
        Music music;

        music=new Spotify();
        music.display();

         music=new Youtube();
        music.display();
        
        music=new Gaana();
        music.display();
    }
}