
$(function(){
	/*document.onkeydown = function(e){
		var ev = document.all ? window.event : e;
		if(ev.keyCode==13) {
			$('#FormId').submit();
		
			$.ajax({
				url:appPath+'/getJobMonitorList.html',
				type:"POST",
				async:true,
				data: {jobNameOrIsSuccess:$("#jobNameOrIsSuccess").val()}
			});
		}
	}*/
}); 
function paging(page){  
    $.ajax({  
       type: "GET",  
       url: "${ctx}/api/v1/user/1/"+(page-1)+"/5",  
       dataType:"json",  
       success: function(msg){  
           
       }  
    });  
    $.ajax({  
        type: "GET",  
        url:"${ctx}/api/v1/user/count/1",  
        dataType:"json",  
        success:function(msg){  
            var pages = Math.ceil(msg.data/5);//这里data里面有数据总量  
            var element = $('#pageUl');//对应下面ul的ID  
            var options = {  
                bootstrapMajorVersion:3,  
                currentPage: page,//当前页面  
                numberOfPages: 5,//一页显示几个按钮（在ul里面生成5个li）  
                totalPages:pages //总页数  
            }  
           element.bootstrapPaginator(options);  
        }  
    });  
}