/**
 * 
 */

$('document').ready(function() {	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyBooking, status){
			$('#idEdit').val(propertyBooking.id);
			$('#ddlClientEdit').val(propertyBooking.clientid);			
			
			var dateIn = propertyBooking.dateIn.substr(0,10);
			var dateOut = propertyBooking.dateOut.substr(0,10);
			$('#dateInEdit').val(dateIn);
			$('#dateOutEdit').val(dateOut);
			
			$('#timeInEdit').val(propertyBooking.timeIn);
			$('#timeOutEdit').val(propertyBooking.timeOut);
			
			$('#ddlLocationEdit').val(propertyBooking.locationid);
			$('#rateEdit').val(propertyBooking.rate);
			$('#remarksEdit').val(propertyBooking.remarks);
			$('#ddlPropertyEdit').val(propertyBooking.propertyid);			
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyBooking, status){
			$('#idDetails').val(propertyBooking.id);
			$('#ddlClientDetails').val(propertyBooking.clientid);
			
			var dateIn = propertyBooking.dateIn.substr(0,10);
			var dateOut = propertyBooking.dateOut.substr(0,10);
			$('#dateInDetails').val(propertyBooking.dateIn);
			$('#dateOutDetails').val(propertyBooking.dateOut);
			$('#ddlLocationDetails').val(propertyBooking.locationid);
			$('#rateDetails').val(propertyBooking.rate);
			$('#remarksDetails').val(propertyBooking.remarks);
			$('#ddlVehicleDetails').val(propertyBooking.propertyid);
			$('#lastModifiedByDetails').val(propertyBooking.lastModifiedBy);
			$('#lastModifiedDateDetails').val(propertyBooking.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #confirmDelete').attr('href', href);
		$('#deleteModal').modal();		
	});	
});