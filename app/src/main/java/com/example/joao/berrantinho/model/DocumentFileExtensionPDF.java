package com.example.joao.berrantinho.model;

/**
 * Created by João Carlos on 5/14/18.
 * Biox Pecuária Moderna
 * desenvolvedorberrante@bioxbr.com
 */
public class DocumentFileExtensionPDF implements DocumentFileExtension {
  @Override
  public String getFileExtension() {
    return "pdf";
  }
}
