
$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
			
		var href = $(this).attr('href');
		
		$.get(href, function(propertyType, status){
			$('#idEdit').val(propertyType.id);
			$('#descriptionEdit').val(propertyType.description);
			$('#detailsEdit').val(propertyType.details);
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
			$('#cityDetails').val(propertyType.city);
			$('#addressDetails').val(propertyType.address);
			$('#ddlStateDetails').val(propertyType.stateid);
			$('#ddlCountryDetails').val(propertyType.countryid);
			$('#lastModifiedByDetails').val(propertyType.lastModifiedBy);
			$('#lastModifiedDateDetails').val(propertyType.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal();		
	});	
	
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		
		var href= $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
		
});