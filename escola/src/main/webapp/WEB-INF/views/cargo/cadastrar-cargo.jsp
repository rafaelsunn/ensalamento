<%@include file="/WEB-INF/tags/taglibs.jsp"%>
<jsp:include page="../templates/topo.jsp" />

<c:url value="salvar" var="salvar"/>

<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title text-center">CADASTRO DE CARGO</h3>
			</div>
			
			<div class="panel-body">
				
				<form action="${salvar}" class="form-horizontal" method="post">
				<input type="hidden" value="${cargo.idCargo}" />
					<fieldset>
						<legend>Cadastro de Cargo</legend>
						<div class="form-group">
							<label for="descricao" class="col-sm-2 control-label">Descrição</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="descricao" name="descricao" value="${cargo.descricao}">
							</div>
						</div>
						
						<div class="form-group">
							<label for="funcao" class="col-sm-2 control-label">Função</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="funcao" name="funcao" value="${cargo.funcao}">
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