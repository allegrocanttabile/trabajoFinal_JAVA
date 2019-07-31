<%-- 
    Document   : home
    Created on : Jul 29, 2019, 6:10:46 PM
    Author     : AllegroCanttabile
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Sistema Logistica</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.6 -->
        <link rel="stylesheet" href="../../bootstrap/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="../../dist/css/AdminLTE.min.css">
    
        <link rel="stylesheet" href="../../dist/css/skins/_all-skins.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="../../plugins/iCheck/flat/blue.css">
        <!-- Morris chart -->
        <link rel="stylesheet" href="../../plugins/morris/morris.css">
        <!-- jvectormap -->
        <link rel="stylesheet" href="../../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
        <!-- Date Picker -->
        <link rel="stylesheet" href="../../plugins/datepicker/datepicker3.css">
        <!-- Daterange picker -->
        <link rel="stylesheet" href="../../plugins/daterangepicker/daterangepicker.css">
        <!-- bootstrap wysihtml5 - text editor -->
        <link rel="stylesheet" href="../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">

            <header class="main-header">
                <!-- Logo -->
                <a href="main.jsp" class="logo">
                    <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>A</b>PL</span>
                    <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>Administrador Panel</b></span>
                </a>
                <!-- Header Navbar: style can be found in header.less -->
                <nav class="navbar navbar-static-top">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                        <span class="sr-only">Toggle navigation</span>
                    </a>

                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">
                            <!-- Messages: style can be found in dropdown.less-->
                            <li class="dropdown messages-menu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                </a> 
                            </li>
                            <!-- Notifications: style can be found in dropdown.less -->
                            <li class="dropdown notifications-menu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                </a>

                            </li>
                            <!-- Tasks: style can be found in dropdown.less -->

                            <!-- User Account: style can be found in dropdown.less -->
                            <li class="dropdown user user-menu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <img src="../../Image/logo.png" class="user-image" alt="User Image">
                                    
                                </a>
                                <ul class="dropdown-menu">
                                    <!-- User image -->
                                    <li class="user-header">
                                        <img src="../../Image/logo.png" class="img-circle" alt="User Image">

                                       
                                    </li>

                                    <!-- Menu Footer-->
                                    <li class="user-footer">
                                        <div class="pull-left">
                                            <a href="#" class="btn btn-default btn-flat">Perfil</a>
                                        </div>
                                        <div class="pull-right">
                                            <a href="../../logout.jsp" class="btn btn-default btn-flat">Salir</a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <!-- Control Sidebar Toggle Button -->

                        </ul>
                    </div>
                </nav>
            </header>
                                            
                                            
            <aside class="main-sidebar">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <!-- Sidebar user panel -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="../../Image/logo.png" class="img-circle" alt="User Image">
                        </div>
                        <div class="pull-left info">
                            <p>Los Dulces</p>

                        </div>
                    </div>
                    <!-- search form -->
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Buscar...">
                            <span class="input-group-btn">
                                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                    </form>
                    <!-- /.search form -->
                    <!-- sidebar menu: : style can be found in sidebar.less -->
                    <ul class="sidebar-menu">
                        <li class="header">PRINCIPAL NAVEGACION</li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-users"></i> <span>Clientes</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li class="active"><a href="Dashboard/views/sales.jsp"><i class="fa fa-circle-o"></i> Detalle Clientes</a></li>
                                <li class="active"><a href="Dashboard/views/sales.jsp"><i class="fa fa-circle-o"></i> Detalle Entrega</a></li>
                               
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-truck"></i>
                                <span>Transportes</span>
                                <i class="fa fa-angle-left pull-right"></i>                                                       
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="Dashboard/views/purchase2.jsp"><i class="fa fa-circle-o"></i> Detalle Transportes</a></li>
                                
                            </ul>
                        </li>

                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-building"></i>
                                <span>Oficinas</span>
                                <i class="fa fa-angle-left pull-right"></i>                                                       
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="Dashboard/views/MemberShip.jsp"><i class="fa fa-circle-o"></i> Detalle Oficina</a></li>
                                
                            </ul>
                        </li>
                    </li><li class="treeview">
                    <a href="#">
                        <i class="fa fa-user-plus"></i>
                        <span>Personal</span>
                        <i class="fa fa-angle-left pull-right"></i>                                                       
                        </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="Dashboard/views/Staff.jsp"><i class="fa fa-circle-o"></i>Detalle Personal</a></li>

                    </ul>
                </li>
                
            </ul>



        </section>
        <!-- /.sidebar -->
    </aside>
            
            
            
            
            

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Dashboard
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="../../main.jsp"><i class="fa fa-dashboard"></i>Home</a></li>

                    </ol>
                </section>

        <!-- Main content -->
        <section class="content">
            <main>
            
                <div class="panel panel-primary">
                    <div class="container">
                <h2>Agregar Personal</h2>


                <form class="form-inline" action="DB/InsertStaff.jsp" method="post">
                    <table>
                        <tr> 
                            <td><div class="form-group">
                                    <label for="user_id">Staff Id:</label><br>
                                    <input type="text" class="form-control" id="user_id" name="staff_id" placeholder="Enter Your User Id">
                                </div><br></td>
                            <td><div class="form-group">
                                    <label for="password">Password:</label><br>
                                    <input type="text" class="form-control" id="password" name="password" placeholder="Enter Your Password">
                                </div><br></td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group">
                                    <label for="name">Name: </label><br>
                                    <input type="text" class="form-control" id="name" name="name" placeholder="Enter Your Name">
                                </div><br>
                            </td>
                            <td>
                                <div>
                                    <label for="gender">Gender:</label><br>
                                    <select class="form-control" id="gender" name="gender">
                                        <option>Select</option>
                                        <option>Male</option>
                                        <option>Female</option>
                                    </select><br>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group">
                                    <label for="mobile_no">Mobile No:</label><br>
                                    <input type="text" class="form-control" id="mobile_no" name="mobile_no"  placeholder="Enter Your Mobile No">
                                </div><br>
                            </td>

                            <td>
                                <div class="form-group">
                                    <label for="nid">NID:</label><br>
                                    <input type="text" class="form-control" id="nid" name="nid" placeholder="Enter Your NID">
                                </div><br>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group">
                                    <label for="pre_address">Present Address:</label><br>
                                    <textarea class="form-control" rows="3" id="pre_address" name="pre_address"></textarea>
                                </div><br>
                            </td>
                            <td>
                                <div class="form-group">
                                    <label for="per_address">Permanent Address:</label><br>
                                    <textarea class="form-control" rows="3" id="per_address" name="per_address"></textarea>
                                </div><br>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="category">Category:</label><br>
                                <select class="form-control" id="category" name="category">
                                    <option>Select</option>
                                    <option>Salesman</option>
                                    <option>Manager</option>

                                </select>
                                
                            </td>
                            <td>
                            <div class="form-group">
                                    <label for="">Date</label><br>
                                    <input type="date" class="form-control" id="date" name="date" >
                                </div><br>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="btn">
                                    <button class="btn btn-primary">Submit</button>
                                </div>

                            </td>
                        </tr>


                    </table>
                </form>
            </div>
            </div>
            






                    </main>




   <footer></footer>&nbsp;
                    <br>
                    <br>
                    <br>


        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">

        </div>
        <strong>Copyright &copy; 2016-2017 <a href="">Optimus Prime</a>.</strong> The Group Of Friends
    </footer>

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Create the tabs -->
        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
            <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
            <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
        </ul>

    </aside>
    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
         immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="../../plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.6 -->
<script src="../../bootstrap/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="../../plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="../../plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="../../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="../../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="../../plugins/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="../../plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="../../plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="../../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="../../plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="../../dist/js/app.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="../../dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../../dist/js/demo.js"></script>

