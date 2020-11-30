(ns counter.core
  (:require [reagent.core :as r]
            [reagent.dom :as rd]))

(defn counter [count]
  [:div {:style {:display :flex
                 :flex-direction :row
                 :justify-content :center
                 :background-color "#EFEFEF"}}
   [:label {:style {:margin 5}} @count]
   [:input {:type :button
            :value "Count"
            :on-click #(swap! count inc)
            :style {:margin 5}}]])

(defn mount-root []
  (rd/render [counter (r/atom 0)]
             (js/document.getElementById "app-root")))

