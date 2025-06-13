import React from "react";



import Menu from "./components/Menu";
import Testimonials from "./components/Testimonials";
import Footer from "./Components/Footer";
import About from "./Components/About";
import Hero from "./Components/Hero";
import {BrowserRouter ,Routes,Route}from 'react-router-dom'
import Navbar from "./Components/Navbar";
import Contact from "./Components/Contact";





function App() {
  return (
    // <BrowserRouter>
    //   <Navbar/>
    //   <Routes>
    //     {/* <div className="app"> */}
      
    //       {/* <Route path='/' element={<Navbar />}/> */}
    //       <Route path='/about' element={<About />}/>
    //       <Route path='/menu' element={<Menu />}/>
    //       <Route path='/testimonials' element={<Testimonials />}/>
    //       <Route path='/contact' element={<Contact />}/>
    //       <Route path='/footer' element={ <Footer />}/>
          
    //   {/* </div>   */}
    //   </Routes>
      
    
    // </BrowserRouter>
    <div className="app">
      <Navbar />
      <Hero />
      <About />
      <Menu />
      <Testimonials />
      <Contact />
      <Footer />
    </div>
    
  );
}

export default App;
