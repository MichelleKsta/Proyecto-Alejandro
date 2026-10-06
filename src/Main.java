<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Surco — Discos, Café y Ruido del Bueno</title>

  <style>
    * {
box-sizing: border-box;
margin: 0;
padding: 0;
        }

        :root {
    --fondo: #f3ecdc;
    --negro: #1b1a18;
    --rojo: #df3b29;
    --verde: #315f56;
    --amarillo: #e7aa22;
    --azul: #365781;
    --borde: #1b1a18;
    --max: 1200px;
}

html {
    scroll-behavior: smooth;
}

body {
    font-family: Arial, Helvetica, sans-serif;
    background: var(--fondo);
    color: var(--negro);
    line-height: 1.4;
}

a {
    color: inherit;
    text-decoration: none;
}

button,
        a.boton {
    font: inherit;
}

/* ---------- HEADER ---------- */

header {
    background: var(--fondo);
    border-bottom: 1px solid var(--borde);
}

    .nav {
    width: min(100% - 108px, var(--max));
    min-height: 86px;
    margin: auto;
    display: flex;
    align-items: center;
    justify-content: space-between;
    gap: 30px;
}

    .logo {
    font-size: 38px;
    font-weight: 900;
    letter-spacing: -3px;
}

    .logo span {
color: var(--rojo);
    }

            .menu {
    display: flex;
    align-items: center;
    gap: 28px;
    list-style: none;
    font-size: 13px;
    font-weight: 800;
    text-transform: uppercase;
}

    .menu a {
position: relative;
padding: 10px 0;
        }

        .menu a:hover::after,
        .menu a.activo::after {
    content: "";
    position: absolute;
    height: 3px;
    left: 0;
    right: 0;
    bottom: 0;
    background: var(--rojo);
}

    .barra {
    background: var(--negro);
    color: white;
    text-align: center;
    padding: 10px 20px;
    font-size: 12px;
    font-weight: 800;
    letter-spacing: 3px;
    text-transform: uppercase;
}

/* ---------- GENERAL ---------- */

    .contenedor {
    width: min(100% - 108px, var(--max));
    margin: auto;
}

section {
    border-bottom: 1px solid var(--borde);
}

    .titulo-seccion {
    font-size: clamp(34px, 4vw, 52px);
    line-height: .95;
    text-transform: uppercase;
    font-weight: 950;
    letter-spacing: -2px;
}

    .subtitulo {
    margin-top: 8px;
    font-size: 13px;
    font-weight: 700;
}

    .boton {
    display: inline-block;
    border: 2px solid var(--negro);
    padding: 14px 22px;
    font-size: 12px;
    font-weight: 900;
    text-transform: uppercase;
    transition: .2s ease;
}

    .boton:hover {
    background: var(--negro);
    color: white;
}

    .boton.oscuro {
    background: var(--negro);
    color: white;
}

    .boton.oscuro:hover {
    background: transparent;
    color: var(--negro);
}

/* ---------- HERO ---------- */

    .hero {
    min-height: 610px;
    display: grid;
    grid-template-columns: 1fr 1fr;
    align-items: center;
    gap: 70px;
    padding: 70px 0;
}

    .etiqueta {
    color: var(--rojo);
    font-size: 12px;
    font-weight: 900;
    letter-spacing: 3px;
    text-transform: uppercase;
    margin-bottom: 14px;
}

    .hero h1 {
font-size: clamp(55px, 6vw, 92px);
line-height: .88;
letter-spacing: -5px;
text-transform: uppercase;
font-weight: 950;
max-width: 620px;
    }

            .hero h1 .rojo {
    color: var(--rojo);
}

    .hero-texto {
    max-width: 580px;
    margin-top: 30px;
    font-size: 17px;
    font-weight: 700;
}

    .hero-botones {
    display: flex;
    gap: 14px;
    flex-wrap: wrap;
    margin-top: 28px;
}

