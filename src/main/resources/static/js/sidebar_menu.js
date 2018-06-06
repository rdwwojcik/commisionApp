/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Hide submenus
$('#body-row .collapse').collapse('hide'); 

// Collapse/Expand icon
//$('#collapse-icon').addClass('fa-angle-double-left');

// Collapse click
$('[data-toggle=sidebar-colapse]').click(function() {
    SidebarCollapse();
});

function SidebarCollapse () {
    $('.menu-collapsed').toggleClass('d-none');
    $('.sidebar-submenu').toggleClass('d-none');
    $('.submenu-icon').toggleClass('d-none');
    $('#sidebar-container').toggleClass('sidebar-expanded sidebar-collapsed');
    
    // Treating d-flex/d-none on separators with title
    var SeparatorTitle = $('.sidebar-separator-title');
    if ( SeparatorTitle.hasClass('d-flex') ) {
        SeparatorTitle.removeClass('d-flex');
    } else {
        SeparatorTitle.addClass('d-flex');
    }
    
    // Collapse/Expand icon
//    $('#collapse-icon').toggleClass('fa-angle-double-left fa-angle-double-right');
}


//$("#menu-toggle").click(function(e) {
//    e.preventDefault();
//    $("#wrapper").toggleClass("toggled");
//});
// $("#menu-toggle-2").click(function(e) {
//    e.preventDefault();
//    $("#wrapper").toggleClass("toggled-2");
//    $('#menu ul').hide();
//});
//
// function initMenu() {
//  $('#menu ul').hide();
//  $('#menu ul').children('.current').parent().show();
//  //$('#menu ul:first').show();
//  $('#menu li a').click(
//    function() {
//      var checkElement = $(this).next();
//      if((checkElement.is('ul')) && (checkElement.is(':visible'))) {
//        return false;
//        }
//      if((checkElement.is('ul')) && (!checkElement.is(':visible'))) {
//        $('#menu ul:visible').slideUp('normal');
//        checkElement.slideDown('normal');
//        return false;
//        }
//      }
//    );
//  }
//$(document).ready(function() {initMenu();});