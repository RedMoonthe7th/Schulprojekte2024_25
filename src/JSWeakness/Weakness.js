console.log(1 + "1");  // "11" (Zahl wird zu String konkateniert)
console.log(1 - "1");  // 0 (String wird in eine Zahl umgewandelt)
console.log([] + []);  // "" (Leere Arrays werden zu leeren Strings)
//Problem: Unklare Typkonvertierung kann zu schwer auffindbaren Fehlern führen.

let x = "10";
x = x - 2;  // x wird zu 8
x = x + "5"; // Jetzt ist x wieder ein String: "85"
//Problem: JavaScript erlaubt es, Variablen ohne Typ zu deklarieren, was zu unerwarteten Problemen führen kann.

const date = new Date("2023-02-30");
console.log(date); // Invalid Date (kein Fehler, aber falsches Datum)
//Problem: JavaScript hat keine eingebaute Unterstützung für viele grundlegende Funktionen wie Datumshandhabung oder mathematische Berechnungen.