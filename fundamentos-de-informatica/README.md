# Repaint/Reflow/DOM Tree
## Renderizando uma página Web

***Gabriel Corrêa - Front-End Developer***


## TÓPICOS:

+ HTML 		- HyperText Markup Languange
+ CSS 		- Cascading Style Sheets
+ DOM 		- Document Object Model
+ CSSOM 	- CSS Object Model
+ DOM Tree	- DOM + CSSOM
+ Repaint	- Processo Repaint
+ Reflow	- Processo Reflow

## Biografia básica sobre os tópicos que irei abordar.


+ HTML
 + **HyperText Markup Language (HTML)** é a linguagem principal de quase todo o conteúdo da web. A maioria do que você vê na tela de seu navegador está descrita,fundamentalmente, usando HTML. Mais precisamente, o HTML é a linguagem que descreve a estrutura e o conteúdo semântico de um documento da Web. O conteúdo em uma página da Web é marcado com elementos HTML.

+ CSS
 + **Cascading Style Sheets (CSS)** é a linguagem de estilo usada para descrever a apresentação de um documento escrito em HTML. CSS é uma das linguagens núcleo da open web e tem sido padronizado pela Especificações da W3C. Desenvolvido em níveis, o CSS1 está obsoleto, já o CSS2.1 é uma recomendação e o CSS3, dividido em pequenos módulos, está agora progredindo para a sua padronização.

+ DOM
 + **Document Object Model (DOM)** é uma interface de programação para documentos HTML, XML e SVG. Ele fornece uma representação estruturada do documento (a árvore) e define uma forma que a estrutura pode ser acessado a partir de programas para que eles possam alterar o documento estrutura, estilo e conteúdo.

+ CSSOM
 + **CSS Object Model** é um conjunto de APIs que permitem manipular CSS a partir do JavaScript. É como se fosse o DOM do HTML , mas para CSS. Ela permite ler e modificar o estilo CSS dinamicamente.

+ DOM Tree
 + **DOM Tree** é a árvore que tem apenas os elementos para criar a renderização, é básicamente a última árvore apenas com os nodos que importam para a tela.

+ Reflow
 + **Reflow** é o resultado de um evento que desencadeia mudanças no jeito que a pagina deve ser renderizada, tomando tempo para cálculo e reposicionamento de elementos.

+ Repaint
 + **Repaint** é uma ação que faça alteração de propriedades de background sem alterar dimensões ou outras propriedades do elemento não causam o reflow, apenas o repaint, que seria a atualização da propriedade de cor ou da imagem .Literalmente pintar novamente o elemento. Repaints gastam menos CPU que Reflows.