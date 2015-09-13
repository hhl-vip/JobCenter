$(function(){
	pageLoad();
});
function pageLoad(){
	$.ajax({url:appPath+'/getJobUndoList.html',async:true});
}