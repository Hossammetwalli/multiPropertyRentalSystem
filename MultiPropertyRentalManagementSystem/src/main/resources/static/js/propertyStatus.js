
$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
			
		var href = $(this).attr('href');
		
		$.get(href, function(propertyStatus, status){
			$('#idEdit').val(propertyStatus.id);
			$('#descriptionEdit').val(propertyStatus.description);
			$('#detailsEdit').val(propertyStatus.details);
		});					
		$('#editModal').modal();
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(propertyStatus, status){
			$('#idDetails').val(propertyStatus.id);
			$('#descriptionDetails').val(propertyStatus.description);
			$('#detailsDetails').val(propertyStatus.details);
			$('#lastModifiedByDetails').val(propertyStatus.lastModifiedBy);
			$('#lastModifiedDateDetails').val(propertyStatus.lastModifiedDate.substr(0,19).replace("T", " "));
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