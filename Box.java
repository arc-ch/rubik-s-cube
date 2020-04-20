import java.util.*;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Box{
	public char [][]yellow=new char[3][3];
	public char [][]blue=new char[3][3];
	public char [][]red=new char[3][3];
	public char [][]green=new char[3][3];
	public char [][]orange=new char[3][3];
	public char [][]white=new char[3][3];
	public Box(String path){
		Read(path);
	}
	public Box(){
	
	}
	private void Read(String path){
		try (Scanner scanner = new Scanner(new File(path))) {
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					yellow[i][j]=scanner.nextLine().charAt(0);
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					blue[i][j]=scanner.nextLine().charAt(0);
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					red[i][j]=scanner.nextLine().charAt(0);
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					green[i][j]=scanner.nextLine().charAt(0);
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					orange[i][j]=scanner.nextLine().charAt(0);
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					white[i][j]=scanner.nextLine().charAt(0);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void set(Box x){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				this.yellow[i][j]=x.yellow[i][j];
				this.blue[i][j]=x.blue[i][j];
				this.red[i][j]=x.red[i][j];
				this.green[i][j]=x.green[i][j];
				this.orange[i][j]=x.orange[i][j];
				this.white[i][j]=x.white[i][j];
			}
		}
	}
	public Color translate_color(char color){
		switch(color){
			case 'r':
				return new Color(213,0,0);
			case 'b':
				return new Color(13,71,161);
			case 'o':
				return new Color(255,152,0);
			case 'y':
				return new Color(255,234,0);
			case 'g':
				return new Color(100,221,23);
			case 'w':
				return new Color(250,250,250);
		}
		return new Color(69,90,100);
	}
}
