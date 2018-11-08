public class Book{	
	private String title;
	private String author;
	private String tableOfContents="";
	
	
	private int nextPage= 1;
	
	
	public Book(String a, String b){
		title=a;
		author=b;
	}
	
	public String toString(){
		return title+"\n"+author;
	}
	
	
	
	public void addChapter(String a, int x){
		title=a;
		tableOfContents="\n"+title+"..."+nextPage;
		
		//nextPage += nextPage+x;
		nextPage +=x;
		
	}
	
	
	
	
	
	
	public int getPages(){
		return nextPage;
	}
	
	
	
	public String getTableOfContents(){
		return (tableOfContents);
	}
	
}