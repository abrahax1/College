function hexToHsl(hex) {
  // Convert hex to RGB values
  const r = parseInt(hex.slice(1, 3), 16) / 255;
  const g = parseInt(hex.slice(3, 5), 16) / 255;
  const b = parseInt(hex.slice(5, 7), 16) / 255;

  // Find the minimum and maximum values of the RGB components
  const cMin = Math.min(r, g, b);
  const cMax = Math.max(r, g, b);
  const delta = cMax - cMin;

  // Calculate hue
  let hue = 0;
  if (delta === 0) {
    hue = 0;
  } else if (cMax === r) {
    hue = ((g - b) / delta) % 6;
  } else if (cMax === g) {
    hue = (b - r) / delta + 2;
  } else {
    hue = (r - g) / delta + 4;
  }
  hue = Math.round(hue * 60);

  // Calculate lightness
  const lightness = (cMax + cMin) / 2;

  // Calculate saturation
  let saturation = 0;
  if (delta !== 0) {
    saturation = delta / (1 - Math.abs(2 * lightness - 1));
  }
  saturation = Math.round(saturation * 100);

  return { h: hue, s: saturation, l: Math.round(lightness * 100) };
}

const hexToRGB = (hex) => {
  const r = parseInt(hex.slice(1, 3), 16);
  const g = parseInt(hex.slice(3, 5), 16);
  const b = parseInt(hex.slice(5, 7), 16);

  return { r, g, b };
};

export { hexToHsl, hexToRGB };
