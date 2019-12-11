<html>
<head>
<title>Projet Maven JEE</title>


<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/styles2.css" rel="stylesheet">
</head>

<body id="page-top">
	<div id="wrapper">
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.jsp">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</div>
				<div class="sidebar-brand-text mx-3">Tourisme</div>			
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">



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
			<div id="container">
				<div class="row justify-content-center">
					<div class="p-5">
						<h3>Connexion pour gerer le site</h3>
						<br />
						<div class="row">
							<form class="user">
								<div class="form-group">
									Email<input type="email" class="form-control form-control-user"
										id="Email" placeholder="Email">
								</div>
								<div class="form-group">
									Password<input type="password"
										class="form-control form-control-user"
										id="exampleInputPassword" placeholder="Password">
								</div>
							</form>
							<sumbmit value ="connexion" class="btn btn-primary btn-user btn-block"/>
							<a href="accueil.jsp" class="btn btn-primary btn-user btn-block">
								Connexion </a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>
</body>
</html>