/* Disco + portada */

    .vinilo-grande {
    position: relative;
    width: min(100%, 560px);
    aspect-ratio: 1 / 1;
    margin: auto;
}

    .disco {
    position: absolute;
    width: 73%;
    aspect-ratio: 1;
    right: 0;
    top: 11%;
    border-radius: 50%;
    background:
    radial-gradient(circle at center, var(--rojo) 0 8%, transparent 8.5%),
    radial-gradient(circle at center, #181715 0 13%, transparent 13.5%),
    repeating-radial-gradient(circle at center, #151412 0 2px, #23211f 3px 5px);
    border: 3px solid #111;
    box-shadow: 4px 5px 0 #111;
}

    .portada {
    position: absolute;
    z-index: 2;
    width: 67%;
    aspect-ratio: 1;
    left: 2%;
    top: 8%;
    background: var(--rojo);
    border: 2px solid var(--negro);
    padding: 28px;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    box-shadow: 5px 5px 0 var(--negro);
}

    .portada h2 {
color: white;
font-size: clamp(28px, 3vw, 42px);
line-height: .9;
text-transform: uppercase;
font-weight: 950;
        }

        .circulo-portada {
    position: absolute;
    width: 34%;
    aspect-ratio: 1;
    border-radius: 50%;
    background: #e36355;
    right: 7%;
    bottom: 8%;
}

    .portada small {
color: white;
font-size: 10px;
font-weight: 800;
z-index: 2;
        }

        /* ---------- DISCOS ---------- */

        .discos {
    padding: 70px 0 100px;
}

    .cabecera-lista {
    display: flex;
    align-items: end;
    justify-content: space-between;
    gap: 30px;
    margin-bottom: 42px;
}

    .enlace {
    font-size: 13px;
    font-weight: 900;
    text-decoration: underline;
}

    .productos {
    display: grid;
    grid-template-columns: repeat(4, 1fr);
    gap: 30px;
}

    .producto {
    min-width: 0;
}

    .caratula {
    width: 100%;
    aspect-ratio: 1;
    border: 2px solid var(--negro);
    position: relative;
    overflow: hidden;
    padding: 18px;
}

    .caratula.roja {
    background: var(--rojo);
    color: white;
}

    .caratula.verde {
    background: var(--verde);
    color: white;
}

    .caratula.amarilla {
    background: var(--amarillo);
    color: var(--negro);
}

    .caratula.azul {
    background: var(--azul);
    color: white;
}

    .caratula h3 {
position: relative;
z-index: 2;
font-size: 23px;
line-height: .95;
text-transform: uppercase;
font-weight: 950;
        }

        .caratula small {
position: absolute;
z-index: 2;
left: 18px;
bottom: 15px;
font-size: 9px;
font-weight: 900;
        }

        .forma {
    position: absolute;
    width: 48%;
    aspect-ratio: 1;
    right: -5%;
    bottom: -5%;
    border-radius: 50%;
    background: rgba(255,255,255,.2);
}

    .producto-info {
    padding-top: 10px;
    display: grid;
    grid-template-columns: 1fr auto;
    gap: 5px 10px;
    font-size: 13px;
}

    .producto-info strong {
font-weight: 900;
        }

        .producto-info span {
grid-column: 1 / -1;
color: #555;
font-size: 12px;
    }

            /* ---------- CAFÉ ---------- */

            .cafe {
    padding: 70px 0;
}

    .cafe-grid {
    border: 2px solid var(--negro);
    display: grid;
    grid-template-columns: 1fr 1fr;
}

    .cafe-promo {
    background: var(--negro);
    color: white;
    padding: 70px 52px;
}

    .cafe-promo .etiqueta {
    margin-bottom: 15px;
}

    .cafe-promo h2 {
max-width: 470px;
font-size: clamp(36px, 4vw, 56px);
line-height: .9;
text-transform: uppercase;
    }

            .cafe-promo p {
max-width: 450px;
margin: 25px 0;
font-size: 14px;
font-weight: 600;
        }

        .cafe-promo .boton {
    border-color: white;
}

    .cafe-promo .boton:hover {
    background: white;
    color: var(--negro);
}

    .carta {
    padding: 70px 52px;
}

    .carta h2 {
font-size: 35px;
text-transform: uppercase;
margin-bottom: 25px;
    }

            .item-carta {
    display: flex;
    justify-content: space-between;
    gap: 20px;
    padding: 12px 0;
    border-bottom: 1px dotted #777;
    font-size: 13px;
    font-weight: 700;
}

/* ---------- AGENDA ---------- */

    .agenda {
    padding: 70px 0;
}

    .evento {
    display: grid;
    grid-template-columns: 90px 1fr 110px;
    align-items: center;
    gap: 20px;
    border-top: 1px solid var(--negro);
    padding: 24px 0;
}

    .evento:last-child {
    border-bottom: 1px solid var(--negro);
}

    .fecha strong {
display: block;
font-size: 42px;
line-height: .8;
        }

        .fecha small {
font-size: 13px;
font-weight: 900;
text-transform: uppercase;
    }

            .evento h3 {
font-size: 24px;
text-transform: uppercase;
line-height: 1;
        }

        .evento p {
font-size: 12px;
font-weight: 700;
color: #555;
margin-top: 5px;
    }

            .evento .boton {
    padding: 12px 14px;
    text-align: center;
}

/* ---------- FOOTER ---------- */

footer {
    background: var(--negro);
    color: white;
    padding: 65px 0 25px;
}

    .footer-grid {
    display: grid;
    grid-template-columns: 1.5fr 1fr 1fr 1fr;
    gap: 45px;
}

    .footer-logo {
    font-size: 45px;
    font-weight: 950;
    letter-spacing: -3px;
}

    .footer-logo span {
color: var(--rojo);
    }

            .footer-col p {
color: #ddd;
font-size: 12px;
font-weight: 700;
margin-top: 15px;
    }

            .footer-col h3 {
color: #dba827;
font-size: 11px;
letter-spacing: 3px;
text-transform: uppercase;
margin-bottom: 16px;
    }

            .footer-col a {
display: block;
font-size: 12px;
font-weight: 700;
margin: 9px 0;
        }

        .copyright {
    border-top: 1px solid #555;
    margin-top: 45px;
    padding-top: 18px;
    display: flex;
    justify-content: space-between;
    gap: 20px;
    font-size: 10px;
    color: #ccc;
}

/* ---------- TABLET ---------- */

@media (max-width: 900px) {
        .nav,
        .contenedor {
    width: min(100% - 40px, var(--max));
}

      .nav {
    min-height: 75px;
}

      .menu {
    gap: 15px;
    font-size: 11px;
}

      .hero {
    gap: 30px;
    min-height: 520px;
}

      .hero h1 {
font-size: clamp(48px, 7vw, 72px);
      }

              .productos {
    grid-template-columns: repeat(2, 1fr);
}

      .footer-grid {
    grid-template-columns: repeat(2, 1fr);
}
    }

/* ---------- CELULAR ---------- */

@media (max-width: 600px) {
        .nav,
        .contenedor {
    width: calc(100% - 20px);
}

      .nav {
    min-height: auto;
    padding: 18px 0;
    align-items: flex-start;
    flex-direction: column;
    gap: 15px;
}

      .logo {
    font-size: 30px;
}

      .menu {
    width: 100%;
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 8px 12px;
    font-size: 9px;
}

      .menu a {
padding: 5px 0;
        }

        .barra {
    font-size: 8px;
    letter-spacing: 1.5px;
    padding: 8px 5px;
}

      .hero {
    min-height: auto;
    grid-template-columns: 1fr;
    gap: 35px;
    padding: 45px 0 55px;
}

      .hero h1 {
font-size: clamp(48px, 14vw, 68px);
letter-spacing: -3px;
      }

              .hero-texto {
    font-size: 14px;
    margin-top: 22px;
}

      .hero-botones {
    margin-top: 20px;
    gap: 8px;
}

      .boton {
    padding: 11px 14px;
    font-size: 9px;
}

      .vinilo-grande {
    width: 92%;
}

      .portada {
    padding: 18px;
}

      .portada h2 {
font-size: 26px;
      }

              .discos {
    padding: 45px 0 55px;
}

      .cabecera-lista {
    align-items: flex-start;
    flex-direction: column;
    gap: 8px;
    margin-bottom: 25px;
}

      .titulo-seccion {
    font-size: 37px;
}

      .productos {
    grid-template-columns: repeat(2, 1fr);
    gap: 20px 10px;
}

      .caratula {
    padding: 10px;
}

      .caratula h3 {
font-size: 17px;
      }

              .caratula small {
left: 10px;
bottom: 9px;
font-size: 7px;
      }

              .producto-info {
    font-size: 10px;
}

      .producto-info span {
font-size: 9px;
      }

              .cafe {
    padding: 45px 0;
}

      .cafe-grid {
    grid-template-columns: 1fr;
}

      .cafe-promo,
        .carta {
    padding: 35px 20px;
}

      .cafe-promo h2 {
font-size: 34px;
      }

              .carta h2 {
font-size: 29px;
      }

              .item-carta {
    font-size: 11px;
}

      .agenda {
    padding: 45px 0;
}

      .evento {
    grid-template-columns: 50px 1fr;
    gap: 12px;
    padding: 18px 0;
}

      .fecha strong {
font-size: 29px;
      }

              .fecha small {
font-size: 9px;
      }

              .evento h3 {
font-size: 17px;
      }

              .evento p {
font-size: 9px;
      }

              .evento .boton {
    grid-column: 2;
    justify-self: start;
}

footer {
    padding: 45px 0 20px;
}

      .footer-grid {
    grid-template-columns: 1fr 1fr;
    gap: 30px 15px;
}

      .footer-grid .footer-col:first-child {
    grid-column: 1 / -1;
}

      .footer-logo {
    font-size: 38px;
}

      .copyright {
    flex-direction: column;
    font-size: 9px;
}
    }
  </style>
</head>

<body>

  <header>
    <nav class="nav">
      <a href="#" class="logo">SURCO<span>.</span></a>

      <ul class="menu">
        <li><a href="#" class="activo">Inicio</a></li>
        <li><a href="#catalogo">Catálogo</a></li>
        <li><a href="#disco-mes">Disco del mes</a></li>
        <li><a href="#agenda">Agenda</a></li>
        <li><a href="#nosotros">Nosotros</a></li>
        <li><a href="#contacto">Contacto</a></li>
      </ul>
    </nav>

    <div class="barra">
Discos nuevos y usados · Café de origen · Música en vivo cada viernes
        </div>
  </header>

  <main>

    <section class="hero">
      <div class="contenedor" style="display: contents;">
        <div>
          <div class="etiqueta">Armenia · Quindío · Desde 2014</div>

          <h1>
Discos, café<br>
y <span class="rojo">ruido</span> del<br>
        bueno
          </h1>

          <p class="hero-texto">
Una tienda pequeña con muchos vinilos. Ven, busca entre las cajas,
pide un tinto y escucha antes de comprar.
          </p>

          <div class="hero-botones">
            <a href="#catalogo" class="boton oscuro">Ver catálogo</a>
            <a href="#agenda" class="boton">Agenda de la semana</a>
          </div>
        </div>

        <div class="vinilo-grande" aria-label="Portada de disco">
          <div class="disco"></div>
          <div class="portada">
<h2>Los cafeteros<br>del ruido</h2>
            <div class="circulo-portada"></div>
<small>TINTO DOBLE · 2026</small>
          </div>
        </div>
      </div>
    </section>

    <section class="discos" id="catalogo">
      <div class="contenedor">
        <div class="cabecera-lista">
          <div>
            <h2 class="titulo-seccion">Recién llegados</h2>
          </div>
          <a href="#" class="enlace">Ver todo el catálogo →</a>
        </div>

        <div class="productos">

          <article class="producto">
            <div class="caratula roja">
<h3>Los cafeteros<br>del ruido</h3>
              <div class="forma"></div>
<small>TINTO DOBLE</small>
            </div>
            <div class="producto-info">
<strong>Tinto doble</strong>
              <strong>$120.000</strong>
<span>Los Cafeteros del Ruido</span>
            </div>
          </article>

          <article class="producto">
            <div class="caratula verde">
<h3>Marimba norte</h3>
              <div class="forma"></div>
<small>PACÍFICO ELÉCTRICO</small>
            </div>
            <div class="producto-info">
<strong>Pacífico eléctrico</strong>
              <strong>$135.000</strong>
<span>Marimba Norte</span>
            </div>
          </article>

          <article class="producto">
            <div class="caratula amarilla">
<h3>La bandola<br>rota</h3>
              <div class="forma"></div>
<small>ANDINA NOCTURNA</small>
            </div>
            <div class="producto-info">
<strong>Andina nocturna</strong>
              <strong>$98.000</strong>
<span>La Bandola Rota</span>
            </div>
          </article>

          <article class="producto">
            <div class="caratula azul">
              <h3>Neblina</h3>
              <div class="forma"></div>
<small>SALENTO S.A.M.</small>
            </div>
            <div class="producto-info">
              <strong>Salento 5 a.m.</strong>
              <strong>$110.000</strong>
              <span>Neblina</span>
            </div>
          </article>

        </div>
      </div>
    </section>

    <section class="cafe" id="disco-mes">
      <div class="contenedor">
        <div class="cafe-grid">

          <div class="cafe-promo">
            <div class="etiqueta">También somos café</div>
<h2>Escucha un disco con un tinto en la mano</h2>
            <p>
Tenemos tocadiscos en cada mesa. Escoge un vinilo,
pídele al barista y ponlo tú mismo.
            </p>
            <a href="#contacto" class="boton">Conoce el lugar</a>
          </div>

          <div class="carta">
<h2>La carta</h2>

            <div class="item-carta">
<span>Tinto campesino</span>
              <strong>$3.000</strong>
            </div>

            <div class="item-carta">
<span>Filtrado V60</span>
              <strong>$8.000</strong>
            </div>

            <div class="item-carta">
              <span>Capuchino</span>
              <strong>$7.000</strong>
            </div>

            <div class="item-carta">
<span>Aromática de la casa</span>
              <strong>$4.000</strong>
            </div>

            <div class="item-carta">
              <span>Pandebono</span>
              <strong>$3.500</strong>
            </div>
          </div>

        </div>
      </div>
    </section>

    <section class="agenda" id="agenda">
      <div class="contenedor">
        <div class="cabecera-lista">
          <div>
            <h2 class="titulo-seccion">Esta semana suena</h2>
          </div>
          <a href="#" class="enlace">Ver agenda completa →</a>
        </div>

        <article class="evento">
          <div class="fecha">
            <strong>03</strong>
            <small>Oct</small>
          </div>
          <div>
<h3>Marimba Norte en vivo</h3>
            <p>Viernes · 7:00 p.m. · Entrada libre con consumo</p>
          </div>
          <a href="#" class="boton">Detalles</a>
        </article>

        <article class="evento">
          <div class="fecha">
            <strong>05</strong>
            <small>Oct</small>
          </div>
          <div>
<h3>Feria de discos usados</h3>
            <p>Domingo · 10:00 a.m. · Trae tus vinilos para cambiar</p>
          </div>
          <a href="#" class="boton">Detalles</a>
        </article>
      </div>
    </section>

  </main>

  <footer id="contacto">
    <div class="contenedor">

      <div class="footer-grid">

        <div class="footer-col" id="nosotros">
          <div class="footer-logo">SURCO<span>.</span></div>
          <p>
Discos y café desde 2014.<br>
Carrera 14 #18-32, Armenia, Quindío.
          </p>
        </div>

        <div class="footer-col">
          <h3>Tienda</h3>
          <a href="#catalogo">Catálogo</a>
          <a href="#disco-mes">Disco del mes</a>
          <a href="#agenda">Agenda</a>
        </div>

        <div class="footer-col">
          <h3>Surco</h3>
          <a href="#nosotros">Nosotros</a>
          <a href="#contacto">Contacto</a>
        </div>

        <div class="footer-col">
          <h3>Redes</h3>
          <a href="#">Instagram</a>
          <a href="#">Spotify</a>
          <a href="#">WhatsApp</a>
        </div>

      </div>

      <div class="copyright">
        <span>© 2026 Surco Discos & Café</span>
<span>Proyecto de práctica · ADSO SENA</span>
      </div>

    </div>
  </footer>

</body>
</html>