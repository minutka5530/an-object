public class Main {

    public static void main(String[] args) {
        Book captainsDaughter = new Book("Капитанская дочь", 1836);


        Book annaKarenina = new Book("Анна Каренина",1878);


        Author pushkin = new Author("Александор", "Пушкин");


        Author thick = new Author("Лев", "Толстой");
        System.out.println(captainsDaughter.getAuthor()+" "+captainsDaughter.getPublicationYear()+" "+pushkin.getName()
                +" "+pushkin.getSurname() );

        System.out.println(annaKarenina.getAuthor()+" "+annaKarenina.getPublicationYear()+ " "+thick.getName()+" "
                +thick.getSurname() );

        captainsDaughter.setPublicationYear(1935);
        System.out.println(captainsDaughter.getAuthor()+" "+captainsDaughter.getPublicationYear()+" "+pushkin.getName()
                +" "+pushkin.getSurname() );
        annaKarenina.setPublicationYear(1935);

        System.out.println(annaKarenina.getAuthor()+" "+annaKarenina.getPublicationYear()+ " "+thick.getName()+" "
                +thick.getSurname() );


    }

}