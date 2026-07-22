/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/module-info.java to edit this template
 */

module Hospital_system {

    requires java.sql;

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.swing;
    requires javafx.media;
    requires javafx.web;
    requires javafx.swt;

    requires jdk.jsobject;

    requires jfx.incubator.input;
    requires jfx.incubator.richtext;

    opens project_hospital_system to javafx.fxml;

    exports project_hospital_system;
}