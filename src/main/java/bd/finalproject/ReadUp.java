package bd.finalproject;

import java.awt.*;
import java.sql.Statement;
import java.net.URI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ReadUp {

    int boardWidth = 700;

    JFrame frame = new JFrame("ReadUp!");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    // --- NUEVO: CardLayout y panel central ---
    CardLayout cardLayout;
    JPanel panelDerecho;

    Color borderButtonEastColor = new Color(204, 153, 0);

    ReadUp() {

        // CONFIGURACIÓN GENERAL DE LA VENTANA
        frame.setSize(boardWidth, boardWidth + 100);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // PANEL SUPERIOR (Texto principal)
        textLabel.setFont(new Font("Monospaced", Font.BOLD, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Bienvenido a ReadUp!");
        textPanel.setBackground(Color.ORANGE);
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
        textPanel.add(textLabel);

        // PANEL BANNER (GIF)
        JPanel bannerPanel = new JPanel(new BorderLayout());
        bannerPanel.setPreferredSize(new Dimension(frame.getWidth(), 100));

        ImageIcon gifIcon = new ImageIcon("//Users/soporte/Desktop/ReadUp/src/img/Read Portico Library GIF.gif");
        Image img = gifIcon.getImage().getScaledInstance(frame.getWidth(), 100, Image.SCALE_DEFAULT);
        gifIcon = new ImageIcon(img);

        JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setHorizontalAlignment(JLabel.CENTER);
        bannerPanel.add(gifLabel, BorderLayout.CENTER);

        // PANEL BOTONES (Horizontal)
        buttonPanel.setLayout(new GridLayout(1, 5, 10, 10)); // 5 botones en una fila
        buttonPanel.setBackground(Color.ORANGE);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Inicializa botones
        setupButtons();

        // PANEL SUPERIOR COMPLETO (Texto + Banner + Botones)
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(textPanel, BorderLayout.NORTH);
        topPanel.add(bannerPanel, BorderLayout.CENTER);
        topPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(topPanel, BorderLayout.NORTH);

        // --- PANEL CENTRAL con CardLayout ---
        cardLayout = new CardLayout();
        panelDerecho = new JPanel(cardLayout);
        panelDerecho.setOpaque(false);

            // PANEL MENÚ 
            JPanel menuPanel = new JPanel();
            menuPanel.setBackground(Color.WHITE);
            menuPanel.setLayout(null); 



            JPanel recuadroGrande = new JPanel();
            recuadroGrande.setBackground(new Color(255, 214, 153));
            recuadroGrande.setBounds(20, 20, 300, 440); // x, y, ancho, alto
            menuPanel.add(recuadroGrande);



            // Imagen para recuadroPeque1
            ImageIcon icon3 = new ImageIcon("/Users/soporte/Desktop/ReadUp/src/img/71sOSrd+JxL._UF894,1000_QL80_.jpg");
            Image img3 = icon3.getImage().getScaledInstance(recuadroGrande.getWidth() - 15, recuadroGrande.getHeight() - 15, Image.SCALE_SMOOTH); // margen de 5px por lado
            icon3 = new ImageIcon(img3);
            JLabel labelImg3 = new JLabel(icon3);
            labelImg3.setHorizontalAlignment(JLabel.CENTER);
            labelImg3.setVerticalAlignment(JLabel.CENTER);
            labelImg3.setCursor(new Cursor(Cursor.HAND_CURSOR));

            // Poner el JLabel en el recuadro y usar BorderLayout para centrar
            recuadroGrande.setLayout(new BorderLayout());
            recuadroGrande.add(labelImg3, BorderLayout.CENTER);



            JLabel titulo = new JLabel("Ve nuestro catálogo!");
            titulo.setForeground(new Color(255, 132, 132));
            titulo.setFont(new Font("Monospaced", Font.BOLD,25));
            titulo.setBounds(345, 40, 300, 30); // x, y, ancho, alto
            menuPanel.add(titulo);

            // Primer libro MENU
            JLabel titulo1 = new JLabel("Habitos Atomicos.");
            titulo1.setFont(new Font("Monospaced", Font.PLAIN, 17));
            titulo1.setBounds(475, 90, 300, 30); // x, y, ancho, alto
            menuPanel.add(titulo1);


            JLabel subtitulo1 = new JLabel("por James Clear");
            subtitulo1.setFont(new Font("Monospaced", Font.PLAIN, 16));
            subtitulo1.setBounds(475, 110, 300, 30); // x, y, ancho, alto
            menuPanel.add(subtitulo1);



            // Segundo libro MENU
            JLabel titulo2 = new JLabel("El dilema de la novia");
            titulo2.setFont(new Font("Monospaced", Font.PLAIN, 17));
            titulo2.setBounds(475, 290, 300, 30); // x, y, ancho, alto
            menuPanel.add(titulo2);

            JLabel subtitulo2 = new JLabel("por Elena Armas");
            subtitulo2.setFont(new Font("Monospaced", Font.PLAIN, 16));
            subtitulo2.setBounds(475, 310, 300, 30); // x, y, ancho, alto
            menuPanel.add(subtitulo2);



            JPanel recuadroPeque1 = new JPanel();
            recuadroPeque1.setBackground(new Color(255, 230, 128));
            recuadroPeque1.setBounds(340, 80, 120, 180);
            menuPanel.add(recuadroPeque1);


            JPanel recuadroPeque2 = new JPanel();
            recuadroPeque2.setBackground(new Color(255, 230, 128));
            recuadroPeque2.setBounds(340, 280, 120, 180);
            menuPanel.add(recuadroPeque2);


            // Imagen para recuadroPeque1
            ImageIcon icon1 = new ImageIcon("/Users/soporte/Desktop/ReadUp/src/img/WhatsApp Image 2025-09-27 at 00.04.01.jpeg");
            Image img1 = icon1.getImage().getScaledInstance(recuadroPeque1.getWidth() - 10, recuadroPeque1.getHeight() - 10, Image.SCALE_SMOOTH); // margen de 5px por lado
            icon1 = new ImageIcon(img1);
            JLabel labelImg1 = new JLabel(icon1);
            labelImg1.setHorizontalAlignment(JLabel.CENTER);
            labelImg1.setVerticalAlignment(JLabel.CENTER);
            labelImg1.setCursor(new Cursor(Cursor.HAND_CURSOR));

            // Poner el JLabel en el recuadro y usar BorderLayout para centrar
            recuadroPeque1.setLayout(new BorderLayout());
            recuadroPeque1.add(labelImg1, BorderLayout.CENTER);

            // Imagen para recuadroPeque2
            ImageIcon icon2 = new ImageIcon("/Users/soporte/Desktop/ReadUp/src/img/WhatsApp Image 2025-09-27 at 00.02.58.jpeg");
            Image img2 = icon2.getImage().getScaledInstance(recuadroPeque2.getWidth() - 10, recuadroPeque2.getHeight() - 10, Image.SCALE_SMOOTH);
            icon2 = new ImageIcon(img2);
            JLabel labelImg2 = new JLabel(icon2);
            labelImg2.setHorizontalAlignment(JLabel.CENTER);
            labelImg2.setVerticalAlignment(JLabel.CENTER);
            labelImg2.setCursor(new Cursor(Cursor.HAND_CURSOR));

            recuadroPeque2.setLayout(new BorderLayout());
            recuadroPeque2.add(labelImg2, BorderLayout.CENTER);


            // Agregar al CardLayout
            panelDerecho.add(menuPanel, "Menú");








            // PANEL LIBROS/TABLAS
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Titulo");
            modeloTabla.addColumn("Autor");
            modeloTabla.addColumn("Año");
            modeloTabla.addColumn("Sinopsis");
            modeloTabla.addColumn("ISBN");

            try (Connection conn = Connection_mysql.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM LIBRO")) {

                while (rs.next()) {
                    modeloTabla.addRow(new Object[] {
                        rs.getInt("ID_Libro"),
                        rs.getString("Titulo_Libro"),
                        rs.getString("Autor_Libro"),
                        rs.getString("Año_Libro"),
                        rs.getString("Sinopsis_Libro"),
                        rs.getInt("ISBN_Libro")
                    });
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


            // Crear JTable no editable
            JTable tablaLibros = new JTable(modeloTabla) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // ninguna celda será editable
                }
            };
            tablaLibros.setFillsViewportHeight(true);
            tablaLibros.setRowHeight(25);
            tablaLibros.setFont(new Font("Monospaced", Font.PLAIN, 13));
            

            // Encabezado sencillo
            tablaLibros.getTableHeader().setBackground(new Color(247, 144, 6)); // naranja
            tablaLibros.getTableHeader().setForeground(Color.WHITE);              // texto blanco
            tablaLibros.getTableHeader().setFont(new Font("Monospaced", Font.BOLD, 20));
            tablaLibros.setCursor(new Cursor(Cursor.HAND_CURSOR));

            // Mostrar líneas de la tabla
            tablaLibros.setShowGrid(true);                  // activa las líneas
            tablaLibros.setGridColor(Color.GRAY);          // color de las líneas


            JScrollPane scrollPane = new JScrollPane(tablaLibros);

            // Panel “Libros”
            JPanel panelLibros = new JPanel(new BorderLayout());
            panelLibros.add(scrollPane, BorderLayout.CENTER);

            // Añadir al CardLayout
            panelDerecho.add(panelLibros, "Libros");
            panelLibros.add(scrollPane, BorderLayout.CENTER);



// PANEL CATÁLOGO

String[][] librosCatalogo = {
    {
        "Hábitos Atómicos", 
        "James Clear", 
        "Guía práctica para formar buenos hábitos y romper los malos.", 
        "https://www.amazon.com.mx/H%C3%A1bitos-At%C3%B3micos-James-Clear/dp/6077476714",
        "/Users/soporte/Desktop/ReadUp/src/img/WhatsApp Image 2025-09-27 at 00.04.01.jpeg"
    },
    {
        "El dilema de la novia", 
        "Elena Armas", 
        "Comedia romántica con un falso compromiso y segundas oportunidades.", 
        "https://www.amazon.com.mx/El-dilema-novia-Elena-Armas-ebook/dp/B0DF53G617/ref=sr_1_1",
        "/Users/soporte/Desktop/ReadUp/src/img/WhatsApp Image 2025-09-27 at 00.02.58.jpeg"
    },
    {
        "Persona Normal",
        "Benito Taibo",
        "Novela sobre la búsqueda de la identidad y el sentido de la vida.",
        "https://www.amazon.com.mx/Persona-normal-Naranja-Benito-Taibo/dp/6070776038/ref=sr_1_1",
        "/Users/soporte/Desktop/ReadUp/src/img/91x65xPu5AL._UF894,1000_QL80_.jpg"
    },
    {
        "Carrie",
        "Stephen King",
        "Historia de una adolescente con poderes telequinéticos.",
        "https://www.amazon.com.mx/Carrie-Stephen-King/dp/6073118457/ref=sr_1_10",
        "/Users/soporte/Desktop/ReadUp/src/img/817ppdg8QPL._UF894,1000_QL80_.jpg"
    },
    {
        "Cronicas Marcianas",
        "Ray Bradbury",
        "Colección de relatos sobre la colonización de Marte.",
        "https://www.amazon.com.mx/Cr%C3%B3nicas-marcianas-Edici%C3%B3n-mexicana-Bradbury-ebook/dp/B07WT6PZRC",
        "/Users/soporte/Desktop/ReadUp/src/img/81w8viYX3gL._UF1000,1000_QL80_.jpg"
    },
    {
        "La razón de estar contigo",
        "W. Bruce Cameron",
        "Novela que explora la relación entre humanos y perros a través de varias vidas.",
        "https://www.amazon.com.mx/raz%C3%B3n-estar-contigo-novela-humanos-ebook/dp/B01MYR3LY8",
        "/Users/soporte/Desktop/ReadUp/src/img/91WGU5BwqjL._UF1000,1000_QL80_.jpg"
    },
    {    
        "Del amor y otros demonios", 
        "Gabriel García Márquez", 
        "Novela que mezcla realismo mágico y crítica social en la época colonial.", 
        "https://www.amazon.com.mx/Del-amor-y-otros-demonios/dp/6070728785",
        "/Users/soporte/Desktop/ReadUp/src/img/719Eiu6iydL._UF894,1000_QL80_.jpg"
    },      
    {
        "Heartstopper",
        "Alice Oseman",
        "Novela gráfica sobre la amistad y el amor entre dos chicos adolescentes.",
        "https://www.amazon.com.mx/Heartstopper-1-Dos-chicos-juntos/dp/8408224220",
        "/Users/soporte/Desktop/ReadUp/src/img/812P2ZowJRL._UF894,1000_QL80_.jpg"
    },

    {
        "1984",
        "George Orwell",
        "Novela distópica sobre un régimen totalitario y la vigilancia masiva.",
        "https://www.amazon.com.mx/1984-George-Orwell/dp/6073116330",
        "/Users/soporte/Desktop/ReadUp/src/img/71sOSrd+JxL._UF894,1000_QL80_.jpg"
    }, 

    {
        "Boulevard",
        "Florencia Bonelli",
        "Él era tormenta, ella sol; juntos crearon algo que solo ellos entendían.",
        "https://www.amazon.com.mx/Boulevard-Libro-Edici%C3%B3n-revisada-autora/dp/8419169188",
        "/Users/soporte/Desktop/ReadUp/src/img/818VNbq81ZL._UF894,1000_QL80_.jpg"
    },

    {
        "El libro de Azrael",
        "Amber V. Nicole",
        "Novela de fantasía oscura sobre un ángel caído y su redención.",
        "https://www.amazon.com.mx/El-libro-Azrael-Dioses-monstruos-ebook/dp/B0CW198G34",
        "/Users/soporte/Desktop/ReadUp/src/img/81s0nV9ljCL._UF1000,1000_QL80_.jpg"
    },

    {
        "A través de mi ventana",
        "Ariana Godoy",
        "Romance juvenil sobre una chica que se enamora de su vecino.",
        "https://www.amazon.com.mx/trav%C3%A9s-mi-ventana-Ariana-Godoy-ebook/dp/B07PRNC2NC",
        "/Users/soporte/Desktop/ReadUp/src/img/81Qx7jBGXPL._UF1000,1000_QL80_.jpg"
    },

    {
    
        "El principito",
        "Antoine de Saint-Exupéry",
        "Fábula filosófica sobre la inocencia y la naturaleza humana.",
        "https://www.amazon.com.mx/El-principito-EDICION-UNICA-COMPLETA/dp/6073803761",
        "/Users/soporte/Desktop/ReadUp/src/img/811kjwhnjcS._UF894,1000_QL80_.jpg"
        
    }, 

    {
        "El monje que vendió su Ferrari",
        "Robin Sharma",
        "Fábula espiritual sobre la búsqueda de la felicidad y el equilibrio.",
        "https://www.amazon.com.mx/El-monje-que-vendio-ferrari/dp/8499087124",
        "/Users/soporte/Desktop/ReadUp/src/img/81KbajSAThL.jpg"
    },

    {
        "Harry Potter y la piedra filosofal",
        "J.K. Rowling",
        "La primera aventura del joven mago en el mundo de la magia.",
        "hhttps://www.amazon.com.mx/Harry-Potter-y-piedra-filosofal/dp/6073193009",
        "/Users/soporte/Desktop/ReadUp/src/img/81dxFCnAp0L._UF894,1000_QL80_.jpg"
    },

    {
        "Indigno de ser humano",
        "Osamu Dazai",
        "Novela semi-autobiográfica sobre la alienación y la desesperación.",
        "https://www.amazon.com.mx/Indigno-ser-humano-Osamu-Dazai/dp/8419035769",
        "/Users/soporte/Desktop/ReadUp/src/img/71rzQUvqJXL._UF894,1000_QL80_.jpg"       
    }


    // Si agregaste 4 libros más, asegúrate de incluirlos aquí
};

JPanel catalogoPanel = new JPanel();

// Definir GridLayout dinámico
int columnas = 4; // número de libros por fila
int filas = (int) Math.ceil(librosCatalogo.length / (double) columnas);
catalogoPanel.setLayout(new GridLayout(filas, columnas, 10, 10));

catalogoPanel.setBackground(Color.WHITE);

JScrollPane scrollCatalogo = new JScrollPane(
    catalogoPanel,
    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
);

// Obtener la barra de desplazamiento vertical
JScrollBar verticalBar = scrollCatalogo.getVerticalScrollBar();

// Cambiar colores usando un UI personalizado
verticalBar.setUI(new javax.swing.plaf.basic.BasicScrollBarUI() {
    @Override
    protected void configureScrollBarColors() {
        this.thumbColor = new Color(25, 168, 80); // color del "thumb"
        this.trackColor = new Color(230, 230, 230); // color del fondo
    }
});

// Opcional: hacer que la barra sea más ancha
verticalBar.setPreferredSize(new Dimension(12, Integer.MAX_VALUE));

// Crear portadas dinámicamente
for (String[] libro : librosCatalogo) {
    String tituloLibro = libro[0];
    String autorLibro = libro[1];
    String sinopsisLibro = libro[2];
    String linkLibro = libro[3];
    String rutaImagen = libro[4];

    // Cargar la portada con escalado
    ImageIcon icon5 = new ImageIcon(rutaImagen);
    Image img5 = icon5.getImage().getScaledInstance(150, 220, Image.SCALE_SMOOTH);
    JLabel portada = new JLabel(new ImageIcon(img5));
    portada.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

    // Evento de clic para mostrar detalle con botón
    portada.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Crear panel para detalle
            JPanel detallePanel = new JPanel(new BorderLayout(10, 10));

            JLabel info = new JLabel("<html><b>" + tituloLibro + "</b><br>"
                                   + "Autor: " + autorLibro + "<br><br>"
                                   + sinopsisLibro + "</html>");
            info.setFont(new Font("Monospaced", Font.PLAIN, 14));

            JButton btnComprar = new JButton("Comprar aquí!");
            btnComprar.addActionListener(e -> {
                try {
                    Desktop.getDesktop().browse(new URI(linkLibro));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            detallePanel.add(info, BorderLayout.CENTER);
            detallePanel.add(btnComprar, BorderLayout.SOUTH);

            JOptionPane.showMessageDialog(null, detallePanel, "Detalle del libro", JOptionPane.INFORMATION_MESSAGE);
        }
    });

    catalogoPanel.add(portada);
}

// Agregar al CardLayout
panelDerecho.add(scrollCatalogo, "Catálogo");


// PANEL SUGERENCIAS
            JPanel panelSugerencias = new JPanel();
            panelSugerencias.setBackground(Color.WHITE);
            panelSugerencias.setLayout(new BorderLayout(10, 10));

            // Texto motivador
            JLabel tituloSugerencias = new JLabel("Nos encanta saber tu opinión!", JLabel.CENTER);
            tituloSugerencias.setFont(new Font("Monospaced", Font.BOLD, 28));
            tituloSugerencias.setForeground(new Color(56, 7, 13));
            panelSugerencias.add(tituloSugerencias, BorderLayout.NORTH);

            // Cuadro de texto (para sugerencias)
            JTextArea areaTexto = new JTextArea("Escribe aquí tus sugerencias y comentarios...");
            areaTexto.setLineWrap(true);
            areaTexto.setWrapStyleWord(true);
            areaTexto.setFont(new Font("Arial", Font.PLAIN, 18));
            JScrollPane scroll = new JScrollPane(areaTexto);
            scroll.setBorder(BorderFactory.createLineBorder(new Color(204, 153, 0), 2, true));
            panelSugerencias.add(scroll, BorderLayout.CENTER);

            // Botón de enviar
            JButton btnEnviar = new JButton("Mandar");
            btnEnviar.setBackground(new Color(0, 168, 107));
            btnEnviar.setForeground(Color.ORANGE);
            btnEnviar.setFont(new Font("Arial", Font.BOLD, 16));
            btnEnviar.setFocusPainted(false);
            btnEnviar.setCursor(new Cursor(Cursor.HAND_CURSOR));

            btnEnviar.addActionListener(e -> {
                String sugerencia = areaTexto.getText().trim();
                if (!sugerencia.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                        "¡Gracias por tu comentario!\n\n",
                        "Sugerencia enviada",
                        JOptionPane.INFORMATION_MESSAGE);
                    areaTexto.setText(""); // limpia después de mandar
                } else {
                    JOptionPane.showMessageDialog(frame,
                        "Por favor escribe algo antes de mandar.",
                        "Campo vacío",
                        JOptionPane.WARNING_MESSAGE);
                }
            });

            JPanel bottomPanel = new JPanel();
            bottomPanel.add(btnEnviar);
            panelSugerencias.add(bottomPanel, BorderLayout.SOUTH);

            // Lo agregas al CardLayout con el nombre "Sugerencias"
            panelDerecho.add(panelSugerencias, "Sugerencias");



            // PANEL AYUDA
        JPanel panelAyuda = new JPanel();
        panelAyuda.setBackground(Color.WHITE); 
        panelAyuda.setLayout(null); // Para ubicar con coordenadas absolutas

        Color ayudaColor = new Color(56, 7, 13); 

        // Etiqueta mensaje (arriba)
        JLabel mensaje = new JLabel("¡Estamos felices de ayudarte!", JLabel.CENTER);
        mensaje.setForeground(ayudaColor);
        mensaje.setBounds(200, 150, 300, 30);
        panelAyuda.add(mensaje);

        // Etiqueta teléfono (debajo)
        JLabel telefono = new JLabel("Llama a Soporte al 33-2053-7345", JLabel.CENTER);
        telefono.setForeground(ayudaColor);
        telefono.setBounds(200, 170, 300, 30);
        panelAyuda.add(telefono);


        // Cargar imagen original
        ImageIcon icon4 = new ImageIcon("/Users/soporte/Desktop/ReadUp/src/img/WhatsApp Image 2025-09-20 at 23.38.23-2.png");

        // Escalar al tamaño del recuadro
        Image img4 = icon4.getImage().getScaledInstance(
                recuadroPeque2.getWidth() - 10, 
                recuadroPeque2.getHeight() - 10, 
                Image.SCALE_SMOOTH
        );
        icon4 = new ImageIcon(img4);

        // Crear JLabel con el icono escalado
        JLabel labelImg4 = new JLabel(icon4);
        labelImg4.setHorizontalAlignment(JLabel.CENTER);
        labelImg4.setVerticalAlignment(JLabel.CENTER);
        labelImg4.setBounds(280, 180, 150, 150); // posición y tamaño del recuadro

        // Agregar al panel
        panelAyuda.add(labelImg4);


                // Agregar al CardLayout
                panelDerecho.add(panelAyuda, "Ayuda");





        frame.add(panelDerecho, BorderLayout.CENTER);

        // PANEL INFERIOR (Footer)
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(Color.GRAY);
        footerPanel.setPreferredSize(new Dimension(frame.getWidth(), 25));

        JLabel footerLabel = new JLabel("©️ 2025 ReadUp");
        footerLabel.setForeground(Color.WHITE);
        footerLabel.setHorizontalAlignment(JLabel.CENTER);

        footerPanel.add(footerLabel);
        frame.add(footerPanel, BorderLayout.SOUTH);

        // Fondo general
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setVisible(true);
    }

    void setupButtons() {
        // Nombres de botones (coinciden con los paneles en CardLayout)
        String[] nombres = {"Menú", "Libros", "Catálogo", "Sugerencias", "Ayuda"};

        // Colores base
        Color originalBackground = Color.WHITE;
        Color originalForeground = Color.ORANGE;
        Color changeBackgroundColor = new Color(0, 168, 107); // verde activo
        Color changeBorderColor = new Color(1, 121, 111); // borde activo

        for (String nombre : nombres) {
            JButton button = new JButton(nombre);
            button.setFont(new Font("Monospaced", Font.BOLD, 18));
            button.setFocusable(false);

            button.setBackground(originalBackground);
            button.setForeground(originalForeground);

            button.setBorder(new LineBorder(borderButtonEastColor, 3, true));
            button.setContentAreaFilled(false);
            button.setOpaque(true);
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));

            button.setPreferredSize(new Dimension(140, 40));

            // --- ACCIÓN: cambia panel central según botón y actualiza colores ---
            button.addActionListener(e -> {
                // 1. Cambiar el panel central
                cardLayout.show(panelDerecho, nombre);

                // 2. Resetear todos los botones a su estado original
                for (Component comp : buttonPanel.getComponents()) {
                    if (comp instanceof JButton) {
                        JButton b = (JButton) comp;
                        b.setBackground(originalBackground);
                        b.setForeground(originalForeground);
                        b.setBorder(new LineBorder(borderButtonEastColor, 3, true));
                    }
                }

                // 3. Marcar este botón como activo
                button.setBackground(changeBackgroundColor);
                button.setForeground(Color.WHITE);
                button.setBorder(new LineBorder(changeBorderColor, 3, true));
            });

            buttonPanel.add(button);
        }
    }
}


