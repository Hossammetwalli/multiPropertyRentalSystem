
$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
			
		var href = $(this).attr('href');
		
		$.get(href, function(propertyOwnership, status){
			$('#idEdit').val(propertyOwnership.id);
			$('#descriptionEdit').val(propertyOwnership.description);
			$('#detailsEdit').val(propertyOwnership.details);
		});					
		$('#editModal').modal();
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyOwnership, status){
			$('#idDetails').val(propertyOwnership.id);
			$('#descriptionDetails').val(propertyOwnership.description);
			$('#detailsDetails').val(propertyOwnership.details);
			$('#lastModifiedByDetails').val(propertyOwnership.lastModifiedBy);
			$('#lastModifiedDateDetails').val(propertyOwnership.lastModifiedDate.substr(0,19).replace("T", " "));
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