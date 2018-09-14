package AD_6;

public class Baum<T extends Comparable<T>>
{
	
	private Knoten<T> wurzel;

	// Wird nur für grafische Oberfläche benötigt, ohne
	// diese Methode könnte die gesamte Implementierung
	// des Baumes geheim gehalten werden. Alle öffentlichen
	// Methoden sind parameterlos oder besitzen als
	// einzigen Parameter einen Schlüsselwert
	public Knoten<T> getWurzel()
	{
		return wurzel;
	}

	public boolean istLeer()
	{
		return (wurzel == null);
	}

	public void attach(Knoten<T> einKnoten)
	{
		wurzel = einKnoten;
	}


// Methoden zum Suchen

	public boolean suchen(final T daten)
	{
		return istLeer() ? false : suchenKnoten(daten, wurzel);
		// Effiziente Kurzform für:
		// if (istLeer()) { return false; } else { return suchenKnoten(daten, wurzel); }
	}

	private boolean suchenKnoten(final T daten, Knoten<T> teilbaum)
	{
		if (teilbaum == null)
			return false;

		// Vergleichs-Ergebnis zwischenspeichern, da compareTo()
		// aufwändig sein kann, und das Ergebnis mehrfach benötigt
		// wird
		final int cmp = daten.compareTo(teilbaum.getDaten());

		return (cmp == 0) ? true : suchenKnoten(daten, (cmp < 0) ? teilbaum.getKnotenLinks() : teilbaum.getKnotenRechts());
		// Effiziente Kurzform für:
		// if (cmp == 0) { return true; }
		//   else if (cmp < 0) { return suchenKnoten(daten, teilbaum.getKnotenLinks()); }
		//     else { return suchenKnoten(daten, teilbaum.getKnotenRechts()); }
	}


// Methoden zum Einfügen

	public void einfuegen(final T daten)
	{
		if (istLeer())
		{
			// Sonderfall, analog zu verketteten Listen
			wurzel = new Knoten<T>(daten, null, null);
		}
		else
		{
			einfuegenKnoten(daten, wurzel);
		}
	}

	// Generiert einen neuen Knoten mit übergebenen Daten und fügt
	// ihn (die Suchbaumeigenschaft erhaltend) als Blatt in den
	// Baum ein, sofern die Daten noch nicht vorhanden sind.
	private void einfuegenKnoten(final T daten, Knoten<T> teilbaum)
	{
		// Vergleichs-Ergebnis zwischenspeichern, da compareTo()
		// aufwändig sein kann, und das Ergebnis mehrfach benötigt
		// wird
		final int cmp = daten.compareTo(teilbaum.getDaten());

		// Daten schon vorhanden?
		// Falls ja: alles erledigt!
		if (cmp == 0)
			return;

		if (cmp < 0)
		{
			// Einzufügende Daten sind KLEINER als Daten im aktuellen Knoten
			// und müssen daher im LINKEN Teilbaum eingefügt werden
			if (teilbaum.getKnotenLinks() == null)
			{
				// Es gibt keinen linken Teilbaum -> neuen Knoten erzeugen
				teilbaum.setKnotenLinks(new Knoten<T>(daten, null, null));
			}
			else
			{
				// Es existiert ein linker Teilbaum -> rekursiv weiter
				einfuegenKnoten(daten, teilbaum.getKnotenLinks());
			}
		}
		else
		{
			// Einzufügende Daten sind GROESSER als Daten im aktuellen Knoten
			// und müssen daher im RECHTEN Teilbaum eingefügt werden
			if (teilbaum.getKnotenRechts() == null)
			{
				// Es gibt keinen rechten Teilbaum -> neuen Knoten erzeugen
				teilbaum.setKnotenRechts(new Knoten<T>(daten, null, null));
			}
			else
			{
				// Es existiert ein rechter Teilbaum -> rekursiv weiter
				einfuegenKnoten(daten, teilbaum.getKnotenRechts());
			}
		}
	}


// Methoden zum Entfernen

