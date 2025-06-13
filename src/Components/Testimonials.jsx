import React from "react";


function Testimonials() {
  const reviews = [
    { name: "Ava", text: "Best coffee in town!" },
    { name: "Liam", text: "Friendly staff and cozy vibes." },
    { name: "Emma", text: "Love the cappuccino here!" }
  ];

  return (
    <section id="testimonials" className="testimonials">
      <h2>What Our Customers Say</h2>
      <div className="testimonial-cards">
        {reviews.map((review, i) => (
          <div key={i} className="testimonial-card">
            <p>“{review.text}”</p>
            <h4>- {review.name}</h4>
          </div>
        ))}
      </div>
    </section>
  );
}

export default Testimonials;
