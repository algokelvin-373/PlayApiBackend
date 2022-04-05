package main

import (
	"fmt"
	"net/http"
	"encoding/json"
)

type profile struct {
	ID string
	Name string
	Address string
	Description string
}

var data = []profile {
	profile{"1", "AlgoKelvin", "Solo", "Content Software Developer"},
	profile{"2", "Miauauwg", "Jakarta", "Gamers"},
	profile{"3", "Thea Bernice", "Jakarta", "Selebgram"},
}

func profiles(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json")

	if r.Method == "GET" {
		var result, err = json.Marshal(data)
		if err != nil {
			http.Error(w, err.Error(), http.StatusInternalServerError)
			return
		}
		w.Write(result)
		return
	}
	http.Error(w, "", http.StatusBadRequest)
}

func main() {
	http.HandleFunc("/profiles", profiles)

	fmt.Println("starting web server at http://localhost:8002/")
    http.ListenAndServe(":8002", nil)
}