	public void entfernen(final T daten)
	{
		// Leerer Baum?
		// Falls ja, gibt es nicht zu entfernen!
		if (istLeer())
			return;

		// Vergleichs-Ergebnis zwischenspeichern, da compareTo()
		// aufwändig sein kann, und das Ergebnis mehrfach benötigt
		// wird
		final int cmp = daten.compareTo(wurzel.getDaten());

		if (cmp == 0)
		{
			// Der Wurzel-Knoten muss entfernt werden!
			// Sonderfall, analog zu verketteten Listen
			entfernenWurzel();
		}
		else
			if (cmp < 0)
			{
				// Zu löschende Daten kleiner als Daten in Wurzel;
				// im linken Teilbaum weitersuchen falls existent
				if (wurzel.getKnotenLinks() != null)
					entfernenKnoten(daten, wurzel, wurzel.getKnotenLinks(), true);
			}
			else
			{
				// Zu löschende Daten größer als Daten in Wurzel;
				// im rechten Teilbaum weitersuchen falls existent
				if (wurzel.getKnotenRechts() != null)
					entfernenKnoten(daten, wurzel, wurzel.getKnotenRechts(), false);
			}
	}

	private void entfernenWurzel()
	{
		if (wurzel.getKnotenLinks() == null)
		{
			// Wurzel hat höchstens einen rechten Nachfolger.
			// Der wird zur neuen Wurzel!
			wurzel = wurzel.getKnotenRechts();
		}
		else
			if (wurzel.getKnotenRechts() == null)
			{
				// Wurzel hat höchstens einen linken Nachfolger.
				// Der wird zur neuen Wurzel!
				wurzel = wurzel.getKnotenLinks();
			}
			else
			{
				// Rechter und linker Teilbaum nicht leer; zwei Nachfolger.
				// Wurzel durch größten Knoten im linken Teilbaum ersetzen!
				ersetzeKnoten(wurzel);
			}
	}

	// Sofern übergebene Daten im Teilbaum vorhanden sind, werden sie gelöscht.
	// Elternknoten wird benötigt, da dessen rechter bzw. linker Nachfolger ggf. auf
	// den rechten bzw. linken Nachfolger des zu löschenden Knotens umgesetzt werden muss
	// Ist linkerTeilbaum == true, wurde der linke Nachfolger des Elternknotens übergeben,
	// sonst der rechte. Wird benötigt, um zu entscheiden, ob der linke oder rechte
	// Nachfolger des Elternknotens geändert werden muss.
	private void entfernenKnoten(final T daten, Knoten<T> elternknoten, Knoten<T> teilbaum, final boolean linkerTeilbaum)
	{
		// Vergleichs-Ergebnis zwischenspeichern, da compareTo()
		// aufwändig sein kann, und das Ergebnis mehrfach benötigt
		// wird
		final int cmp = daten.compareTo(teilbaum.getDaten());

		if (cmp == 0)
		{
			// Der Knoten mit den zu löschenden Daten wurde gefunden
			if (teilbaum.getKnotenLinks() == null)
			{
				// Zu löschender Knoten hat höchstens einen rechten Nachfolger.
				// Auf diesen vom Elternknoten aus verweisen!
				if (linkerTeilbaum)
				{
					elternknoten.setKnotenLinks(teilbaum.getKnotenRechts());
				}
				else
				{
					elternknoten.setKnotenRechts(teilbaum.getKnotenRechts());
				}
			}
			else
				if (teilbaum.getKnotenRechts() == null)
				{
					// Zu löschender Knoten hat höchstens einen linken Nachfolger.
					// Auf diesen vom Elternknoten aus verweisen!
					if (linkerTeilbaum)
					{
						elternknoten.setKnotenLinks(teilbaum.getKnotenLinks());
					}
					else
					{
						elternknoten.setKnotenRechts(teilbaum.getKnotenLinks());
					}
				}
				else
				{
					// Rechter und linker Teilbaum nicht leer; zwei Nachfolger!
					// Zu löschenden Knoten durch größten Knoten im linken Teilbaum ersetzten
					ersetzeKnoten(teilbaum);
				}
		}
		else
			if (cmp < 0)
			{
				// Zu löschende Daten kleiner als Daten im aktuellen Knoten;
				// im linken Teilbaum weitersuchen falls existent
				if (teilbaum.getKnotenLinks() != null)
					entfernenKnoten(daten, teilbaum, teilbaum.getKnotenLinks(), true);
			}
			else
			{
				// Zu löschende Daten größer als Daten im aktuellen Knoten;
				// im rechten Teilbaum weitersuchen falls existent
				if (teilbaum.getKnotenRechts() != null)
					entfernenKnoten(daten, teilbaum, teilbaum.getKnotenRechts(), false);
			}
	}

