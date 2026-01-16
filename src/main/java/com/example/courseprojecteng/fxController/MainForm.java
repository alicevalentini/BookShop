package com.example.courseprojecteng.fxController;
import com.example.courseprojecteng.hibernate.ShopHibernate;
import com.example.courseprojecteng.model.Product;
import com.example.courseprojecteng.model.Book;
import com.example.courseprojecteng.model.Magazine;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class MainForm {
    public ListView shopProducts;
    public Tab shopTab;
    public ListView<Product> productAdminList;
    public TextField productTitleField;
    public TextArea productDescriptionField;
    public TextField productQuantityField;
    public TextField productGenreField;
    public TextField productHouseBookField;
    public DatePicker productDateBookField;
    public RadioButton productBookRadio;
    public RadioButton productMagazineRadio;
    public RadioButton productStationaryRadio;


    public void buyItems() {
        Pane pane = new Pane();
        Button button = new Button("Test button");
        pane.getChildren().add(button);
        System.out.println("Yo");

        AnchorPane anchorPane = (AnchorPane) shopTab.getContent();
        anchorPane.getChildren().add(pane);

    }


    public void loadProductData(MouseEvent mouseEvent) {
        Product product = productAdminList.getSelectionModel().getSelectedItem();

        if (product instanceof Book) {
            Book book = (Book) product;
            //productTitleField.setText(book.());
            //productDescriptionField.setText(book.());
        }
    }

    public void createRecord(ActionEvent actionEvent) {
        if (productBookRadio.isSelected()) {
            Book book = new Book(productTitleField.getText(),
                    productDescriptionField.getText(),
                    Integer.parseInt(productQuantityField.getText()),
                    productDateBookField.getValue(),
                    productGenreField.getText(),
                    productHouseBookField.getText());
            ShopHibernate.create(book);
        } else if (productMagazineRadio.isSelected()) {
            Magazine magazine = new Magazine(productTitleField.getText(),
                    productDescriptionField.getText(),
                    productDateBookField.getValue(),
                    productHouseBookField.getText());
        }
    }


    public void deleteRecord(ActionEvent actionEvent) {
        Product product = productAdminList.getSelectionModel().getSelectedItem();
        productAdminList.getItems().remove(product);
    }

    public void disableFields(ActionEvent actionEvent) {
        if (productBookRadio.isSelected()) {
            productMagazineRadio.setDisable(true);
            productStationaryRadio.setDisable(true);
        } else if (productMagazineRadio.isSelected()) {
            productBookRadio.setDisable(false);
            productStationaryRadio.setDisable(false);
        } else {

        }
    }

    public void disableField(ActionEvent actionEvent) {
    }

    public void updateRecord(ActionEvent actionEvent) {
        Product product = productAdminList.getSelectionModel().getSelectedItem();
        if (product instanceof Book) {
            Book book = (Book) product;
            product.setTitle(productTitleField.getText());
            //productDescriptionField.setText(plant.getDescription());
            book.setDescription(productDescriptionField.getText());
        }
    }

    public void loadReviewForm(ActionEvent actionEvent) {
    }
}

