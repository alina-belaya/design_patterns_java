public class Canvas {
  public static void main(String[] args) {
    Button largeCheckbox = new LargeCheckboxButton();
    largeCheckbox.draw();

    Button mediumRadioButton = new MediumRadioButton();
    mediumRadioButton.draw();

    Button smallDropdown = new SmallDropdownButton();
    smallDropdown.draw();

    Button userSizeImage = new ImageButton(new UserSize());
    userSizeImage.draw();
  }
}