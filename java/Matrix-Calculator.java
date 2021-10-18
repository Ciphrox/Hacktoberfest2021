import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Matrix {
//Private Class Variable Definitions -- belongs to each object
private int m_rows;
private int n_cols;
private double[][] arr;

// -------------------Constructors--------------------------------
//Construct[1] given m & n as parameters
public Matrix(int m, int n){
	this.m_rows = m;
	this.n_cols = n;
	this.arr = new double[m][n];
	for(int i = 0; i< this.m_rows; i++){
		for(int j = 0; j < this.n_cols; j++){
			this.arr[i][j] = 0;
		}
	}
}

//Construct [2] with console input -- no parameters (Overloaded)
public Matrix(){
	Scanner in = new Scanner(System.in);//Create scanner
	
	System.out.println("Enter the number of array [rows] then [columns] seperated by a space");
	String input = in.nextLine();//Get user input line as string
	StringTokenizer st = new StringTokenizer(input," ");//Store input in string tokenizer -- delimit tokens by ','
	this.m_rows = Integer.parseInt(st.nextToken().trim());//store rows	
	this.n_cols = Integer.parseInt(st.nextToken().trim());//store cols	
	//Initialize Array
	this.arr = new double[this.m_rows][this.n_cols];
	//Prompt user to enter array data
	System.out.println("Enter the array in format:");
	
	//Show how array input should be formatted
	for(int i = 0; i< this.m_rows; i++){
		for(int j = 0; j < this.n_cols; j++){
			System.out.print("X ");
			//System.out.print(this.arr[i][j]);
		}
		System.out.println();
	}
	System.out.println("Column elements seperated by spaces.\nRow elements seperated by return");
	//Get array input
	StringTokenizer st2;
	int token;
	for(int i = 0; i < this.m_rows; i++){
		input = in.nextLine();
		st2 = new StringTokenizer(input," ");
		//System.out.println("st = "+st2.countTokens());
		for(int j = 0; j < this.n_cols; j++ ){
		token = Integer.parseInt(st2.nextToken().trim());
		//System.out.print(" " + token + " ");
		//System.out.print("i = "+i +", j = "+j + " ");
		this.arr[i][j] = token;
		}
	}
}//end construct [2]

//Construct[3] -- Constructor using file input
public Matrix(String filename) throws FileNotFoundException{
	Scanner inFile = new Scanner(new FileReader(filename)); 
	
	//Initialize array using first line of file -- size parameters
	String arrSize = inFile.nextLine();
	StringTokenizer st = new StringTokenizer(arrSize,",");
	this.m_rows = Integer.parseInt(st.nextToken());
	this.n_cols = Integer.parseInt(st.nextToken());
	
	this.arr = new double[m_rows][n_cols];
	
	//Fill array with data
	int i = 0;//row variable
	String rowData;//String of row data
	StringTokenizer st2;//Create new stringtokenizer to store row data
	while(inFile.hasNextLine()){
		//Fill array with data
		rowData = inFile.nextLine();
		st2 = new StringTokenizer(rowData,",");
		for(int j = 0; j < this.n_cols; j++){
			this.arr[i][j] = Double.parseDouble(st2.nextToken());
		}
		i++;
	}
	
	
}//End construct[3]
//-----------------------------End Constructors----------------------------

//----------------------------Operations--------------------------------
//ADD MATRIX
public Matrix add(Matrix m){//add 'this' matrix to matrix m
	Matrix newMat = new Matrix(this.m_rows,this.n_cols);
	for(int i = 0; i < this.m_rows; i++){
		for(int j = 0; j < this.n_cols; j++){
			newMat.arr[i][j] = this.arr[i][j] + m.arr[i][j];
		}
	}
	return newMat;
}
//SUBTRACT MATRIX
public Matrix subtract(Matrix m){//add 'this' matrix to matrix m
	Matrix newMat = new Matrix(this.m_rows,this.n_cols);
	for(int i = 0; i < this.m_rows; i++){
		for(int j = 0; j < this.n_cols; j++){
			newMat.arr[i][j] = this.arr[i][j] - m.arr[i][j];
		}
	}
	return newMat;
}

//MULTIPLY MATRIX -- by another matrix
public Matrix multiply(Matrix m){
	Matrix newMat = new Matrix(this.m_rows,m.n_cols);//Create new matrix with correct dimensions
	//Matrices must have the same inner dimensions 2x3 * 3*2
	/*
	 * |1 2 3| * |3 2|	 |20 <- 1*3 + 2*1 + 3 *5   |
	 * |4 5 6|	 |1 2| = |   |
	 * 			 |5 4|
	 * 2x3     *  3x2
	 */
	if(this.n_cols == m.m_rows){
	for(int row = 0; row < this.m_rows; row++){
		for(int col = 0; col < m.n_cols; col++){
			for(int k = 0; k < this.n_cols; k++)
			newMat.arr[row][col] += this.arr[row][k] * m.arr[k][col];
		}
	}
	}else{
		System.out.println("Arrays can't be multiplied");
		return newMat;
	}
	
	return newMat;
}
//MULTIPLY MATRIX -- by scalar double 
public Matrix multiply(double x){
	Matrix newMat = new Matrix(this.m_rows,this.n_cols);
	for(int i = 0; i < this.m_rows; i++){
		for(int j = 0; j < this.n_cols; j++){
			newMat.arr[i][j] = this.arr[i][j] *x;
			}
		}
	return newMat;
}

//DETERMINANT MATRIX -- return determinant of square matrix
public double determinant(){
	double result = -1;
	if(this.m_rows > 3){
		System.out.println("Matrix too large -- Cannot find determinant");
		return -1;
		}
	if(this.m_rows == 1){
		return this.arr[0][0];
	}
	else if(this.m_rows == 2)
	{
		result = (this.arr[0][0]*this.arr[1][1])-(this.arr[1][0]*this.arr[0][1]);

	}
	else if(this.m_rows == 3){
		result = (this.arr[0][0]*this.det_2x2(0)) - (this.arr[1][0]*this.det_2x2(1)) + (this.arr[2][0]*this.det_2x2(2)); 
	}
	return result;//error case
}
//Helper method for determinant method
private double det_2x2(int rowX){
	//Assuming determinant column is always 0!
	if(rowX == 0)
		return (this.arr[1][1]*this.arr[2][2])-(this.arr[2][1]*this.arr[1][2]);
	else if(rowX == 1)
		return (this.arr[0][1]*this.arr[2][2])-(this.arr[2][1]*this.arr[0][2]);
	else if(rowX == 2)
		return (this.arr[0][1]*this.arr[1][2])-(this.arr[1][1]*this.arr[0][2]);
	else
		return -1;//Error case
	
}
//Checks if matrix is square
public boolean isSquare(){
	if(this.m_rows == this.n_cols)
		return true;
	else 
		return false;
}
//Transpose Matrix -- Switch rows and columns
public Matrix transpose(){
	Matrix result = new Matrix(this.m_rows,this.n_cols);
	for(int i = 0; i < this.m_rows; i++){
		for(int j = 0; j < this.n_cols; j++){
			result.arr[i][j] = this.arr[j][i];
		}
	}
	return result;
}//end transpose

//Inverse Matrix -- Return inverse of matrix 1x1,2x2,3x3
public Matrix inverse(){
	Matrix newMat = new Matrix(this.m_rows,this.n_cols);
	if(this.isSquare()){//check if square matrix
		if(this.m_rows == 1){//1x1 inverse
			newMat.arr[0][0] = 1/this.arr[0][0];
		}
		else if(this.m_rows == 2){//2x2 inverse
			double det = this.determinant();
			det = 1/det;
			newMat.arr[0][0] = det*this.arr[1][1];
			newMat.arr[1][1] = det*this.arr[0][0];
			newMat.arr[0][1] = -1*det*this.arr[0][1];
			newMat.arr[1][0] = -1*det*this.arr[1][0];
			
		}
		else if(this.m_rows == 3){
			double det = this.determinant();
			if(det == 0){
				System.out.println("Determinant = 0, cannot find inverse");
				return newMat;
			}
			this.cofactorAndminor();
			Matrix temp = this.transpose();
			//temp.printConsole("Intermediate step printing temp");
			Matrix temp2 = temp.multiply(1/det);
			return temp2;//Still need to code 3x3 matrix inverse
			
		}
		else{
			System.out.println("Problem encountered finding inverse");
			return newMat;
		}
		
	}else{
		System.out.println("Cannot find inverse of non-square matrix");
		return newMat;
	}
	//default return
	return newMat;
}

public void cofactorAndminor() {
	double[][] save = new double[this.m_rows][this.n_cols];
	
	for (int i = 0; i < this.m_rows; i++){
		for (int j = 0; j < this.n_cols; j++){
			save[i][j] = this.arr[i][j];
		}
	}
	
	//Calculates determinant wrt each array element --> calculating determinant of 2x2 array after blocking out row/column chosen
	//Simultaneosly finds the 'minor' of the matrix +-+ sign change in rows and columns
    this.arr[0][0] = (save[1][1]*save[2][2]) - (save[2][1]*save[1][2]);
    
    this.arr[0][1] = -1*((save[1][0]*save[2][2]) - (save[2][0]*save[1][2]));
    
    this.arr[0][2] = (save[1][0]*save[2][1]) - (save[2][0]*save[1][1]);
    
    this.arr[1][0] = -1*((save[0][1]*save[2][2]) - (save[2][1]*save[0][2]));
    
    this.arr[1][1] = (save[0][0]*save[2][2]) - (save[2][0]*save[0][2]);
    
    this.arr[1][2] = -1*((save[0][0]*save[2][1]) - (save[2][0]*save[0][1]));
    
    this.arr[2][0] = (save[0][1]*save[1][2]) - (save[1][1]*save[0][2]);
    
    this.arr[2][1] = -1*((save[0][0]*save[1][2]) - (save[1][0]*save[0][2]));
    
    this.arr[2][2] = (save[0][0]*save[1][1]) - (save[1][0]*save[0][1]);     
   
}


	
public Matrix divide(Matrix m){
	Matrix newMat = null;
	if(m.m_rows == m.n_cols){//Check if divisor is square matrix
		Matrix inverse = m.inverse();
		if(this.n_cols == inverse.m_rows){//check if inner dimensions equal
			newMat = this.multiply(inverse);
		}else{
			System.out.println("Inner dimensions do not match...\nCannot multiply by inverse");
		}

	}
	else{
		System.out.println("Matrix divisor is not a square matrix...\nCannot divide.");
	}
	
	return newMat;
}//end divide


//--------------------------End Operations--------------------------------
//----------------------------Getters--------------------------------
public int getM(){
	return this.m_rows;
}
public int getN(){
	return this.n_cols;
}
public double getElement(int i, int j){
	return this.arr[i][j];
}
//----------------------------End Getters--------------------------------
//--------------------------Other Classes---------------------------------
//Print Array to Console
void printConsole(String message){
	System.out.println("----"+message+"----");
	for(int i = 0; i < this.m_rows; i++){
		for(int j = 0; j < this.n_cols; j++){
			System.out.print(this.arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("--End Array--");
}
//turn matrix into file-format string
public String toString(){
	String result = "";
	result += this.m_rows +"," + this.n_cols+"\n";
	for(int i = 0; i < m_rows; i++){
		for(int j = 0; j < n_cols; j++){
			result += this.arr[i][j];
			if(j < n_cols - 1)
				result +=",";
			result+=" ";
		}
		result += "\n";
	}
	return result;
}
//Write matrix to specified file
public void print(String filename) throws IOException {
	String data = this.toString();
	FileWriter fw = new FileWriter(filename);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(data);
	bw.flush();
	bw.close();
}
//Static Method to create identity matrix
static Matrix identity(int squareSize){
	Matrix id = new Matrix(squareSize,squareSize);
	
	for(int i = 0; i < squareSize; i++){
		for(int j= 0; i< squareSize; i++){
			if(i == j)
			id.arr[i][j] = 1; 
		}
	}
	return id;
}

//----------------------- End Other Classes---------------------------------


}
