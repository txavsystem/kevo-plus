/**
 *  Kevo Unofficial
 *
 *  Copyright 2018 Sam Alston
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "Kevo Plus",
    namespace: "Helvio88",
    author: "Helvio Pedreschi",
    description: "The manager SmartApp for Kevo Plus",
    category: "Safety & Security",
    iconUrl: "https://lh6.ggpht.com/7wQk6c9M1kFkZTkheR0pZpLPsUr1DxMUmPYKbEHwPUatQcmW74LHa4J1GdoW_EDjjwQ=w60",
    iconX2Url: "https://lh6.ggpht.com/7wQk6c9M1kFkZTkheR0pZpLPsUr1DxMUmPYKbEHwPUatQcmW74LHa4J1GdoW_EDjjwQ=w120",
    iconX3Url: "https://lh6.ggpht.com/7wQk6c9M1kFkZTkheR0pZpLPsUr1DxMUmPYKbEHwPUatQcmW74LHa4J1GdoW_EDjjwQ=w180")


preferences {
	section("Title") {
		// TODO: put inputs here
	}
}

def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

// TODO: implement event handlers