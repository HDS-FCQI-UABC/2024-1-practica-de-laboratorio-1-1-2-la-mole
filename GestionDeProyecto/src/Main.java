//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Main correr = new Main();
        correr.programa();
    }

    public static void programa()
    {
        Project theProject = new Project();
        theProject.setName("Aplicacion de restaurante.");

        System.out.println("Proyecto: " + theProject.getName());

        return;
    }
}