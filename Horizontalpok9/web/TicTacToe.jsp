<%-- 
    Document   : newjsp
    Created on : Aug 3, 2018, 2:39:16 PM
    Author     : nam_s
--%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Handlee" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <style>
        body {
           background: linear-gradient(lightpink, violet);
           background-attachment: fixed;
           color : white;
           text-align: center;
           font-family: 'Handlee', cursive;
       }
       #tic-tac-toe {
            cell-spacing: 0px;
            border-spacing: 0px;
            border-collapse: separate;
            margin-top: 30px;
            margin-bottom: 30px;
            margin: 40px auto;
        }

        #tic-tac-toe td {
            border: 3px solid white;
            height: 150px;
            width: 150px;
            text-align: center;
        }

        #tic-tac-toe tr:first-child td { /* First row all columns */
            border-top: none
        }

        #tic-tac-toe tr:last-child td { /* Last row all columns */
            border-bottom: none
        }

        #tic-tac-toe tr td:first-child { /* First column of every row */
            border-left: none;
        }

        #tic-tac-toe tr td:last-child { /* Last column of every row */
            border-right: none;
        }
        
        #scoreboard{
            font-size: 25px;
        }

   </style>
    <title>Tic Tac Toe</title>
  </head>
  <body>
      
      <div class="container">
          <div class="row">
              <div class="col">
                   <div id="placeholder">
                        <table id="tic-tac-toe">
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                        </table>
                       
                       <table id="scoreboard" align="center">
                            <tr>
                              <td> Player 1 </td>
                              <td width="30"> &nbsp; </td>
                              <td> Tie </td>
                              <td width="30"> &nbsp; </td>
                              <td> Player 2 </td>
                            </tr>
                            <tr>
                              <td class="score" id="player1">
                                0 
                              </td>
                              <td> &nbsp; </td>
                              <td class="score" id="player2">
                                0 
                              </td>
                              <td> &nbsp; </td>
                              <td class="score" id="player2">
                                0 
                              </td>
                            </tr>
                      </table>
                </div>
              </div>
          </div>
      </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>