	// Ersetzt zu löschenden Knoten durch größten Knoten im linken Teilbaum,
	// indem Daten des größten Knotens in zu löschenden Knoten kopiert werden.
	// Vom Elternknoten des größten Knotens aus muss auf den linken Teilbaum
	// des größten Knotens verwiesen werden. Der rechten Teilbaum des größten
	// Knotens ist immer leer (Def. größter Knoten)
	private void ersetzeKnoten(Knoten<T> zuLoeschenderKnoten)
	{
		// Größten Knoten suchen; dessen rechter Nachfolger ist null.
		// Daher kann rechter Nachfolger des zu löschenden Knotens übernommen werden.
		Knoten<T> elternknoten = zuLoeschenderKnoten;
		Knoten<T> teilbaum = zuLoeschenderKnoten.getKnotenLinks();
		Knoten<T> groessterKnoten = teilbaum;

		while (teilbaum.getKnotenRechts() != null)
		{
			elternknoten = teilbaum;
			teilbaum = teilbaum.getKnotenRechts();
			groessterKnoten = teilbaum;
		}

		// Daten des größten Knotens werden in zu löschenden Knoten kopiert
		zuLoeschenderKnoten.setDaten(groessterKnoten.getDaten());

		if (elternknoten == zuLoeschenderKnoten) // Größter Knoten ist Wurzel des linken Teilbaums des zu Löschenden
		{
			// Zu löschender Knoten ist gleichzeitig Elternknoten des größten Knotens
			// Rechter Teilbaum des zu löschenden Knotens muss erhalten bleiben
			// Linken Teilbaum des zu loeschenden Knotens auf linken Teilbaum des größten Knotens setzen
			// Das sind die einzigen Nachfolger des größten Knotens, da dessen rechter Teilbaum ja
			// immer leer ist.
			zuLoeschenderKnoten.setKnotenLinks(groessterKnoten.getKnotenLinks());
		}
		else
		{
			// Rechten, freiwerdenden Teilbaum des Elternknotens des größten Knotens
			// auf linken Teilbaum des größten Knotens setzen
			// Das sind die einzigen Nachfolger des größten Knotens, da dessen rechter Teilbaum ja
			// immer leer ist.
			elternknoten.setKnotenRechts(groessterKnoten.getKnotenLinks());
		}
	}


// Methoden zum Traversieren

	// Pre-Order
	public String traversierePreOrder()
	{
		return (wurzel != null) ? traversierePreOrder(wurzel) : "Der Baum ist leer.";
	}

	private String traversierePreOrder(final Knoten<T> einKnoten)
	{
		assert(einKnoten != null);
		
		// Diese Methode wird im Praktikum implementiert
		
		String str = "";
		str += einKnoten.getDaten();
		
		if (einKnoten.getKnotenLinks() != null) {
			str +=   ", " + traversierePreOrder(einKnoten.getKnotenLinks()) ;
		}
		
		if (einKnoten.getKnotenRechts() != null) {
			str += ", " + traversierePreOrder(einKnoten.getKnotenRechts()) ;
		}

		return str;
				
//		return "NOCH NICHT IMPLEMENTIERT";
	}


	// In-Order
	public String traversiereInOrder()
	{
		return (wurzel != null) ? traversiereInOrder(wurzel) : "Der Baum ist leer.";
	}

	private String traversiereInOrder(final Knoten<T> einKnoten)
	{
		assert(einKnoten != null);

		// Diese Methode wird im Praktikum implementiert
		
		String str = "";
					
		if (einKnoten.getKnotenLinks() != null) {
			str += traversiereInOrder(einKnoten.getKnotenLinks()) + ", " ;
		}
		
		str += einKnoten.getDaten();
		
		if (einKnoten.getKnotenRechts() != null) {
			str += ", " + traversiereInOrder(einKnoten.getKnotenRechts());
		}
		
		return str;
//		return "NOCH NICHT IMPLEMENTIERT";
	}


	// Post-Order
	public String traversierePostOrder()
	{
		return (wurzel != null) ? traversierePostOrder(wurzel) : "Der Baum ist leer.";
	}

	private String traversierePostOrder(final Knoten<T> einKnoten)
	{
		assert(einKnoten != null);
		// Diese Methode wird im Praktikum implementiert
		
		String str = "";
		
		if (einKnoten.getKnotenLinks() != null) {
			str += traversierePostOrder(einKnoten.getKnotenLinks()) + ", ";
		}
		
		if (einKnoten.getKnotenRechts() != null) {
			str += traversierePostOrder(einKnoten.getKnotenRechts()) + ", ";
		}
		str += einKnoten.getDaten();

		return str;
//		return "NOCH NICHT IMPLEMENTIERT";
	}
}