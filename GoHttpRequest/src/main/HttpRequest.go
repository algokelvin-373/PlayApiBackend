package main

import(
	"io/ioutil"
	"log"
	"net/http"
)

func HttpGetRequest() {
	resp, err := http.Get("http://127.0.0.1:8000/api/profile/all")
	if err != nil {
		log.Fatalln(err)
	}

	// Read response body
	body, err := ioutil.ReadAll(resp.Body)
	if err != nil {
		log.Fatalln(err)
	}

	// Convert to string
	sb := string(body)
	log.Printf(sb)
}

func main() {
	HttpGetRequest()
}