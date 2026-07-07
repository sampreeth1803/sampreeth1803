public class SoftwareEngineer {


    String name = "Sampreeth";


    String[] skills = {

        "Artificial Intelligence",
        "Machine Learning",
        "Full Stack Development",
        "Cloud Computing"

    };


    void introduce(){

        System.out.println(
            "Building intelligent software solutions"
        );

    }


    public static void main(String args[]){

        SoftwareEngineer engineer =
        new SoftwareEngineer();

        engineer.introduce();

    }

}
