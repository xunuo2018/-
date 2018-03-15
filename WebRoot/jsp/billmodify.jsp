<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>

<div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>订单管理页面 >> 订单修改页面</span>
        </div>
        <div class="providerAdd">
          <form id="billForm" name="billForm" method="post" action="billUpdate.s?bid=${bill.bid }">
				<input type="hidden" name="method" value="modifysave">
				
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="billCode">订单编码：</label>
                    <input type="text" name="billCode" id="billCode" value="${bill.billCode }" readonly="readonly"> 
                </div>
                <div>
                    <label for="productName">商品名称：</label>
                    <input type="text" name="productName" id="productName" value="${bill.productName }"> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="productUnit">商品单位：</label>
                    <input type="text" name="productUnit" id="productUnit" value="${bill.productUnit }"> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="productCount">商品数量：</label>
                    <input type="text" name="productCount" id="productCount" value="${bill.productCount }"> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="totalPrice">总金额：</label>
                    <input type="text" name="totalPrice" id="totalPrice" value="${bill.totalPrice }"> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="providerId">供应商：</label>
                    
					<select name="providerId" id="providerId">
					  <option value="0">--请选择--</option>
					  	<c:forEach items="${NameList }" var="li">
					  		<option value="${li.providerId }">${li.proName }</option>
					  	</c:forEach>	
		        	</select>
					<font color="red"></font>
                </div>
                <div>
                    <label >是否付款：</label>
                    <c:choose>
                    	<c:when test="${bill.isPayment==2 }">
                    		<input type="radio" name="isPayment" value="1" checked="checked">未付款
							<input type="radio" name="isPayment" value="2" >已付款
                    	</c:when>
                    	<c:otherwise>
                    		<input type="radio" name="isPayment" value="1">未付款
							<input type="radio" name="isPayment" value="2" checked="checked">已付款               		
                    	</c:otherwise>
                    </c:choose>

					
                </div>
                <div class="providerAddBtn">
                  <input type="submit" name="save" id="save" value="保存">
				  <input type="button" id="back" name="back" value="返回" >
              	</div>
            </form>
        </div>

    </div>
</section>

<%@include file="/jsp/common/foot.jsp" %>
