import React from "react";


function Menu() {
  const items = [
    { name: "Espresso", desc: "Rich & bold espresso shot.", price: "$3", img: "https://images.pexels.com/photos/685527/pexels-photo-685527.jpeg?auto=compress&cs=tinysrgb&w=600" },
    { name: "Latte", desc: "Smooth milk & espresso blend.", price: "$4", img: "https://images.pexels.com/photos/302897/pexels-photo-302897.jpeg?auto=compress&cs=tinysrgb&w=600" },
    { name: "Cappuccino", desc: "Foamy and flavorful.", price: "$4.5", img: "https://images.pexels.com/photos/533403/pexels-photo-533403.jpeg?auto=compress&cs=tinysrgb&w=600" },
    { name: "Mocha", desc: "Chocolate-infused coffee.", price: "$5", img: "https://images.pexels.com/photos/2299028/pexels-photo-2299028.jpeg?auto=compress&cs=tinysrgb&w=600" }
  ];

  return (
    <section id="menu" className="menu">
      <h2>Our Menu</h2>
      <div className="menu-items">
        {items.map((item, index) => (
          <div key={index} className="menu-card">
            <img src={item.img} alt={item.name} />
            <h3>{item.name}</h3>
            <p>{item.desc}</p>
            <span>{item.price}</span>
          </div>
        ))}
      </div>
    </section>
  );
}

export default Menu;
