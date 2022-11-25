public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александор", "Пушкин");
        Author thick = new Author("Лев", "Толстой");

        Book captainsDaughter = new Book("Капитанская дочь", pushkin, 1836);

        Book annaKarenina = new Book("Анна Каренина", thick, 1887);
        System.out.println(captainsDaughter.getAuthor().getName() + " " + captainsDaughter.getAuthor().getSurname() + "" +
                " " + captainsDaughter.getTitle() + " " + captainsDaughter.getPublicationYear());
        System.out.println(annaKarenina.getAuthor().getName() + " " + annaKarenina.getAuthor().getSurname() + "" +
                " " + annaKarenina.getTitle() + " " + annaKarenina.getPublicationYear());
        captainsDaughter.setPublicationYear(1837);
        System.out.println(captainsDaughter.getAuthor().getName() + " " + captainsDaughter.getAuthor().getSurname() + "" +
                " " + captainsDaughter.getTitle() + " " + captainsDaughter.getPublicationYear());

        System.out.println(captainsDaughter);




    }



}