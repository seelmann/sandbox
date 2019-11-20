Conda
=====

Lade den Miniconda3 Installer (Python 3.7, Windows 64-bit) von https://conda.io/en/latest/miniconda.html#windows-installers herunter.

Führe den Installer `Miniconda3-latest-Windows-x86_64.exe` aus und übernehme alle Standardeinstellungen.

Öffne über das Startmenü den `Anaconda Prompt (Miniconda3)`.

Führe `conda list` aus um die erfolgreiche Installation zu überprüfen.

Optional: Erstelle ein conda env.
```
conda create --name ml
conda activate ml
```

Speichere die `requirements.txt` Datei lokal ab.

Installiere die notwendigen Pakete:
```
conda install --file requirements.txt
```

Starte Jupyter:
```
jupyter notebook
```

