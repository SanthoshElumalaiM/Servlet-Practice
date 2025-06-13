import React from "react";
import { NavLink } from "react-router-dom";


function Navbar() {
  return (
    <nav className="navbar">
      <div className="logo">
        <img src="coffee2.png" alt="coffee" /> 
      </div>
      <ul className="nav-links">
        {/* <NavLink to='/'><li>Home</li>  </NavLink>
        <NavLink to='/about'><li>About</li>  </NavLink>
        <NavLink to='/menu'><li>Menu</li>  </NavLink>
        <NavLink to='/testimonials'><li>Testimonials</li>  </NavLink>
        <NavLink to='/contact'><li>Contact</li>  </NavLink>
        <NavLink to='/footer'><li>Footer</li>  </NavLink>
         */}

         <li><a href="#hero">Home</a></li>
        <li><a href="#about">About</a></li>
        <li><a href="#menu">Menu</a></li>
        <li><a href="#testimonials">Testimonials</a></li>
        <li><a href="#contact">Contact</a></li>
      </ul>
    </nav>
  );
}

export default Navbar;
