(ns supersix.core.desktop-launcher
  (:require [supersix.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. supersix-game "supersix" 800 600)
  (Keyboard/enableRepeatEvents true))
