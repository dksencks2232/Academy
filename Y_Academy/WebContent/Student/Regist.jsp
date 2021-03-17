
<%@page import="vo.StudentMemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="Header.jsp" />
</head>
<body>
    <!-- 1.데이터 베이스에서 한회원의 정보를 가져옴 2. table태그를 이용하며 화면에 회원의 정보를 출력 -->
<%
	/* StudentMemberBean member = new StudentMemberBean(); 
	member = (StudentMemberBean)request.getAttribute("member");
	
	System.out.println(member.getStu_ID()); */
%>
<script type="text/javascript">
function formCheck(f){
	
	if(f.name.value == ""){
		alert("이름을 입력하세요");
		f.name.value="";
		f.name.focus();
		return false;
	}
	if(f.phone.value == ""){
		alert("휴대폰번호를 입력하세요");
		f.phone.value="";
		f.phone.focus();
		return false;
	}
	if(f.birth.value == ""){
		alert("생년월일을 입력하세요");
		f.birth.value="";
		f.birth.focus();
		return false;
	}
	if(f.email.value == ""){
		alert("이메일을 입력하세요");
		f.email.value="";
		f.email.focus();
		return false;
	}
	if(f.content.value == ""){
		alert("내용을 입력하세요");
		f.content.value="";
		f.content.focus();
		return false;
	}else{
		return true;	
	}
	
}

</script>
 
<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <div class="col-sm-2"></div>
                <div class="col-sm-9">
                    <h2 class="text-center">수 강 신 청 </h2>
                     
                    <form action="ResgistStudent.edc" name="form" method="post" >
                     
                    <table class="table table-striped">
                    
                    <tr>
                        <td>교육과정</td>
                        <td>
                        ${subject }
                        
                       <input type="hidden" value='${id }' name="id" id="id" class="form-control">
                       
                       </td>
                      </tr>
                    
                    <tr>
                        <td>이 름</td>
                        <td>
                        <input type="text" value='' name="name" id="name" class="form-control">
                        </td>
                      </tr>
                      
                      <tr>
                        <td>휴대전화</td>
                        <td>
                        <input type="text" value='' name="phone" id="phone" class="form-control">
                        </td>
                      </tr>
                    
                    <tr>
                        <td>생년월일</td>
                        <td>
                        <input type="text" value='' name="birth" id="birth" class="form-control">
                        </td>
                      </tr>
                    
                    <tr>
                        <td>이메일</td>
                        <td>
                        <input type="email" value=''name="email" id="email" class="form-control">
                        </td>
                      </tr>
                    
                    <tr>
                        <td>상담내용</td>
                        <td>
                        <input type="text" value=''name="content" id="content" class="form-control">
                        </td>
                      </tr>
                      
                    <tr>
                         <td colspan="2" class="text-center">
                         <input type="submit" value="수강신청" class="btn btn-success" onclick="return formCheck(form)">
 <!-- <button type="button"  class="btn btn-warning" onclick="location.href='MemberList.jsp'">회원 전체 보기</button> -->
                         
                         
                         </td>    
                    </tr>
                           
                    </table>
                 
                </form>   
                     
                </div>
        </div> <!-- col-sm-12 -->
    </div><!-- row -->
</div> <!-- container end-->
     
     
</body>
</html>