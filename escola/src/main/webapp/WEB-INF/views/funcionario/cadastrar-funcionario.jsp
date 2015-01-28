<%@include file="/WEB-INF/tags/taglibs.jsp"%>
<jsp:include page="../templates/topo.jsp"/>
<!-- URLs -->
<c:url value="salvar" var="salvar" />
<!-- Fim das URLs -->

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title text-center">CADASTRO DE FUNCIONÁRIO</h3>
			</div>
			
			<div class="panel-body">
				
				<form action="${salvar}" class="form-horizontal">
					<fieldset>
						<legend>Dados Pessoais</legend>
						<div class="form-group">
							<label for="nome" class="col-sm-2 control-label">Nome</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="nome" name="nome">
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-sm-2 control-label">Sexo</label>
							<div class="col-sm-4">
								<label class="radio-inline">
									<input type="radio" name="sexo" id="feminino" value="FEMININO"> Feminino
								</label>

								<label class="radio-inline">
									<input type="radio" name="sexo" id="masculino" value="MASCULINO"> Masculino
								</label>
							</div>
						</div>
						
						<div class="form-group">
							<label for="pai" class="col-sm-2 control-label">Nome do Pai</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="pai" name="nomepai">
							</div>
						</div>	
						
						<div class="form-group">
							<label for="mae" class="col-sm-2 control-label">Nome da Mãe</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="mae" name="nomepai">
							</div>
						</div>													
						
						<div class="form-group">
							<label for="data-nascimento" class="col-sm-2 control-label">Data de Nascimento</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="data-nascimento" name="dtnasc">
							</div>
						</div>
						
						<div class="form-group">
							<label for="cpf" class="col-sm-2 control-label">CPF</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="cpf" name="cpf">
							</div>
						</div>
						
						<div class="form-group">
							<label for="rg" class="col-sm-2 control-label">RG</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="rg" name="rg">
							</div>
						</div>	
						
					</fieldset>
					
					<fieldset>
						<legend>Contato</legend>
						<div class="form-group">
							<label for="email" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-4">
								<input type="email" class="form-control" id="email" name="email">
							</div>
						</div>
						
						<div class="form-group">
							<label for="telefone" class="col-sm-2 control-label">Telefone</label>
							<div class="col-sm-4">
								<input type="tel" class="form-control" id="telefone">
							</div>
						</div>
					</fieldset>
					
					<fieldset>
						<legend>Endereço</legend>
						<div class="form-group">
							<label for="logradouro" class="col-sm-2 control-label">Logradouro</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="logradouro" name="endereco.logradouro">	
							</div>
						</div>
						
						<div class="form-group">
							<label for="cidade" class="col-sm-2 control-label">Cidade</label>
							<div class="col-sm-4">
								<select class="form-control" id="cidade" name="cidade" >
									<c:forEach var="cidade" items="${cidades}">
										<option>${cidade.nomeCidade}</option>
									</c:forEach>									
								</select>
							</div>
						</div>
						
						<div class="form-group">
							<label for="uf" class="col-sm-2 control-label">UF</label>
							<div class="col-sm-4">
								<input type="text" name="uf" class="form-control" value="${uf.siglaUf}" disabled>
							</div>
						</div>
						
					</fieldset>
					
					<fieldset>
						<legend>Informações Adicionais</legend>

						<div class="form-group">
							<label for="cargo" class="col-sm-2 control-label">Cargo</label>
							<div class="col-sm-4">
								<select class="form-control" name="cargo" id="cargo" name="cargo">
									<option value="Cargo 1">Cargo 1</option>
									<option value="Cargo 2">Cargo 2</option>
								</select>
							</div>
						</div>			
						
						<div class="form-group">
							<label for="pis" class="col-sm-2 control-label">PIS</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="pis" name="pis">
							</div>
						</div>	
						
						<div class="form-group">
							<label for="dtadmis" class="col-sm-2 control-label">Data de Admissão</label>
							<div class="col-sm-4">
									<input type="text" class="form-control" id="dtadmis" name="dataAdmis">
							</div>
						</div>			
						
						<div class="form-group">
							<label for="grauescolar" class="col-sm-2 control-label">Grau Escolar</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="grauescolar" name="grauesc">
							</div>
						</div>						
						
						<div class="form-group">
							<label for="naturalidade" class="col-sm-2 control-label">Naturalidade</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="naturalidade" name="naturalidade">
							</div>
						</div>
						
						<div class="form-group">
							<label for="nacionalidade" class="col-sm-2 control-label">Nacionalidade</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="nacionalidade" name="nacionalidade">
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

<jsp:include page="../templates/footer.jsp"/>
