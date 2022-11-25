import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name= name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;

        }
        Author author = (Author)o;
        return getName().equals(author.getName()) && getSurname().equals(author.getSurname());
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,surname);
    }

}

