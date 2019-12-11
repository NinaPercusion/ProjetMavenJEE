<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE HTML>
<html>


<head>
<title>Monuments</title>
<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<!-- Custom styles for this template-->
<link href="css/styles2.css" rel="stylesheet">
<head>

<body id="page-top">
	<div id="wrapper">
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.html">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</div>
				<div class="sidebar-brand-text mx-3">Tourisme</div>
			</a>

			<!-- Divider -->

			<!-- Divider -->
			<hr class="sidebar-divider">


			<!-- Heading -->
			<div class="sidebar-heading">D&eacute;cuverte</div>

			<!-- Nav Item - Charts -->
			<li class="nav-item"><a class="nav-link" href="monument.jsp">
					<i class="fas fa-fw fa-chart-area"></i> <span>Monument</span>
			</a></li>

			<!-- Nav Item - Tables -->
			<li class="nav-item"><a class="nav-link" href="lieu.jsp"> <i
					class="fas fa-fw fa-table"></i> <span>Lieux</span>
			</a></li>

			<!-- Nav Item - Tables -->
			<li class="nav-item"><a class="nav-link" href="departament.jsp">
					<i class="fas fa-fw fa-table"></i> <span>Départaments</span>
			</a></li>
			<!-- Nav Item - Tables -->
			<li class="nav-item"><a class="nav-link" href="celebrite.jsp">
					<i class="fas fa-fw fa-table"></i> <span>Personnages
						C&eacute;l&egrave;bres</span>
			</a></li>

			<!-- Divider -->
			<hr class="sidebar-divider d-none d-md-block">

			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
				<!--Table Monument-->
				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-2 text-gray-800">Monuments</h1>
					<p class="mb-4">
						Si vous voulez regarder la <a target="_blank"
							href="https://umap.openstreetmap.fr/fr/map/monuments-aux-morts_263977#6/46.785/3.153">carte
							des monuments en france (OpenStreetMap) </a> <br />Auteur: Christian
						Quest.
					</p>

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">Monuments</h6>
						</div>
						<div class="card-body">
							<div class="table-responsive">

								<table class="table table-bordered" id="dataTable"
									width="100%" cellspacing="0"
									value="#{monumentBean.getMonument()}" var="monument">


									<thead>
										<tr>
											<th>Codigo Monument</th>

											<th>Region</th>

											<th>Code Departement</th>

											<th>Comune</th>

											<th>Titre Courant</th>
											<th>Status Propiete</th>
										</tr>
									</thead>
									<tfoot>
										<tr>
											<th>Codigo Monument</th>
											<th>Region</th>
											<th>Code Departement</th>
											<th>Comune</th>
											<th>Titre Courant</th>
											<th>Status Propiete</th>
										</tr>
									</tfoot>
									<tbody>

										<s:iterator value="monument">
											<tr>
												<td><s:property value="CodigoMnumeto" /></td>
												<td><s:property value="regionMonumento" /></td>
												<td><s:property value="codeDepartement" /></td>
												<td><s:property value="Commune" /></td>
												<td><s:property value="titreCourant" /></td>
												<td><s:property value="statusPropiete" /></td>
											</tr>

										</s:iterator>
									</tbody>
									<!--  
											
												<tr>
													<td>Tiger Nixon</td>
													<td>System Architect</td>
													<td>Edinburgh</td>
													<td>61</td>
													<td>2011/04/25</td>
													<td>$320,800</td>
												</tr>
												<tr>
													<td>Garrett Winters</td>
													<td>Accountant</td>
													<td>Tokyo</td>
													<td>63</td>
													<td>2011/07/25</td>
													<td>$170,750</td>
												</tr>
												<tr>
													<td>Ashton Cox</td>
													<td>Junior Technical Author</td>
													<td>San Francisco</td>
													<td>66</td>
													<td>2009/01/12</td>
													<td>$86,000</td>
												</tr>

											</tbody>-->
								</table>
							</div>
						</div>
					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

		</div>

	</div>

</body>
</html>