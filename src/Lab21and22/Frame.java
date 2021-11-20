package Lab21and22;

import java.util.Scanner;

public class Frame {
    private IDocument Document;
    private IDocumentCreate DocumentCreate;
    public void New(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип файла: Text, Image, Music");
        String nameDocument = in.nextLine();
        switch (nameDocument) {
            case "Text" :
                DocumentCreate = new CreateTextDocument();
                Document = DocumentCreate.CreateNew();
                Document.New();
            break;
            case "Image" :
                DocumentCreate = new CreateImageDocument();
                Document = DocumentCreate.CreateNew();
                Document.New();
                break;
            case "Music" :
                DocumentCreate = new CreateMusicDocument();
                Document = DocumentCreate.CreateNew();
                Document.New();
                break;
        }
    }
    public void Open(){
        Document.Open();
    }
    public void Save(){
        Document.Save();
    }
    public void Exit(){
        Document.Exit();
    }
}
