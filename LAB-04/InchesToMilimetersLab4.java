public class InchesToMilimetersLab4{

	public static void main(String[] args){
//1st section
	//Variable Declaration
			final float lengthDimensionsInInches =8.5f, widthDimensionsInInches = 11f;
			final float dimensionsInMillimeters = 25.4f;
	//Value Assigning
			float lengthDimensionsInMillimeters = lengthDimensionsInInches*dimensionsInMillimeters;
			float widthDimensionsInMillimeters = widthDimensionsInInches*dimensionsInMillimeters;
	//Printing the 1st Section
			System.out.println("Dimensions of a letter-size sheet in Millimeters is: " + lengthDimensionsInMillimeters+" * "+widthDimensionsInMillimeters);

//2nd Section
	//Perimeter of Rectangle
			float perimeter = 2*(lengthDimensionsInInches+widthDimensionsInInches);
			System.out.println("Perimeter of the rectangle with given dimensions is: " + perimeter);
	//Diagonal
			float diagonal = (float)(Math.sqrt(Math.pow(lengthDimensionsInInches,2)+Math.pow(widthDimensionsInInches,2)));
			System.out.println("Diagonal of the rectangle with given dimensions is: " + diagonal);

	}

}