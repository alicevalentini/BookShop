package com.example.courseprojecteng.fxController;

import com.example.courseprojecteng.hibernate.Product;
import com.example.courseprojecteng.model.Comment;
import com.example.courseprojecteng.model.User;
import jakarta.persistence.EntityManagerFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class ProductRewiev {

@FXML
    public ListView<Product> productListField;
@FXML
    public TreeView<Comment> commentTreeField;

    private EntityManagerFactory entityManagerFactory;
    private User correntUser;

    public void PreviewProduct(ActionEvent actionEvent) {
    }

    public void AddReview(ActionEvent actionEvent) {
    }

    public void loadComments(){
        Product selectedProduct = productListField.getSelectionModel().getSelectedItem();
        commentTreeField.setRoot(new TreeItem<>());
        commentTreeField.setShowRoot(false);
        commentTreeField.getRoot().setExpanded(true);

    }

    private void addTreeItem(Comment comment, TreeView<Comment> parentComment){

    }
}
