
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
<script type="text/javascript">
function formCheck(f){
	
	if(f.name.value==""){
		alert("이름을 입력하세요");
		f.name.value="";
		f.name.focus();
		return false;
	}
	 if(document.getElementById("gender").value==""){
		alert("성별을 입력하세요");
		document.getElementById("gender").value="";
		document.getElementById("gender").focus();
		return false;
	}
	 if(document.getElementById("birth").value==""){
			alert("생년월일을 입력하세요");
			document.getElementById("birth").value="";
			document.getElementById("birth").focus();
			return false;
		}
	 if(document.getElementById("email").value==""){
			alert("이메일을 입력하세요");
			document.getElementById("email").value="";
			document.getElementById("email").focus();
			return false;
		}
	 if(document.getElementById("phone").value==""){
			alert("휴대폰번호를 입력하세요");
			document.getElementById("phone").value="";
			document.getElementById("phone").focus();
			return false;
		}
	 if(document.getElementById("address").value==""){
			alert("주소를 입력하세요");
			document.getElementById("address").value="";
			document.getElementById("address").focus();
			return false;
		}
	 if(document.getElementById("time").value==""){
			alert("수강회차를 입력하세요");
			document.getElementById("time").value="";
			document.getElementById("time").focus();
			return false;
		}
	 if(document.getElementById("id").value==""){
			alert("id를 입력하세요");
			document.getElementById("id").value="";
			document.getElementById("id").focus();
			return false;
		}
	 if(document.getElementById("pw").value==""){
			alert("pw를 입력하세요");
			document.getElementById("pw").value="";
			document.getElementById("pw").focus();
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
                    <h2 class="text-center">회원 정보 수정하기</h2>
                     
                    <form action="StudentUpdate.me" name="form" method="post" onsubmit="return formCheck(form)">
                     
                    <table class="table table-striped">
                    
                    <tr>
                        <td>학생번호</td>
                        <td>${member.stu_Num }</td>
                        <input type="hidden" value='${member.stu_Num}' name="number" id="number" class="form-control">
                      </tr>
                    
                    <tr>
                        <td>이름</td>
                        <td>
                        <input type="text" value='${member.stu_Name }' name="name" id="name" class="form-control">
                        </td>
                      </tr>
                      
                      <tr>
                        <td>성별</td>
                        <td>
                        <input type="text" value='${member.stu_Gender }' name="gender" id="gender" class="form-control">
                        </td>
                      </tr>
                    
                    <tr>
                        <td>생년월일</td>
                        <td>
                        <input type="text" value='${member.stu_Birth }' name="birth" id="birth" class="form-control">
                        </td>
                      </tr>
                    
                    <tr>
                        <td>이메일</td>
                        <td>
                        <input type="email" value='${member.stu_Email }'name="email" id="email" class="form-control">
                        </td>
                      </tr>
                    
                    <tr>
                        <td>휴대전화</td>
                        <td>
                        <input type="text" value='${member.stu_Phone }'name="phone" id="phone" class="form-control">
                        </td>
                      </tr>
                    
                    <tr>
                        <td>주소</td>
                        <td>
                        <input type="text" value='${member.stu_Address }'name="address" id="address" class="form-control">
                        </td>
                      </tr>
                      
                      <tr>
                        <td>수강회차</td>
                        <td>
                        <input type="text" value='${member.lecture_Time }'name="time" id="time" class="form-control">
                        </td>
                      </tr>
                    
                      <tr>
                        <td>아이디</td>
                        <td>
                        <input type="text" value='${member.stu_ID }' name="id" id="id" class="form-control">
                        </td>
                      </tr>
                       
                      <tr>
                        <td>패스워드</td>
                        <td>
                        <input type="password" value=${member.stu_PW } name="pw" id="pw" class="form-control">
                        </td>
                      </tr>
                       
                    <tr>
                         <td colspan="2" class="text-center">
                         <input type="submit" value="회원 수정하기" class="btn btn-success" >
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