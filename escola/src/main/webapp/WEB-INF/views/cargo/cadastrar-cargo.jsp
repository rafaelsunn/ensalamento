<%@include file="/WEB-INF/tags/taglibs.jsp"%>
<jsp:include page="../templates/topo.jsp" />

<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title text-center">CADASTRO DE FUNCIONÁRIO</h3>
			</div>
			
			<div class="panel-body">
				
				<form action="${salvar}" class="form-horizontal">
					<fieldset>
						<legend>Cadastro de Cargo</legend>
						<div class="form-group">
							<label for="nome" class="col-sm-2 control-label">Nome</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="nome" name="nome">
							</div>
						</div>
						
						<div class="form-group">
							<label for="nome" class="col-sm-2 control-label">Nome</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="nome" name="nome">
							</div>
						</div>												
					</fieldset>
					<button type="submit" class="btn btn-primary">
						<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Gravar
					</button>
			</form>
			</div>
		</div>
	</div>

<jsp:include page="../templates/footer.jsp" />