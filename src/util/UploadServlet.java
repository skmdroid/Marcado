package util;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dao.PostAdDao;
import dto.ProductDetailsDTO;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class UploadServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	String prodTitle,prodCategory,prodDesc,prodPrice,fullPath;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		  PostAdDao postAdDaoObj = new PostAdDao();
		  ProductDetailsDTO prodDetailsDtoObj = new ProductDetailsDTO();

		  if (!isMultipart) {
			  System.out.println("File Not Uploaded");
			  request.getRequestDispatcher("PostAd.jsp").forward(request, response);
		  } else {
			  FileItemFactory factory = new DiskFileItemFactory();
			  ServletFileUpload upload = new ServletFileUpload(factory);
			  List items = null;
	
			  try {
			  items = upload.parseRequest(request);
			  System.out.println("items: "+items);
			  } catch (FileUploadException e) {
			  e.printStackTrace();
			  }
			  Iterator itr = items.iterator();
			  while (itr.hasNext()) {
				  FileItem item = (FileItem) itr.next();
				  if (item.isFormField()){
					  String name = item.getFieldName();
					  System.out.println("name: "+name);
					  String value = item.getString();
					  System.out.println("value: "+value);
					  
					  checkfield(name,value);
					  /*
					   * Below 2 lines of code is to re-render the page if any of the form field is empty.
					   */
					  if(value == null || value.equals(""))
						  request.getRequestDispatcher("PostAd.jsp").forward(request, response);
				  } 
				  else{
					  try {
					  String itemName = item.getName();
					  Random generator = new Random();
					  int r = Math.abs(generator.nextInt());
			
					  String reg = "[.*]";
					  String replacingtext = "";
					  System.out.println("Text before replacing is:-" + 
					  itemName);
					  Pattern pattern = Pattern.compile(reg);
					  Matcher matcher = pattern.matcher(itemName);
					  StringBuffer buffer = new StringBuffer();
			
					  while (matcher.find()) {
						  matcher.appendReplacement(buffer, replacingtext);
					  }
					  int IndexOf = itemName.indexOf("."); 
					  String domainName = itemName.substring(IndexOf);
					  System.out.println("domainName: "+domainName);
			
					  String finalimage = buffer.toString()+"_"+r+domainName;
					  System.out.println("Final Image==="+finalimage);
			
					  String folderpath="C:/Users/Pavan kumar/Desktop/Marcado_Images/";
					  fullPath = folderpath+r+domainName;
					  File savedFile = new File(fullPath);
					  item.write(savedFile);
					  
					  /*Map prodDetailsMap = new HashMap();
					  prodDetailsMap.put("prodTitle", prodTitle);
					  prodDetailsMap.put("prodCategory", prodCategory);
					  prodDetailsMap.put("prodDesc", prodDesc);
					  prodDetailsMap.put("prodPrice", prodPrice);
					  prodDetailsMap.put("fullPath", fullPath);*/
					  
					  prodDetailsDtoObj.setProdTitle(prodTitle);
					  prodDetailsDtoObj.setProdCategory(prodCategory);
					  prodDetailsDtoObj.setProdDesc(prodDesc);
					  prodDetailsDtoObj.setFullPath(fullPath);
					  prodDetailsDtoObj.setProdPrice(prodPrice);
					  HttpSession session = request.getSession(true);
					  prodDetailsDtoObj.setUID((String)session.getAttribute("uname"));
					  
					  System.out.println("prodTitle->"+prodTitle+":prodCategory:"+prodCategory+":prodDesc:"+prodDesc+"fullPath"+fullPath+":prodPrice:"+prodPrice+
							  "UID:"+prodDetailsDtoObj.getUID());
					  
					  postAdDaoObj.insertProdDetails(prodDetailsDtoObj);
					  
					  request.getRequestDispatcher("ProductDetails.jsp").forward(request, response);
					 
					  }catch (Exception e) 
					  {
						e.printStackTrace();
					  }
				  }
			  }
		  }
	}

	private void checkfield(String name,String value) {
		
		switch(name)
		{
			case "producttitle":
				prodTitle=value;
				break;
			case "prodcategory":
				prodCategory=value;
				break;
			case "proddescription":
				prodDesc=value;
				break;
			case "prodprice":
				prodPrice=value;
				break;
		}
	}
	
	/*public boolean allFieldsPresent()
	{
		boolean allFieldsPresent = false;
		
		if(prodTitle != null && !prodTitle.equals("") && prodCategory != null && !prodCategory.equals("")
				 && prodDesc != null && !prodDesc.equals("") && prodPrice != null && !prodPrice.equals(""))
		{
			allFieldsPresent = true;
		}
		
		return allFieldsPresent;
	}*/
	
}