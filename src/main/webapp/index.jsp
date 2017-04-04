<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Nutrition Intuition</title>
	  	<meta charset="utf-8">
	  	<meta name="viewport" content="width=device-width, initial-scale=1">
	  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  	<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" >
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/subscribe.js" type="text/javascript"></script>
	</head>


	<body>

		 <nav class="navbar navbar-default navbar-fixed-top">
		 	<div class="container">
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="#">Logo</a>
			    </div>
			    <div class="collapse navbar-collapse" id="myNavbar">
			      <ul class="nav navbar-nav navbar-right">
			        <li><a href="#about">ABOUT</a></li>
			        <li><a href="#services">SERVICES</a></li>
			        <li><a href="#portfolio">PORTFOLIO</a></li>
			        <li><a href="#pricing">PRICING</a></li>
			        <li><a href="#contact">CONTACT</a></li>
			      </ul>
			    </div>
			</div>
		</nav>


		<div class="jumbotron text-center">
		  <h1>Nutrition Intuition</h1>
		  <p>Real Time analysis of your nutritional profile</p>

		  <form class="form-inline" id="form-inline" action="/intuition/subscribe" method="post">
			<div class="input-group">
				<input type="email" name="email" id="email" class="form-control" size="50" placeholder="Email Address" required>
					<div class="input-group-btn">
						<button type="submit" class="btn btn-success">Subscribe</button>
					</div>
				</div>
	  		</form>
		</div>

		<div class="container-fluid">
		  <div class="row">
		    <div class="col-sm-8">
		      <h2>About Company Page</h2>
		      <h4>Lorem ipsum..</h4>
		      <p>Lorem ipsum..</p>
		      <button class="btn btn-default btn-lg">Get in Touch</button>
		    </div>
		    <div class="col-sm-4">
		      <span class="glyphicon glyphicon-signal logo"></span>
		    </div>
		  </div>
		</div>

		<div class="container-fluid bg-grey">
		  <div class="row">
		    <div class="col-sm-4">
		      <span class="glyphicon glyphicon-globe logo"></span>
		    </div>
		    <div class="col-sm-8">
		      <h2>Our Values</h2>
		      <h4><strong>MISSION:</strong> Our mission lorem ipsum..</h4>
		      <p><strong>VISION:</strong> Our vision Lorem ipsum..</p>
		    </div>
		  </div>
		</div>

		<footer class="container-fluid text-center footer">
		  <a href="#myPage" title="To Top">
		    <span class="glyphicon glyphicon-chevron-up"></span>
		  </a>
		  <p>You are what you eat.. <a href="http://www.apples.com" title="NDA Agreement">&copy TOKUM-K 2017</a></p>
		</footer>

	</body>


</html>