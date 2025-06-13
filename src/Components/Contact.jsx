import React, { useState } from "react";


function Contact() {
  const [form, setForm] = useState({ name: "", email: "", message: "" });
  const [error, setError] = useState("");

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!form.name || !form.email || !form.message) {
      setError("Please fill out all fields.");
      return;
    }
    setError("");
    alert("Message sent!");
    setForm({ name: "", email: "", message: "" });
  };

  return (
    <section id="contact" className="contact">
      <h2>Contact Us</h2>
      <div className="contact-wrapper">
        <form onSubmit={handleSubmit}>
          <input type="text" name="name" placeholder="Your Name" value={form.name} onChange={handleChange} />
          <input type="email" name="email" placeholder="Your Email" value={form.email} onChange={handleChange} />
          <textarea name="message" placeholder="Your Message" value={form.message} onChange={handleChange}></textarea>
          {error && <p className="error">{error}</p>}
          <button type="submit">Send</button>
        </form>
        <div className="contact-info">
          <p>📞 +91 98765 43210</p>
          <p>📧 brewbliss@example.com</p>
          <p>📍 123 Padasalai Street, Coffee City</p>
          <iframe
          src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3888.1327824011605!2d79.1374527!3d12.9633541!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bad476bfc8abd7b%3A0xd4f36af5e1b935dd!2sStrydo%20Technologies%20Pvt%20Ltd%20-%20Vellore!5e0!3m2!1sen!2sin!4v1749742936221!5m2!1sen!2sin"
          width="500"
          height="250"
          style={{ border: 0 }}
          allowFullScreen=""
          loading="lazy"
          title="Strydo Tech"/>
         
        </div>
      </div>
    </section>
  );
}

export default Contact;
          <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3888.1327824011605!2d79.1374527!3d12.9633541!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bad476bfc8abd7b%3A0xd4f36af5e1b935dd!2sStrydo%20Technologies%20Pvt%20Ltd%20-%20Vellore!5e0!3m2!1sen!2sin!4v1749742936221!5m2!1sen!2sin" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
