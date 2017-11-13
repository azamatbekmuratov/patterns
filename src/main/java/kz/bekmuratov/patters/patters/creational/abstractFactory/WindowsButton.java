package kz.bekmuratov.patters.patters.creational.abstractFactory;

/**
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под Windows.
 */
public class WindowsButton implements Button{

    @Override
    public void paint(){
        System.out.println("You have created WindowsButton.");
    }
}