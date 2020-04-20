import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.util.*;
public class Cube{
	private Box rubik;
	private char [][]temp=new char [3][3];
	private window win;
	private int counter;
	private boolean flag;
	private Color []y=new Color[9];
	private Color []b=new Color[9];
	private Color []r=new Color[9];
	private Color []g=new Color[9];
	private Color []o=new Color[9];
	private Color []w=new Color[9];
	private char [][]yellow;
	private char [][]blue;
	private char [][]red;
	private char [][]green;
	private char [][]orange;
	private char [][]white;
	private int []list_1={1,2,3,4,5,6,7,8,9,10,11,12};
	private int []list_2={1,3,5,7,9,11};
	private int []list_3={2,3,6,8,9,12};
	private int []list_4={13,14,15,16};
	private int []list_5={3,6,17,18,19,20};
	private int []list_6={21,22,23,24};
	public Cube(String path){
		rubik=new Box(path);
		counter=0;
		yellow=rubik.yellow;
		blue=rubik.blue;
		red=rubik.red;
		green=rubik.green;
		orange=rubik.orange;
		white=rubik.white;
		update();
	}
	public Cube(){
		rubik=new Box();
		counter=0;
		yellow=rubik.yellow;
		blue=rubik.blue;
		red=rubik.red;
		green=rubik.green;
		orange=rubik.orange;
		white=rubik.white;
	}
	public Cube(Box rubik){
		this.rubik=new Box();
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				this.rubik.yellow[i][j]=rubik.yellow[i][j];
				this.rubik.blue[i][j]=rubik.blue[i][j];
				this.rubik.red[i][j]=rubik.red[i][j];
				this.rubik.green[i][j]=rubik.green[i][j];
				this.rubik.orange[i][j]=rubik.orange[i][j];
				this.rubik.white[i][j]=rubik.white[i][j];
			}
		}
		counter=0;
		yellow=this.rubik.yellow;
		blue=this.rubik.blue;
		red=this.rubik.red;
		green=this.rubik.green;
		orange=this.rubik.orange;
		white=this.rubik.white;
	}
	public void R(){
		temp[0][2]=blue[0][2];
		temp[1][2]=blue[1][2];
		temp[2][2]=blue[2][2];
		for(int i=0;i<3;i++){
			blue[i][2]=white[i][2];
			white[i][2]=green[i][2];
			green[i][2]=yellow[i][2];
			yellow[i][2]=temp[i][2];
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=red[i][j];
			}
		}
		red[0][0]=temp[2][0];
		red[0][1]=temp[1][0];
		red[0][2]=temp[0][0];
		red[1][0]=temp[2][1];
		red[1][2]=temp[0][1];
		red[2][0]=temp[2][2];
		red[2][1]=temp[1][2];
		red[2][2]=temp[0][2];
		counter++;
	}
	public void Ri(){
		temp[0][2]=blue[0][2];
		temp[1][2]=blue[1][2];
		temp[2][2]=blue[2][2];
		for(int i=0;i<3;i++){
			blue[i][2]=yellow[i][2];
			yellow[i][2]=green[i][2];
			green[i][2]=white[i][2];
			white[i][2]=temp[i][2];
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=red[i][j];
			}
		}
		red[0][0]=temp[0][2];
		red[0][1]=temp[1][2];
		red[0][2]=temp[2][2];
		red[1][0]=temp[0][1];
		red[1][2]=temp[2][1];
		red[2][0]=temp[0][0];
		red[2][1]=temp[1][0];
		red[2][2]=temp[2][0];
		counter++;
	}
	public void L(){
		temp[0][0]=blue[0][0];
		temp[1][0]=blue[1][0];
		temp[2][0]=blue[2][0];
		for(int i=0;i<3;i++){
			blue[i][0]=yellow[i][0];
			yellow[i][0]=green[i][0];
			green[i][0]=white[i][0];
			white[i][0]=temp[i][0];
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=orange[i][j];
			}
		}
		orange[0][0]=temp[2][0];
		orange[0][1]=temp[1][0];
		orange[0][2]=temp[0][0];
		orange[1][0]=temp[2][1];
		orange[1][2]=temp[0][1];
		orange[2][0]=temp[2][2];
		orange[2][1]=temp[1][2];
		orange[2][2]=temp[0][2];
		counter++;
	}
	public void Li(){
		temp[0][0]=blue[0][0];
		temp[1][0]=blue[1][0];
		temp[2][0]=blue[2][0];
		for(int i=0;i<3;i++){
			blue[i][0]=white[i][0];
			white[i][0]=green[i][0];
			green[i][0]=yellow[i][0];
			yellow[i][0]=temp[i][0];
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=orange[i][j];
			}
		}
		orange[0][0]=temp[0][2];
		orange[0][1]=temp[1][2];
		orange[0][2]=temp[2][2];
		orange[1][0]=temp[0][1];
		orange[1][2]=temp[2][1];
		orange[2][0]=temp[0][0];
		orange[2][1]=temp[1][0];
		orange[2][2]=temp[2][0];
		counter++;
	}
	public void B(){
		temp[0][0]=yellow[0][0];
		temp[0][1]=yellow[0][1];
		temp[0][2]=yellow[0][2];
		

		yellow[0][0]=red[0][2];
		yellow[0][1]=red[1][2];
		yellow[0][2]=red[2][2];
		red[0][2]=white[2][2];
		red[1][2]=white[2][1];
		red[2][2]=white[2][0];
		white[2][2]=orange[2][0];
		white[2][1]=orange[1][0];
		white[2][0]=orange[0][0];
		orange[0][0]=temp[0][2];
		orange[1][0]=temp[0][1];
		orange[2][0]=temp[0][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=green[i][j];
			}
		}
		green[0][0]=temp[2][0];
		green[0][1]=temp[1][0];
		green[0][2]=temp[0][0];
		green[1][0]=temp[2][1];
		green[1][2]=temp[0][1];
		green[2][0]=temp[2][2];
		green[2][1]=temp[1][2];
		green[2][2]=temp[0][2];
		counter++;
	}
	public void Bi(){
		temp[0][0]=yellow[0][0];
		temp[0][1]=yellow[0][1];
		temp[0][2]=yellow[0][2];

		yellow[0][0]=orange[2][0];
		yellow[0][1]=orange[1][0];
		yellow[0][2]=orange[0][0];
		orange[0][0]=white[2][0];
		orange[1][0]=white[2][1];
		orange[2][0]=white[2][2];
		white[2][0]=red[2][2];
		white[2][1]=red[1][2];
		white[2][2]=red[0][2];
		red[0][2]=temp[0][0];
		red[1][2]=temp[0][1];
		red[2][2]=temp[0][2];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=green[i][j];
			}
		}
		green[0][0]=temp[0][2];
		green[0][1]=temp[1][2];
		green[0][2]=temp[2][2];
		green[1][0]=temp[0][1];
		green[1][2]=temp[2][1];
		green[2][0]=temp[0][0];
		green[2][1]=temp[1][0];
		green[2][2]=temp[2][0];
		counter++;
	}
	public void D(){
		temp[2][0]=red[2][0];
		temp[2][1]=red[2][1];
		temp[2][2]=red[2][2];

		for(int i=0;i<3;i++){
			red[2][i]=blue[2][i];
			blue[2][i]=orange[2][i];
		}
		orange[2][0]=green[0][2];
		orange[2][1]=green[0][1];
		orange[2][2]=green[0][0];
		green[0][0]=temp[2][2];
		green[0][1]=temp[2][1];
		green[0][2]=temp[2][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=white[i][j];
			}
		}
		white[0][0]=temp[2][0];
		white[0][1]=temp[1][0];
		white[0][2]=temp[0][0];
		white[1][0]=temp[2][1];
		white[1][2]=temp[0][1];
		white[2][0]=temp[2][2];
		white[2][1]=temp[1][2];
		white[2][2]=temp[0][2];
		counter++;
	}
	public void Di(){
		temp[2][0]=orange[2][0];
		temp[2][1]=orange[2][1];
		temp[2][2]=orange[2][2];

		for(int i=0;i<3;i++){
			orange[2][i]=blue[2][i];
			blue[2][i]=red[2][i];
		}
		red[2][0]=green[0][2];
		red[2][1]=green[0][1];
		red[2][2]=green[0][0];
		green[0][0]=temp[2][2];
		green[0][1]=temp[2][1];
		green[0][2]=temp[2][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=white[i][j];
			}
		}
		white[0][0]=temp[0][2];
		white[0][1]=temp[1][2];
		white[0][2]=temp[2][2];
		white[1][0]=temp[0][1];
		white[1][2]=temp[2][1];
		white[2][0]=temp[0][0];
		white[2][1]=temp[1][0];
		white[2][2]=temp[2][0];
		counter++;
	}
	public void F(){
		temp[2][0]=yellow[2][0];
		temp[2][1]=yellow[2][1];
		temp[2][2]=yellow[2][2];

		yellow[2][0]=orange[2][2];
		yellow[2][1]=orange[1][2];
		yellow[2][2]=orange[0][2];
		orange[0][2]=white[0][0];
		orange[1][2]=white[0][1];
		orange[2][2]=white[0][2];
		white[0][0]=red[2][0];
		white[0][1]=red[1][0];
		white[0][2]=red[0][0];
		red[0][0]=temp[2][0];
		red[1][0]=temp[2][1];
		red[2][0]=temp[2][2];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=blue[i][j];
			}
		}
		blue[0][0]=temp[2][0];
		blue[0][1]=temp[1][0];
		blue[0][2]=temp[0][0];
		blue[1][0]=temp[2][1];
		blue[1][2]=temp[0][1];
		blue[2][0]=temp[2][2];
		blue[2][1]=temp[1][2];
		blue[2][2]=temp[0][2];
		counter++;
	}
	public void Fi(){
		temp[2][0]=yellow[2][0];
		temp[2][1]=yellow[2][1];
		temp[2][2]=yellow[2][2];

		yellow[2][0]=red[0][0];
		yellow[2][1]=red[1][0];
		yellow[2][2]=red[2][0];
		red[0][0]=white[0][2];
		red[1][0]=white[0][1];
		red[2][0]=white[0][0];
		white[0][0]=orange[0][2];
		white[0][1]=orange[1][2];
		white[0][2]=orange[2][2];
		orange[0][2]=temp[2][2];
		orange[1][2]=temp[2][1];
		orange[2][2]=temp[2][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=blue[i][j];
			}
		}
		blue[0][0]=temp[0][2];
		blue[0][1]=temp[1][2];
		blue[0][2]=temp[2][2];
		blue[1][0]=temp[0][1];
		blue[1][2]=temp[2][1];
		blue[2][0]=temp[0][0];
		blue[2][1]=temp[1][0];
		blue[2][2]=temp[2][0];
		counter++;
	} 
	public void U(){
		for(int i=0;i<3;i++){
			temp[0][i]=orange[0][i];
			orange[0][i]=blue[0][i];
			blue[0][i]=red[0][i];
		}
		red[0][0]=green[2][2];
		red[0][1]=green[2][1];
		red[0][2]=green[2][0];
		green[2][0]=temp[0][2];
		green[2][1]=temp[0][1];
		green[2][2]=temp[0][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=yellow[i][j];
			}
		}
		yellow[0][0]=temp[2][0];
		yellow[0][1]=temp[1][0];
		yellow[0][2]=temp[0][0];
		yellow[1][0]=temp[2][1];
		yellow[1][2]=temp[0][1];
		yellow[2][0]=temp[2][2];
		yellow[2][1]=temp[1][2];
		yellow[2][2]=temp[0][2];
		counter++;
	}
	public void Ui(){
		for(int i=0;i<3;i++){
			temp[0][i]=red[0][i];
			red[0][i]=blue[0][i];
			blue[0][i]=orange[0][i];
		}
		orange[0][0]=green[2][2];
		orange[0][1]=green[2][1];
		orange[0][2]=green[2][0];
		green[2][0]=temp[0][2];
		green[2][1]=temp[0][1];
		green[2][2]=temp[0][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp[i][j]=yellow[i][j];
			}
		}
		yellow[0][0]=temp[0][2];
		yellow[0][1]=temp[1][2];
		yellow[0][2]=temp[2][2];
		yellow[1][0]=temp[0][1];
		yellow[1][2]=temp[2][1];
		yellow[2][0]=temp[0][0];
		yellow[2][1]=temp[1][0];
		yellow[2][2]=temp[2][0];
		counter++;
	}
	public void update(){
		int c=0;
		for(int j=0;j<3;j++){
			for(int i=0;i<3;i++){
				y[c]=rubik.translate_color(yellow[i][j]);
				b[c]=rubik.translate_color(blue[i][j]);
				r[c]=rubik.translate_color(red[i][j]);
				g[c]=rubik.translate_color(green[i][j]);
				o[c]=rubik.translate_color(orange[i][j]);
				w[c]=rubik.translate_color(white[i][j]);
				c++;
			}
		}
	}
	public void update(LinkedList<Integer> moves){
		int size=moves.size();
		for(int i=0;i<size;i++){
			translate_move(moves.pop());
			//System.out.println(moves);
			//counter++;
		}
	}
	public void translate_move(int n){
		switch(n){
			case 1:
				R();
				break;
			case 2:
				L();
				break;
			case 3:
				U();
				break;
			case 4:
				D();
				break;
			case 5:
				F();
				break;
			case 6:
				B();
				break;
			case 7:
				Ri();
				break;
			case 8:
				Li();
				break;
			case 9:
				Ui();
				break;
			case 10:
				Di();
				break;
			case 11:
				Fi();
				break;
			case 12:
				Bi();
				break;
			//
			case 13:
				cornerYblue();
				break;
			case 14:
				cornerYred();
				break;
			case 15:
				cornerYgreen();
				break;
			case 16:
				cornerYorange();
				break;
			case 17:
				abBlue();
				break;
			case 18:
				abRed();
				break;
			case 19:
				abGreen();
				break;
			case 20:
				abOrange();
				break;
			case 21:
				eBlue();
				break;
			case 22:
				eRed();
				break;
			case 23:
				eGreen();
				break;
			case 24:
				eOrange();
		}
	}
	public boolean check_yellow_cross(){
		if(yellow[0][1]=='y' && yellow[1][2]=='y' && yellow[2][1]=='y' && yellow[1][0]=='y')
			return true;
		return false;
	}
	public boolean check_yellow_conrner(){
		if(yellow[0][0]=='y' && yellow[0][2]=='y' && yellow[2][2]=='y' && yellow[2][0]=='y')
			return true;
		return false;
	}
	private boolean check_cube(int i,int j,int k){
		switch(i){
			case 0:
				switch(j){
					case 0:
						switch(k){
							//000
							case 0:
								if(yellow[2][0]=='y' && blue[0][0]=='b' && orange[0][2]=='o')
									return true;
								return false;
							//001
							case 1:
								if(yellow[1][0]=='y' && orange[0][1]=='o')
									return true;
								return false;
							//002
							case 2:
								if(yellow[0][0]=='y' && orange[0][0]=='o' && green[2][0]=='g')
									return true;
								return false;
						}
						break;
					case 1:
						switch(k){
							//010
							case 0:
								if(yellow[2][1]=='y' && blue[0][1]=='b')
									return true;
								return false;
							//011
							case 1:
								return true;
							//012
							case 2:
								if(yellow[0][1]=='y' && green[2][1]=='g')
									return true;
								return false;
						}
						break;
					case 2:
						switch(k){
							//020
							case 0:
								if(yellow[2][2]=='y' && blue[0][2]=='b' && red[0][0]=='r')
									return true;
								return false;
							//021
							case 1:
								if(yellow[1][2]=='y' && red[0][1]=='r')
									return true;
								return false;
							//022
							case 2:
								if(yellow[0][2]=='y' && red[0][2]=='r' && green[2][2]=='g')
									return true;
								return false;
						}
						break;
				}
				break;
			case 1:
				switch(j){
					case 0:
						switch(k){
							//100
							case 0:
								if(blue[1][0]=='b' && orange[1][2]=='o')
									return true;
								return false;
							//101
							case 1:
								return true;
							//102
							case 2:
								if(orange[1][0]=='o' && green[1][0]=='g')
									return true;
								return false;
						}
						break;
					case 1:
						switch(k){
							//110
							case 0:
								return true;
							//111
							case 1:
								return true;
							//112
							case 2:
								return true;
						}
						break;
					case 2:
						switch(k){
							//120
							case 0:
								if(blue[1][2]=='b' && red[1][0]=='r')
									return true;
								return false;
							//121
							case 1:
								return true;
							//122
							case 2:
								if(red[1][2]=='r' && green[1][2]=='g')
									return true;
								return false;
						}
						break;
				}
				break;
			case 2:
				switch(j){
					case 0:
						switch(k){
							//200
							case 0:
								if(blue[2][0]=='b' && orange[2][2]=='o' && white[0][0]=='w')
									return true;
								return false;
							//201
							case 1:
								if(orange[2][1]=='o' && white[1][0]=='w')
									return true;
								return false;
							//202
							case 2:
								if(orange[2][0]=='o' && white[2][0]=='w' && green[0][0]=='g')
									return true;
								return false;
						}
						break;
					case 1:
						switch(k){
							//210
							case 0:
								if(blue[2][1]=='b' && white[0][1]=='w')
									return true;
								return false;
							//211
							case 1:
								return true;
							//212
							case 2:
								if(white[2][1]=='w' && green[0][1]=='g')
									return true;
								return false;
						}
						break;
					case 2:
						switch(k){
							//220
							case 0:
								if(blue[2][2]=='b' && white[0][2]=='w' && red[2][0]=='r')
									return true;
								return false;
							//221
							case 1:
								if(red[2][1]=='r' && white[1][2]=='w')
									return true;
								return false;
							//222
							case 2:
								if(red[2][2]=='r' && white[2][2]=='w' && green[0][2]=='g')
									return true;
								return false;
						}
						break;
				}
				break;
		}
		return false;
	}
	private boolean g(int i){
		switch(i){
			//white cross
			case 1:
				if(check_cube(2,1,0) && check_cube(2,2,1) && check_cube(2,1,2) && check_cube(2,0,1))
					return true;
				return false;
			//white corners **
			case 2:
				if(check_cube(2,2,0) && g(1))
					return true;
				return false;
			case 3:
				if(check_cube(2,2,2) && g(2))
					return true;
				return false;
			case 4:
				if(check_cube(2,0,2) && g(3))
					return true;
				return false;
			case 5:
				if(check_cube(2,0,0) && g(4))
					return true;
				return false;
			//second layer
			case 6:
				if(check_cube(1,0,0) && g(5))
					return true;
				return false;
			case 7:
				if(check_cube(1,2,0) && g(6))
					return true;
				return false;
			case 8:
				if(check_cube(1,2,2) && g(7))
					return true;
				return false;
			case 9:
				if(check_cube(1,0,2) && g(8))
					return true;
				return false;
			//yellow cross
			case 10:
				if(check_cube(0,0,1) && check_cube(0,1,0) && check_cube(0,2,1) && check_cube(0,1,2) && g(9))
					return true;
				return false;
			//yellow corners and yellow cross
			case 11:
				if(check_yellow_conrner() && check_yellow_cross() && g(9))
					return true;
				return false;
			case 12:
				if(check_cube(0,0,2) && check_cube(0,2,2) && check_cube(0,0,0) && check_cube(0,2,0) && g(11))
					return true;
				return false;
			case 13:
				if(check_cube(0,1,2) && check_cube(0,2,1) && check_cube(0,1,0) && check_cube(0,0,1) && g(12))
					return true;
				return false;
		}
		return false;
	}
	public void show(){
		win=new window(1200,400,"Rubik's Cube");
		win.update(y,b,r,g,o,w);		
		win.frame.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			
    		}
    		public void keyPressed(KeyEvent e) {
        		if(e.getKeyCode()==KeyEvent.VK_1){
        			R();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_2){
        			L();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_3){
        			U();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_4){
        			D();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_5){
        			F();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_6){
        			B();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_7){
        			Ri();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_8){
        			Li();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_9){
        			Ui();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_D){
        			Di();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_Y){
        			Fi();
        			update();
        		}
        		if(e.getKeyCode()==KeyEvent.VK_B){
        			Bi();
        			update();
        		}
    		}
    		public void keyReleased(KeyEvent e) {

    		}
			public void actionPerformed(KeyEvent e) {

    		}
		});
	}
	public void solve(){
		for(int i=1;i<=13;i++)
			step(i);	
		update();
		System.out.println(counter);
	}
	private void f(int []LM,int t,int depth,int d,int prev,LinkedList<Integer> moves,Cube temp){
		if(d>depth || d==0){
			if(temp.g(t) && flag==false){
				flag=true;
				System.out.println(moves);
				if(d!=0)
					update(moves);
			}
			return;
		}
		for(int i=0;i<LM.length;i++){
			if( (LM[i]%6==prev && LM[i]>6) || (prev%6==LM[i] && prev>6) )
				continue;
			if(flag)
				return;
			Cube temp2=new Cube(temp.rubik);
			temp2.translate_move(LM[i]);
			int SIZE=moves.size();
			if(SIZE>=2){
				for(int j=2;j<SIZE;j++){
					if(moves.get(j-1)==LM[i] && moves.get(j-2)==LM[i])
						continue;
				}
			}
			
			moves.addLast(LM[i]);
			f(LM,t,depth,d+1,LM[i],moves,temp2);
			if(moves.size()>0)
				moves.removeLast();
		}
	}
	private void step(int n){
		flag=false;
		int []list;
		if(n==6 || n==7 || n==10)
			list=list_2;
		else if(n==8 || n==9)
			list=list_3;
		else if(n==11)
			list=list_4;
		else if(n==12)
			list=list_5;
		else if(n==13)
			list=list_6;
		else
			list=list_1;
		for(int i=0;i<=20 && flag==false;i++){
			f(list,n,i,1,0,new LinkedList<Integer>(),new Cube(rubik));
		}
		update();
	}
	private void eBlue(){
		F();
		F();
		U();
		L();
		Ri();
		F();
		F();
		Li();
		R();
		U();
		F();
		F();
	}
	private void eRed(){
		R();
		R();
		U();
		F();
		Bi();
		R();
		R();
		Fi();
		B();
		U();
		R();
		R();
	}
	private void eGreen(){
		B();
		B();
		U();
		R();
		Li();
		B();
		B();
		Ri();
		L();
		U();
		B();
		B();
	}
	private void eOrange(){
		L();
		L();
		U();
		B();
		Fi();
		L();
		L();
		Bi();
		F();
		U();
		L();
		L();
	}
	private void abBlue(){
		Ri();
		F();
		Ri();
		B();
		B();
		R();
		Fi();
		Ri();
		B();
		B();
		R();
		R();
		Ui();
	}
	private void abRed(){
		Bi();
		R();
		Bi();
		L();
		L();
		B();
		Ri();
		Bi();
		L();
		L();
		B();
		B();
		Ui();
	}
	private void abGreen(){
		Li();
		B();
		Li();
		F();
		F();
		L();
		Bi();
		Li();
		F();
		F();
		L();
		L();
		Ui();
	}
	private void abOrange(){
		Fi();
		L();
		Fi();
		R();
		R();
		F();
		Li();
		Fi();
		R();
		R();
		F();
		F();
		Ui();
	}
	private void cornerYblue(){
		R();
		U();
		Ri();
		U();
		R();
		U();
		U();
		Ri();
	}
	private void cornerYred(){
		B();
		U();
		Bi();
		U();
		B();
		U();
		U();
		Bi();
	}
	private void cornerYgreen(){
		L();
		U();
		Li();
		U();
		L();
		U();
		U();
		Li();
	}
	private void cornerYorange(){
		F();
		U();
		Fi();
		U();
		F();
		U();
		U();
		Fi();
	}
}
