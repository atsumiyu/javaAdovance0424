package JavaAdvance;

public class PersonTest {
    public static void main(String[] args) {

        Person.person[] persons = {
                new Person.person("渥美","アツミ",22),
                new Person.person("小波津","コハツ",24),
                new Person.person("松本","マツモト",22),
                new Person.person("蔵","クラ",22),
                new Person.person("饒辺","ヨヘン",23)
        };

        var max = persons[0].age();
        var oldperson = persons[0].name();

        var min = persons[0].age();
        var youngperson = persons[0].name();

        for(var i = 0; i < persons.length; i++) {
            if(max < (persons[i].age() )) {
                max = persons[i].age();
                oldperson = persons[i].name();
            }
            if(min > (persons[i].age() )) {
                min = persons[i].age();
                youngperson = persons[i].name();
            }
        }

        System.out.println("最年長は　" + max + "歳の　" + oldperson + " です");
        System.out.println("最年少は　" + min + "歳の　" + youngperson + " です");
        //System.out.println(persons[1].age());

    }

//    record person(String name, String kana, int age){};
//
//    // var person = new person("渥美", "アツミ", 22);
//    Person.person[] persons = {
//            new Person.person("渥美","アツミ","22"),
//            new Person.person("小波津","コハツ","24"),
//            new Person.person("松本","マツモト","22"),
//            new Person.person("蔵","クラ","22"),
//            new Person.person("饒辺","ヨヘン","23")
//    };


}
