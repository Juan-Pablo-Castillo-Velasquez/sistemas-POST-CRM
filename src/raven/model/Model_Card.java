/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.model;

import javax.swing.Icon;

/**
 *
 * @author juanp
 */
public class Model_Card {

    /**
     * @return the ico
     */
    public Icon getIco() {
        return ico;
    }

    /**
     * @param ico the ico to set
     */
    public void setIco(Icon ico) {
        this.ico = ico;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the values
     */
    public String getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(String values) {
        this.values = values;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Model_Card(Icon ico,String Title,String values,String description){
     this.ico=ico;
    this.Title=Title;    
    this.values=values;    
    this.description=description;
    }
    private Icon ico;
    private String Title;
    private String values;
    private String description;
    
}
