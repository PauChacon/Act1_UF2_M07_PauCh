# Act1_UF2_M07_PauCh

## Nom Prova | Tipus | Paràmetres Entrada | Resultat Esperat

Usuari vàlid | Unitària | "usuari123" | Vàlid (>= 4 caràcters)

Usuari curt | Unitària | "abc" | Error: "El nom d'usuari ha de tenir més de 3 caràcters"

Telèfon vàlid | Unitària | "612345678" | Vàlid

Telèfon curt | Unitària | "12345" | Error: "Ha de tenir 9 xifres"

Correu correcte | Unitària | "prova@gmail.com" | Vàlid

Correu mal format | Unitària | "prova@gmail" | Error: "Correu invàlid"

Contrasenya segura | Unitària | "Abcd@1234" | Vàlid

Contrasenya feble | Unitària | "abc123" | Error: "Ha de tenir majúscula, símbol, etc."

Contrassenyes coincideixen | Unitària | "Abcd@1234" i "Abcd@1234" | Vàlid

Contrassenyes diferents | Unitària | "Abcd@1234" i "Abcd@4321" | Error: "Les contrasenyes no coincideixen"

Tot correcte (UI) | Integració (Espresso) | Simula omplir tot correctament i clicar "Registrar" | Mostra Toast: "Registre correcte"

Error usuari curt (UI) | Integració (Espresso) | Simula nom curt i clic "Registrar" | Mostra error i marcació en vermell
