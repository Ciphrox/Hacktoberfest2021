import React, { useState } from "react";
import { FaArrowCircleLeft, FaArrowCircleRight } from "react-icons/fa";

const Slider = ({ slides }) => {
  const [current, setCurrent] = useState(0);

  const nextImage = () => {
    setCurrent(current === slides.length - 1 ? 0 : current + 1);
  };

  const prevImage = () => {
    setCurrent(current === 0 ? slides.length - 1 : current - 1);
  };

  return (
    <section className="slider">
      <FaArrowCircleLeft className="left-arrow" onClick={prevImage} />
      <FaArrowCircleRight className="right-arrow" onClick={nextImage} />
      {slides.map((img, index) => {
        return (
          <div
            className={index === current ? "slide active" : "slide"}
            key={index}
          >
            {index === current && (
              <img
                src={img.imageSrc}
                alt={`mclaren-${index}`}
                className="image"
              />
            )}
          </div>
        );
      })}
    </section>
  );
};

export default Slider;
