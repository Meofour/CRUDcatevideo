<%@ page language="java" contentType="text/html; charset=UTF-8"


pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="jakarta.tags.core" %>



<a href="<c:url value='/admin/category/add'></c:url>">Add category</a>


<table border="1">


<tr>


<th>STT</th>


<th>Images</th>


<th>Category Name</th>


<th>Status</th>


<th>Action</th>


</tr>


<c:forEach items="${listcate}" var="cate" varStatus="STT">


<tr>


<td>${STT.index+1 }</td>



<c:if test="${cate.images.substring(0 , 5)=='https'}">


<c:url value="${cate.images}" var="imgUrl"></c:url>


</c:if>


<c:if test="${cate.images.substring(0 , 5)!='https'}">


<c:url value="/image?fname=${cate.images }" var="imgUrl"></c:url>


</c:if>



<td><img height="150" width="200" src="${imgUrl}" /></td>


<td>${cate.categoryname }</td>


<td>${cate.status}</td>


<td><a


href="<c:url value='/admin/category/edit?id=${cate.categoryId }'/>">Sửa</a>


| <a


href="<c:url value='/admin/category/delete?id=${cate.categoryId }'/>">Xóa</a>


</td>


</tr>


</c:forEach>


</table>

