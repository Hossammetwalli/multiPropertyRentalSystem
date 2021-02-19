/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyRecord, status){
			$('#idEdit').val(propertyRecord.id);
			$('#ddlVehicleEdit').val(propertyRecord.propertyid);
			$('#ddlLocationEdit').val(propertyRecord.locationid);
			$('#ddlClientNameEdit').val(propertyRecord.clientname);
			
			var date1 = propertyRecord.date1.substr(0,10);
			var date2 = propertyRecord.date2.substr(0,10);
			$('#date1Edit').val(date1);
			$('#date2Edit').val(date2);
			$('#remarksEdit').val(propertyRecord.remarks);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyRecord, status){
			$('#idDetails').val(propertyRecord.id);
			$('#ddlPropertyDetails').val(propertyRecord.propertyid);
			$('#ddlLocation1Details').val(propertyRecord.locationid);
			$('#ddlLocation2Details').val(propertyRecord.clientid);
			
			var date1 = propertyRecord.date1.substr(0,10);
			var date2 = propertyRecord.date2.substr(0,10);
			$('#date1Details').val(date1);
			$('#date2Details').val(date2);
			$('#remarksDetails').val(propertyRecord.remarks);
		//	$('#lastModifiedByDetails').val(propertyRecord.lastModifiedBy);
		//	$('#lastModifiedDateDetails').val(propertyRecord.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #confirmDeleteButton').attr('href', href);
		$('#deleteModal').modal();		
	});	
});