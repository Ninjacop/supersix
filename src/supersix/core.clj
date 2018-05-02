
; Import Swing + Namespace
(ns supersix.core
	(import javax.swing.JFrame)
	(import javax.swing.JPanel)
	(import javax.swing.JButton)
	(import javax.swing.JOptionPane)
	(import java.awt.event.ActionListener)
	(:gen-class))


; Making the Window variables 
(def b1 (JButton. "Click Me!"))
(def panel (doto (JPanel.)
             (.add b1)))
(def frame (doto (JFrame. "supersix - 0.1.0 - APLHA CLIENT")
             (.setSize 200 200)
             (.setContentPane panel)
             (.setVisible true)))

(defn -main
	"documentation goes here"
	[& args]
	(.setContentPane frame panel)
	(.revalidate b1))
