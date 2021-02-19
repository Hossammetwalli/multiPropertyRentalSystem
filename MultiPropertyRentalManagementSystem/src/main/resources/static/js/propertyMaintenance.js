/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyMaintenance, status){
			$('#idEdit').val(propertyMaintenance.id);
			$('#costEdit').val(propertyMaintenance.cost);
			$('#remarksEdit').val(propertyMaintenance.remarks);
			$('#ddlSupplierEdit').val(propertyMaintenance.supplierid);
			$('#ddlVehicleEdit').val(propertyMaintenance.propertyid);
			
			//Create a date variable and extract only the date part of the fiedl
			var startDate = propertyMaintenance.startDate.substr(0,10);
			var endDate = propertyMaintenance.endDate.substr(0,10);
			
			$('#startDateEdit').val(startDate);
			$('#endDateEdit').val(endDate);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyMaintenance, status){
			$('#idDetails').val(propertyMaintenance.id);
			$('#costDetails').val(propertyMaintenance.cost);
			$('#remarksDetails').val(propertyMaintenance.remarks);
			$('#ddlSupplierDetails').val(propertyMaintenance.supplierid);
			$('#ddlPropertyDetails').val(propertyMaintenance.propertyid);
			
			var startDate = propertyMaintenance.startDate.substr(0,10);
			var endDate = propertyMaintenance.endDate.substr(0,10);
			
			$('#startDateDetails').val(startDate);
			$('#endDateDetails').val(endDate);
			$('#lastModifiedByDetails').val(propertyMaintenance.lastModifiedBy);
			$('#lastModifiedDateDetails').val(propertyMaintenance.lastModifiedDate.substr(0,19).replace("T", " "));
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