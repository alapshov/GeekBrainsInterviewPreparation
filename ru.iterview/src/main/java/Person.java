public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;
    private Person person;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Person person;

        public Builder() {this.person = new Person();}

        public Builder firstName(String firstName) {
            this.person.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.person.lastName = lastName;
            return this;
        }
        public Builder middleName(String middleName) {
            this.person.middleName = middleName;
            return this;
        }
        public Builder country(String country) {
            this.person.country = country;
            return this;
        }
        public Builder address(String address) {
            this.person.address = address;
            return this;
        }
        public Builder phone(String phone) {
            this.person.phone = phone;
            return this;
        }
        public Builder age(int age) {
            this.person.age = age;
            return this;
        }
        public Builder gender(String gender) {
            this.person.gender = gender;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    public static void main(String[] args) {
        Person person = Person.builder()
                .lastName("lastName")
                .firstName("firstName")
                .middleName("middleName")
                .age(35)
                .country("country")
                .build();

    }

}
