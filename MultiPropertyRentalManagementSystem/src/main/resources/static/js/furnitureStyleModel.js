
$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
			
		var href = $(this).attr('href');
		
		$.get(href, function(furnitureStyleModel, status){
			$('#idEdit').val(furnitureStyleModel.id);
			$('#descriptionEdit').val(furnitureStyleModel.description);
			$('#detailsEdit').val(furnitureStyleModel.details);
		});					
		$('#editModal').modal();
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(furnitureStyleModel, status){
			$('#idDetails').val(furnitureStyleModel.id);
			$('#descriptionDetails').val(furnitureStyleModel.description);
			$('#detailsDetails').val(furnitureStyleModel.details);
			$('#createdByDetails').val(furnitureStyleModel.createdBy);
			$('#createdDateDetails').val(furnitureStyleModel.createdDate.substr(0,19).replace("T", " "));
			$('#lastModifiedByDetails').val(furnitureStyleModel.lastModifiedBy);
			$('#lastModifiedDateDetails').val(furnitureStyleModel.lastModifiedDate.substr(0,19).replace("T", " "));
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