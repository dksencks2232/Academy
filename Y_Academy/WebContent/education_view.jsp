
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="Header.jsp"></jsp:include>

</head>
<body>
<main id="main">
    <!-- ======= Breadcrumbs ======= -->
    <form action="Regist.edc" method="post">
    <div class="breadcrumbs" data-aos="fade-in">
      <div class="container">
        <h2>교육과정</h2>
        <p><h3><c:out value="${edcBean.edc_Subject }"></c:out></h3></p>
        
      </div>
    </div><!-- End Breadcrumbs -->

    <!-- ======= About Section ======= -->
    <section id="about" class="about">
      <div class="container" data-aos="fade-up">

        <div class="row">
          <div class="col-lg-6 order-1 order-lg-2" data-aos="fade-left" data-aos-delay="100">
            <img src="Mentor/assets/img/about.jpg" class="img-fluid" alt="">
          </div>
          <div class="col-lg-6 pt-4 pt-lg-0 order-2 order-lg-1 content">
            <h3>교육과정 : <c:out value="${edcBean.edc_Subject }"></c:out> </h3>
            <input type="hidden" value='${edcBean.edc_Num }' name="id" id="id" class="form-control">
            <input type="hidden" value='${edcBean.edc_Subject }' name="subject" id="subject" class="form-control">
            <!-- <p class="font-italic">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
              magna aliqua.
            </p> -->
            <ul>
              <li><i class="icofont-check-circled"></i> 교육과정 내용 : <c:out value="${edcBean.edc_Content }"></c:out></li>
              <li><i class="icofont-check-circled"></i> 교육과정 장소 : <c:out value="${edcBean.edc_Place }"></c:out></li>
              <li><i class="icofont-check-circled"></i> 교육과정 시간 : <c:out value="${edcBean.edc_Time }"></c:out></li>
              <li><i class="icofont-check-circled"></i> 교육과정 기간 : <c:out value="${edcBean.edc_PD }"></c:out></li>
              <li><i class="icofont-check-circled"></i> 교육과정 모집인원 : <c:out value="${edcBean.edc_NMPR }"></c:out></li>
            </ul>
            <p>
              Ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate
            </p>

          </div>
        </div>
			<%-- <a href="Regist.edc?id=${edcBean.edc_Num }" class="get-started-btn">수강 신청</a> --%>
			<input type="submit" value='수 강 신 청' class="btn btn-success">
     	 </div>
     	 
     	 
    </section><!-- End About Section -->
    </form>
    <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>