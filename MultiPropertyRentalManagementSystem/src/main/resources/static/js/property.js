/**
 * 
 */

$('document').ready(function() {	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(property, status){
			
			var acDate = property.acquisitionDate.substr(0,10);
			$('#txtAcquisitionDateEdit').val(acDate);
			
			$('#txtDescriptionEdit').val(property.description);
			$('#ddlEmployeeEdit').val(property.employeeid);
			$('#txtMaximumoccupancyEdit').val(property.maximumoccupancy);
			$('#txtIdEdit').val(property.id);
			$('#ddlLocationEdit').val(property.locationid);
			$('#txtNameEdit').val(property.name);
			$('#txtNetRateEdit').val(property.netrate);
			$('#txtSize').val(property.size);
			
			var startDate = property.startDate.substr(0,10);
			$('#txtStartDateEdit').val(startDate);
			
			$('#txtRemarksEdit').val(property.remarks);
			$('#ddlPropertyOwnershipEdit').val(property.propertyownershipid);		
			$('#ddlFurnitureStyleModelEdit').val(property.furniturestilemodelid);			
			$('#txtPropertyNumberEdit').val(property.propertyNumber);			
			$('#ddlPropertyStatusEdit').val(property.propertystatusid);			
			$('#ddlpropertyTypeEdit').val(property.propertytypeid);	
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyType, status){
			$('#idDetails').val(propertyType.id);
			$('#descriptionDetails').val(propertyType.description);
			$('#detailsDetails').val(propertyType.details);
			$('#lastModifiedByDetails').val(propertyType.lastModifiedBy);
			$('#lastModifiedDateDetails').val(propertyType.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
	
	$('.table #photoButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#photoModal #propertyPhoto').attr('src', href);
		$('#photoModal').modal();		
	});	
});