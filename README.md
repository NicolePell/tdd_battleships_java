# Design Overview

This game was designed with the SOLID principles of Object-Oriented Design in mind. Anything that has its own responsibilities is represented as a class. Class Responsibility Cards are as follows:

#### Ship
<table>
  <tr>
    <td><b>Responsibilities</b></td>
    <td>
      Know when it has been placed on the board
      <br>Lose a hit point when it gets hit
      <br>Sink when hit points reaches ship size
      <br>Has size which can be defined
    </td>
  </tr>
</table>

#### Cell

<table>
  <tr>
    <td><b>Responsibilities</b></td>
    <td>
      Know what it contains - either 'water' or a Ship object
      <br>Know if it has been fired at
    </td>
  </tr>
  <tr>
    <td><b>Dependencies</b></td>
    <td>None</td>
  </tr>
  <tr>
    <td><b>Subclasses</b></td>
    <td>None</td>
  </tr>
</table>

#### Grid (aka Board)

<table>
  <tr>
    <td><b>Responsibilities</b></td>
    <td>
      Populate itself with hash containing coordinates as keys, and Cells as values
      <br>Retrieve the content at a specified coordinate
    </td>
  </tr>
  <tr>
    <td><b>Dependencies</b></td>
    <td>Cell</td>
  </tr>
  <tr>
    <td><b>Subclasses</b></td>
    <td>None</td>
  </tr>
</table>

#### Player

<table>
  <tr>
    <td><b>Responsibilities</b></td>
    <td>
      Have two boards: own board and a firing board
      <br>Have five ships and place them on the board, vertically or horizontally
      <br>Know when all ships are placed on the board
      <br>Know how many ships are floating
      <br>Keep track of points, which increment when Player successfully hits a ship on the opponent's board
      <br>Choose a coordinate on the firing board to hit, without repeats
    </td>
  </tr>
  <tr>
    <td><b>Dependencies</b></td>
    <td>Grid
      <br>Ship
    </td>
  </tr>
  <tr>
    <td><b>Subclasses</b></td>
    <td>None</td>
  </tr>
</table>

#### Game

<table>
  <tr>
    <td><b>Responsibilities</b></td>
    <td>
      Have two players
      <br>Know when both players are ready to begin, i.e. all ships placed
      <br>Inform a player whether his attack was successful
      <br>End when one player has no floating ships
    </td>
  </tr>
  <tr>
    <td><b>Dependencies</b></td>
    <td>Player
    </td>
  </tr>
  <tr>
    <td><b>Subclasses</b></td>
    <td>None</td>
  </tr>
</table>