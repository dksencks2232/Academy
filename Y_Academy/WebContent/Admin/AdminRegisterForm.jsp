<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
    <title>관리자 등록 페이지</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
 
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
 
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
     <div class="container">
    <div class="row">
    <div class="col-sm-12 text-center" >
    <div class="col-sm-3"></div>
     
    <div class="col-sm-6">
    <h2>회원가입</h2>
    <form action="MemberJoinProc.jsp" method="post">
        <table class="table table-boardered">
            <tr>
                <th>강사 아이디</th>
                <td><input type="text" class="form-control" name="id" placeholder="id를 넣으세요"></td>        
            </tr>
            <tr>
                <th>강사 비밀번호</th>
                <td><input type="password" class="form-control" name="password" placeholder="비밀번호는 영문만 넣어주세요"></td>      
            </tr>
             
            <tr>
                <th>비밀번호 확인</th>
                <td><input type="password" class="form-control" name="passwordConfirm"></td>        
            </tr>
             
            <tr>
                <th>강사 이름</th>
                <td><input type="email" class="form-control" name="name"></td>       
            </tr>
             
            <tr>
                <th>강사 성별</th>
                <td>
                <input type="radio" class="form-control" name="gender">남
                <input type="radio" class="form-control" name="gender">여
                </td>       
            </tr>
             
            <tr>
                <th>강사 휴대전화</th>
                <td><input type="tel" class="form-control" name="gender"></td>       
            </tr> 
             
                         
             
             
            <tr>
                <td colspan="2">
                <input type="submit" class="btn btn-primary" value="전송">
                <input type="reset" class="btn btn-danger" value="취소">
                </td>
            </tr>
             
             
        </table>
    </form>
    </div>
     
    </div>
    </div>
</div>
</body>
</html>